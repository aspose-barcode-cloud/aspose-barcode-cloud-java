package com.aspose.barcode.cloud.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/** CodeLocation. Gets or Sets CodeLocation. */
@JsonAdapter(CodeLocation.Adapter.class)
public enum CodeLocation {
    BELOW("Below"),

    ABOVE("Above"),

    NONE("None");

    private final String value;

    CodeLocation(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    /** Create CodeLocation from String. */
    public static CodeLocation fromValue(String text) {
        for (CodeLocation b : CodeLocation.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    /** Class for JsonAdapter. */
    public static class Adapter extends TypeAdapter<CodeLocation> {
        @Override
        public void write(final JsonWriter jsonWriter, final CodeLocation enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public CodeLocation read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return CodeLocation.fromValue(String.valueOf(value));
        }
    }
}
