package com.aspose.barcode.cloud.model;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import org.threeten.bp.OffsetDateTime;

import java.util.Objects;

/** The error details */
@ApiModel(description = "The error details")
public class ErrorDetails {
    @SerializedName(value = "requestId")
    private String requestId = null;

    @SerializedName(value = "date")
    private OffsetDateTime date = null;

    /**
     * The request id
     *
     * @return requestId
     */
    @ApiModelProperty(value = "RequestId")
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * Date
     *
     * @return date
     */
    @ApiModelProperty(required = true, value = "Date")
    public OffsetDateTime getDate() {
        return date;
    }

    public void setDate(OffsetDateTime date) {
        this.date = date;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ErrorDetails errorDetails = (ErrorDetails) o;
        return Objects.equals(this.requestId, errorDetails.requestId)
                && Objects.equals(this.date, errorDetails.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, date);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ErrorDetails {\n");

        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
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
