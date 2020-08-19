package com.aspose.barcode.cloud.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.api.FileApi;
import com.aspose.barcode.cloud.model.FilesUploadResult;

import org.junit.Test;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

/** API tests for FileApi */
public class FileApiTest extends TestBase {

    private static final ApiClient client = new ApiClient(accessToken);
    private static final FileApi api = new FileApi(client);

    /**
     * Upload file
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uploadFileTest() throws ApiException {
        Path filePath = Paths.get(testDataPath, "1.png");

        String path = remoteTempFolder + filePath.getFileName();
        File imageFile = new File(String.valueOf(filePath));
        FilesUploadResult response = api.uploadFile(path, imageFile, testStorageName);

        assertTrue(String.valueOf(response.getErrors()), response.getErrors().isEmpty());
        assertEquals(1, response.getUploaded().size());
        assertEquals("1.png", response.getUploaded().get(0));
    }
}
