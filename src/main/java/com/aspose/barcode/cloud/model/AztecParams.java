// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="AztecParams.java">
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

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/** Aztec parameters. */
@ApiModel(description = "Aztec parameters.")
public class AztecParams {
    @SerializedName(value = "aspectRatio")
    private Double aspectRatio = null;

    @SerializedName(value = "errorLevel")
    private Integer errorLevel = null;

    @SerializedName(value = "symbolMode")
    private AztecSymbolMode symbolMode = null;

    @SerializedName(value = "textEncoding")
    private String textEncoding = null;

    @SerializedName(value = "encodeMode")
    private AztecEncodeMode encodeMode = null;

    @SerializedName(value = "ecIEncoding")
    private ECIEncodings ecIEncoding = null;

    @SerializedName(value = "isReaderInitialization")
    private Boolean isReaderInitialization = null;

    @SerializedName(value = "layersCount")
    private Integer layersCount = null;

    /**
     * Height/Width ratio of 2D BarCode module.
     *
     * @return aspectRatio
     */
    @ApiModelProperty(value = "AspectRatio")
    public Double getAspectRatio() {
        return aspectRatio;
    }

    public void setAspectRatio(Double aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    /**
     * Level of error correction of Aztec types of barcode. Value should between 10 to 95.
     *
     * @return errorLevel
     */
    @ApiModelProperty(value = "ErrorLevel")
    public Integer getErrorLevel() {
        return errorLevel;
    }

    public void setErrorLevel(Integer errorLevel) {
        this.errorLevel = errorLevel;
    }

    /**
     * Aztec Symbol mode. Default value: AztecSymbolMode.Auto.
     *
     * @return symbolMode
     */
    @ApiModelProperty(value = "SymbolMode")
    public AztecSymbolMode getSymbolMode() {
        return symbolMode;
    }

    public void setSymbolMode(AztecSymbolMode symbolMode) {
        this.symbolMode = symbolMode;
    }

    /**
     * DEPRECATED: This property is obsolete and will be removed in future releases. Unicode symbols
     * detection and encoding will be processed in Auto mode with Extended Channel Interpretation
     * charset designator. Using of own encodings requires manual CodeText encoding into byte[]
     * array. @Deprecated() Sets the encoding of codetext.
     *
     * @return textEncoding
     */
    @ApiModelProperty(value = "TextEncoding")
    public String getTextEncoding() {
        return textEncoding;
    }

    public void setTextEncoding(String textEncoding) {
        this.textEncoding = textEncoding;
    }

    /**
     * Encoding mode for Aztec barcodes. Default value: Auto
     *
     * @return encodeMode
     */
    @ApiModelProperty(value = "EncodeMode")
    public AztecEncodeMode getEncodeMode() {
        return encodeMode;
    }

    public void setEncodeMode(AztecEncodeMode encodeMode) {
        this.encodeMode = encodeMode;
    }

    /**
     * Identifies ECI encoding. Used when AztecEncodeMode is Auto. Default value: ISO-8859-1.
     *
     * @return ecIEncoding
     */
    @ApiModelProperty(value = "EcIEncoding")
    public ECIEncodings getEcIEncoding() {
        return ecIEncoding;
    }

    public void setEcIEncoding(ECIEncodings ecIEncoding) {
        this.ecIEncoding = ecIEncoding;
    }

    /**
     * Used to instruct the reader to interpret the data contained within the symbol as programming
     * for reader initialization.
     *
     * @return isReaderInitialization
     */
    @ApiModelProperty(value = "IsReaderInitialization")
    public Boolean isIsReaderInitialization() {
        return isReaderInitialization;
    }

    public void setIsReaderInitialization(Boolean isReaderInitialization) {
        this.isReaderInitialization = isReaderInitialization;
    }

    /**
     * Gets or sets layers count of Aztec symbol. Layers count should be in range from 1 to 3 for
     * Compact mode and in range from 1 to 32 for Full Range mode. Default value: 0 (auto).
     *
     * @return layersCount
     */
    @ApiModelProperty(value = "LayersCount")
    public Integer getLayersCount() {
        return layersCount;
    }

    public void setLayersCount(Integer layersCount) {
        this.layersCount = layersCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AztecParams aztecParams = (AztecParams) o;
        return Objects.equals(this.aspectRatio, aztecParams.aspectRatio)
                && Objects.equals(this.errorLevel, aztecParams.errorLevel)
                && Objects.equals(this.symbolMode, aztecParams.symbolMode)
                && Objects.equals(this.textEncoding, aztecParams.textEncoding)
                && Objects.equals(this.encodeMode, aztecParams.encodeMode)
                && Objects.equals(this.ecIEncoding, aztecParams.ecIEncoding)
                && Objects.equals(this.isReaderInitialization, aztecParams.isReaderInitialization)
                && Objects.equals(this.layersCount, aztecParams.layersCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                aspectRatio,
                errorLevel,
                symbolMode,
                textEncoding,
                encodeMode,
                ecIEncoding,
                isReaderInitialization,
                layersCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AztecParams {\n");

        sb.append("    aspectRatio: ").append(toIndentedString(aspectRatio)).append("\n");
        sb.append("    errorLevel: ").append(toIndentedString(errorLevel)).append("\n");
        sb.append("    symbolMode: ").append(toIndentedString(symbolMode)).append("\n");
        sb.append("    textEncoding: ").append(toIndentedString(textEncoding)).append("\n");
        sb.append("    encodeMode: ").append(toIndentedString(encodeMode)).append("\n");
        sb.append("    ecIEncoding: ").append(toIndentedString(ecIEncoding)).append("\n");
        sb.append("    isReaderInitialization: ")
                .append(toIndentedString(isReaderInitialization))
                .append("\n");
        sb.append("    layersCount: ").append(toIndentedString(layersCount)).append("\n");
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
