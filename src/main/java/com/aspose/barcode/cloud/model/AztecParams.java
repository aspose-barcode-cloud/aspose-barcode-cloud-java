// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="AztecParams.java">
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
     * Sets the encoding of codetext.
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
                && Objects.equals(this.textEncoding, aztecParams.textEncoding);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aspectRatio, errorLevel, symbolMode, textEncoding);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AztecParams {\n");

        sb.append("    aspectRatio: ").append(toIndentedString(aspectRatio)).append("\n");
        sb.append("    errorLevel: ").append(toIndentedString(errorLevel)).append("\n");
        sb.append("    symbolMode: ").append(toIndentedString(symbolMode)).append("\n");
        sb.append("    textEncoding: ").append(toIndentedString(textEncoding)).append("\n");
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
