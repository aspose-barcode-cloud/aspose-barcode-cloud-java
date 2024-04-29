package com.aspose.barcode.cloud.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/** DataMatrixEncodeMode. DataMatrix encoder&#39;s encoding mode, default to Auto */
@JsonAdapter(DataMatrixEncodeMode.Adapter.class)
public enum DataMatrixEncodeMode {
    AUTO("Auto"),

    ASCII("ASCII"),

    FULL("Full"),

    CUSTOM("Custom"),

    C40("C40"),

    TEXT("Text"),

    EDIFACT("EDIFACT"),

    ANSIX12("ANSIX12"),

    EXTENDEDCODETEXT("ExtendedCodetext");

    private final String value;

    DataMatrixEncodeMode(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    /** Create DataMatrixEncodeMode from String. */
    public static DataMatrixEncodeMode fromValue(String text) {
        for (DataMatrixEncodeMode b : DataMatrixEncodeMode.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    /** Class for JsonAdapter. */
    public static class Adapter extends TypeAdapter<DataMatrixEncodeMode> {
        @Override
        public void write(final JsonWriter jsonWriter, final DataMatrixEncodeMode enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public DataMatrixEncodeMode read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return DataMatrixEncodeMode.fromValue(String.valueOf(value));
        }
    }
}
