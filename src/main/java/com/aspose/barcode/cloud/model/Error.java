package com.aspose.barcode.cloud.model;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/** Error */
@ApiModel(description = "Error")
public class Error {
    @SerializedName(value = "code")
    private String code = null;

    @SerializedName(value = "message")
    private String message = null;

    @SerializedName(value = "description")
    private String description = null;

    @SerializedName(value = "innerError")
    private ErrorDetails innerError = null;

    /**
     * Code
     *
     * @return code
     */
    @ApiModelProperty(value = "Code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Message
     *
     * @return message
     */
    @ApiModelProperty(value = "Message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Description
     *
     * @return description
     */
    @ApiModelProperty(value = "Description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Inner Error
     *
     * @return innerError
     */
    @ApiModelProperty(value = "InnerError")
    public ErrorDetails getInnerError() {
        return innerError;
    }

    public void setInnerError(ErrorDetails innerError) {
        this.innerError = innerError;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Error error = (Error) o;
        return Objects.equals(this.code, error.code)
                && Objects.equals(this.message, error.message)
                && Objects.equals(this.description, error.description)
                && Objects.equals(this.innerError, error.innerError);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, message, description, innerError);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Error {\n");

        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    innerError: ").append(toIndentedString(innerError)).append("\n");
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
