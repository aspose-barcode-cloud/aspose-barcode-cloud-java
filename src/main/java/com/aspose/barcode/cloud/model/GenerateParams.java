package com.aspose.barcode.cloud.model;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/** Barcode generation parameters */
@ApiModel(description = "Barcode generation parameters")
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.8.0")
public class GenerateParams {
    @SerializedName(value = "barcodeType")
    private EncodeBarcodeType barcodeType;

    @SerializedName(value = "encodeData")
    private EncodeData encodeData;

    @SerializedName(value = "barcodeImageParams")
    private BarcodeImageParams barcodeImageParams;

    /**
     * .
     *
     * @param
     * @param
     */
    public GenerateParams(EncodeBarcodeType barcodeType, EncodeData encodeData) {
        this.barcodeType = barcodeType;
        this.encodeData = encodeData;
    }

    /**
     * Get barcodeType
     *
     * @return barcodeType
     */
    @ApiModelProperty(required = true, value = "barcodeType")
    public EncodeBarcodeType getBarcodeType() {
        return barcodeType;
    }

    public void setBarcodeType(EncodeBarcodeType barcodeType) {
        this.barcodeType = barcodeType;
    }

    /**
     * Get encodeData
     *
     * @return encodeData
     */
    @ApiModelProperty(required = true, value = "encodeData")
    public EncodeData getEncodeData() {
        return encodeData;
    }

    public void setEncodeData(EncodeData encodeData) {
        this.encodeData = encodeData;
    }

    /**
     * Get barcodeImageParams
     *
     * @return barcodeImageParams
     */
    @ApiModelProperty(value = "barcodeImageParams")
    public BarcodeImageParams getBarcodeImageParams() {
        return barcodeImageParams;
    }

    public void setBarcodeImageParams(BarcodeImageParams barcodeImageParams) {
        this.barcodeImageParams = barcodeImageParams;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GenerateParams generateParams = (GenerateParams) o;
        return Objects.equals(this.barcodeType, generateParams.barcodeType)
                && Objects.equals(this.encodeData, generateParams.encodeData)
                && Objects.equals(this.barcodeImageParams, generateParams.barcodeImageParams);
    }

    @Override
    public int hashCode() {
        return Objects.hash(barcodeType, encodeData, barcodeImageParams);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GenerateParams {\n");

        sb.append("    barcodeType: ").append(toIndentedString(barcodeType)).append("\n");
        sb.append("    encodeData: ").append(toIndentedString(encodeData)).append("\n");
        sb.append("    barcodeImageParams: ")
                .append(toIndentedString(barcodeImageParams))
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
