// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="Padding.java">
//   Copyright (c) 2020 Aspose.BarCode for Cloud
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
    @ApiModelProperty(value = "Left padding.")
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
    @ApiModelProperty(value = "Right padding.")
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
    @ApiModelProperty(value = "Top padding.")
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
    @ApiModelProperty(value = "Bottom padding.")
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
