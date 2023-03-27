package com.aspose.barcode.cloud.test;

import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.api.BarcodeApi;
import com.aspose.barcode.cloud.api.FileApi;

import java.nio.file.Paths;
import java.util.UUID;

public class TestBase {

    protected static final String accessToken =
            System.getenv().get("TEST_CONFIGURATION_ACCESS_TOKEN");

    protected static final String testDataPath = Paths.get("test_data").toAbsolutePath().toString();
    protected static final String testStorageName = "First Storage";
    protected static final String remoteTempFolder = "BarcodeTests/" + UUID.randomUUID() + "/";
    private static final ApiClient client = new ApiClient(accessToken);
    protected static final BarcodeApi api = new BarcodeApi(client);
    protected static final FileApi fileApi = new FileApi(client);
}
