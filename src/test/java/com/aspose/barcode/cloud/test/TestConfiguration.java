package com.aspose.barcode.cloud.test;

import com.aspose.barcode.cloud.Configuration;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestConfiguration {
    private static final Path ConfigFileName = Paths.get("src", "test", "configuration.json");

    public static Configuration load() {
        File maybeConfigFile = ConfigFileName.toFile();
        if (maybeConfigFile.exists()) {
            try {
                return Configuration.loadFromFile(maybeConfigFile);
            } catch (IOException ignored) {
            }
        }

        Configuration fromEnv = new Configuration();
        fromEnv.AccessToken = System.getenv().get("TEST_CONFIGURATION_ACCESS_TOKEN");
        return fromEnv;
    }
}
