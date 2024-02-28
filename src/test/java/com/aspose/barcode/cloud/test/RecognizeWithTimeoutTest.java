package com.aspose.barcode.cloud.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.api.BarcodeApi;
import com.aspose.barcode.cloud.requests.PostBarcodeRecognizeFromUrlOrContentRequest;

import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RecognizeWithTimeoutTest extends TestBase {

    private static BarcodeApi api;

    @BeforeClass
    public static void oneTimeSetUp() {
        api = new BarcodeApi(apiClient);
    }

    @Test
    public void RecognizeWithTimeoutShouldThrowTimeout() {
        PostBarcodeRecognizeFromUrlOrContentRequest request =
                new PostBarcodeRecognizeFromUrlOrContentRequest();

        Path currentRelativePath = Paths.get("");
        String currentPath = currentRelativePath.toAbsolutePath().toString();
        Path filePath = Paths.get(currentPath, "test_data", "1.png");

        request.image = new File(String.valueOf(filePath));
        request.timeout = 1;

        boolean thrown = false;
        try {
            api.postBarcodeRecognizeFromUrlOrContent(request);
        } catch (ApiException e) {
            thrown = true;
            assertEquals(408, e.getHttpCode());
            assertEquals("Request Timeout", e.getMessage());
            String details = e.getDetails();
            assertTrue(
                    details,
                    details.startsWith(
                            "requestTimeout: Try reducing the image size to avoid the timeout. Recognition is aborted. Execution time: "));
        }

        assertTrue(thrown);
    }
}
