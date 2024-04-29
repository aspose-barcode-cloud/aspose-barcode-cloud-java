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
     * CustomerInformationInterpretingType.Other
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
