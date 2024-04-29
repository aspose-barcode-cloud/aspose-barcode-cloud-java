package com.aspose.barcode.cloud.model;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/** Created image info. */
@ApiModel(description = "Created image info.")
public class ResultImageInfo {
    @SerializedName(value = "fileSize")
    private Long fileSize = null;

    @SerializedName(value = "imageWidth")
    private Integer imageWidth = null;

    @SerializedName(value = "imageHeight")
    private Integer imageHeight = null;

    /**
     * Result file size.
     *
     * @return fileSize
     */
    @ApiModelProperty(required = true, value = "FileSize")
    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    /**
     * Result image width.
     *
     * @return imageWidth
     */
    @ApiModelProperty(value = "ImageWidth")
    public Integer getImageWidth() {
        return imageWidth;
    }

    public void setImageWidth(Integer imageWidth) {
        this.imageWidth = imageWidth;
    }

    /**
     * Result image height.
     *
     * @return imageHeight
     */
    @ApiModelProperty(value = "ImageHeight")
    public Integer getImageHeight() {
        return imageHeight;
    }

    public void setImageHeight(Integer imageHeight) {
        this.imageHeight = imageHeight;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResultImageInfo resultImageInfo = (ResultImageInfo) o;
        return Objects.equals(this.fileSize, resultImageInfo.fileSize)
                && Objects.equals(this.imageWidth, resultImageInfo.imageWidth)
                && Objects.equals(this.imageHeight, resultImageInfo.imageHeight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileSize, imageWidth, imageHeight);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResultImageInfo {\n");

        sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
        sb.append("    imageWidth: ").append(toIndentedString(imageWidth)).append("\n");
        sb.append("    imageHeight: ").append(toIndentedString(imageHeight)).append("\n");
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
