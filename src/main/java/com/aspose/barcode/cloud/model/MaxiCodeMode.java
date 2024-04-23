package com.aspose.barcode.cloud.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/** MaxiCodeMode. */
@JsonAdapter(MaxiCodeMode.Adapter.class)
public enum MaxiCodeMode {
    MODE2("Mode2"),

    MODE3("Mode3"),

    MODE4("Mode4"),

    MODE5("Mode5"),

    MODE6("Mode6");

    private final String value;

    MaxiCodeMode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    /** Create MaxiCodeMode from String. */
    public static MaxiCodeMode fromValue(String text) {
        for (MaxiCodeMode b : MaxiCodeMode.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    /** Class for JsonAdapter. */
    public static class Adapter extends TypeAdapter<MaxiCodeMode> {
        @Override
        public void write(final JsonWriter jsonWriter, final MaxiCodeMode enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public MaxiCodeMode read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return MaxiCodeMode.fromValue(String.valueOf(value));
        }
    }
}
