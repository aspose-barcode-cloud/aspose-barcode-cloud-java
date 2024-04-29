package com.aspose.barcode.cloud.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/** Pdf417CompactionMode. */
@JsonAdapter(Pdf417CompactionMode.Adapter.class)
public enum Pdf417CompactionMode {
    AUTO("Auto"),

    TEXT("Text"),

    NUMERIC("Numeric"),

    BINARY("Binary");

    private final String value;

    Pdf417CompactionMode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    /** Create Pdf417CompactionMode from String. */
    public static Pdf417CompactionMode fromValue(String text) {
        for (Pdf417CompactionMode b : Pdf417CompactionMode.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    /** Class for JsonAdapter. */
    public static class Adapter extends TypeAdapter<Pdf417CompactionMode> {
        @Override
        public void write(final JsonWriter jsonWriter, final Pdf417CompactionMode enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public Pdf417CompactionMode read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return Pdf417CompactionMode.fromValue(String.valueOf(value));
        }
    }
}
