package com.aspose.barcode.cloud.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/** AvailableGraphicsUnit. Subset of GraphicsUnit. */
@JsonAdapter(AvailableGraphicsUnit.Adapter.class)
public enum AvailableGraphicsUnit {
    PIXEL("Pixel"),

    POINT("Point"),

    INCH("Inch"),

    MILLIMETER("Millimeter");

    private final String value;

    AvailableGraphicsUnit(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    /** Create AvailableGraphicsUnit from String. */
    public static AvailableGraphicsUnit fromValue(String text) {
        for (AvailableGraphicsUnit b : AvailableGraphicsUnit.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    /** Class for JsonAdapter. */
    public static class Adapter extends TypeAdapter<AvailableGraphicsUnit> {
        @Override
        public void write(final JsonWriter jsonWriter, final AvailableGraphicsUnit enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public AvailableGraphicsUnit read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return AvailableGraphicsUnit.fromValue(String.valueOf(value));
        }
    }
}
