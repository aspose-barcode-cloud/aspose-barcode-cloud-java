package com.aspose.barcode.cloud.model;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/** Data to encode in barcode */
@ApiModel(description = "Data to encode in barcode")
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.8.0")
public class EncodeData {
    @SerializedName(value = "dataType")
    private EncodeDataType dataType;

    @SerializedName(value = "data")
    private String data;

    /**
     * .
     *
     * @param String represents data to encode
     */
    public EncodeData(String data) {
        this.data = data;
    }

    /**
     * Get dataType
     *
     * @return dataType
     */
    @ApiModelProperty(value = "dataType")
    public EncodeDataType getDataType() {
        return dataType;
    }

    public void setDataType(EncodeDataType dataType) {
        this.dataType = dataType;
    }

    /**
     * String represents data to encode
     *
     * @return data
     */
    @ApiModelProperty(required = true, value = "data")
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EncodeData encodeData = (EncodeData) o;
        return Objects.equals(this.dataType, encodeData.dataType)
                && Objects.equals(this.data, encodeData.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataType, data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EncodeData {\n");

        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
