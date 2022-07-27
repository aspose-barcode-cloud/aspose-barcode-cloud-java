// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="CouponParams.java">
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

/** Coupon parameters. Used for UpcaGs1DatabarCoupon, UpcaGs1Code128Coupon. */
@ApiModel(description = "Coupon parameters. Used for UpcaGs1DatabarCoupon, UpcaGs1Code128Coupon.")
public class CouponParams {
    @SerializedName(value = "supplementSpace")
    private Double supplementSpace = null;

    /**
     * Space between main the BarCode and supplement BarCode in Unit value.
     *
     * @return supplementSpace
     */
    @ApiModelProperty(
            value = "Space between main the BarCode and supplement BarCode in Unit value.")
    public Double getSupplementSpace() {
        return supplementSpace;
    }

    public void setSupplementSpace(Double supplementSpace) {
        this.supplementSpace = supplementSpace;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CouponParams couponParams = (CouponParams) o;
        return Objects.equals(this.supplementSpace, couponParams.supplementSpace);
    }

    @Override
    public int hashCode() {
        return Objects.hash(supplementSpace);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CouponParams {\n");

        sb.append("    supplementSpace: ").append(toIndentedString(supplementSpace)).append("\n");
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
