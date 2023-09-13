// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="Pdf417MacroTerminator.java">
//   Copyright (c) 2023 Aspose.BarCode for Cloud
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

/** Pdf417MacroTerminator. */
@JsonAdapter(Pdf417MacroTerminator.Adapter.class)
public enum Pdf417MacroTerminator {
    AUTO("Auto"),

    NONE("None"),

    SET("Set");

    private final String value;

    Pdf417MacroTerminator(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    /** Create Pdf417MacroTerminator from String. */
    public static Pdf417MacroTerminator fromValue(String text) {
        for (Pdf417MacroTerminator b : Pdf417MacroTerminator.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    /** Class for JsonAdapter. */
    public static class Adapter extends TypeAdapter<Pdf417MacroTerminator> {
        @Override
        public void write(final JsonWriter jsonWriter, final Pdf417MacroTerminator enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public Pdf417MacroTerminator read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return Pdf417MacroTerminator.fromValue(String.valueOf(value));
        }
    }
}
