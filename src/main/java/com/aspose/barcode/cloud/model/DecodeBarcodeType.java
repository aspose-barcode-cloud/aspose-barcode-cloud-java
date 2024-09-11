package com.aspose.barcode.cloud.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/** DecodeBarcodeType. See Aspose.BarCode.Aspose.BarCode.BarCodeRecognition.DecodeType */
@JsonAdapter(DecodeBarcodeType.Adapter.class)
public enum DecodeBarcodeType {
    MOST_COMMONLY_USED("mostCommonlyUsed"),

    AUSTRALIA_POST("AustraliaPost"),

    AZTEC("Aztec"),

    ISBN("ISBN"),

    CODABAR("Codabar"),

    CODE11("Code11"),

    CODE128("Code128"),

    GS1_CODE128("GS1Code128"),

    CODE39("Code39"),

    CODE39_FULL_ASCII("Code39FullASCII"),

    CODE93("Code93"),

    CODE93_FULL_ASCII("Code93FullASCII"),

    DATA_MATRIX("DataMatrix"),

    DEUTSCHE_POST_IDENTCODE("DeutschePostIdentcode"),

    DEUTSCHE_POST_LEITCODE("DeutschePostLeitcode"),

    EAN13("EAN13"),

    EAN14("EAN14"),

    EAN8("EAN8"),

    IATA2OF5("IATA2of5"),

    INTERLEAVED2OF5("Interleaved2of5"),

    ISSN("ISSN"),

    ISMN("ISMN"),

    ITALIAN_POST25("ItalianPost25"),

    ITF14("ITF14"),

    ITF6("ITF6"),

    MACRO_PDF417("MacroPdf417"),

    MATRIX2OF5("Matrix2of5"),

    MSI("MSI"),

    ONE_CODE("OneCode"),

    OPC("OPC"),

    PATCH_CODE("PatchCode"),

    PDF417("Pdf417"),

    MICRO_PDF417("MicroPdf417"),

    PLANET("Planet"),

    POSTNET("Postnet"),

    PZN("PZN"),

    QR("QR"),

    MICRO_QR("MicroQR"),

    RECT_MICRO_QR("RectMicroQR"),

    RM4_SCC("RM4SCC"),

    SCC14("SCC14"),

    SSCC18("SSCC18"),

    STANDARD2OF5("Standard2of5"),

    SUPPLEMENT("Supplement"),

    UPCA("UPCA"),

    UPCE("UPCE"),

    VIN("VIN"),

    PHARMACODE("Pharmacode"),

    GS1_DATA_MATRIX("GS1DataMatrix"),

    DATABAR_OMNI_DIRECTIONAL("DatabarOmniDirectional"),

    DATABAR_TRUNCATED("DatabarTruncated"),

    DATABAR_LIMITED("DatabarLimited"),

    DATABAR_EXPANDED("DatabarExpanded"),

    SWISS_POST_PARCEL("SwissPostParcel"),

    AUSTRALIAN_POSTE_PARCEL("AustralianPosteParcel"),

    CODE16_K("Code16K"),

    DATABAR_STACKED_OMNI_DIRECTIONAL("DatabarStackedOmniDirectional"),

    DATABAR_STACKED("DatabarStacked"),

    DATABAR_EXPANDED_STACKED("DatabarExpandedStacked"),

    COMPACT_PDF417("CompactPdf417"),

    GS1_QR("GS1QR"),

    MAXI_CODE("MaxiCode"),

    MICR_E13_B("MicrE13B"),

    CODE32("Code32"),

    DATA_LOGIC2OF5("DataLogic2of5"),

    DOT_CODE("DotCode"),

    DUTCH_KIX("DutchKIX"),

    CODABLOCK_F("CodablockF"),

    MAILMARK("Mailmark"),

    GS1_DOT_CODE("GS1DotCode"),

    HIBC_CODE39_LIC("HIBCCode39LIC"),

    HIBC_CODE128_LIC("HIBCCode128LIC"),

    HIBC_AZTEC_LIC("HIBCAztecLIC"),

    HIBC_DATA_MATRIX_LIC("HIBCDataMatrixLIC"),

    HIBCQRLIC("HIBCQRLIC"),

    HIBC_CODE39_PAS("HIBCCode39PAS"),

    HIBC_CODE128_PAS("HIBCCode128PAS"),

    HIBC_AZTEC_PAS("HIBCAztecPAS"),

    HIBC_DATA_MATRIX_PAS("HIBCDataMatrixPAS"),

    HIBCQRPAS("HIBCQRPAS"),

    HAN_XIN("HanXin"),

    GS1_HAN_XIN("GS1HanXin"),

    GS1_AZTEC("GS1Aztec"),

    GS1_COMPOSITE_BAR("GS1CompositeBar"),

    GS1_MICRO_PDF417("GS1MicroPdf417");

    private final String value;

    DecodeBarcodeType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    /** Create DecodeBarcodeType from String. */
    public static DecodeBarcodeType fromValue(String text) {
        for (DecodeBarcodeType b : DecodeBarcodeType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }

    /** Class for JsonAdapter. */
    public static class Adapter extends TypeAdapter<DecodeBarcodeType> {
        @Override
        public void write(final JsonWriter jsonWriter, final DecodeBarcodeType enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public DecodeBarcodeType read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return DecodeBarcodeType.fromValue(String.valueOf(value));
        }
    }
}
