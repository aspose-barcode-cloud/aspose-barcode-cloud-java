package com.aspose.barcode.cloud.model;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

import org.threeten.bp.OffsetDateTime;

import java.util.Objects;

/** ApiError */
public class ApiError {
    @SerializedName(value = "code")
    private String code = null;

    @SerializedName(value = "message")
    private String message = null;

    @SerializedName(value = "description")
    private String description = null;

    @SerializedName(value = "dateTime")
    private OffsetDateTime dateTime = null;

    @SerializedName(value = "innerError")
    private ApiError innerError = null;

    /**
     * Get code
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
     * Get message
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
     * Get description
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
     * Get dateTime
     *
     * @return dateTime
     */
    @ApiModelProperty(value = "DateTime")
    public OffsetDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(OffsetDateTime dateTime) {
        this.dateTime = dateTime;
    }

    /**
     * Get innerError
     *
     * @return innerError
     */
    @ApiModelProperty(value = "InnerError")
    public ApiError getInnerError() {
        return innerError;
    }

    public void setInnerError(ApiError innerError) {
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
        ApiError apiError = (ApiError) o;
        return Objects.equals(this.code, apiError.code)
                && Objects.equals(this.message, apiError.message)
                && Objects.equals(this.description, apiError.description)
                && Objects.equals(this.dateTime, apiError.dateTime)
                && Objects.equals(this.innerError, apiError.innerError);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, message, description, dateTime, innerError);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiError {\n");

        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
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
