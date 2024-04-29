package com.aspose.barcode.cloud.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/** ChecksumValidation. */
@JsonAdapter(ChecksumValidation.Adapter.class)
public enum ChecksumValidation {
    DEFAULT("Default"),

    ON("On"),

    OFF("Off");

    private final String value;

    ChecksumValidation(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    /** Create ChecksumValidation from String. */
    public static ChecksumValidation fromValue(String text) {
        for (ChecksumValidation b : ChecksumValidation.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    /** Class for JsonAdapter. */
    public static class Adapter extends TypeAdapter<ChecksumValidation> {
        @Override
        public void write(final JsonWriter jsonWriter, final ChecksumValidation enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ChecksumValidation read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return ChecksumValidation.fromValue(String.valueOf(value));
        }
    }
}
