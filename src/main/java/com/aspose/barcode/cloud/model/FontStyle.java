package com.aspose.barcode.cloud.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/** FontStyle. */
@JsonAdapter(FontStyle.Adapter.class)
public enum FontStyle {
    REGULAR("Regular"),

    BOLD("Bold"),

    ITALIC("Italic"),

    UNDERLINE("Underline"),

    STRIKEOUT("Strikeout");

    private final String value;

    FontStyle(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    /** Create FontStyle from String. */
    public static FontStyle fromValue(String text) {
        for (FontStyle b : FontStyle.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    /** Class for JsonAdapter. */
    public static class Adapter extends TypeAdapter<FontStyle> {
        @Override
        public void write(final JsonWriter jsonWriter, final FontStyle enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public FontStyle read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return FontStyle.fromValue(String.valueOf(value));
        }
    }
}
