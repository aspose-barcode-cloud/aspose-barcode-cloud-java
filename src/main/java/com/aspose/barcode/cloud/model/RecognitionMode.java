package com.aspose.barcode.cloud.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/** RecognitionMode. Recognition mode. */
@JsonAdapter(RecognitionMode.Adapter.class)
public enum RecognitionMode {
    FAST("Fast"),

    NORMAL("Normal"),

    EXCELLENT("Excellent");

    private final String value;

    RecognitionMode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    /** Create RecognitionMode from String. */
    public static RecognitionMode fromValue(String text) {
        for (RecognitionMode b : RecognitionMode.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    /** Class for JsonAdapter. */
    public static class Adapter extends TypeAdapter<RecognitionMode> {
        @Override
        public void write(final JsonWriter jsonWriter, final RecognitionMode enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public RecognitionMode read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return RecognitionMode.fromValue(String.valueOf(value));
        }
    }
}
