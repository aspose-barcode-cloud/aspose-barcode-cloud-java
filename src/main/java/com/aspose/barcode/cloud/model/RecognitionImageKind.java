package com.aspose.barcode.cloud.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/** RecognitionImageKind. Kind of image to recognize */
@JsonAdapter(RecognitionImageKind.Adapter.class)
public enum RecognitionImageKind {
    PHOTO("Photo"),

    SCANNED_DOCUMENT("ScannedDocument"),

    CLEAR_IMAGE("ClearImage");

    private final String value;

    RecognitionImageKind(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    /** Create RecognitionImageKind from String. */
    public static RecognitionImageKind fromValue(String text) {
        for (RecognitionImageKind b : RecognitionImageKind.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    /** Class for JsonAdapter. */
    public static class Adapter extends TypeAdapter<RecognitionImageKind> {
        @Override
        public void write(final JsonWriter jsonWriter, final RecognitionImageKind enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public RecognitionImageKind read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return RecognitionImageKind.fromValue(String.valueOf(value));
        }
    }
}
