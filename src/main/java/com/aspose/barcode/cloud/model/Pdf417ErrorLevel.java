// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="Pdf417ErrorLevel.java">
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

/** Pdf417ErrorLevel. */
@JsonAdapter(Pdf417ErrorLevel.Adapter.class)
public enum Pdf417ErrorLevel {
    LEVEL0("Level0"),

    LEVEL1("Level1"),

    LEVEL2("Level2"),

    LEVEL3("Level3"),

    LEVEL4("Level4"),

    LEVEL5("Level5"),

    LEVEL6("Level6"),

    LEVEL7("Level7"),

    LEVEL8("Level8");

    private final String value;

    Pdf417ErrorLevel(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    /** Create Pdf417ErrorLevel from String. */
    public static Pdf417ErrorLevel fromValue(String text) {
        for (Pdf417ErrorLevel b : Pdf417ErrorLevel.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    /** Class for JsonAdapter. */
    public static class Adapter extends TypeAdapter<Pdf417ErrorLevel> {
        @Override
        public void write(final JsonWriter jsonWriter, final Pdf417ErrorLevel enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public Pdf417ErrorLevel read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return Pdf417ErrorLevel.fromValue(String.valueOf(value));
        }
    }
}
