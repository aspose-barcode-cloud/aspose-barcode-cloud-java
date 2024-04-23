package com.aspose.barcode.cloud.model;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/** Class for disc space information. */
@ApiModel(description = "Class for disc space information.")
public class DiscUsage {
    @SerializedName(value = "usedSize")
    private Long usedSize = null;

    @SerializedName(value = "totalSize")
    private Long totalSize = null;

    /**
     * Application used disc space.
     *
     * @return usedSize
     */
    @ApiModelProperty(required = true, value = "UsedSize")
    public Long getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(Long usedSize) {
        this.usedSize = usedSize;
    }

    /**
     * Total disc space.
     *
     * @return totalSize
     */
    @ApiModelProperty(required = true, value = "TotalSize")
    public Long getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DiscUsage discUsage = (DiscUsage) o;
        return Objects.equals(this.usedSize, discUsage.usedSize)
                && Objects.equals(this.totalSize, discUsage.totalSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usedSize, totalSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DiscUsage {\n");

        sb.append("    usedSize: ").append(toIndentedString(usedSize)).append("\n");
        sb.append("    totalSize: ").append(toIndentedString(totalSize)).append("\n");
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
