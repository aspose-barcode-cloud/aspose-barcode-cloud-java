package com.aspose.barcode.cloud.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/** DecodeBarcodeType. See DecodeType */
@JsonAdapter(DecodeBarcodeType.Adapter.class)
public enum DecodeBarcodeType {
    ALL("all"),

    AUSTRALIAPOST("AustraliaPost"),

    AZTEC("Aztec"),

    ISBN("ISBN"),

    CODABAR("Codabar"),

    CODE11("Code11"),

    CODE128("Code128"),

    GS1CODE128("GS1Code128"),

    CODE39EXTENDED("Code39Extended"),

    CODE39STANDARD("Code39Standard"),

    CODE93EXTENDED("Code93Extended"),

    CODE93STANDARD("Code93Standard"),

    DATAMATRIX("DataMatrix"),

    DEUTSCHEPOSTIDENTCODE("DeutschePostIdentcode"),

    DEUTSCHEPOSTLEITCODE("DeutschePostLeitcode"),

    EAN13("EAN13"),

    EAN14("EAN14"),

    EAN8("EAN8"),

    IATA2OF5("IATA2of5"),

    INTERLEAVED2OF5("Interleaved2of5"),

    ISSN("ISSN"),

    ISMN("ISMN"),

    ITALIANPOST25("ItalianPost25"),

    ITF14("ITF14"),

    ITF6("ITF6"),

    MACROPDF417("MacroPdf417"),

    MATRIX2OF5("Matrix2of5"),

    MSI("MSI"),

    ONECODE("OneCode"),

    OPC("OPC"),

    PATCHCODE("PatchCode"),

    PDF417("Pdf417"),

    MICROPDF417("MicroPdf417"),

    PLANET("Planet"),

    POSTNET("Postnet"),

    PZN("PZN"),

    QR("QR"),

    MICROQR("MicroQR"),

    RM4SCC("RM4SCC"),

    SCC14("SCC14"),

    SSCC18("SSCC18"),

    STANDARD2OF5("Standard2of5"),

    SUPPLEMENT("Supplement"),

    UPCA("UPCA"),

    UPCE("UPCE"),

    VIN("VIN"),

    PHARMACODE("Pharmacode"),

    GS1DATAMATRIX("GS1DataMatrix"),

    DATABAROMNIDIRECTIONAL("DatabarOmniDirectional"),

    DATABARTRUNCATED("DatabarTruncated"),

    DATABARLIMITED("DatabarLimited"),

    DATABAREXPANDED("DatabarExpanded"),

    SWISSPOSTPARCEL("SwissPostParcel"),

    AUSTRALIANPOSTEPARCEL("AustralianPosteParcel"),

    CODE16K("Code16K"),

    DATABARSTACKEDOMNIDIRECTIONAL("DatabarStackedOmniDirectional"),

    DATABARSTACKED("DatabarStacked"),

    DATABAREXPANDEDSTACKED("DatabarExpandedStacked"),

    COMPACTPDF417("CompactPdf417"),

    GS1QR("GS1QR"),

    MAXICODE("MaxiCode"),

    MICRE13B("MicrE13B"),

    CODE32("Code32"),

    DATALOGIC2OF5("DataLogic2of5"),

    DOTCODE("DotCode"),

    DUTCHKIX("DutchKIX"),

    CODABLOCKF("CodablockF"),

    MAILMARK("Mailmark"),

    GS1DOTCODE("GS1DotCode"),

    HIBCCODE39LIC("HIBCCode39LIC"),

    HIBCCODE128LIC("HIBCCode128LIC"),

    HIBCAZTECLIC("HIBCAztecLIC"),

    HIBCDATAMATRIXLIC("HIBCDataMatrixLIC"),

    HIBCQRLIC("HIBCQRLIC"),

    HIBCCODE39PAS("HIBCCode39PAS"),

    HIBCCODE128PAS("HIBCCode128PAS"),

    HIBCAZTECPAS("HIBCAztecPAS"),

    HIBCDATAMATRIXPAS("HIBCDataMatrixPAS"),

    HIBCQRPAS("HIBCQRPAS"),

    HANXIN("HanXin"),

    GS1HANXIN("GS1HanXin"),

    GS1AZTEC("GS1Aztec"),

    GS1COMPOSITEBAR("GS1CompositeBar"),

    GS1MICROPDF417("GS1MicroPdf417"),

    MOSTCOMMONLYUSED("mostCommonlyUsed");

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
