package com.aspose.barcode.cloud.model;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/** Codablock parameters. */
@ApiModel(description = "Codablock parameters.")
public class CodablockParams {
    @SerializedName(value = "aspectRatio")
    private Double aspectRatio = null;

    @SerializedName(value = "columns")
    private Integer columns = null;

    @SerializedName(value = "rows")
    private Integer rows = null;

    /**
     * Height/Width ratio of 2D BarCode module.
     *
     * @return aspectRatio
     */
    @ApiModelProperty(value = "AspectRatio")
    public Double getAspectRatio() {
        return aspectRatio;
    }

    public void setAspectRatio(Double aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    /**
     * Columns count.
     *
     * @return columns
     */
    @ApiModelProperty(value = "Columns")
    public Integer getColumns() {
        return columns;
    }

    public void setColumns(Integer columns) {
        this.columns = columns;
    }

    /**
     * Rows count.
     *
     * @return rows
     */
    @ApiModelProperty(value = "Rows")
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
        CodablockParams codablockParams = (CodablockParams) o;
        return Objects.equals(this.aspectRatio, codablockParams.aspectRatio)
                && Objects.equals(this.columns, codablockParams.columns)
                && Objects.equals(this.rows, codablockParams.rows);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aspectRatio, columns, rows);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodablockParams {\n");

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
