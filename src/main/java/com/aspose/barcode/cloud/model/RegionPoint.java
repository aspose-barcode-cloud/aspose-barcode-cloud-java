// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="RegionPoint.java">
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

/** Wrapper around Drawing.Point for proper specification. */
@ApiModel(description = "Wrapper around Drawing.Point for proper specification.")
public class RegionPoint {
    @SerializedName(value = "x")
    private Integer X = null;

    @SerializedName(value = "y")
    private Integer Y = null;

    /**
     * X-coordinate
     *
     * @return X
     */
    @ApiModelProperty(required = true, value = "X-coordinate")
    public Integer getX() {
        return X;
    }

    public void setX(Integer X) {
        this.X = X;
    }

    /**
     * Y-coordinate
     *
     * @return Y
     */
    @ApiModelProperty(required = true, value = "Y-coordinate")
    public Integer getY() {
        return Y;
    }

    public void setY(Integer Y) {
        this.Y = Y;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RegionPoint regionPoint = (RegionPoint) o;
        return Objects.equals(this.X, regionPoint.X) && Objects.equals(this.Y, regionPoint.Y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(X, Y);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RegionPoint {\n");

        sb.append("    X: ").append(toIndentedString(X)).append("\n");
        sb.append("    Y: ").append(toIndentedString(Y)).append("\n");
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
