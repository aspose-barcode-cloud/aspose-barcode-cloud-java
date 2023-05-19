// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="Code128Params.java">
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

/** Code128 params. */
@ApiModel(description = "Code128 params.")
public class Code128Params {
    @SerializedName(value = "encodeMode")
    private Code128EncodeMode encodeMode = null;

    /**
     * Encoding mode for Code128 barcodes. Code 128 specification Default value:
     * Code128EncodeMode.Auto.
     *
     * @return encodeMode
     */
    @ApiModelProperty(
            value =
                    "Encoding mode for Code128 barcodes. Code 128 specification Default value: Code128EncodeMode.Auto.")
    public Code128EncodeMode getEncodeMode() {
        return encodeMode;
    }

    public void setEncodeMode(Code128EncodeMode encodeMode) {
        this.encodeMode = encodeMode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Code128Params code128Params = (Code128Params) o;
        return Objects.equals(this.encodeMode, code128Params.encodeMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(encodeMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Code128Params {\n");

        sb.append("    encodeMode: ").append(toIndentedString(encodeMode)).append("\n");
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
