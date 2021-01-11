// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="Code16KParams.java">
//   Copyright (c) 2021 Aspose.BarCode for Cloud
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

/** Code16K parameters. */
@ApiModel(description = "Code16K parameters.")
public class Code16KParams {
    @SerializedName(value = "aspectRatio")
    private Double aspectRatio = null;

    @SerializedName(value = "quietZoneLeftCoef")
    private Integer quietZoneLeftCoef = null;

    @SerializedName(value = "quietZoneRightCoef")
    private Integer quietZoneRightCoef = null;

    /**
     * Height/Width ratio of 2D BarCode module.
     *
     * @return aspectRatio
     */
    @ApiModelProperty(value = "Height/Width ratio of 2D BarCode module.")
    public Double getAspectRatio() {
        return aspectRatio;
    }

    public void setAspectRatio(Double aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    /**
     * Size of the left quiet zone in xDimension. Default value: 10, meaning if xDimension &#x3D;
     * 2px than left quiet zone will be 20px.
     *
     * @return quietZoneLeftCoef
     */
    @ApiModelProperty(
            value =
                    "Size of the left quiet zone in xDimension. Default value: 10, meaning if"
                            + " xDimension = 2px than left quiet zone will be 20px.")
    public Integer getQuietZoneLeftCoef() {
        return quietZoneLeftCoef;
    }

    public void setQuietZoneLeftCoef(Integer quietZoneLeftCoef) {
        this.quietZoneLeftCoef = quietZoneLeftCoef;
    }

    /**
     * Size of the right quiet zone in xDimension. Default value: 1, meaning if xDimension &#x3D;
     * 2px than right quiet zone will be 2px.
     *
     * @return quietZoneRightCoef
     */
    @ApiModelProperty(
            value =
                    "Size of the right quiet zone in xDimension. Default value: 1, meaning if"
                            + " xDimension = 2px than right quiet zone will be 2px.")
    public Integer getQuietZoneRightCoef() {
        return quietZoneRightCoef;
    }

    public void setQuietZoneRightCoef(Integer quietZoneRightCoef) {
        this.quietZoneRightCoef = quietZoneRightCoef;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Code16KParams code16KParams = (Code16KParams) o;
        return Objects.equals(this.aspectRatio, code16KParams.aspectRatio)
                && Objects.equals(this.quietZoneLeftCoef, code16KParams.quietZoneLeftCoef)
                && Objects.equals(this.quietZoneRightCoef, code16KParams.quietZoneRightCoef);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aspectRatio, quietZoneLeftCoef, quietZoneRightCoef);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Code16KParams {\n");

        sb.append("    aspectRatio: ").append(toIndentedString(aspectRatio)).append("\n");
        sb.append("    quietZoneLeftCoef: ")
                .append(toIndentedString(quietZoneLeftCoef))
                .append("\n");
        sb.append("    quietZoneRightCoef: ")
                .append(toIndentedString(quietZoneRightCoef))
                .append("\n");
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
