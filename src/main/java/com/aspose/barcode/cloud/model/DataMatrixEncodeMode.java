// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="DataMatrixEncodeMode.java">
//   Copyright (c) 2024 Aspose.BarCode for Cloud
// </copyright>
// <summary>
//   Permission is hereby granted, free of charge, to any person obtaining a copy
//  of this software and associated documentation files (the "Software"), to deal
//  in the Software without restriction, including without limitation the rights
//  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
//  copies of the Software, and to permit persons to whom the Software is
//  furnished to do so, subject to the following conditions:
//
//  The above copyright notice and this permission notice shall be included in all
//  copies or substantial portions of the Software.
//
//  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
//  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
//  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
//  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
//  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
//  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
//  SOFTWARE.
// </summary>
// --------------------------------------------------------------------------------------------------------------------

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
