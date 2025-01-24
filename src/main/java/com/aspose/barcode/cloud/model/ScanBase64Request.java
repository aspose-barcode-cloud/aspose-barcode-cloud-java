package com.aspose.barcode.cloud.model;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/** Scan barcode request. */
@ApiModel(description = "Scan barcode request.")
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.8.0")
public class ScanBase64Request {
    @SerializedName(value = "fileBase64")
    private String fileBase64;

    /**
     * .
     *
     * @param fileBase64 Barcode image bytes encoded as base-64.
     */
    public ScanBase64Request(String fileBase64) {
        this.fileBase64 = fileBase64;
    }

    /**
     * Barcode image bytes encoded as base-64.
     *
     * @return fileBase64
     */
    @ApiModelProperty(required = true, value = "fileBase64")
    public String getFileBase64() {
        return fileBase64;
    }

    public void setFileBase64(String fileBase64) {
        this.fileBase64 = fileBase64;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ScanBase64Request scanBase64Request = (ScanBase64Request) o;
        return Objects.equals(this.fileBase64, scanBase64Request.fileBase64);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileBase64);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScanBase64Request {\n");

        sb.append("    fileBase64: ").append(toIndentedString(fileBase64)).append("\n");
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
