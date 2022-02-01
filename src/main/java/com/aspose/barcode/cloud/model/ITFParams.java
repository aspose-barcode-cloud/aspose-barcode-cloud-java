// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="ITFParams.java">
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

import java.util.Objects;

/** ITF parameters. */
@ApiModel(description = "ITF parameters.")
public class ITFParams {
    @SerializedName(value = "borderThickness")
    private Double borderThickness = null;

    @SerializedName(value = "borderType")
    private ITF14BorderType borderType = null;

    @SerializedName(value = "quietZoneCoef")
    private Integer quietZoneCoef = null;

    /**
     * ITF border (bearer bar) thickness in Unit value. Default value: 12pt.
     *
     * @return borderThickness
     */
    @ApiModelProperty(
            value = "ITF border (bearer bar) thickness in Unit value. Default value: 12pt.")
    public Double getBorderThickness() {
        return borderThickness;
    }

    public void setBorderThickness(Double borderThickness) {
        this.borderThickness = borderThickness;
    }

    /**
     * Border type of ITF barcode. Default value: ITF14BorderType.Bar.
     *
     * @return borderType
     */
    @ApiModelProperty(value = "Border type of ITF barcode. Default value: ITF14BorderType.Bar.")
    public ITF14BorderType getBorderType() {
        return borderType;
    }

    public void setBorderType(ITF14BorderType borderType) {
        this.borderType = borderType;
    }

    /**
     * Size of the quiet zones in xDimension. Default value: 10, meaning if xDimension &#x3D; 2px
     * than quiet zones will be 20px.
     *
     * @return quietZoneCoef
     */
    @ApiModelProperty(
            value =
                    "Size of the quiet zones in xDimension. Default value: 10, meaning if"
                            + " xDimension = 2px than quiet zones will be 20px.")
    public Integer getQuietZoneCoef() {
        return quietZoneCoef;
    }

    public void setQuietZoneCoef(Integer quietZoneCoef) {
        this.quietZoneCoef = quietZoneCoef;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ITFParams itFParams = (ITFParams) o;
        return Objects.equals(this.borderThickness, itFParams.borderThickness)
                && Objects.equals(this.borderType, itFParams.borderType)
                && Objects.equals(this.quietZoneCoef, itFParams.quietZoneCoef);
    }

    @Override
    public int hashCode() {
        return Objects.hash(borderThickness, borderType, quietZoneCoef);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ITFParams {\n");

        sb.append("    borderThickness: ").append(toIndentedString(borderThickness)).append("\n");
        sb.append("    borderType: ").append(toIndentedString(borderType)).append("\n");
        sb.append("    quietZoneCoef: ").append(toIndentedString(quietZoneCoef)).append("\n");
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
