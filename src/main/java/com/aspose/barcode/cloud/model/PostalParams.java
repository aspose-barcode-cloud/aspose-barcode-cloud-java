package com.aspose.barcode.cloud.model;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/** Postal parameters. Used for Postnet, Planet. */
@ApiModel(description = "Postal parameters. Used for Postnet, Planet.")
public class PostalParams {
    @SerializedName(value = "shortBarHeight")
    private Double shortBarHeight = null;

    /**
     * Short bar&#39;s height of Postal barcodes.
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
        PostalParams postalParams = (PostalParams) o;
        return Objects.equals(this.shortBarHeight, postalParams.shortBarHeight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shortBarHeight);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostalParams {\n");

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
