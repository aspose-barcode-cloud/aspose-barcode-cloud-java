package com.aspose.barcode.cloud.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/** EncodeBarcodeType. See Aspose.BarCode.Generation.EncodeTypes */
@JsonAdapter(EncodeBarcodeType.Adapter.class)
public enum EncodeBarcodeType {
    CODABAR("Codabar"),

    CODE11("Code11"),

    CODE39("Code39"),

    CODE39_FULL_ASCII("Code39FullASCII"),

    CODE93("Code93"),

    CODE128("Code128"),

    GS1_CODE128("GS1Code128"),

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

    ITALIAN_POST25("ItalianPost25"),

    IATA2OF5("IATA2of5"),

    ITF14("ITF14"),

    ITF6("ITF6"),

    MSI("MSI"),

    VIN("VIN"),

    DEUTSCHE_POST_IDENTCODE("DeutschePostIdentcode"),

    DEUTSCHE_POST_LEITCODE("DeutschePostLeitcode"),

    OPC("OPC"),

    PZN("PZN"),

    CODE16_K("Code16K"),

    PHARMACODE("Pharmacode"),

    DATA_MATRIX("DataMatrix"),

    QR("QR"),

    AZTEC("Aztec"),

    PDF417("Pdf417"),

    MACRO_PDF417("MacroPdf417"),

    AUSTRALIA_POST("AustraliaPost"),

    POSTNET("Postnet"),

    PLANET("Planet"),

    ONE_CODE("OneCode"),

    RM4_SCC("RM4SCC"),

    DATABAR_OMNI_DIRECTIONAL("DatabarOmniDirectional"),

    DATABAR_TRUNCATED("DatabarTruncated"),

    DATABAR_LIMITED("DatabarLimited"),

    DATABAR_EXPANDED("DatabarExpanded"),

    SINGAPORE_POST("SingaporePost"),

    GS1_DATA_MATRIX("GS1DataMatrix"),

    AUSTRALIAN_POSTE_PARCEL("AustralianPosteParcel"),

    SWISS_POST_PARCEL("SwissPostParcel"),

    PATCH_CODE("PatchCode"),

    DATABAR_EXPANDED_STACKED("DatabarExpandedStacked"),

    DATABAR_STACKED("DatabarStacked"),

    DATABAR_STACKED_OMNI_DIRECTIONAL("DatabarStackedOmniDirectional"),

    MICRO_PDF417("MicroPdf417"),

    GS1_QR("GS1QR"),

    MAXI_CODE("MaxiCode"),

    CODE32("Code32"),

    DATA_LOGIC2OF5("DataLogic2of5"),

    DOT_CODE("DotCode"),

    DUTCH_KIX("DutchKIX"),

    UPCA_GS1_CODE128_COUPON("UpcaGs1Code128Coupon"),

    UPCA_GS1_DATABAR_COUPON("UpcaGs1DatabarCoupon"),

    CODABLOCK_F("CodablockF"),

    GS1_CODABLOCK_F("GS1CodablockF"),

    MAILMARK("Mailmark"),

    GS1_DOT_CODE("GS1DotCode"),

    HAN_XIN("HanXin"),

    GS1_HAN_XIN("GS1HanXin"),

    GS1_AZTEC("GS1Aztec"),

    GS1_MICRO_PDF417("GS1MicroPdf417"),

    RECT_MICRO_QR("RectMicroQR"),

    MICRO_QR("MicroQR");

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
