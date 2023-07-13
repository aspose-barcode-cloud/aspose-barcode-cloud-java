// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="DataMatrixParams.java">
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

/** DataMatrix parameters. */
@ApiModel(description = "DataMatrix parameters.")
public class DataMatrixParams {
    @SerializedName(value = "aspectRatio")
    private Double aspectRatio = null;

    @SerializedName(value = "textEncoding")
    private String textEncoding = null;

    @SerializedName(value = "columns")
    private Integer columns = null;

    @SerializedName(value = "dataMatrixEcc")
    private DataMatrixEccType dataMatrixEcc = null;

    @SerializedName(value = "dataMatrixEncodeMode")
    private DataMatrixEncodeMode dataMatrixEncodeMode = null;

    @SerializedName(value = "rows")
    private Integer rows = null;

    @SerializedName(value = "macroCharacters")
    private MacroCharacter macroCharacters = null;

    /**
     * Height/Width ratio of 2D BarCode module
     *
     * @return aspectRatio
     */
    @ApiModelProperty(value = "Height/Width ratio of 2D BarCode module")
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
     * DEPRECATED: Will be replaced with &#39;DataMatrix.Version&#39; in the next release Columns
     * count.
     *
     * @return columns
     */
    @ApiModelProperty(
            value =
                    "DEPRECATED: Will be replaced with 'DataMatrix.Version' in the next release  Columns count.")
    public Integer getColumns() {
        return columns;
    }

    public void setColumns(Integer columns) {
        this.columns = columns;
    }

    /**
     * Datamatrix ECC type. Default value: DataMatrixEccType.Ecc200.
     *
     * @return dataMatrixEcc
     */
    @ApiModelProperty(value = "Datamatrix ECC type. Default value: DataMatrixEccType.Ecc200.")
    public DataMatrixEccType getDataMatrixEcc() {
        return dataMatrixEcc;
    }

    public void setDataMatrixEcc(DataMatrixEccType dataMatrixEcc) {
        this.dataMatrixEcc = dataMatrixEcc;
    }

    /**
     * Encode mode of Datamatrix barcode. Default value: DataMatrixEncodeMode.Auto.
     *
     * @return dataMatrixEncodeMode
     */
    @ApiModelProperty(
            value = "Encode mode of Datamatrix barcode. Default value: DataMatrixEncodeMode.Auto.")
    public DataMatrixEncodeMode getDataMatrixEncodeMode() {
        return dataMatrixEncodeMode;
    }

    public void setDataMatrixEncodeMode(DataMatrixEncodeMode dataMatrixEncodeMode) {
        this.dataMatrixEncodeMode = dataMatrixEncodeMode;
    }

    /**
     * DEPRECATED: Will be replaced with &#39;DataMatrix.Version&#39; in the next release Rows
     * count.
     *
     * @return rows
     */
    @ApiModelProperty(
            value =
                    "DEPRECATED: Will be replaced with 'DataMatrix.Version' in the next release  Rows count.")
    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    /**
     * Macro Characters 05 and 06 values are used to obtain more compact encoding in special modes.
     * Can be used only with DataMatrixEccType.Ecc200 or DataMatrixEccType.EccAuto. Cannot be used
     * with EncodeTypes.GS1DataMatrix Default value: MacroCharacters.None.
     *
     * @return macroCharacters
     */
    @ApiModelProperty(
            value =
                    "Macro Characters 05 and 06 values are used to obtain more compact encoding in special modes. Can be used only with DataMatrixEccType.Ecc200 or DataMatrixEccType.EccAuto. Cannot be used with EncodeTypes.GS1DataMatrix Default value: MacroCharacters.None.")
    public MacroCharacter getMacroCharacters() {
        return macroCharacters;
    }

    public void setMacroCharacters(MacroCharacter macroCharacters) {
        this.macroCharacters = macroCharacters;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DataMatrixParams dataMatrixParams = (DataMatrixParams) o;
        return Objects.equals(this.aspectRatio, dataMatrixParams.aspectRatio)
                && Objects.equals(this.textEncoding, dataMatrixParams.textEncoding)
                && Objects.equals(this.columns, dataMatrixParams.columns)
                && Objects.equals(this.dataMatrixEcc, dataMatrixParams.dataMatrixEcc)
                && Objects.equals(this.dataMatrixEncodeMode, dataMatrixParams.dataMatrixEncodeMode)
                && Objects.equals(this.rows, dataMatrixParams.rows)
                && Objects.equals(this.macroCharacters, dataMatrixParams.macroCharacters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                aspectRatio,
                textEncoding,
                columns,
                dataMatrixEcc,
                dataMatrixEncodeMode,
                rows,
                macroCharacters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataMatrixParams {\n");

        sb.append("    aspectRatio: ").append(toIndentedString(aspectRatio)).append("\n");
        sb.append("    textEncoding: ").append(toIndentedString(textEncoding)).append("\n");
        sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
        sb.append("    dataMatrixEcc: ").append(toIndentedString(dataMatrixEcc)).append("\n");
        sb.append("    dataMatrixEncodeMode: ")
                .append(toIndentedString(dataMatrixEncodeMode))
                .append("\n");
        sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
        sb.append("    macroCharacters: ").append(toIndentedString(macroCharacters)).append("\n");
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
