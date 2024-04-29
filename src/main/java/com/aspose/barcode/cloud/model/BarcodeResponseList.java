package com.aspose.barcode.cloud.model;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Represents information about barcode list. */
@ApiModel(description = "Represents information about barcode list.")
public class BarcodeResponseList {
    @SerializedName(value = "barcodes")
    private List<BarcodeResponse> barcodes = null;

    /** Add BarcodeResponse. */
    public void addBarcodesItem(BarcodeResponse barcodesItem) {
        if (this.barcodes == null) {
            this.barcodes = new ArrayList<BarcodeResponse>();
        }
        this.barcodes.add(barcodesItem);
    }

    /**
     * List of barcodes which are present in image.
     *
     * @return barcodes
     */
    @ApiModelProperty(value = "Barcodes")
    public List<BarcodeResponse> getBarcodes() {
        return barcodes;
    }

    public void setBarcodes(List<BarcodeResponse> barcodes) {
        this.barcodes = barcodes;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BarcodeResponseList barcodeResponseList = (BarcodeResponseList) o;
        return Objects.equals(this.barcodes, barcodeResponseList.barcodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(barcodes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BarcodeResponseList {\n");

        sb.append("    barcodes: ").append(toIndentedString(barcodes)).append("\n");
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
