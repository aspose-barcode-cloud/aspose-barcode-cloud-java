// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="FileVersion.java">
//   Copyright (c) 2023 Aspose.BarCode for Cloud
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

import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/** FileVersion */
public class FileVersion extends StorageFile {
    @SerializedName(value = "versionId")
    private String versionId = null;

    @SerializedName(value = "isLatest")
    private Boolean isLatest = null;

    /**
     * File Version ID.
     *
     * @return versionId
     */
    @ApiModelProperty(value = "File Version ID.")
    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * Specifies whether the file is (true) or is not (false) the latest version of an file.
     *
     * @return isLatest
     */
    @ApiModelProperty(
            required = true,
            value =
                    "Specifies whether the file is (true) or is not (false) the latest version of an file.")
    public Boolean isIsLatest() {
        return isLatest;
    }

    public void setIsLatest(Boolean isLatest) {
        this.isLatest = isLatest;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FileVersion fileVersion = (FileVersion) o;
        return Objects.equals(this.versionId, fileVersion.versionId)
                && Objects.equals(this.isLatest, fileVersion.isLatest)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(versionId, isLatest, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FileVersion {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
        sb.append("    isLatest: ").append(toIndentedString(isLatest)).append("\n");
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
