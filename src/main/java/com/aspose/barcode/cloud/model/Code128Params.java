package com.aspose.barcode.cloud.model;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/** Code128 params. */
@ApiModel(description = "Code128 params.")
public class Code128Params {
    @SerializedName(value = "encodeMode")
    private Code128EncodeMode encodeMode = null;

    /**
     * Encoding mode for Code128 barcodes. Code 128 specification Default value:
     * Code128EncodeMode.Auto.
     *
     * @return encodeMode
     */
    @ApiModelProperty(value = "EncodeMode")
    public Code128EncodeMode getEncodeMode() {
        return encodeMode;
    }

    public void setEncodeMode(Code128EncodeMode encodeMode) {
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
        Code128Params code128Params = (Code128Params) o;
        return Objects.equals(this.encodeMode, code128Params.encodeMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(encodeMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Code128Params {\n");

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
