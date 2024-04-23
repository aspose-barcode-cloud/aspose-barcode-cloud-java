package com.aspose.barcode.cloud.model;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** File versions FileVersion. */
@ApiModel(description = "File versions FileVersion.")
public class FileVersions {
    @SerializedName(value = "value")
    private List<FileVersion> value = null;

    /** Add FileVersion. */
    public void addValueItem(FileVersion valueItem) {
        if (this.value == null) {
            this.value = new ArrayList<FileVersion>();
        }
        this.value.add(valueItem);
    }

    /**
     * File versions FileVersion.
     *
     * @return value
     */
    @ApiModelProperty(value = "Value")
    public List<FileVersion> getValue() {
        return value;
    }

    public void setValue(List<FileVersion> value) {
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
        FileVersions fileVersions = (FileVersions) o;
        return Objects.equals(this.value, fileVersions.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FileVersions {\n");

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
