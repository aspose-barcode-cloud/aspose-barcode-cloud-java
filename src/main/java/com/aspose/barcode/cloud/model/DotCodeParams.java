// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="DotCodeParams.java">
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

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** DotCode parameters. */
@ApiModel(description = "DotCode parameters.")
public class DotCodeParams {
    @SerializedName(value = "aspectRatio")
    private Double aspectRatio = null;

    @SerializedName(value = "columns")
    private Integer columns = null;

    @SerializedName(value = "encodeMode")
    private DotCodeEncodeMode encodeMode = null;

    @SerializedName(value = "ecIEncoding")
    private ECIEncodings ecIEncoding = null;

    @SerializedName(value = "isReaderInitialization")
    private Boolean isReaderInitialization = null;

    @SerializedName(value = "rows")
    private Integer rows = null;

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
     * Identifies columns count. Sum of the number of rows plus the number of columns of a DotCode
     * symbol must be odd. Number of columns must be at least 5.
     *
     * @return columns
     */
    @ApiModelProperty(
            value =
                    "Identifies columns count. Sum of the number of rows plus the number of columns of a DotCode symbol must be odd. Number of columns must be at least 5.")
    public Integer getColumns() {
        return columns;
    }

    public void setColumns(Integer columns) {
        this.columns = columns;
    }

    /**
     * Identifies DotCode encode mode. Default value: Auto.
     *
     * @return encodeMode
     */
    @ApiModelProperty(value = "Identifies DotCode encode mode. Default value: Auto.")
    public DotCodeEncodeMode getEncodeMode() {
        return encodeMode;
    }

    public void setEncodeMode(DotCodeEncodeMode encodeMode) {
        this.encodeMode = encodeMode;
    }

    /**
     * Identifies ECI encoding. Used when DotCodeEncodeMode is Auto. Default value: ISO-8859-1.
     *
     * @return ecIEncoding
     */
    @ApiModelProperty(
            value =
                    "Identifies ECI encoding. Used when DotCodeEncodeMode is Auto. Default value: ISO-8859-1.")
    public ECIEncodings getEcIEncoding() {
        return ecIEncoding;
    }

    public void setEcIEncoding(ECIEncodings ecIEncoding) {
        this.ecIEncoding = ecIEncoding;
    }

    /**
     * Indicates whether code is used for instruct reader to interpret the following data as
     * instructions for initialization or reprogramming of the bar code reader. Default value is
     * false.
     *
     * @return isReaderInitialization
     */
    @ApiModelProperty(
            value =
                    "Indicates whether code is used for instruct reader to interpret the following data as instructions for initialization or reprogramming of the bar code reader. Default value is false.")
    public Boolean isIsReaderInitialization() {
        return isReaderInitialization;
    }

    public void setIsReaderInitialization(Boolean isReaderInitialization) {
        this.isReaderInitialization = isReaderInitialization;
    }

    /**
     * Identifies rows count. Sum of the number of rows plus the number of columns of a DotCode
     * symbol must be odd. Number of rows must be at least 5.
     *
     * @return rows
     */
    @ApiModelProperty(
            value =
                    "Identifies rows count. Sum of the number of rows plus the number of columns of a DotCode symbol must be odd. Number of rows must be at least 5.")
    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DotCodeParams dotCodeParams = (DotCodeParams) o;
        return Objects.equals(this.aspectRatio, dotCodeParams.aspectRatio)
                && Objects.equals(this.columns, dotCodeParams.columns)
                && Objects.equals(this.encodeMode, dotCodeParams.encodeMode)
                && Objects.equals(this.ecIEncoding, dotCodeParams.ecIEncoding)
                && Objects.equals(this.isReaderInitialization, dotCodeParams.isReaderInitialization)
                && Objects.equals(this.rows, dotCodeParams.rows);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                aspectRatio, columns, encodeMode, ecIEncoding, isReaderInitialization, rows);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DotCodeParams {\n");

        sb.append("    aspectRatio: ").append(toIndentedString(aspectRatio)).append("\n");
        sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
        sb.append("    encodeMode: ").append(toIndentedString(encodeMode)).append("\n");
        sb.append("    ecIEncoding: ").append(toIndentedString(ecIEncoding)).append("\n");
        sb.append("    isReaderInitialization: ")
                .append(toIndentedString(isReaderInitialization))
                .append("\n");
        sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
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
