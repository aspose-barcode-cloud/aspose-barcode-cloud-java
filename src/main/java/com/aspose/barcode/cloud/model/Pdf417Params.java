// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="Pdf417Params.java">
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

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

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
                    "Pdf417 symbology type of BarCode's compaction mode. Default value:"
                            + " Pdf417CompactionMode.Auto.")
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
                    "Pdf417 symbology type of BarCode's error correction level ranging from level0"
                            + " to level8, level0 means no error correction info, level8 means best"
                            + " error correction which means a larger picture.")
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
                    "Macro Pdf417 barcode's segment ID, which starts from 0, to MacroSegmentsCount"
                            + " - 1.")
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
                && Objects.equals(this.truncate, pdf417Params.truncate);
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
                truncate);
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
