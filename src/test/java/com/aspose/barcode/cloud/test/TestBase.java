package com.aspose.barcode.cloud.test;

import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.Configuration;

import java.nio.file.Paths;
import java.util.UUID;

public class TestBase {
    protected static final String testDataPath = Paths.get("test_data").toAbsolutePath().toString();
    protected static final String testStorageName = "First Storage";
    protected static final String remoteTempFolder = "BarcodeTests/" + UUID.randomUUID() + "/";
    protected static final Configuration testConfiguration = TestConfiguration.load();
    protected static final ApiClient apiClient = testConfiguration.buildApiClient();
}
