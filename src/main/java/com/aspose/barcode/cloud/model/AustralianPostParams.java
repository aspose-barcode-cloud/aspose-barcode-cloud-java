// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="AustralianPostParams.java">
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

/** AustralianPost barcode parameters. */
@ApiModel(description = "AustralianPost barcode parameters.")
public class AustralianPostParams {
    @SerializedName(value = "encodingTable")
    private CustomerInformationInterpretingType encodingTable = null;

    @SerializedName(value = "shortBarHeight")
    private Double shortBarHeight = null;

    /**
     * Interpreting type for the Customer Information of AustralianPost, default to
     * CustomerInformationInterpretingType.Other&quot;
     *
     * @return encodingTable
     */
    @ApiModelProperty(value = "EncodingTable")
    public CustomerInformationInterpretingType getEncodingTable() {
        return encodingTable;
    }

    public void setEncodingTable(CustomerInformationInterpretingType encodingTable) {
        this.encodingTable = encodingTable;
    }

    /**
     * Short bar&#39;s height of AustralianPost barcode.
     *
     * @return shortBarHeight
     */
    @ApiModelProperty(value = "ShortBarHeight")
    public Double getShortBarHeight() {
        return shortBarHeight;
    }

    public void setShortBarHeight(Double shortBarHeight) {
        this.shortBarHeight = shortBarHeight;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AustralianPostParams australianPostParams = (AustralianPostParams) o;
        return Objects.equals(this.encodingTable, australianPostParams.encodingTable)
                && Objects.equals(this.shortBarHeight, australianPostParams.shortBarHeight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(encodingTable, shortBarHeight);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AustralianPostParams {\n");

        sb.append("    encodingTable: ").append(toIndentedString(encodingTable)).append("\n");
        sb.append("    shortBarHeight: ").append(toIndentedString(shortBarHeight)).append("\n");
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
