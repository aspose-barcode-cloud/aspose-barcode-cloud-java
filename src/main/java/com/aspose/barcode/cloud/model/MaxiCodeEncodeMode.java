package com.aspose.barcode.cloud.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/** MaxiCodeEncodeMode. */
@JsonAdapter(MaxiCodeEncodeMode.Adapter.class)
public enum MaxiCodeEncodeMode {
    AUTO("Auto"),

    BYTES("Bytes"),

    EXTENDEDCODETEXT("ExtendedCodetext");

    private final String value;

    MaxiCodeEncodeMode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    /** Create MaxiCodeEncodeMode from String. */
    public static MaxiCodeEncodeMode fromValue(String text) {
        for (MaxiCodeEncodeMode b : MaxiCodeEncodeMode.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    /** Class for JsonAdapter. */
    public static class Adapter extends TypeAdapter<MaxiCodeEncodeMode> {
        @Override
        public void write(final JsonWriter jsonWriter, final MaxiCodeEncodeMode enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public MaxiCodeEncodeMode read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return MaxiCodeEncodeMode.fromValue(String.valueOf(value));
        }
    }
}
