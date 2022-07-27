// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="Pdf417Params.java">
//   Copyright (c) 2022 Aspose.BarCode for Cloud
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

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import org.threeten.bp.OffsetDateTime;

/** PDF417 parameters. */
@ApiModel(description = "PDF417 parameters.")
public class Pdf417Params {
    @SerializedName(value = "aspectRatio")
    private Double aspectRatio = null;

    @SerializedName(value = "textEncoding")
    private String textEncoding = null;

    @SerializedName(value = "columns")
    private Integer columns = null;

    @SerializedName(value = "compactionMode")
    private Pdf417CompactionMode compactionMode = null;

    @SerializedName(value = "errorLevel")
    private Pdf417ErrorLevel errorLevel = null;

    @SerializedName(value = "macroFileID")
    private Integer macroFileID = null;

    @SerializedName(value = "macroSegmentID")
    private Integer macroSegmentID = null;

    @SerializedName(value = "macroSegmentsCount")
    private Integer macroSegmentsCount = null;

    @SerializedName(value = "rows")
    private Integer rows = null;

    @SerializedName(value = "truncate")
    private Boolean truncate = null;

    @SerializedName(value = "pdf417ECIEncoding")
    private ECIEncodings pdf417ECIEncoding = null;

    @SerializedName(value = "isReaderInitialization")
    private Boolean isReaderInitialization = null;

    @SerializedName(value = "macroTimeStamp")
    private OffsetDateTime macroTimeStamp = null;

    @SerializedName(value = "macroSender")
    private String macroSender = null;

    @SerializedName(value = "macroFileSize")
    private Integer macroFileSize = null;

    @SerializedName(value = "macroChecksum")
    private Integer macroChecksum = null;

    @SerializedName(value = "macroFileName")
    private String macroFileName = null;

    @SerializedName(value = "macroAddressee")
    private String macroAddressee = null;

    @SerializedName(value = "macroECIEncoding")
    private ECIEncodings macroECIEncoding = null;

    @SerializedName(value = "code128Emulation")
    private Code128Emulation code128Emulation = null;

    /**
     * Height/Width ratio of 2D BarCode module.
     *
     * @return aspectRatio
     */
    @ApiModelProperty(value = "Height/Width ratio of 2D BarCode module.")
    public Double getAspectRatio() {
        return aspectRatio;
    }

