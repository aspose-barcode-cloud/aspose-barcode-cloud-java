package com.aspose.barcode.cloud.test;

import com.aspose.barcode.cloud.Configuration;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestConfiguration {
    private static final Path ConfigFileName = Paths.get("src", "test", "configuration.json");

    public static Configuration load() {
        String maybeToken = System.getenv().get("TEST_CONFIGURATION_ACCESS_TOKEN");

        // Prefer config from environment
        if (maybeToken != null && !maybeToken.isEmpty()) {
            Configuration fromEnv = new Configuration();
            fromEnv.AccessToken = maybeToken;
            return fromEnv;
        }

        // And then try to load config from file
        try {
            return Configuration.loadFromFile(ConfigFileName.toFile());
        } catch (IOException e) {
            System.err.println("ERROR: Cannot load config from file " + ConfigFileName);
            throw new RuntimeException(e);
        }
    }
}
