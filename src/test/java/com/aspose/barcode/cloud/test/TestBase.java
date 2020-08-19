package com.aspose.barcode.cloud.test;

import java.nio.file.Paths;
import java.util.UUID;

public class TestBase {

    protected static final String accessToken =
            System.getenv().get("TEST_CONFIGURATION_ACCESS_TOKEN");

    protected static final String testDataPath = Paths.get("test_data").toAbsolutePath().toString();
    protected static final String testStorageName = "First Storage";
    protected static final String remoteTempFolder = "BarcodeTests/" + UUID.randomUUID() + "/";
}
