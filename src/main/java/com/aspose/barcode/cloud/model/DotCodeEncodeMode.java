package com.aspose.barcode.cloud.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/** DotCodeEncodeMode. */
@JsonAdapter(DotCodeEncodeMode.Adapter.class)
public enum DotCodeEncodeMode {
    AUTO("Auto"),

    BYTES("Bytes"),

    EXTENDEDCODETEXT("ExtendedCodetext");

    private final String value;

    DotCodeEncodeMode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    /** Create DotCodeEncodeMode from String. */
    public static DotCodeEncodeMode fromValue(String text) {
        for (DotCodeEncodeMode b : DotCodeEncodeMode.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    /** Class for JsonAdapter. */
    public static class Adapter extends TypeAdapter<DotCodeEncodeMode> {
        @Override
        public void write(final JsonWriter jsonWriter, final DotCodeEncodeMode enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public DotCodeEncodeMode read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return DotCodeEncodeMode.fromValue(String.valueOf(value));
        }
    }
}
