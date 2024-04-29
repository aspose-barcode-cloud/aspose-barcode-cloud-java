package com.aspose.barcode.cloud.model;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/** Font. */
@ApiModel(description = "Font.")
public class FontParams {
    @SerializedName(value = "family")
    private String family = null;

    @SerializedName(value = "size")
    private Double size = null;

    @SerializedName(value = "style")
    private FontStyle style = null;

    /**
     * Font family.
     *
     * @return family
     */
    @ApiModelProperty(value = "Family")
    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    /**
     * Font size in units.
     *
     * @return size
     */
    @ApiModelProperty(value = "Size")
    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    /**
     * Font style.
     *
     * @return style
     */
    @ApiModelProperty(value = "Style")
    public FontStyle getStyle() {
        return style;
    }

    public void setStyle(FontStyle style) {
        this.style = style;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FontParams fontParams = (FontParams) o;
        return Objects.equals(this.family, fontParams.family)
                && Objects.equals(this.size, fontParams.size)
                && Objects.equals(this.style, fontParams.style);
    }

    @Override
    public int hashCode() {
        return Objects.hash(family, size, style);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FontParams {\n");

        sb.append("    family: ").append(toIndentedString(family)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    style: ").append(toIndentedString(style)).append("\n");
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
