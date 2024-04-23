package com.aspose.barcode.cloud.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/** AutoSizeMode. */
@JsonAdapter(AutoSizeMode.Adapter.class)
public enum AutoSizeMode {
    NONE("None"),

    NEAREST("Nearest"),

    INTERPOLATION("Interpolation");

    private final String value;

    AutoSizeMode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    /** Create AutoSizeMode from String. */
    public static AutoSizeMode fromValue(String text) {
        for (AutoSizeMode b : AutoSizeMode.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    /** Class for JsonAdapter. */
    public static class Adapter extends TypeAdapter<AutoSizeMode> {
        @Override
        public void write(final JsonWriter jsonWriter, final AutoSizeMode enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public AutoSizeMode read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return AutoSizeMode.fromValue(String.valueOf(value));
        }
    }
}
