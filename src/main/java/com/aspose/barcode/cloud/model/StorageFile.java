package com.aspose.barcode.cloud.model;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import org.threeten.bp.OffsetDateTime;

import java.util.Objects;

/** File or folder information */
@ApiModel(description = "File or folder information")
public class StorageFile {
    @SerializedName(value = "name")
    private String name = null;

    @SerializedName(value = "isFolder")
    private Boolean isFolder = null;

    @SerializedName(value = "modifiedDate")
    private OffsetDateTime modifiedDate = null;

    @SerializedName(value = "size")
    private Long size = null;

    @SerializedName(value = "path")
    private String path = null;

    /**
     * File or folder name.
     *
     * @return name
     */
    @ApiModelProperty(value = "Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * True if it is a folder.
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

    /**
     * File or folder last modified DateTime.
     *
     * @return modifiedDate
     */
    @ApiModelProperty(value = "ModifiedDate")
    public OffsetDateTime getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(OffsetDateTime modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    /**
     * File or folder size.
     *
     * @return size
     */
    @ApiModelProperty(required = true, value = "Size")
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    /**
     * File or folder path.
     *
     * @return path
     */
    @ApiModelProperty(value = "Path")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StorageFile storageFile = (StorageFile) o;
        return Objects.equals(this.name, storageFile.name)
                && Objects.equals(this.isFolder, storageFile.isFolder)
                && Objects.equals(this.modifiedDate, storageFile.modifiedDate)
                && Objects.equals(this.size, storageFile.size)
                && Objects.equals(this.path, storageFile.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, isFolder, modifiedDate, size, path);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StorageFile {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    isFolder: ").append(toIndentedString(isFolder)).append("\n");
        sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
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
