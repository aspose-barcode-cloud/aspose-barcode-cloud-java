package com.aspose.barcode.cloud.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/** HanXinEncodeMode. */
@JsonAdapter(HanXinEncodeMode.Adapter.class)
public enum HanXinEncodeMode {
    AUTO("Auto"),

    BINARY("Binary"),

    ECI("ECI"),

    UNICODE("Unicode"),

    URI("URI"),

    EXTENDED("Extended");

    private final String value;

    HanXinEncodeMode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    /** Create HanXinEncodeMode from String. */
    public static HanXinEncodeMode fromValue(String text) {
        for (HanXinEncodeMode b : HanXinEncodeMode.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    /** Class for JsonAdapter. */
    public static class Adapter extends TypeAdapter<HanXinEncodeMode> {
        @Override
        public void write(final JsonWriter jsonWriter, final HanXinEncodeMode enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public HanXinEncodeMode read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return HanXinEncodeMode.fromValue(String.valueOf(value));
        }
    }
}
