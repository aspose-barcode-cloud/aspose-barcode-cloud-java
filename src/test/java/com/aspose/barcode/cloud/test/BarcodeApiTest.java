package com.aspose.barcode.cloud.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.api.BarcodeApi;
import com.aspose.barcode.cloud.api.FileApi;
import com.aspose.barcode.cloud.model.BarcodeResponse;
import com.aspose.barcode.cloud.model.BarcodeResponseList;
import com.aspose.barcode.cloud.model.ChecksumValidation;
import com.aspose.barcode.cloud.model.DecodeBarcodeType;
import com.aspose.barcode.cloud.model.EncodeBarcodeType;
import com.aspose.barcode.cloud.model.FilesUploadResult;
import com.aspose.barcode.cloud.model.GeneratorParams;
import com.aspose.barcode.cloud.model.GeneratorParamsList;
import com.aspose.barcode.cloud.model.PresetType;
import com.aspose.barcode.cloud.model.ReaderParams;
import com.aspose.barcode.cloud.model.RegionPoint;
import com.aspose.barcode.cloud.model.ResultImageInfo;

import com.aspose.barcode.cloud.requests.GetBarcodeGenerateRequest;
import com.aspose.barcode.cloud.requests.GetBarcodeRecognizeRequest;
import com.aspose.barcode.cloud.requests.PostBarcodeRecognizeFromUrlOrContentRequest;
import com.aspose.barcode.cloud.requests.PostGenerateMultipleRequest;
import com.aspose.barcode.cloud.requests.PutBarcodeGenerateFileRequest;
import com.aspose.barcode.cloud.requests.PutBarcodeRecognizeFromBodyRequest;
import com.aspose.barcode.cloud.requests.PutGenerateMultipleRequest;
import com.aspose.barcode.cloud.requests.ScanBarcodeRequest;
import com.aspose.barcode.cloud.requests.UploadFileRequest;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/** API tests for BarcodeApi */
public class BarcodeApiTest extends TestBase {

    private static BarcodeApi api;
    private static FileApi fileApi;

    @BeforeClass
    public static void oneTimeSetUp() {
        api = new BarcodeApi(apiClient);
        fileApi = new FileApi(apiClient);
    }

