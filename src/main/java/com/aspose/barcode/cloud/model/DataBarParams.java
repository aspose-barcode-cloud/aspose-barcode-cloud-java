// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="DataBarParams.java">
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

/** Databar parameters. */
@ApiModel(description = "Databar parameters.")
public class DataBarParams {
    @SerializedName(value = "aspectRatio")
    private Double aspectRatio = null;

    @SerializedName(value = "columns")
    private Integer columns = null;

    @SerializedName(value = "rows")
    private Integer rows = null;

    public DataBarParams aspectRatio(Double aspectRatio) {
        this.aspectRatio = aspectRatio;
        return this;
    }

    /**
     * Height/Width ratio of 2D BarCode module. Used for DataBar stacked.
     *
     * @return aspectRatio
     */
    @ApiModelProperty(value = "Height/Width ratio of 2D BarCode module. Used for DataBar stacked.")
    public Double getAspectRatio() {
        return aspectRatio;
    }

    public void setAspectRatio(Double aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    public DataBarParams columns(Integer columns) {
        this.columns = columns;
        return this;
    }

    /**
     * Columns count.
     *
     * @return columns
     */
    @ApiModelProperty(value = "Columns count.")
    public Integer getColumns() {
        return columns;
    }

    public void setColumns(Integer columns) {
        this.columns = columns;
    }

    public DataBarParams rows(Integer rows) {
        this.rows = rows;
        return this;
    }

    /**
     * Rows count.
     *
     * @return rows
     */
    @ApiModelProperty(value = "Rows count.")
    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DataBarParams dataBarParams = (DataBarParams) o;
        return Objects.equals(this.aspectRatio, dataBarParams.aspectRatio)
                && Objects.equals(this.columns, dataBarParams.columns)
                && Objects.equals(this.rows, dataBarParams.rows);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aspectRatio, columns, rows);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataBarParams {\n");

        sb.append("    aspectRatio: ").append(toIndentedString(aspectRatio)).append("\n");
        sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
        sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
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
