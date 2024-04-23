package com.aspose.barcode.cloud.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/** AztecSymbolMode. */
@JsonAdapter(AztecSymbolMode.Adapter.class)
public enum AztecSymbolMode {
    AUTO("Auto"),

    COMPACT("Compact"),

    FULLRANGE("FullRange"),

    RUNE("Rune");

    private final String value;

    AztecSymbolMode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    /** Create AztecSymbolMode from String. */
    public static AztecSymbolMode fromValue(String text) {
        for (AztecSymbolMode b : AztecSymbolMode.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    /** Class for JsonAdapter. */
    public static class Adapter extends TypeAdapter<AztecSymbolMode> {
        @Override
        public void write(final JsonWriter jsonWriter, final AztecSymbolMode enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public AztecSymbolMode read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return AztecSymbolMode.fromValue(String.valueOf(value));
        }
    }
}
