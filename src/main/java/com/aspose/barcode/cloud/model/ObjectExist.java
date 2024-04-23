package com.aspose.barcode.cloud.model;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/** Object exists */
@ApiModel(description = "Object exists")
public class ObjectExist {
    @SerializedName(value = "exists")
    private Boolean exists = null;

    @SerializedName(value = "isFolder")
    private Boolean isFolder = null;

    /**
     * Indicates that the file or folder exists.
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

    /**
     * True if it is a folder, false if it is a file.
     *
     * @return isFolder
     */
    @ApiModelProperty(required = true, value = "IsFolder")
    public Boolean isIsFolder() {
        return isFolder;
    }

    public void setIsFolder(Boolean isFolder) {
        this.isFolder = isFolder;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ObjectExist objectExist = (ObjectExist) o;
        return Objects.equals(this.exists, objectExist.exists)
                && Objects.equals(this.isFolder, objectExist.isFolder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exists, isFolder);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ObjectExist {\n");

        sb.append("    exists: ").append(toIndentedString(exists)).append("\n");
        sb.append("    isFolder: ").append(toIndentedString(isFolder)).append("\n");
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