    public void setAspectRatio(Double aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    /**
     * Encoding of codetext.
     *
     * @return textEncoding
     */
    @ApiModelProperty(value = "Encoding of codetext.")
    public String getTextEncoding() {
        return textEncoding;
    }

    public void setTextEncoding(String textEncoding) {
        this.textEncoding = textEncoding;
    }

    /**
     * Columns count.
     *
     * @return columns
     */
    @ApiModelProperty(value = "Columns count.")
    public Integer getColumns() {
        return columns;
    }

    public void setColumns(Integer columns) {
        this.columns = columns;
    }

    /**
     * Pdf417 symbology type of BarCode&#39;s compaction mode. Default value:
     * Pdf417CompactionMode.Auto.
     *
     * @return compactionMode
     */
    @ApiModelProperty(
            value =
                    "Pdf417 symbology type of BarCode's compaction mode. Default value: Pdf417CompactionMode.Auto.")
    public Pdf417CompactionMode getCompactionMode() {
        return compactionMode;
    }

    public void setCompactionMode(Pdf417CompactionMode compactionMode) {
        this.compactionMode = compactionMode;
    }

    /**
     * Pdf417 symbology type of BarCode&#39;s error correction level ranging from level0 to level8,
     * level0 means no error correction info, level8 means best error correction which means a
     * larger picture.
     *
     * @return errorLevel
     */
    @ApiModelProperty(
            value =
                    "Pdf417 symbology type of BarCode's error correction level ranging from level0 to level8, level0 means no error correction info, level8 means best error correction which means a larger picture.")
    public Pdf417ErrorLevel getErrorLevel() {
        return errorLevel;
    }

    public void setErrorLevel(Pdf417ErrorLevel errorLevel) {
        this.errorLevel = errorLevel;
    }

    /**
     * Macro Pdf417 barcode&#39;s file ID. Used for MacroPdf417.
     *
     * @return macroFileID
     */
    @ApiModelProperty(value = "Macro Pdf417 barcode's file ID. Used for MacroPdf417.")
    public Integer getMacroFileID() {
        return macroFileID;
    }

    public void setMacroFileID(Integer macroFileID) {
        this.macroFileID = macroFileID;
    }

    /**
     * Macro Pdf417 barcode&#39;s segment ID, which starts from 0, to MacroSegmentsCount - 1.
     *
     * @return macroSegmentID
     */
    @ApiModelProperty(
            value =
                    "Macro Pdf417 barcode's segment ID, which starts from 0, to MacroSegmentsCount - 1.")
    public Integer getMacroSegmentID() {
        return macroSegmentID;
    }

    public void setMacroSegmentID(Integer macroSegmentID) {
        this.macroSegmentID = macroSegmentID;
    }

    /**
     * Macro Pdf417 barcode segments count.
     *
     * @return macroSegmentsCount
     */
    @ApiModelProperty(value = "Macro Pdf417 barcode segments count.")
    public Integer getMacroSegmentsCount() {
        return macroSegmentsCount;
    }

    public void setMacroSegmentsCount(Integer macroSegmentsCount) {
        this.macroSegmentsCount = macroSegmentsCount;
    }

    /**
     * Rows count.
     *
     * @return rows
     */
    @ApiModelProperty(value = "Rows count.")
    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    /**
     * Whether Pdf417 symbology type of BarCode is truncated (to reduce space).
     *
     * @return truncate
     */
    @ApiModelProperty(
            value = "Whether Pdf417 symbology type of BarCode is truncated (to reduce space).")
    public Boolean isTruncate() {
        return truncate;
    }

    public void setTruncate(Boolean truncate) {
        this.truncate = truncate;
    }

    /**
     * Extended Channel Interpretation Identifiers. It is used to tell the barcode reader details
     * about the used references for encoding the data in the symbol. Current implementation
     * consists all well known charset encodings.
     *
     * @return pdf417ECIEncoding
     */
    @ApiModelProperty(
            value =
                    "Extended Channel Interpretation Identifiers. It is used to tell the barcode reader details about the used references for encoding the data in the symbol. Current implementation consists all well known charset encodings.")
    public ECIEncodings getPdf417ECIEncoding() {
        return pdf417ECIEncoding;
    }

    public void setPdf417ECIEncoding(ECIEncodings pdf417ECIEncoding) {
        this.pdf417ECIEncoding = pdf417ECIEncoding;
    }

    /**
     * Used to instruct the reader to interpret the data contained within the symbol as programming
     * for reader initialization
     *
     * @return isReaderInitialization
     */
    @ApiModelProperty(
            value =
                    "Used to instruct the reader to interpret the data contained within the symbol as programming for reader initialization")
    public Boolean isIsReaderInitialization() {
        return isReaderInitialization;
    }

    public void setIsReaderInitialization(Boolean isReaderInitialization) {
        this.isReaderInitialization = isReaderInitialization;
    }

    /**
     * Macro Pdf417 barcode time stamp
     *
     * @return macroTimeStamp
     */
    @ApiModelProperty(value = "Macro Pdf417 barcode time stamp")
    public OffsetDateTime getMacroTimeStamp() {
        return macroTimeStamp;
    }

    public void setMacroTimeStamp(OffsetDateTime macroTimeStamp) {
        this.macroTimeStamp = macroTimeStamp;
    }

    /**
     * Macro Pdf417 barcode sender name
     *
     * @return macroSender
     */
    @ApiModelProperty(value = "Macro Pdf417 barcode sender name")
    public String getMacroSender() {
        return macroSender;
    }

    public void setMacroSender(String macroSender) {
        this.macroSender = macroSender;
    }

    /**
     * Macro Pdf417 file size. The file size field contains the size in bytes of the entire source
     * file
     *
     * @return macroFileSize
     */
    @ApiModelProperty(
            value =
                    "Macro Pdf417 file size. The file size field contains the size in bytes of the entire source file")
    public Integer getMacroFileSize() {
        return macroFileSize;
    }

    public void setMacroFileSize(Integer macroFileSize) {
        this.macroFileSize = macroFileSize;
    }

    /**
     * Macro Pdf417 barcode checksum. The checksum field contains the value of the 16-bit (2 bytes)
     * CRC checksum using the CCITT-16 polynomial
     *
     * @return macroChecksum
     */
    @ApiModelProperty(
            value =
                    "Macro Pdf417 barcode checksum. The checksum field contains the value of the 16-bit (2 bytes) CRC checksum using the CCITT-16 polynomial")
    public Integer getMacroChecksum() {
        return macroChecksum;
    }

    public void setMacroChecksum(Integer macroChecksum) {
        this.macroChecksum = macroChecksum;
    }

    /**
     * Macro Pdf417 barcode file name
     *
     * @return macroFileName
     */
    @ApiModelProperty(value = "Macro Pdf417 barcode file name")
    public String getMacroFileName() {
        return macroFileName;
    }

    public void setMacroFileName(String macroFileName) {
        this.macroFileName = macroFileName;
    }

    /**
     * Macro Pdf417 barcode addressee name
     *
     * @return macroAddressee
     */
    @ApiModelProperty(value = "Macro Pdf417 barcode addressee name")
    public String getMacroAddressee() {
        return macroAddressee;
    }

    public void setMacroAddressee(String macroAddressee) {
        this.macroAddressee = macroAddressee;
    }

    /**
     * Extended Channel Interpretation Identifiers. Applies for Macro PDF417 text fields.
     *
     * @return macroECIEncoding
     */
    @ApiModelProperty(
            value =
                    "Extended Channel Interpretation Identifiers. Applies for Macro PDF417 text fields.")
    public ECIEncodings getMacroECIEncoding() {
        return macroECIEncoding;
    }

    public void setMacroECIEncoding(ECIEncodings macroECIEncoding) {
        this.macroECIEncoding = macroECIEncoding;
    }

    /**
     * Function codeword for Code 128 emulation. Applied for MicroPDF417 only. Ignored for PDF417
     * and MacroPDF417 barcodes.
     *
     * @return code128Emulation
     */
    @ApiModelProperty(
            value =
                    "Function codeword for Code 128 emulation. Applied for MicroPDF417 only. Ignored for PDF417 and MacroPDF417 barcodes.")
    public Code128Emulation getCode128Emulation() {
        return code128Emulation;
    }

    public void setCode128Emulation(Code128Emulation code128Emulation) {
        this.code128Emulation = code128Emulation;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pdf417Params pdf417Params = (Pdf417Params) o;
        return Objects.equals(this.aspectRatio, pdf417Params.aspectRatio)
                && Objects.equals(this.textEncoding, pdf417Params.textEncoding)
                && Objects.equals(this.columns, pdf417Params.columns)
                && Objects.equals(this.compactionMode, pdf417Params.compactionMode)
                && Objects.equals(this.errorLevel, pdf417Params.errorLevel)
                && Objects.equals(this.macroFileID, pdf417Params.macroFileID)
                && Objects.equals(this.macroSegmentID, pdf417Params.macroSegmentID)
                && Objects.equals(this.macroSegmentsCount, pdf417Params.macroSegmentsCount)
                && Objects.equals(this.rows, pdf417Params.rows)
                && Objects.equals(this.truncate, pdf417Params.truncate)
                && Objects.equals(this.pdf417ECIEncoding, pdf417Params.pdf417ECIEncoding)
                && Objects.equals(this.isReaderInitialization, pdf417Params.isReaderInitialization)
                && Objects.equals(this.macroTimeStamp, pdf417Params.macroTimeStamp)
                && Objects.equals(this.macroSender, pdf417Params.macroSender)
                && Objects.equals(this.macroFileSize, pdf417Params.macroFileSize)
                && Objects.equals(this.macroChecksum, pdf417Params.macroChecksum)
                && Objects.equals(this.macroFileName, pdf417Params.macroFileName)
                && Objects.equals(this.macroAddressee, pdf417Params.macroAddressee)
                && Objects.equals(this.macroECIEncoding, pdf417Params.macroECIEncoding)
                && Objects.equals(this.code128Emulation, pdf417Params.code128Emulation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                aspectRatio,
                textEncoding,
                columns,
                compactionMode,
                errorLevel,
                macroFileID,
                macroSegmentID,
                macroSegmentsCount,
                rows,
                truncate,
                pdf417ECIEncoding,
                isReaderInitialization,
                macroTimeStamp,
                macroSender,
                macroFileSize,
                macroChecksum,
                macroFileName,
                macroAddressee,
                macroECIEncoding,
                code128Emulation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Pdf417Params {\n");

        sb.append("    aspectRatio: ").append(toIndentedString(aspectRatio)).append("\n");
        sb.append("    textEncoding: ").append(toIndentedString(textEncoding)).append("\n");
        sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
        sb.append("    compactionMode: ").append(toIndentedString(compactionMode)).append("\n");
        sb.append("    errorLevel: ").append(toIndentedString(errorLevel)).append("\n");
        sb.append("    macroFileID: ").append(toIndentedString(macroFileID)).append("\n");
        sb.append("    macroSegmentID: ").append(toIndentedString(macroSegmentID)).append("\n");
        sb.append("    macroSegmentsCount: ")
                .append(toIndentedString(macroSegmentsCount))
                .append("\n");
        sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
        sb.append("    truncate: ").append(toIndentedString(truncate)).append("\n");
        sb.append("    pdf417ECIEncoding: ")
                .append(toIndentedString(pdf417ECIEncoding))
                .append("\n");
        sb.append("    isReaderInitialization: ")
                .append(toIndentedString(isReaderInitialization))
                .append("\n");
        sb.append("    macroTimeStamp: ").append(toIndentedString(macroTimeStamp)).append("\n");
        sb.append("    macroSender: ").append(toIndentedString(macroSender)).append("\n");
        sb.append("    macroFileSize: ").append(toIndentedString(macroFileSize)).append("\n");
        sb.append("    macroChecksum: ").append(toIndentedString(macroChecksum)).append("\n");
        sb.append("    macroFileName: ").append(toIndentedString(macroFileName)).append("\n");
        sb.append("    macroAddressee: ").append(toIndentedString(macroAddressee)).append("\n");
        sb.append("    macroECIEncoding: ").append(toIndentedString(macroECIEncoding)).append("\n");
        sb.append("    code128Emulation: ").append(toIndentedString(code128Emulation)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first
     * line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
