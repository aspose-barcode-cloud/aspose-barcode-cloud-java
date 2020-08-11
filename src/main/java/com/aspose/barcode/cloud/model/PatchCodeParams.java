// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="PatchCodeParams.java">
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

/** PatchCode parameters. */
@ApiModel(description = "PatchCode parameters.")
public class PatchCodeParams {
    @SerializedName(value = "extraBarcodeText")
    private String extraBarcodeText = null;

    @SerializedName(value = "patchFormat")
    private PatchFormat patchFormat = null;

    /**
     * Specifies codetext for an extra QR barcode, when PatchCode is generated in page mode.
     *
     * @return extraBarcodeText
     */
    @ApiModelProperty(
            value =
                    "Specifies codetext for an extra QR barcode, when PatchCode is generated in"
                        + " page mode.")
    public String getExtraBarcodeText() {
        return extraBarcodeText;
    }

    public void setExtraBarcodeText(String extraBarcodeText) {
        this.extraBarcodeText = extraBarcodeText;
    }

    /**
     * PatchCode format. Choose PatchOnly to generate single PatchCode. Use page format to generate
     * Patch page with PatchCodes as borders. Default value: PatchFormat.PatchOnly
     *
     * @return patchFormat
     */
    @ApiModelProperty(
            value =
                    "PatchCode format. Choose PatchOnly to generate single PatchCode. Use page"
                        + " format to generate Patch page with PatchCodes as borders. Default"
                        + " value: PatchFormat.PatchOnly")
    public PatchFormat getPatchFormat() {
        return patchFormat;
    }

    public void setPatchFormat(PatchFormat patchFormat) {
        this.patchFormat = patchFormat;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PatchCodeParams patchCodeParams = (PatchCodeParams) o;
        return Objects.equals(this.extraBarcodeText, patchCodeParams.extraBarcodeText)
                && Objects.equals(this.patchFormat, patchCodeParams.patchFormat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(extraBarcodeText, patchFormat);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PatchCodeParams {\n");

        sb.append("    extraBarcodeText: ").append(toIndentedString(extraBarcodeText)).append("\n");
        sb.append("    patchFormat: ").append(toIndentedString(patchFormat)).append("\n");
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
