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
    @ApiModelProperty(value = "SupplementSpace")
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
