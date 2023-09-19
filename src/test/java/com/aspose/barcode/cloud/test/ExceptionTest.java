package com.aspose.barcode.cloud.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.api.BarcodeApi;
import com.aspose.barcode.cloud.model.EncodeBarcodeType;
import com.aspose.barcode.cloud.requests.GetBarcodeGenerateRequest;

import org.junit.BeforeClass;
import org.junit.Test;

public class ExceptionTest extends TestBase {

    private static BarcodeApi api;

    @BeforeClass
    public static void oneTimeSetUp() {
        api = new BarcodeApi(apiClient);
    }

    @Test
    public void ExceptionMessageParsed() {
        GetBarcodeGenerateRequest request =
                new GetBarcodeGenerateRequest(EncodeBarcodeType.QR.getValue(), "");

        boolean thrown = false;
        try {
            api.getBarcodeGenerate(request);
        } catch (ApiException e) {
            thrown = true;
            assertEquals(400, e.getHttpCode());
            assertEquals("Bad Request", e.getMessage());
            assertEquals("com.aspose.barcode.cloud.ApiException: Bad Request", e.toString());
            assertEquals(
                    "errorInvalidInputData: Barcode.Text is not provided.\n"
                            + "Operation Failed. The input data is not valid.",
                    e.getDetails().replace("\r", ""));
        }

        assertTrue(thrown);
    }
}
