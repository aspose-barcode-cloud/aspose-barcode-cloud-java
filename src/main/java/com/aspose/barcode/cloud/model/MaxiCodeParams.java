package com.aspose.barcode.cloud.model;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/** MaxiCode parameters. */
@ApiModel(description = "MaxiCode parameters.")
public class MaxiCodeParams {
    @SerializedName(value = "aspectRatio")
    private Double aspectRatio = null;

    @SerializedName(value = "mode")
    private MaxiCodeMode mode = null;

    @SerializedName(value = "encodeMode")
    private MaxiCodeEncodeMode encodeMode = null;

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
     * Mode for MaxiCode barcodes.
     *
     * @return mode
     */
    @ApiModelProperty(value = "Mode")
    public MaxiCodeMode getMode() {
        return mode;
    }

    public void setMode(MaxiCodeMode mode) {
        this.mode = mode;
    }

    /**
     * Encoding mode for MaxiCode barcodes.
     *
     * @return encodeMode
     */
    @ApiModelProperty(value = "EncodeMode")
    public MaxiCodeEncodeMode getEncodeMode() {
        return encodeMode;
    }

    public void setEncodeMode(MaxiCodeEncodeMode encodeMode) {
        this.encodeMode = encodeMode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MaxiCodeParams maxiCodeParams = (MaxiCodeParams) o;
        return Objects.equals(this.aspectRatio, maxiCodeParams.aspectRatio)
                && Objects.equals(this.mode, maxiCodeParams.mode)
                && Objects.equals(this.encodeMode, maxiCodeParams.encodeMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aspectRatio, mode, encodeMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MaxiCodeParams {\n");

        sb.append("    aspectRatio: ").append(toIndentedString(aspectRatio)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    encodeMode: ").append(toIndentedString(encodeMode)).append("\n");
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
