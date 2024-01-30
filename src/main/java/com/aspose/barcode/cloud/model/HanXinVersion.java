// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="HanXinVersion.java">
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

/** HanXinVersion. */
@JsonAdapter(HanXinVersion.Adapter.class)
public enum HanXinVersion {
    AUTO("Auto"),

    VERSION01("Version01"),

    VERSION02("Version02"),

    VERSION03("Version03"),

    VERSION04("Version04"),

    VERSION05("Version05"),

    VERSION06("Version06"),

    VERSION07("Version07"),

    VERSION08("Version08"),

    VERSION09("Version09"),

    VERSION10("Version10"),

    VERSION11("Version11"),

    VERSION12("Version12"),

    VERSION13("Version13"),

    VERSION14("Version14"),

    VERSION15("Version15"),

    VERSION16("Version16"),

    VERSION17("Version17"),

    VERSION18("Version18"),

    VERSION19("Version19"),

    VERSION20("Version20"),

    VERSION21("Version21"),

    VERSION22("Version22"),

    VERSION23("Version23"),

    VERSION24("Version24"),

    VERSION25("Version25"),

    VERSION26("Version26"),

    VERSION27("Version27"),

    VERSION28("Version28"),

    VERSION29("Version29"),

    VERSION30("Version30"),

    VERSION31("Version31"),

    VERSION32("Version32"),

    VERSION33("Version33"),

    VERSION34("Version34"),

    VERSION35("Version35"),

    VERSION36("Version36"),

    VERSION37("Version37"),

    VERSION38("Version38"),

    VERSION39("Version39"),

    VERSION40("Version40"),

    VERSION41("Version41"),

    VERSION42("Version42"),

    VERSION43("Version43"),

    VERSION44("Version44"),

    VERSION45("Version45"),

    VERSION46("Version46"),

    VERSION47("Version47"),

    VERSION48("Version48"),

    VERSION49("Version49"),

    VERSION50("Version50"),

    VERSION51("Version51"),

    VERSION52("Version52"),

    VERSION53("Version53"),

    VERSION54("Version54"),

    VERSION55("Version55"),

    VERSION56("Version56"),

    VERSION57("Version57"),

    VERSION58("Version58"),

    VERSION59("Version59"),

    VERSION60("Version60"),

    VERSION61("Version61"),

    VERSION62("Version62"),

    VERSION63("Version63"),

    VERSION64("Version64"),

    VERSION65("Version65"),

    VERSION66("Version66"),

    VERSION67("Version67"),

    VERSION68("Version68"),

    VERSION69("Version69"),

    VERSION70("Version70"),

    VERSION71("Version71"),

    VERSION72("Version72"),

    VERSION73("Version73"),

    VERSION74("Version74"),

    VERSION75("Version75"),

    VERSION76("Version76"),

    VERSION77("Version77"),

    VERSION78("Version78"),

    VERSION79("Version79"),

    VERSION80("Version80"),

    VERSION81("Version81"),

    VERSION82("Version82"),

    VERSION83("Version83"),

    VERSION84("Version84");

    private final String value;

    HanXinVersion(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    /** Create HanXinVersion from String. */
    public static HanXinVersion fromValue(String text) {
        for (HanXinVersion b : HanXinVersion.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    /** Class for JsonAdapter. */
    public static class Adapter extends TypeAdapter<HanXinVersion> {
        @Override
        public void write(final JsonWriter jsonWriter, final HanXinVersion enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public HanXinVersion read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return HanXinVersion.fromValue(String.valueOf(value));
        }
    }
}
