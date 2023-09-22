// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="FontParams.java">
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
