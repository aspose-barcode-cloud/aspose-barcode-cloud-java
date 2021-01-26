package com.aspose.barcode.cloud.test;

import static org.junit.Assert.*;

import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.api.BarcodeApi;
import com.aspose.barcode.cloud.api.FileApi;
import com.aspose.barcode.cloud.model.*;

import org.junit.Test;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/** API tests for BarcodeApi */
public class BarcodeApiTest extends TestBase {

    private static final ApiClient client = new ApiClient(accessToken);
    private static final BarcodeApi api = new BarcodeApi(client);
    private static final FileApi fileApi = new FileApi(client);

    /**
     * Generate barcode.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBarcodeGenerateTest() throws ApiException {
        String type = EncodeBarcodeType.QR.getValue();
        String text = "QR text";
        String twoDDisplayText = null;
        String textLocation = null;
        String textAlignment = null;
        String textColor = null;
        String fontSizeMode = null;
        Boolean noWrap = null;
        Double resolution = null;
        Double resolutionX = null;
        Double resolutionY = null;
        Double dimensionX = null;
        Double textSpace = null;
        String units = null;
        String sizeMode = null;
        Double barHeight = null;
        Double imageHeight = null;
        Double imageWidth = null;
        Double rotationAngle = null;
        String backColor = null;
        String barColor = null;
        String borderColor = null;
        Double borderWidth = null;
        String borderDashStyle = null;
        Boolean borderVisible = null;
        String enableChecksum = null;
        Boolean enableEscape = null;
        Boolean filledBars = null;
        Boolean alwaysShowChecksum = null;
        Double wideNarrowRatio = null;
        Boolean validateText = null;
        String supplementData = null;
        Double supplementSpace = null;
        Double barWidthReduction = null;
        String format = "png";
        File response =
                api.getBarcodeGenerate(
                        type,
                        text,
                        twoDDisplayText,
                        textLocation,
                        textAlignment,
                        textColor,
                        fontSizeMode,
                        noWrap,
                        resolution,
                        resolutionX,
                        resolutionY,
                        dimensionX,
                        textSpace,
                        units,
                        sizeMode,
                        barHeight,
                        imageHeight,
                        imageWidth,
                        rotationAngle,
                        backColor,
                        barColor,
                        borderColor,
                        borderWidth,
                        borderDashStyle,
                        borderVisible,
                        enableChecksum,
                        enableEscape,
                        filledBars,
                        alwaysShowChecksum,
                        wideNarrowRatio,
                        validateText,
                        supplementData,
                        supplementSpace,
                        barWidthReduction,
                        format);

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

        String type = DecodeBarcodeType.CODE11.getValue();
        String checksumValidation = ChecksumValidation.OFF.toString();
        Boolean detectEncoding = null;
        String preset = PresetType.HIGHPERFORMANCE.toString();
        Integer rectX = null;
        Integer rectY = null;
        Integer rectWidth = null;
        Integer rectHeight = null;
        Boolean stripFNC = null;
        Integer timeout = null;
        Integer medianSmoothingWindowSize = null;
        Boolean allowMedianSmoothing = null;
        Boolean allowComplexBackground = null;
        Boolean allowDatamatrixIndustrialBarcodes = null;
        Boolean allowDecreasedImage = null;
        Boolean allowDetectScanGap = null;
        Boolean allowIncorrectBarcodes = null;
        Boolean allowInvertImage = null;
        Boolean allowMicroWhiteSpotsRemoving = null;
        Boolean allowOneDFastBarcodesDetector = null;
        Boolean allowOneDWipedBarsRestoration = null;
        Boolean allowQRMicroQrRestoration = null;
        Boolean allowRegularImage = null;
        Boolean allowSaltAndPepperFiltering = null;
        Boolean allowWhiteSpotsRemoving = null;
        Boolean checkMore1DVariants = null;
        Double regionLikelihoodThresholdPercent = null;
        List<Integer> scanWindowSizes = null;
        Double similarity = null;
        Boolean skipDiagonalSearch = null;
        Boolean readTinyBarcodes = null;
        String australianPostEncodingTable = null;
        String rectangleRegion = null;
        BarcodeResponseList response =
                api.getBarcodeRecognize(
                        testFileName,
                        type,
                        checksumValidation,
                        detectEncoding,
                        preset,
                        rectX,
                        rectY,
                        rectWidth,
                        rectHeight,
                        stripFNC,
                        timeout,
                        medianSmoothingWindowSize,
                        allowMedianSmoothing,
                        allowComplexBackground,
                        allowDatamatrixIndustrialBarcodes,
                        allowDecreasedImage,
                        allowDetectScanGap,
                        allowIncorrectBarcodes,
                        allowInvertImage,
                        allowMicroWhiteSpotsRemoving,
                        allowOneDFastBarcodesDetector,
                        allowOneDWipedBarsRestoration,
                        allowQRMicroQrRestoration,
                        allowRegularImage,
                        allowSaltAndPepperFiltering,
                        allowWhiteSpotsRemoving,
                        checkMore1DVariants,
                        regionLikelihoodThresholdPercent,
                        scanWindowSizes,
                        similarity,
                        skipDiagonalSearch,
                        readTinyBarcodes,
                        australianPostEncodingTable,
                        rectangleRegion,
                        testStorageName,
                        remoteTempFolder);

        assertNotNull(response);
        assertFalse(response.getBarcodes().isEmpty());

        BarcodeResponse barcode = response.getBarcodes().get(0);
        assertEquals(type, barcode.getType());
        assertEquals("1234567812", barcode.getBarcodeValue());

        List<RegionPoint> region = barcode.getRegion();
        assertFalse(region.isEmpty());
        assertTrue(region.get(0).getX() > 0);
        assertTrue(region.get(0).getY() > 0);
    }

    private void uploadTestFile(String testFileName) throws ApiException {
        Path filePath = Paths.get(testDataPath, testFileName);
        File file = new File(filePath.toString());
        String remotePath = remoteTempFolder + filePath.getFileName();

        FilesUploadResult result = fileApi.uploadFile(remotePath, file, testStorageName);

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
        String type = null;
        String checksumValidation = ChecksumValidation.OFF.toString();
        Boolean detectEncoding = null;
        String preset = PresetType.HIGHPERFORMANCE.toString();
        Integer rectX = null;
        Integer rectY = null;
        Integer rectWidth = null;
        Integer rectHeight = null;
        Boolean stripFNC = null;
        Integer timeout = null;
        Integer medianSmoothingWindowSize = null;
        Boolean allowMedianSmoothing = null;
        Boolean allowComplexBackground = null;
        Boolean allowDatamatrixIndustrialBarcodes = null;
        Boolean allowDecreasedImage = null;
        Boolean allowDetectScanGap = null;
        Boolean allowIncorrectBarcodes = null;
        Boolean allowInvertImage = null;
        Boolean allowMicroWhiteSpotsRemoving = null;
        Boolean allowOneDFastBarcodesDetector = null;
        Boolean allowOneDWipedBarsRestoration = null;
        Boolean allowQRMicroQrRestoration = null;
        Boolean allowRegularImage = null;
        Boolean allowSaltAndPepperFiltering = null;
        Boolean allowWhiteSpotsRemoving = null;
        Boolean checkMore1DVariants = null;
        Double regionLikelihoodThresholdPercent = null;
        List<Integer> scanWindowSizes = null;
        Double similarity = null;
        Boolean skipDiagonalSearch = null;
        Boolean readTinyBarcodes = null;
        String australianPostEncodingTable = null;
        String rectangleRegion = null;
        String url = null;

        Path currentRelativePath = Paths.get("");
        String currentPath = currentRelativePath.toAbsolutePath().toString();
        Path filePath = Paths.get(currentPath, "test_data", "1.png");

        File image = new File(String.valueOf(filePath));

        BarcodeResponseList response =
                api.postBarcodeRecognizeFromUrlOrContent(
                        type,
                        checksumValidation,
                        detectEncoding,
                        preset,
                        rectX,
                        rectY,
                        rectWidth,
                        rectHeight,
                        stripFNC,
                        timeout,
                        medianSmoothingWindowSize,
                        allowMedianSmoothing,
                        allowComplexBackground,
                        allowDatamatrixIndustrialBarcodes,
                        allowDecreasedImage,
                        allowDetectScanGap,
                        allowIncorrectBarcodes,
                        allowInvertImage,
                        allowMicroWhiteSpotsRemoving,
                        allowOneDFastBarcodesDetector,
                        allowOneDWipedBarsRestoration,
                        allowQRMicroQrRestoration,
                        allowRegularImage,
                        allowSaltAndPepperFiltering,
                        allowWhiteSpotsRemoving,
                        checkMore1DVariants,
                        regionLikelihoodThresholdPercent,
                        scanWindowSizes,
                        similarity,
                        skipDiagonalSearch,
                        readTinyBarcodes,
                        australianPostEncodingTable,
                        rectangleRegion,
                        url,
                        image);

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

        String format = "jpg";
        File response = api.postGenerateMultiple(generatorParamsList, format);

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
        String name = "putBarcodeGenerateFileTest.png";
        String type = EncodeBarcodeType.QR.getValue();
        String text = "Put Barcode Generate File Test";
        String twoDDisplayText = null;
        String textLocation = null;
        String textAlignment = null;
        String textColor = null;
        String fontSizeMode = null;
        Double resolution = null;
        Double resolutionX = null;
        Double resolutionY = null;
        Double dimensionX = null;
        Double textSpace = null;
        String units = null;
        String sizeMode = null;
        Boolean noWrap = null;
        Double barHeight = null;
        Double imageHeight = null;
        Double imageWidth = null;
        Double rotationAngle = null;
        String backColor = null;
        String barColor = null;
        String borderColor = null;
        Double borderWidth = null;
        String borderDashStyle = null;
        Boolean borderVisible = null;
        String enableChecksum = null;
        Boolean enableEscape = null;
        Boolean filledBars = null;
        Boolean alwaysShowChecksum = null;
        Double wideNarrowRatio = null;
        Boolean validateText = null;
        String supplementData = null;
        Double supplementSpace = null;
        Double barWidthReduction = null;
        String format = null;
        ResultImageInfo response =
                api.putBarcodeGenerateFile(
                        name,
                        type,
                        text,
                        twoDDisplayText,
                        textLocation,
                        textAlignment,
                        textColor,
                        fontSizeMode,
                        noWrap,
                        resolution,
                        resolutionX,
                        resolutionY,
                        dimensionX,
                        textSpace,
                        units,
                        sizeMode,
                        barHeight,
                        imageHeight,
                        imageWidth,
                        rotationAngle,
                        backColor,
                        barColor,
                        borderColor,
                        borderWidth,
                        borderDashStyle,
                        borderVisible,
                        enableChecksum,
                        enableEscape,
                        filledBars,
                        alwaysShowChecksum,
                        wideNarrowRatio,
                        validateText,
                        supplementData,
                        supplementSpace,
                        barWidthReduction,
                        testStorageName,
                        remoteTempFolder,
                        format);

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
        String type = DecodeBarcodeType.CODE11.getValue();
        BarcodeResponseList response =
                api.putBarcodeRecognizeFromBody(
                        testFileName, readerParams, type, testStorageName, remoteTempFolder);

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
        String name = "putGenerateMultipleTest";

        GeneratorParams barcode1 = new GeneratorParams();
        barcode1.setTypeOfBarcode(EncodeBarcodeType.QR);
        barcode1.setText("putGenerateMultipleTest1");

        GeneratorParams barcode2 = new GeneratorParams();
        barcode2.setTypeOfBarcode(EncodeBarcodeType.CODE128);
        barcode2.setText("putGenerateMultipleTest2");

        GeneratorParamsList generatorParamsList = new GeneratorParamsList();
        generatorParamsList.addBarcodeBuildersItem(barcode1);
        generatorParamsList.addBarcodeBuildersItem(barcode2);

        String format = "png";
        ResultImageInfo response =
                api.putGenerateMultiple(
                        name, generatorParamsList, format, remoteTempFolder, testStorageName);

        assertNotNull(response);
        assertTrue(response.getFileSize() > 0);
        assertTrue(response.getImageWidth() > 0);
        assertTrue(response.getImageHeight() > 0);
    }
}
