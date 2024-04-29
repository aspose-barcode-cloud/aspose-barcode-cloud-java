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
    @ApiModelProperty(value = "BarcodeValue")
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
    @ApiModelProperty(value = "Type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /** Add RegionPoint. */
    public void addRegionItem(RegionPoint regionItem) {
        if (this.region == null) {
            this.region = new ArrayList<RegionPoint>();
        }
        this.region.add(regionItem);
    }

    /**
     * Region with barcode.
     *
     * @return region
     */
    @ApiModelProperty(value = "Region")
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
    @ApiModelProperty(value = "Checksum")
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
