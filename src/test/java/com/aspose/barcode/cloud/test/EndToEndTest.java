package com.aspose.barcode.cloud.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.aspose.barcode.cloud.api.GenerateApi;
import com.aspose.barcode.cloud.api.ScanApi;
import com.aspose.barcode.cloud.model.AvailableBarCodeImageFormat;
import com.aspose.barcode.cloud.model.BarcodeResponseList;
import com.aspose.barcode.cloud.model.EncodeBarcodeType;
import com.aspose.barcode.cloud.model.EncodeDataType;
import com.aspose.barcode.cloud.requests.BarcodeGenerateBarcodeTypeGetRequest;
import com.aspose.barcode.cloud.requests.BarcodeScanFormPostRequest;

import org.junit.Test;

import java.io.File;

public class EndToEndTest extends TestBase {

    @Test
    public void testGenerateAndRecognize() throws Exception {

        // Initialize GenerateApi and ScanApi
        GenerateApi genApi = new GenerateApi(apiClient);
        ScanApi scanApi = new ScanApi(apiClient);

        // Generate barcode request
        BarcodeGenerateBarcodeTypeGetRequest genRequest =
                new BarcodeGenerateBarcodeTypeGetRequest(EncodeBarcodeType.QR, "Java SDK Test");
        genRequest.dataType = EncodeDataType.STRING_DATA;
        genRequest.imageFormat = AvailableBarCodeImageFormat.PNG;

        // Generate barcode
        File genResponse = genApi.barcodeGenerateBarcodeTypeGet(genRequest);

        // Scan barcode request
        BarcodeScanFormPostRequest scanRequest = new BarcodeScanFormPostRequest(genResponse);

        // Scan barcode
        BarcodeResponseList scanResponse = scanApi.barcodeScanFormPost(scanRequest);

        // Assertions
        assertNotNull(scanResponse);
        assertEquals("QR", scanResponse.getBarcodes().get(0).getType());
        assertEquals("Java SDK Test", scanResponse.getBarcodes().get(0).getBarcodeValue());
    }
}
