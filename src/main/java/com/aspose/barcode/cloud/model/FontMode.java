package com.aspose.barcode.cloud.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/** FontMode. */
@JsonAdapter(FontMode.Adapter.class)
public enum FontMode {
    AUTO("Auto"),

    MANUAL("Manual");

    private final String value;

    FontMode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    /** Create FontMode from String. */
    public static FontMode fromValue(String text) {
        for (FontMode b : FontMode.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    /** Class for JsonAdapter. */
    public static class Adapter extends TypeAdapter<FontMode> {
        @Override
        public void write(final JsonWriter jsonWriter, final FontMode enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public FontMode read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return FontMode.fromValue(String.valueOf(value));
        }
    }
}
