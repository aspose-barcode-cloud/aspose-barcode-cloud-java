// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="ECIEncodings.java">
//   Copyright (c) 2020 Aspose.BarCode for Cloud
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

/** */
@JsonAdapter(ECIEncodings.Adapter.class)
public enum ECIEncodings {
    ISO_8859_1("ISO_8859_1"),

    ISO_8859_2("ISO_8859_2"),

    ISO_8859_3("ISO_8859_3"),

    ISO_8859_4("ISO_8859_4"),

    ISO_8859_5("ISO_8859_5"),

    ISO_8859_6("ISO_8859_6"),

    ISO_8859_7("ISO_8859_7"),

    ISO_8859_8("ISO_8859_8"),

    ISO_8859_9("ISO_8859_9"),

    ISO_8859_10("ISO_8859_10"),

    ISO_8859_11("ISO_8859_11"),

    ISO_8859_13("ISO_8859_13"),

    ISO_8859_14("ISO_8859_14"),

    ISO_8859_15("ISO_8859_15"),

    ISO_8859_16("ISO_8859_16"),

    SHIFT_JIS("Shift_JIS"),

    WIN1250("Win1250"),

    WIN1251("Win1251"),

    WIN1252("Win1252"),

    WIN1256("Win1256"),

    UTF16BE("UTF16BE"),

    UTF8("UTF8"),

    US_ASCII("US_ASCII"),

    BIG5("Big5"),

    GB18030("GB18030"),

    EUC_KR("EUC_KR");

    private final String value;

    ECIEncodings(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ECIEncodings fromValue(String text) {
        for (ECIEncodings b : ECIEncodings.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    public static class Adapter extends TypeAdapter<ECIEncodings> {
        @Override
        public void write(final JsonWriter jsonWriter, final ECIEncodings enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public ECIEncodings read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return ECIEncodings.fromValue(String.valueOf(value));
        }
    }
}
