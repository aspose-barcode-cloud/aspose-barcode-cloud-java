package com.aspose.barcode.cloud.snippets;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.stream.Collectors;

public class ManualFetchToken {
    public static void main(String[] args) {

        String clientId = "Client Id from https://dashboard.aspose.cloud/applications";
        String clientSecret = "Client Secret from https://dashboard.aspose.cloud/applications";

        HttpClient client = HttpClient.newHttpClient();

        // Form the payload
        String form =
                Map.of(
                                "grant_type", "client_credentials",
                                "client_id", clientId,
                                "client_secret", clientSecret)
                        .entrySet()
                        .stream()
                        .map(
                                entry ->
                                        URLEncoder.encode(entry.getKey(), StandardCharsets.UTF_8)
                                                + "="
                                                + URLEncoder.encode(
                                                        entry.getValue(), StandardCharsets.UTF_8))
                        .collect(Collectors.joining("&"));

        HttpRequest request =
                HttpRequest.newBuilder()
                        .uri(URI.create("https://id.aspose.cloud/connect/token"))
                        .header("Content-Type", "application/x-www-form-urlencoded")
                        .POST(BodyPublishers.ofString(form))
                        .build();

        try {
            HttpResponse<String> response =
                    client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {

                JsonObject data = JsonParser.parseString(response.body()).getAsJsonObject();
                String token = data.get("access_token").getAsString();
                System.out.println("Token reciewed successfully.");

                // Uncomment next line to view token
                //   System.out.println(token);

            } else {
                System.out.printf("Request failed with status code: %d%n", response.statusCode());
            }
        } catch (Exception ex) {
            System.out.println("An unexpected error occurred: " + ex.getMessage());
        }
    }
}
