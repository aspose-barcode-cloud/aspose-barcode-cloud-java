package com.aspose.barcode.cloud;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/** Class for storing configuration of the SDK. */
public class Configuration {
    public String ClientId = "Client Id from https://dashboard.aspose.cloud/applications";
    public String ClientSecret = "Client Secret from https://dashboard.aspose.cloud/applications";
    public String ApiBaseUrl = "https://api.aspose.cloud";
    public String TokenUrl = ApiBaseUrl + "/connect/token";
    public String AccessToken = null;

    /** Build ApiClient from configuration. */
    public ApiClient buildApiClient() {
        if (AccessToken != null) {
            return new ApiClient(AccessToken);
        }
        return new ApiClient(ClientId, ClientSecret, ApiBaseUrl, TokenUrl);
    }

    /** Load configuration from file. */
    public static Configuration loadFromFile(File file) throws IOException {
        String content = String.join("\n", Files.readAllLines(file.toPath()));
        Configuration loadedConfig = new JSON().deserialize(content, Configuration.class);

        return loadedConfig;
    }
}
