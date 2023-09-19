package com.aspose.barcode.cloud.test;

import com.aspose.barcode.cloud.Configuration;
import com.aspose.barcode.cloud.JSON;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ConfigurationTest {
    JSON json = new JSON();

    @Test
    public void toJsonTest() throws IOException {
        Configuration conf = new Configuration();
        String text = json.serialize(conf);
        // TODO: Move to base
        String expected =
                String.join(
                        "\n",
                        Files.readAllLines(Paths.get("src", "test", "configuration.example.json")));
        Assert.assertEquals(expected, text);
    }
}
