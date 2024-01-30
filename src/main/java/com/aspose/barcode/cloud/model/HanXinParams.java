// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="HanXinParams.java">
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

/** HanXin params. */
@ApiModel(description = "HanXin params.")
public class HanXinParams {
    @SerializedName(value = "encodeMode")
    private HanXinEncodeMode encodeMode = null;

    @SerializedName(value = "errorLevel")
    private HanXinErrorLevel errorLevel = null;

    @SerializedName(value = "version")
    private HanXinVersion version = null;

    @SerializedName(value = "ecIEncoding")
    private ECIEncodings ecIEncoding = null;

    /**
     * Encoding mode for XanXin barcodes. Default value: HanXinEncodeMode.Auto.
     *
     * @return encodeMode
     */
    @ApiModelProperty(value = "EncodeMode")
    public HanXinEncodeMode getEncodeMode() {
        return encodeMode;
    }

    public void setEncodeMode(HanXinEncodeMode encodeMode) {
        this.encodeMode = encodeMode;
    }

    /**
     * Allowed Han Xin error correction levels from L1 to L4. Default value: HanXinErrorLevel.L1.
     *
     * @return errorLevel
     */
    @ApiModelProperty(value = "ErrorLevel")
    public HanXinErrorLevel getErrorLevel() {
        return errorLevel;
    }

    public void setErrorLevel(HanXinErrorLevel errorLevel) {
        this.errorLevel = errorLevel;
    }

    /**
     * Allowed Han Xin versions, Auto and Version01 - Version84. Default value: HanXinVersion.Auto.
     *
     * @return version
     */
    @ApiModelProperty(value = "Version")
    public HanXinVersion getVersion() {
        return version;
    }

    public void setVersion(HanXinVersion version) {
        this.version = version;
    }

    /**
     * Extended Channel Interpretation Identifiers. It is used to tell the barcode reader details
     * about the used references for encoding the data in the symbol. Current implementation
     * consists all well known charset encodings. Default value: ECIEncodings.ISO_8859_1
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HanXinParams hanXinParams = (HanXinParams) o;
        return Objects.equals(this.encodeMode, hanXinParams.encodeMode)
                && Objects.equals(this.errorLevel, hanXinParams.errorLevel)
                && Objects.equals(this.version, hanXinParams.version)
                && Objects.equals(this.ecIEncoding, hanXinParams.ecIEncoding);
    }

    @Override
    public int hashCode() {
        return Objects.hash(encodeMode, errorLevel, version, ecIEncoding);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HanXinParams {\n");

        sb.append("    encodeMode: ").append(toIndentedString(encodeMode)).append("\n");
        sb.append("    errorLevel: ").append(toIndentedString(errorLevel)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    ecIEncoding: ").append(toIndentedString(ecIEncoding)).append("\n");
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
