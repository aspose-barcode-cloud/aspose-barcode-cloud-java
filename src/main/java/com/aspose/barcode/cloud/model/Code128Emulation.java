package com.aspose.barcode.cloud.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * Code128Emulation. DEPRECATED. This enum will be removed in future releases Function codewords for
 * Code 128 emulation. Applied for MicroPDF417 only. Ignored for PDF417 and MacroPDF417 barcodes.
 */
@JsonAdapter(Code128Emulation.Adapter.class)
public enum Code128Emulation {
    NONE("None"),

    CODE903("Code903"),

    CODE904("Code904"),

    CODE905("Code905");

    private final String value;

    Code128Emulation(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    /** Create Code128Emulation from String. */
    public static Code128Emulation fromValue(String text) {
        for (Code128Emulation b : Code128Emulation.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    /** Class for JsonAdapter. */
    public static class Adapter extends TypeAdapter<Code128Emulation> {
        @Override
        public void write(final JsonWriter jsonWriter, final Code128Emulation enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public Code128Emulation read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return Code128Emulation.fromValue(String.valueOf(value));
        }
    }
}
