package com.aspose.barcode.cloud.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/** TextAlignment. */
@JsonAdapter(TextAlignment.Adapter.class)
public enum TextAlignment {
    LEFT("Left"),

    CENTER("Center"),

    RIGHT("Right");

    private final String value;

    TextAlignment(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    /** Create TextAlignment from String. */
    public static TextAlignment fromValue(String text) {
        for (TextAlignment b : TextAlignment.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    /** Class for JsonAdapter. */
    public static class Adapter extends TypeAdapter<TextAlignment> {
        @Override
        public void write(final JsonWriter jsonWriter, final TextAlignment enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public TextAlignment read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return TextAlignment.fromValue(String.valueOf(value));
        }
    }
}
