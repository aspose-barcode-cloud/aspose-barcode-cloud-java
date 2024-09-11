package com.aspose.barcode.cloud.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/** AvailableBarCodeImageFormat. Specifies the file format of the image. */
@JsonAdapter(AvailableBarCodeImageFormat.Adapter.class)
public enum AvailableBarCodeImageFormat {
    GIF("Gif"),

    JPEG("Jpeg"),

    PNG("Png"),

    TIFF("Tiff"),

    SVG("Svg");

    private final String value;

    AvailableBarCodeImageFormat(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    /** Create AvailableBarCodeImageFormat from String. */
    public static AvailableBarCodeImageFormat fromValue(String text) {
        for (AvailableBarCodeImageFormat b : AvailableBarCodeImageFormat.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    /** Class for JsonAdapter. */
    public static class Adapter extends TypeAdapter<AvailableBarCodeImageFormat> {
        @Override
        public void write(
                final JsonWriter jsonWriter, final AvailableBarCodeImageFormat enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public AvailableBarCodeImageFormat read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return AvailableBarCodeImageFormat.fromValue(String.valueOf(value));
        }
    }
}
