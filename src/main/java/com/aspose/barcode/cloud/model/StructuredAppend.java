// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="StructuredAppend.java">
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

/** QR structured append parameters. */
@ApiModel(description = "QR structured append parameters.")
public class StructuredAppend {
    @SerializedName(value = "sequenceIndicator")
    private Integer sequenceIndicator = null;

    @SerializedName(value = "totalCount")
    private Integer totalCount = null;

    @SerializedName(value = "parityByte")
    private Integer parityByte = null;

    /**
     * The index of the QR structured append mode barcode. Index starts from 0.
     *
     * @return sequenceIndicator
     */
    @ApiModelProperty(
            value = "The index of the QR structured append mode barcode. Index starts from 0.")
    public Integer getSequenceIndicator() {
        return sequenceIndicator;
    }

    public void setSequenceIndicator(Integer sequenceIndicator) {
        this.sequenceIndicator = sequenceIndicator;
    }

    /**
     * QR structured append mode barcodes quantity. Max value is 16.
     *
     * @return totalCount
     */
    @ApiModelProperty(value = "QR structured append mode barcodes quantity. Max value is 16.")
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * QR structured append mode parity data.
     *
     * @return parityByte
     */
    @ApiModelProperty(value = "QR structured append mode parity data.")
    public Integer getParityByte() {
        return parityByte;
    }

    public void setParityByte(Integer parityByte) {
        this.parityByte = parityByte;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StructuredAppend structuredAppend = (StructuredAppend) o;
        return Objects.equals(this.sequenceIndicator, structuredAppend.sequenceIndicator)
                && Objects.equals(this.totalCount, structuredAppend.totalCount)
                && Objects.equals(this.parityByte, structuredAppend.parityByte);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sequenceIndicator, totalCount, parityByte);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StructuredAppend {\n");

        sb.append("    sequenceIndicator: ")
                .append(toIndentedString(sequenceIndicator))
                .append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    parityByte: ").append(toIndentedString(parityByte)).append("\n");
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
