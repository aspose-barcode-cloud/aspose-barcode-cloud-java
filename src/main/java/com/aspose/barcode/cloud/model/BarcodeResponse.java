// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="BarcodeResponse.java">
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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Represents information about barcode. */
@ApiModel(description = "Represents information about barcode.")
public class BarcodeResponse {
    @SerializedName(value = "barcodeValue")
    private String barcodeValue = null;

    @SerializedName(value = "type")
    private String type = null;

    @SerializedName(value = "region")
    private List<RegionPoint> region = null;

    @SerializedName(value = "checksum")
    private String checksum = null;

    /**
     * Barcode data.
     *
     * @return barcodeValue
     */
    @ApiModelProperty(value = "Barcode data.")
    public String getBarcodeValue() {
        return barcodeValue;
    }

    public void setBarcodeValue(String barcodeValue) {
        this.barcodeValue = barcodeValue;
    }

    /**
     * Type of the barcode.
     *
     * @return type
     */
    @ApiModelProperty(value = "Type of the barcode.")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BarcodeResponse addRegionItem(RegionPoint regionItem) {
        if (this.region == null) {
            this.region = new ArrayList<RegionPoint>();
        }
        this.region.add(regionItem);
        return this;
    }

    /**
     * Region with barcode.
     *
     * @return region
     */
    @ApiModelProperty(value = "Region with barcode.")
    public List<RegionPoint> getRegion() {
        return region;
    }

    public void setRegion(List<RegionPoint> region) {
        this.region = region;
    }

    /**
     * Checksum of barcode.
     *
     * @return checksum
     */
    @ApiModelProperty(value = "Checksum of barcode.")
    public String getChecksum() {
        return checksum;
    }

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BarcodeResponse barcodeResponse = (BarcodeResponse) o;
        return Objects.equals(this.barcodeValue, barcodeResponse.barcodeValue)
                && Objects.equals(this.type, barcodeResponse.type)
                && Objects.equals(this.region, barcodeResponse.region)
                && Objects.equals(this.checksum, barcodeResponse.checksum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(barcodeValue, type, region, checksum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BarcodeResponse {\n");

        sb.append("    barcodeValue: ").append(toIndentedString(barcodeValue)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
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
