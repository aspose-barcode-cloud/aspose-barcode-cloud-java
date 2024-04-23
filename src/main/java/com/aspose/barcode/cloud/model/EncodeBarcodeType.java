package com.aspose.barcode.cloud.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/** EncodeBarcodeType. See EncodeTypes */
@JsonAdapter(EncodeBarcodeType.Adapter.class)
public enum EncodeBarcodeType {
    CODABAR("Codabar"),

    CODE11("Code11"),

    CODE39STANDARD("Code39Standard"),

    CODE39EXTENDED("Code39Extended"),

    CODE93STANDARD("Code93Standard"),

    CODE93EXTENDED("Code93Extended"),

    CODE128("Code128"),

    GS1CODE128("GS1Code128"),

    EAN8("EAN8"),

    EAN13("EAN13"),

    EAN14("EAN14"),

    SCC14("SCC14"),

    SSCC18("SSCC18"),

    UPCA("UPCA"),

    UPCE("UPCE"),

    ISBN("ISBN"),

    ISSN("ISSN"),

    ISMN("ISMN"),

    STANDARD2OF5("Standard2of5"),

    INTERLEAVED2OF5("Interleaved2of5"),

    MATRIX2OF5("Matrix2of5"),

    ITALIANPOST25("ItalianPost25"),

    IATA2OF5("IATA2of5"),

    ITF14("ITF14"),

    ITF6("ITF6"),

    MSI("MSI"),

    VIN("VIN"),

    DEUTSCHEPOSTIDENTCODE("DeutschePostIdentcode"),

    DEUTSCHEPOSTLEITCODE("DeutschePostLeitcode"),

    OPC("OPC"),

    PZN("PZN"),

    CODE16K("Code16K"),

    PHARMACODE("Pharmacode"),

    DATAMATRIX("DataMatrix"),

    QR("QR"),

    AZTEC("Aztec"),

    PDF417("Pdf417"),

    MACROPDF417("MacroPdf417"),

    AUSTRALIAPOST("AustraliaPost"),

    POSTNET("Postnet"),

    PLANET("Planet"),

    ONECODE("OneCode"),

    RM4SCC("RM4SCC"),

    DATABAROMNIDIRECTIONAL("DatabarOmniDirectional"),

    DATABARTRUNCATED("DatabarTruncated"),

    DATABARLIMITED("DatabarLimited"),

    DATABAREXPANDED("DatabarExpanded"),

    SINGAPOREPOST("SingaporePost"),

    GS1DATAMATRIX("GS1DataMatrix"),

    AUSTRALIANPOSTEPARCEL("AustralianPosteParcel"),

    SWISSPOSTPARCEL("SwissPostParcel"),

    PATCHCODE("PatchCode"),

    DATABAREXPANDEDSTACKED("DatabarExpandedStacked"),

    DATABARSTACKED("DatabarStacked"),

    DATABARSTACKEDOMNIDIRECTIONAL("DatabarStackedOmniDirectional"),

    MICROPDF417("MicroPdf417"),

    GS1QR("GS1QR"),

    MAXICODE("MaxiCode"),

    CODE32("Code32"),

    DATALOGIC2OF5("DataLogic2of5"),

    DOTCODE("DotCode"),

    DUTCHKIX("DutchKIX"),

    UPCAGS1CODE128COUPON("UpcaGs1Code128Coupon"),

    UPCAGS1DATABARCOUPON("UpcaGs1DatabarCoupon"),

    CODABLOCKF("CodablockF"),

    GS1CODABLOCKF("GS1CodablockF"),

    MAILMARK("Mailmark"),

    GS1DOTCODE("GS1DotCode"),

    HANXIN("HanXin"),

    GS1HANXIN("GS1HanXin"),

    GS1AZTEC("GS1Aztec"),

    GS1MICROPDF417("GS1MicroPdf417");

    private final String value;

    EncodeBarcodeType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    /** Create EncodeBarcodeType from String. */
    public static EncodeBarcodeType fromValue(String text) {
        for (EncodeBarcodeType b : EncodeBarcodeType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    /** Class for JsonAdapter. */
    public static class Adapter extends TypeAdapter<EncodeBarcodeType> {
        @Override
        public void write(final JsonWriter jsonWriter, final EncodeBarcodeType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public EncodeBarcodeType read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return EncodeBarcodeType.fromValue(String.valueOf(value));
        }
    }
}
