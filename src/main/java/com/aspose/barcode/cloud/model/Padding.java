package com.aspose.barcode.cloud.model;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/** Padding around barcode. */
@ApiModel(description = "Padding around barcode.")
public class Padding {
    @SerializedName(value = "left")
    private Double left = null;

    @SerializedName(value = "right")
    private Double right = null;

    @SerializedName(value = "top")
    private Double top = null;

    @SerializedName(value = "bottom")
    private Double bottom = null;

    /**
     * Left padding.
     *
     * @return left
     */
    @ApiModelProperty(value = "Left")
    public Double getLeft() {
        return left;
    }

    public void setLeft(Double left) {
        this.left = left;
    }

    /**
     * Right padding.
     *
     * @return right
     */
    @ApiModelProperty(value = "Right")
    public Double getRight() {
        return right;
    }

    public void setRight(Double right) {
        this.right = right;
    }

    /**
     * Top padding.
     *
     * @return top
     */
    @ApiModelProperty(value = "Top")
    public Double getTop() {
        return top;
    }

    public void setTop(Double top) {
        this.top = top;
    }

    /**
     * Bottom padding.
     *
     * @return bottom
     */
    @ApiModelProperty(value = "Bottom")
    public Double getBottom() {
        return bottom;
    }

    public void setBottom(Double bottom) {
        this.bottom = bottom;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Padding padding = (Padding) o;
        return Objects.equals(this.left, padding.left)
                && Objects.equals(this.right, padding.right)
                && Objects.equals(this.top, padding.top)
                && Objects.equals(this.bottom, padding.bottom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(left, right, top, bottom);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Padding {\n");

        sb.append("    left: ").append(toIndentedString(left)).append("\n");
        sb.append("    right: ").append(toIndentedString(right)).append("\n");
        sb.append("    top: ").append(toIndentedString(top)).append("\n");
        sb.append("    bottom: ").append(toIndentedString(bottom)).append("\n");
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
