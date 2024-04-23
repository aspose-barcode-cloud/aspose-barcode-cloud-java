package com.aspose.barcode.cloud.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/** CustomerInformationInterpretingType. */
@JsonAdapter(CustomerInformationInterpretingType.Adapter.class)
public enum CustomerInformationInterpretingType {
    CTABLE("CTable"),

    NTABLE("NTable"),

    OTHER("Other");

    private final String value;

    CustomerInformationInterpretingType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    /** Create CustomerInformationInterpretingType from String. */
    public static CustomerInformationInterpretingType fromValue(String text) {
        for (CustomerInformationInterpretingType b : CustomerInformationInterpretingType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    /** Class for JsonAdapter. */
    public static class Adapter extends TypeAdapter<CustomerInformationInterpretingType> {
        @Override
        public void write(
                final JsonWriter jsonWriter, final CustomerInformationInterpretingType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public CustomerInformationInterpretingType read(final JsonReader jsonReader)
                throws IOException {
            String value = jsonReader.nextString();
            return CustomerInformationInterpretingType.fromValue(String.valueOf(value));
        }
    }
}
