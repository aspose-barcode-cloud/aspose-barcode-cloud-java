package com.aspose.barcode.cloud.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/** CodabarSymbol. */
@JsonAdapter(CodabarSymbol.Adapter.class)
public enum CodabarSymbol {
    A("A"),

    B("B"),

    C("C"),

    D("D");

    private final String value;

    CodabarSymbol(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    /** Create CodabarSymbol from String. */
    public static CodabarSymbol fromValue(String text) {
        for (CodabarSymbol b : CodabarSymbol.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    /** Class for JsonAdapter. */
    public static class Adapter extends TypeAdapter<CodabarSymbol> {
        @Override
        public void write(final JsonWriter jsonWriter, final CodabarSymbol enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public CodabarSymbol read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return CodabarSymbol.fromValue(String.valueOf(value));
        }
    }
}
