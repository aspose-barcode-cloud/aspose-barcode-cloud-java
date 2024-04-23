package com.aspose.barcode.cloud.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/** Pdf417MacroTerminator. */
@JsonAdapter(Pdf417MacroTerminator.Adapter.class)
public enum Pdf417MacroTerminator {
    AUTO("Auto"),

    NONE("None"),

    SET("Set");

    private final String value;

    Pdf417MacroTerminator(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    /** Create Pdf417MacroTerminator from String. */
    public static Pdf417MacroTerminator fromValue(String text) {
        for (Pdf417MacroTerminator b : Pdf417MacroTerminator.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    /** Class for JsonAdapter. */
    public static class Adapter extends TypeAdapter<Pdf417MacroTerminator> {
        @Override
        public void write(final JsonWriter jsonWriter, final Pdf417MacroTerminator enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public Pdf417MacroTerminator read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return Pdf417MacroTerminator.fromValue(String.valueOf(value));
        }
    }
}
