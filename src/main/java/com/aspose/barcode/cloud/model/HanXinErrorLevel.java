package com.aspose.barcode.cloud.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/** HanXinErrorLevel. */
@JsonAdapter(HanXinErrorLevel.Adapter.class)
public enum HanXinErrorLevel {
    L1("L1"),

    L2("L2"),

    L3("L3"),

    L4("L4");

    private final String value;

    HanXinErrorLevel(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    /** Create HanXinErrorLevel from String. */
    public static HanXinErrorLevel fromValue(String text) {
        for (HanXinErrorLevel b : HanXinErrorLevel.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    /** Class for JsonAdapter. */
    public static class Adapter extends TypeAdapter<HanXinErrorLevel> {
        @Override
        public void write(final JsonWriter jsonWriter, final HanXinErrorLevel enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public HanXinErrorLevel read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return HanXinErrorLevel.fromValue(String.valueOf(value));
        }
    }
}
