package com.aspose.barcode.cloud.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/** CodabarChecksumMode. */
@JsonAdapter(CodabarChecksumMode.Adapter.class)
public enum CodabarChecksumMode {
    MOD10("Mod10"),

    MOD16("Mod16");

    private final String value;

    CodabarChecksumMode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    /** Create CodabarChecksumMode from String. */
    public static CodabarChecksumMode fromValue(String text) {
        for (CodabarChecksumMode b : CodabarChecksumMode.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    /** Class for JsonAdapter. */
    public static class Adapter extends TypeAdapter<CodabarChecksumMode> {
        @Override
        public void write(final JsonWriter jsonWriter, final CodabarChecksumMode enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public CodabarChecksumMode read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return CodabarChecksumMode.fromValue(String.valueOf(value));
        }
    }
}
