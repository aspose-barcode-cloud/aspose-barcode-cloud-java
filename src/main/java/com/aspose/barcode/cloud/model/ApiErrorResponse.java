package com.aspose.barcode.cloud.model;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/** ApiError Response */
@ApiModel(description = "ApiError Response")
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.8.0")
public class ApiErrorResponse {
    @SerializedName(value = "requestId")
    private String requestId;

    @SerializedName(value = "error")
    private ApiError error;

    /**
     * .
     *
     * @param requestId Gets or sets request Id.
     * @param error Param of type ApiError
     */
    public ApiErrorResponse(String requestId, ApiError error) {
        this.requestId = requestId;
        this.error = error;
    }

    /**
     * Gets or sets request Id.
     *
     * @return requestId
     */
    @ApiModelProperty(required = true, value = "requestId")
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * Get error
     *
     * @return error
     */
    @ApiModelProperty(required = true, value = "error")
    public ApiError getError() {
        return error;
    }

    public void setError(ApiError error) {
        this.error = error;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiErrorResponse apiErrorResponse = (ApiErrorResponse) o;
        return Objects.equals(this.requestId, apiErrorResponse.requestId)
                && Objects.equals(this.error, apiErrorResponse.error);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, error);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiErrorResponse {\n");

        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
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
