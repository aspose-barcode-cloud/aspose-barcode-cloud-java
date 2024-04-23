package com.aspose.barcode.cloud.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/** PatchFormat. */
@JsonAdapter(PatchFormat.Adapter.class)
public enum PatchFormat {
    PATCHONLY("PatchOnly"),

    A4("A4"),

    A4_LANDSCAPE("A4_LANDSCAPE"),

    US_LETTER("US_Letter"),

    US_LETTER_LANDSCAPE("US_Letter_LANDSCAPE");

    private final String value;

    PatchFormat(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    /** Create PatchFormat from String. */
    public static PatchFormat fromValue(String text) {
        for (PatchFormat b : PatchFormat.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    /** Class for JsonAdapter. */
    public static class Adapter extends TypeAdapter<PatchFormat> {
        @Override
        public void write(final JsonWriter jsonWriter, final PatchFormat enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public PatchFormat read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return PatchFormat.fromValue(String.valueOf(value));
        }
    }
}
