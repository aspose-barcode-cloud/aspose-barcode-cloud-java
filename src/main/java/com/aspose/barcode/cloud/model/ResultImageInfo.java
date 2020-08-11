// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="ResultImageInfo.java">
//   Copyright (c) 2020 Aspose.BarCode for Cloud
// </copyright>
// <summary>
//   Permission is hereby granted, free of charge, to any person obtaining a copy
//  of this software and associated documentation files (the "Software"), to deal
//  in the Software without restriction, including without limitation the rights
//  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
//  copies of the Software, and to permit persons to whom the Software is
//  furnished to do so, subject to the following conditions:
//
//  The above copyright notice and this permission notice shall be included in all
//  copies or substantial portions of the Software.
//
//  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
//  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
//  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
//  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
//  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
//  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
//  SOFTWARE.
// </summary>
// --------------------------------------------------------------------------------------------------------------------

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
    @ApiModelProperty(required = true, value = "Result file size.")
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
    @ApiModelProperty(value = "Result image width.")
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
    @ApiModelProperty(value = "Result image height.")
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
