package com.aspose.barcode.cloud.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/** BarcodeImageFormat. Specifies the file format of the image. */
@JsonAdapter(BarcodeImageFormat.Adapter.class)
public enum BarcodeImageFormat {
    PNG("Png"),

    JPEG("Jpeg"),

    SVG("Svg"),

    TIFF("Tiff"),

    GIF("Gif");

    private final String value;

    BarcodeImageFormat(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    /** Create BarcodeImageFormat from String. */
    public static BarcodeImageFormat fromValue(String text) {
        for (BarcodeImageFormat b : BarcodeImageFormat.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    /** Class for JsonAdapter. */
    public static class Adapter extends TypeAdapter<BarcodeImageFormat> {
        @Override
        public void write(final JsonWriter jsonWriter, final BarcodeImageFormat enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public BarcodeImageFormat read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return BarcodeImageFormat.fromValue(String.valueOf(value));
        }
    }
}
