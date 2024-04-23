package com.aspose.barcode.cloud.model;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/** Storage exists */
@ApiModel(description = "Storage exists")
public class StorageExist {
    @SerializedName(value = "exists")
    private Boolean exists = null;

    /**
     * Shows that the storage exists.
     *
     * @return exists
     */
    @ApiModelProperty(required = true, value = "Exists")
    public Boolean isExists() {
        return exists;
    }

    public void setExists(Boolean exists) {
        this.exists = exists;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StorageExist storageExist = (StorageExist) o;
        return Objects.equals(this.exists, storageExist.exists);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exists);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StorageExist {\n");

        sb.append("    exists: ").append(toIndentedString(exists)).append("\n");
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
