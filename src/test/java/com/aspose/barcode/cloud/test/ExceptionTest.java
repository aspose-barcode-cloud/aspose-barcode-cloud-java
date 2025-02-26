package com.aspose.barcode.cloud.test;

import static org.junit.Assert.*;

import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.api.GenerateApi;
import com.aspose.barcode.cloud.model.EncodeBarcodeType;
import com.aspose.barcode.cloud.requests.GenerateRequestWrapper;

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
        GenerateRequestWrapper request = new GenerateRequestWrapper(EncodeBarcodeType.QR, "");

        ApiException thrownE = null;
        try {
            api.generate(request);
        } catch (ApiException e) {
            thrownE = e;
            assertEquals(400, e.getHttpCode());
            assertEquals("com.aspose.barcode.cloud.ApiException: Bad Request", e.toString());
            assertEquals(
                    "errorInvalidInputData: Error: Field name: 'Data' errors: The Data field is required."
                            + "Operation Failed. The input data is not valid.",
                    e.getDetails().replace("\r", ""));
        }

        assertNotNull(thrownE);
    }
}
