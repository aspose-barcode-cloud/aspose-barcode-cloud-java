package com.aspose.barcode.cloud.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/** DataMatrixEccType. */
@JsonAdapter(DataMatrixEccType.Adapter.class)
public enum DataMatrixEccType {
    ECCAUTO("EccAuto"),

    ECC000("Ecc000"),

    ECC050("Ecc050"),

    ECC080("Ecc080"),

    ECC100("Ecc100"),

    ECC140("Ecc140"),

    ECC200("Ecc200");

    private final String value;

    DataMatrixEccType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    /** Create DataMatrixEccType from String. */
    public static DataMatrixEccType fromValue(String text) {
        for (DataMatrixEccType b : DataMatrixEccType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    /** Class for JsonAdapter. */
    public static class Adapter extends TypeAdapter<DataMatrixEccType> {
        @Override
        public void write(final JsonWriter jsonWriter, final DataMatrixEccType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public DataMatrixEccType read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return DataMatrixEccType.fromValue(String.valueOf(value));
        }
    }
}
