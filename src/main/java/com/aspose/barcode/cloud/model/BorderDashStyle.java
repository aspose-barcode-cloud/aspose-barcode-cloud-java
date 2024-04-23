package com.aspose.barcode.cloud.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/** BorderDashStyle. */
@JsonAdapter(BorderDashStyle.Adapter.class)
public enum BorderDashStyle {
    SOLID("Solid"),

    DASH("Dash"),

    DOT("Dot"),

    DASHDOT("DashDot"),

    DASHDOTDOT("DashDotDot");

    private final String value;

    BorderDashStyle(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    /** Create BorderDashStyle from String. */
    public static BorderDashStyle fromValue(String text) {
        for (BorderDashStyle b : BorderDashStyle.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    /** Class for JsonAdapter. */
    public static class Adapter extends TypeAdapter<BorderDashStyle> {
        @Override
        public void write(final JsonWriter jsonWriter, final BorderDashStyle enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public BorderDashStyle read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return BorderDashStyle.fromValue(String.valueOf(value));
        }
    }
}
