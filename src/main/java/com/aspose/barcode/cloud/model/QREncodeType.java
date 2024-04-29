package com.aspose.barcode.cloud.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/** QREncodeType. */
@JsonAdapter(QREncodeType.Adapter.class)
public enum QREncodeType {
    AUTO("Auto"),

    FORCEQR("ForceQR"),

    FORCEMICROQR("ForceMicroQR");

    private final String value;

    QREncodeType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    /** Create QREncodeType from String. */
    public static QREncodeType fromValue(String text) {
        for (QREncodeType b : QREncodeType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    /** Class for JsonAdapter. */
    public static class Adapter extends TypeAdapter<QREncodeType> {
        @Override
        public void write(final JsonWriter jsonWriter, final QREncodeType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public QREncodeType read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return QREncodeType.fromValue(String.valueOf(value));
        }
    }
}