    /**
     * Generate barcode.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBarcodeGenerateTest() throws ApiException {
        GetBarcodeGenerateRequest request =
                new GetBarcodeGenerateRequest(EncodeBarcodeType.QR.getValue(), "QR text");
        request.format = "png";

        File response = api.getBarcodeGenerate(request);

        assertTrue(response.length() > 0);
        assertTrue(response.getName().endsWith(".png"));
    }

    /**
     * Recognize barcode from a file on server.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBarcodeRecognizeTest() throws ApiException {
        String testFileName = "1.png";
        uploadTestFile(testFileName);

        GetBarcodeRecognizeRequest request = new GetBarcodeRecognizeRequest(testFileName);
        request.types = Collections.singletonList(DecodeBarcodeType.CODE11);
        request.checksumValidation = ChecksumValidation.OFF.toString();
        request.preset = PresetType.HIGHPERFORMANCE.toString();
        request.storage = testStorageName;
        request.folder = remoteTempFolder;

        BarcodeResponseList response = api.getBarcodeRecognize(request);

        assertNotNull(response);
        assertFalse(response.getBarcodes().isEmpty());

        BarcodeResponse barcode = response.getBarcodes().get(0);
        assertEquals("Code11", barcode.getType());
        assertEquals("1234567812", barcode.getBarcodeValue());

        List<RegionPoint> region = barcode.getRegion();
        assertFalse(region.isEmpty());
        assertTrue(region.get(0).getX() > 0);
        assertTrue(region.get(0).getY() > 0);
    }

    /**
     * Recognize barcode from a file on server with multiple types in params
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBarcodeRecognizeWithTypesTest() throws ApiException {
        String testFileName = "ManyTypes.png";
        uploadTestFile(testFileName);

        GetBarcodeRecognizeRequest request = new GetBarcodeRecognizeRequest(testFileName);
        request.types =
                Arrays.asList(
                        DecodeBarcodeType.QR, DecodeBarcodeType.CODE128, DecodeBarcodeType.CODE11);
        request.checksumValidation = ChecksumValidation.OFF.toString();
        request.preset = PresetType.HIGHPERFORMANCE.toString();
        request.storage = testStorageName;
        request.folder = remoteTempFolder;

        BarcodeResponseList response = api.getBarcodeRecognize(request);

        assertNotNull(response);
        assertFalse(response.getBarcodes().isEmpty());

        assertEquals(3, response.getBarcodes().size());
    }

    private void uploadTestFile(String testFileName) throws ApiException {
        Path filePath = Paths.get(testDataPath, testFileName);
        File file = new File(filePath.toString());
        String remotePath = remoteTempFolder + filePath.getFileName();

        UploadFileRequest request = new UploadFileRequest(remotePath, file);
        request.storageName = testStorageName;

        FilesUploadResult result = fileApi.uploadFile(request);

        if (!result.getErrors().isEmpty()) {
            throw new ApiException(result.getErrors().toString());
        }
    }

    /**
     * Recognize barcode from an url or from request body. Request body can contain raw data bytes
     * of the image or encoded with base64.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postBarcodeRecognizeFromUrlOrContentTest() throws ApiException {
        PostBarcodeRecognizeFromUrlOrContentRequest request =
                new PostBarcodeRecognizeFromUrlOrContentRequest();
        request.checksumValidation = ChecksumValidation.OFF.toString();
        request.preset = PresetType.HIGHPERFORMANCE.toString();
        request.types = Collections.singletonList(DecodeBarcodeType.CODE11);

        Path currentRelativePath = Paths.get("");
        String currentPath = currentRelativePath.toAbsolutePath().toString();
        Path filePath = Paths.get(currentPath, "test_data", "1.png");

        request.image = new File(String.valueOf(filePath));

        BarcodeResponseList response = api.postBarcodeRecognizeFromUrlOrContent(request);

        assertNotNull(response);
        assertFalse(response.getBarcodes().isEmpty());

        BarcodeResponse barcode = response.getBarcodes().get(0);
        assertEquals(DecodeBarcodeType.CODE11.getValue(), barcode.getType());
        assertEquals("1234567812", barcode.getBarcodeValue());

        List<RegionPoint> region = barcode.getRegion();
        assertFalse(region.isEmpty());
        assertTrue(region.get(0).getX() > 0);
        assertTrue(region.get(0).getY() > 0);
    }

    /**
     * Generate multiple barcodes and return in response stream
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postGenerateMultipleTest() throws ApiException {
        GeneratorParams barcode1 = new GeneratorParams();
        barcode1.setTypeOfBarcode(EncodeBarcodeType.QR);
        barcode1.setText("putGenerateMultipleTest1");

        GeneratorParams barcode2 = new GeneratorParams();
        barcode2.setTypeOfBarcode(EncodeBarcodeType.CODE128);
        barcode2.setText("putGenerateMultipleTest2");

        GeneratorParamsList generatorParamsList = new GeneratorParamsList();
        generatorParamsList.addBarcodeBuildersItem(barcode1);
        generatorParamsList.addBarcodeBuildersItem(barcode2);

        PostGenerateMultipleRequest request = new PostGenerateMultipleRequest(generatorParamsList);
        request.format = "jpg";
        File response = api.postGenerateMultiple(request);

        assertNotNull(response);
        assertTrue(response.length() > 0);
        assertTrue(response.getName().endsWith(".jpeg"));
    }

    /**
     * Generate barcode and save on server (from query params or from file with json or xml content)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void putBarcodeGenerateFileTest() throws ApiException {
        PutBarcodeGenerateFileRequest request =
                new PutBarcodeGenerateFileRequest(
                        "putBarcodeGenerateFileTest.png",
                        EncodeBarcodeType.QR.getValue(),
                        "Put Barcode Generate File Test");
        request.storage = testStorageName;
        request.folder = remoteTempFolder;

        ResultImageInfo response = api.putBarcodeGenerateFile(request);

        assertTrue(response.getFileSize() > 0);
        assertTrue(response.getImageWidth() > 0);
        assertTrue(response.getImageHeight() > 0);
    }

    /**
     * Recognition of a barcode from file on server with parameters in body.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void putBarcodeRecognizeFromBodyTest() throws ApiException {
        String testFileName = "1.png";
        uploadTestFile(testFileName);

        ReaderParams readerParams = new ReaderParams();
        readerParams.setChecksumValidation(ChecksumValidation.OFF);
        readerParams.setTypes(Collections.singletonList(DecodeBarcodeType.CODE11));
        readerParams.setPreset(PresetType.HIGHPERFORMANCE);

        PutBarcodeRecognizeFromBodyRequest request =
                new PutBarcodeRecognizeFromBodyRequest(testFileName, readerParams);
        request.storage = testStorageName;
        request.folder = remoteTempFolder;

        BarcodeResponseList response = api.putBarcodeRecognizeFromBody(request);

        assertNotNull(response);
        assertFalse(response.getBarcodes().isEmpty());

        BarcodeResponse barcode = response.getBarcodes().get(0);
        assertEquals(DecodeBarcodeType.CODE11.toString(), barcode.getType());
        assertEquals("1234567812", barcode.getBarcodeValue());

        List<RegionPoint> region = barcode.getRegion();
        assertFalse(region.isEmpty());
        assertTrue(region.get(0).getX() > 0);
        assertTrue(region.get(0).getY() > 0);
    }

    /**
     * Generate image with multiple barcodes and put new file on server
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void putGenerateMultipleTest() throws ApiException {
        GeneratorParams barcode1 = new GeneratorParams();
        barcode1.setTypeOfBarcode(EncodeBarcodeType.QR);
        barcode1.setText("putGenerateMultipleTest1");

        GeneratorParams barcode2 = new GeneratorParams();
        barcode2.setTypeOfBarcode(EncodeBarcodeType.CODE128);
        barcode2.setText("putGenerateMultipleTest2");

        GeneratorParamsList generatorParamsList = new GeneratorParamsList();
        generatorParamsList.addBarcodeBuildersItem(barcode1);
        generatorParamsList.addBarcodeBuildersItem(barcode2);

        PutGenerateMultipleRequest request =
                new PutGenerateMultipleRequest("putGenerateMultipleTest", generatorParamsList);
        request.format = "png";
        request.folder = remoteTempFolder;
        request.storage = testStorageName;
        ResultImageInfo response = api.putGenerateMultiple(request);

        assertNotNull(response);
        assertTrue(response.getFileSize() > 0);
        assertTrue(response.getImageWidth() > 0);
        assertTrue(response.getImageHeight() > 0);
    }

    /**
     * Recognize barcode from an url or from request body. Request body can contain raw data bytes
     * of the image or encoded with base64.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void scanBarcodeTest() throws ApiException {
        Path currentRelativePath = Paths.get("");
        String currentPath = currentRelativePath.toAbsolutePath().toString();
        Path filePath = Paths.get(currentPath, "test_data", "QR_and_Code128.png");

        ScanBarcodeRequest request = new ScanBarcodeRequest(new File(String.valueOf(filePath)));
        request.decodeTypes = Arrays.asList(DecodeBarcodeType.CODE128, DecodeBarcodeType.QR);
        BarcodeResponseList response = api.scanBarcode(request);

        assertNotNull(response);
        assertFalse(response.getBarcodes().isEmpty());

        List<BarcodeResponse> barcodes = response.getBarcodes();
        assertEquals(2, barcodes.size());

        assertEquals(DecodeBarcodeType.QR.getValue(), barcodes.get(0).getType());
        assertEquals("Hello world!", barcodes.get(0).getBarcodeValue());

        assertEquals(DecodeBarcodeType.CODE128.getValue(), barcodes.get(1).getType());
        assertEquals("Hello world!", barcodes.get(1).getBarcodeValue());
    }
}
