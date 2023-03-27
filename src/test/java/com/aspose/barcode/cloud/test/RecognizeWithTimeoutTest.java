package com.aspose.barcode.cloud.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.model.ChecksumValidation;
import com.aspose.barcode.cloud.model.PresetType;
import com.aspose.barcode.cloud.requests.PostBarcodeRecognizeFromUrlOrContentRequest;

import org.junit.Test;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RecognizeWithTimeoutTest extends TestBase {

    @Test
    public void RecognizeWithTimeoutShouldThrowTimeout() {
        PostBarcodeRecognizeFromUrlOrContentRequest request =
                new PostBarcodeRecognizeFromUrlOrContentRequest();
        request.checksumValidation = ChecksumValidation.OFF.toString();
        request.preset = PresetType.HIGHPERFORMANCE.toString();

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
            assertEquals(408, e.getCode());
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
