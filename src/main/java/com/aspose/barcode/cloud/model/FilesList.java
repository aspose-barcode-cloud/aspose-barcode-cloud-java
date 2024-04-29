package com.aspose.barcode.cloud.model;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Files list */
@ApiModel(description = "Files list")
public class FilesList {
    @SerializedName(value = "value")
    private List<StorageFile> value = null;

    /** Add StorageFile. */
    public void addValueItem(StorageFile valueItem) {
        if (this.value == null) {
            this.value = new ArrayList<StorageFile>();
        }
        this.value.add(valueItem);
    }

    /**
     * Files and folders contained by folder StorageFile.
     *
     * @return value
     */
    @ApiModelProperty(value = "Value")
    public List<StorageFile> getValue() {
        return value;
    }

    public void setValue(List<StorageFile> value) {
        this.value = value;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FilesList filesList = (FilesList) o;
        return Objects.equals(this.value, filesList.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FilesList {\n");

        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
