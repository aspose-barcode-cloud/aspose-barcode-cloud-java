package com.aspose.barcode.cloud.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.api.FileApi;
import com.aspose.barcode.cloud.model.FilesUploadResult;
import com.aspose.barcode.cloud.requests.UploadFileRequest;

import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

/** API tests for FileApi */
public class FileApiTest extends TestBase {
    private static FileApi fileApi;

    @BeforeClass
    public static void oneTimeSetUp() {
        fileApi = new FileApi(apiClient);
    }

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

        UploadFileRequest request = new UploadFileRequest(path, imageFile);
        request.storageName = testStorageName;

        FilesUploadResult response = fileApi.uploadFile(request);

        assertTrue(String.valueOf(response.getErrors()), response.getErrors().isEmpty());
        assertEquals(1, response.getUploaded().size());
        assertEquals("1.png", response.getUploaded().get(0));
    }
}
