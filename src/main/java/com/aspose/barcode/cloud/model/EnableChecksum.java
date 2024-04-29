package com.aspose.barcode.cloud.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/** EnableChecksum. */
@JsonAdapter(EnableChecksum.Adapter.class)
public enum EnableChecksum {
    DEFAULT("Default"),

    YES("Yes"),

    NO("No");

    private final String value;

    EnableChecksum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    /** Create EnableChecksum from String. */
    public static EnableChecksum fromValue(String text) {
        for (EnableChecksum b : EnableChecksum.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    /** Class for JsonAdapter. */
    public static class Adapter extends TypeAdapter<EnableChecksum> {
        @Override
        public void write(final JsonWriter jsonWriter, final EnableChecksum enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public EnableChecksum read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return EnableChecksum.fromValue(String.valueOf(value));
        }
    }
}
