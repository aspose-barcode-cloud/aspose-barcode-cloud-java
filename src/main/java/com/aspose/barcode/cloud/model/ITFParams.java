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
    @ApiModelProperty(value = "BorderThickness")
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
    @ApiModelProperty(value = "BorderType")
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
    @ApiModelProperty(value = "QuietZoneCoef")
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
