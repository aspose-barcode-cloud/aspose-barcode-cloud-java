package com.aspose.barcode.cloud.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.api.GenerateApi;
import com.aspose.barcode.cloud.model.EncodeBarcodeType;
import com.aspose.barcode.cloud.requests.BarcodeGenerateBarcodeTypeGetRequest;

import org.junit.BeforeClass;
import org.junit.Test;

public class ExceptionTest extends TestBase {

    private static GenerateApi api;

    @BeforeClass
    public static void oneTimeSetUp() {
        api = new GenerateApi(apiClient);
    }

    @Test
    public void ExceptionMessageParsed() {
        BarcodeGenerateBarcodeTypeGetRequest request =
                new BarcodeGenerateBarcodeTypeGetRequest(EncodeBarcodeType.QR, "");

        boolean thrown = false;
        try {
            api.barcodeGenerateBarcodeTypeGet(request);
        } catch (ApiException e) {
            thrown = true;
            System.err.println(e);
            assertEquals(400, e.getHttpCode());
            assertEquals("Bad Request", e.getMessage());
            assertEquals("com.aspose.barcode.cloud.ApiException: Bad Request", e.toString());
            assertEquals(
                    "errorInvalidInputData: 1. Field name: 'Data'. Errors: The Data field is required."
                            + "Operation Failed. The input data is not valid.",
                    e.getDetails().replace("\r", ""));
        }

        assertTrue(thrown);
    }
}
