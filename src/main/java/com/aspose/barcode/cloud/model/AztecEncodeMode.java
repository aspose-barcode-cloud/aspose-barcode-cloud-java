package com.aspose.barcode.cloud.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/** AztecEncodeMode. */
@JsonAdapter(AztecEncodeMode.Adapter.class)
public enum AztecEncodeMode {
    AUTO("Auto"),

    BYTES("Bytes"),

    EXTENDEDCODETEXT("ExtendedCodetext");

    private final String value;

    AztecEncodeMode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    /** Create AztecEncodeMode from String. */
    public static AztecEncodeMode fromValue(String text) {
        for (AztecEncodeMode b : AztecEncodeMode.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    /** Class for JsonAdapter. */
    public static class Adapter extends TypeAdapter<AztecEncodeMode> {
        @Override
        public void write(final JsonWriter jsonWriter, final AztecEncodeMode enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public AztecEncodeMode read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return AztecEncodeMode.fromValue(String.valueOf(value));
        }
    }
}
