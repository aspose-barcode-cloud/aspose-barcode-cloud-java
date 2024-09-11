package com.aspose.barcode.cloud.test;

import static org.junit.Assert.assertTrue;

import com.aspose.barcode.cloud.api.GenerateApi;
import com.aspose.barcode.cloud.model.AvailableBarCodeImageFormat;
import com.aspose.barcode.cloud.model.BarcodeImageParams;
import com.aspose.barcode.cloud.model.EncodeBarcodeType;
import com.aspose.barcode.cloud.model.EncodeData;
import com.aspose.barcode.cloud.model.EncodeDataType;
import com.aspose.barcode.cloud.model.GenerateParams;
import com.aspose.barcode.cloud.requests.BarcodeGenerateBarcodeTypeGetRequest;
import com.aspose.barcode.cloud.requests.BarcodeGenerateBodyPostRequest;
import com.aspose.barcode.cloud.requests.BarcodeGenerateFormPostRequest;

import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;

public class GenerateApiTest extends TestBase {

    private static GenerateApi api;

    @BeforeClass
    public static void setUpClass() {
        // Initialize
        api = new GenerateApi(apiClient);
    }

    @Test
    public void testBarcodeGenerateBarcodeTypeGet() throws Exception {
        // Test case for barcode_generate_barcode_type_get
        // Generate barcode

        File response =
                api.barcodeGenerateBarcodeTypeGet(
                        new BarcodeGenerateBarcodeTypeGetRequest(
                                EncodeBarcodeType.CODE128, EncodeDataType.STRING_DATA, "Hello!"));

        long contentLength = response.length();
        assertTrue("Content length is zero or negative", contentLength > 0);
        assertTrue(response.getName().contains("png"));
    }

    @Test
    public void testBarcodeGenerateBodyPost() throws Exception {
        // Test case for barcode_generate_body_post
        // Generate barcode from params in body
        BarcodeImageParams imageParams = new BarcodeImageParams();
        imageParams.setImageFormat(AvailableBarCodeImageFormat.JPEG);

        GenerateParams generatorParams =
                new GenerateParams(
                        EncodeBarcodeType.QR,
                        new EncodeData(EncodeDataType.BASE64_BYTES, "VGVzdA=="));

        generatorParams.setBarcodeImageParams(imageParams);

        File response =
                api.barcodeGenerateBodyPost(new BarcodeGenerateBodyPostRequest(generatorParams));

        long contentLength = response.length();
        assertTrue("Content length is zero or negative", contentLength > 0);
        assertTrue(response.getName().contains("jpeg"));
    }

    @Test
    public void testBarcodeGenerateFormPost() throws Exception {
        // Test case for barcode_generate_form_post
        // Generate barcode from params in form

        File response =
                api.barcodeGenerateFormPost(
                        new BarcodeGenerateFormPostRequest(
                                EncodeBarcodeType.QR, EncodeDataType.HEX_BYTES, "54657374"));

        long contentLength = response.length();
        assertTrue("Content length is zero or negative", contentLength > 0);
        assertTrue(response.getName().contains("png"));
    }
}
