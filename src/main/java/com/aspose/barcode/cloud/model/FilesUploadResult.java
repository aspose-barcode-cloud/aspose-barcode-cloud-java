package com.aspose.barcode.cloud.model;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** File upload result */
@ApiModel(description = "File upload result")
public class FilesUploadResult {
    @SerializedName(value = "uploaded")
    private List<String> uploaded = null;

    @SerializedName(value = "errors")
    private List<Error> errors = null;

    /** Add Uploaded item. */
    public void addUploadedItem(String uploadedItem) {
        if (this.uploaded == null) {
            this.uploaded = new ArrayList<String>();
        }
        this.uploaded.add(uploadedItem);
    }

    /**
     * List of uploaded file names
     *
     * @return uploaded
     */
    @ApiModelProperty(value = "Uploaded")
    public List<String> getUploaded() {
        return uploaded;
    }

    public void setUploaded(List<String> uploaded) {
        this.uploaded = uploaded;
    }

    /** Add Error. */
    public void addErrorsItem(Error errorsItem) {
        if (this.errors == null) {
            this.errors = new ArrayList<Error>();
        }
        this.errors.add(errorsItem);
    }

    /**
     * List of errors.
     *
     * @return errors
     */
    @ApiModelProperty(value = "Errors")
    public List<Error> getErrors() {
        return errors;
    }

    public void setErrors(List<Error> errors) {
        this.errors = errors;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FilesUploadResult filesUploadResult = (FilesUploadResult) o;
        return Objects.equals(this.uploaded, filesUploadResult.uploaded)
                && Objects.equals(this.errors, filesUploadResult.errors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uploaded, errors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FilesUploadResult {\n");

        sb.append("    uploaded: ").append(toIndentedString(uploaded)).append("\n");
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
