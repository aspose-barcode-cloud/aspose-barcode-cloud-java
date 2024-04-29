package com.aspose.barcode.cloud.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/** PresetType. See QualitySettings allows to configure recognition quality and speed manually. */
@JsonAdapter(PresetType.Adapter.class)
public enum PresetType {
    HIGHPERFORMANCE("HighPerformance"),

    NORMALQUALITY("NormalQuality"),

    HIGHQUALITYDETECTION("HighQualityDetection"),

    MAXQUALITYDETECTION("MaxQualityDetection"),

    HIGHQUALITY("HighQuality"),

    MAXBARCODES("MaxBarCodes");

    private final String value;

    PresetType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    /** Create PresetType from String. */
    public static PresetType fromValue(String text) {
        for (PresetType b : PresetType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    /** Class for JsonAdapter. */
    public static class Adapter extends TypeAdapter<PresetType> {
        @Override
        public void write(final JsonWriter jsonWriter, final PresetType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public PresetType read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return PresetType.fromValue(String.valueOf(value));
        }
    }
}
