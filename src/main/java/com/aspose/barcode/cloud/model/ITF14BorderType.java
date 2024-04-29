package com.aspose.barcode.cloud.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/** ITF14BorderType. */
@JsonAdapter(ITF14BorderType.Adapter.class)
public enum ITF14BorderType {
    NONE("None"),

    FRAME("Frame"),

    BAR("Bar"),

    FRAMEOUT("FrameOut"),

    BAROUT("BarOut");

    private final String value;

    ITF14BorderType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    /** Create ITF14BorderType from String. */
    public static ITF14BorderType fromValue(String text) {
        for (ITF14BorderType b : ITF14BorderType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    /** Class for JsonAdapter. */
    public static class Adapter extends TypeAdapter<ITF14BorderType> {
        @Override
        public void write(final JsonWriter jsonWriter, final ITF14BorderType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ITF14BorderType read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return ITF14BorderType.fromValue(String.valueOf(value));
        }
    }
}
