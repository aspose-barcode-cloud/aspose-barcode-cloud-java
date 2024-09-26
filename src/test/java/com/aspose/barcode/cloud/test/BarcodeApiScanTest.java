package com.aspose.barcode.cloud.test;

import static com.aspose.barcode.cloud.test.TestBase.apiClient;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.api.BarcodeApi;
import com.aspose.barcode.cloud.model.BarcodeResponse;
import com.aspose.barcode.cloud.model.BarcodeResponseList;
import com.aspose.barcode.cloud.model.ChecksumValidation;
import com.aspose.barcode.cloud.model.DecodeBarcodeType;
import com.aspose.barcode.cloud.requests.ScanBarcodeRequest;

import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

/** Tests for BarcodeApi.Scan endpoint */
public class BarcodeApiScanTest {

    private static BarcodeApi api;

    @BeforeClass
    public static void oneTimeSetUp() {
        api = new BarcodeApi(apiClient);
    }

    /**
     * Scan barcode from an url or from request body. Request body can contain raw data bytes of the
     * image or encoded with base64.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void scanBarcodeTest() throws ApiException {
        Path currentRelativePath = Paths.get("");
        String currentPath = currentRelativePath.toAbsolutePath().toString();
        Path filePath = Paths.get(currentPath, "test_data", "Code39.jpg");

        ScanBarcodeRequest request = new ScanBarcodeRequest(new File(String.valueOf(filePath)));
        request.decodeTypes = Collections.singletonList(DecodeBarcodeType.CODE39EXTENDED);
        request.checksumValidation = ChecksumValidation.OFF.toString();

        // Act
        BarcodeResponseList response = api.scanBarcode(request);

        // Assert
        assertNotNull(response);
        assertFalse("No barcodes", response.getBarcodes().isEmpty());

        List<BarcodeResponse> barcodes = response.getBarcodes();
        assertEquals(1, barcodes.size());

        assertEquals(DecodeBarcodeType.CODE39EXTENDED.getValue(), barcodes.get(0).getType());
        assertEquals("8M93", barcodes.get(0).getBarcodeValue());
    }
}
