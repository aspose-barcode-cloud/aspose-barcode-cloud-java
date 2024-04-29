package com.aspose.barcode.cloud;

import com.aspose.barcode.cloud.model.ApiError;
import com.aspose.barcode.cloud.model.ApiErrorResponse;

import java.util.List;
import java.util.Map;

/** ApiException. */
public class ApiException extends Exception {
    private int httpCode = 0;
    private Map<String, List<String>> responseHeaders = null;
    private String responseBody = null;
    private ApiErrorResponse response = null;

    public ApiException(Throwable throwable) {
        super(throwable);
    }

    public ApiException(String message) {
        super(message);
    }

    public ApiException(String message, int httpCode) {
        super(message);
        this.httpCode = httpCode;
    }

    /** Constructor for ApiException with message, httpCode, responseHeaders, responseBody */
    public ApiException(
            String message,
            int httpCode,
            Map<String, List<String>> responseHeaders,
            String responseBody) {
        this(message, httpCode);
        this.responseHeaders = responseHeaders;
        this.responseBody = responseBody;
    }

    /** Constructor for ApiException with message, throwable, httpCode, responseHeaders */
    public ApiException(
            String message,
            Throwable throwable,
            int httpCode,
            Map<String, List<String>> responseHeaders) {
        super(message, throwable);
        this.httpCode = httpCode;
        this.responseHeaders = responseHeaders;
    }

    /** Constructor for ApiException with message, httpCode, errorResponse */
    public ApiException(String message, int httpCode, ApiErrorResponse errorResponse) {
        this(message, httpCode);
        this.response = errorResponse;
    }

    /**
     * Get the HTTP status code.
     *
     * @return HTTP status code
     */
    public int getHttpCode() {
        return httpCode;
    }

    /**
     * Get the HTTP response headers.
     *
     * @return A map of list of string
     */
    public Map<String, List<String>> getResponseHeaders() {
        return responseHeaders;
    }

    /**
     * Get the error details
     *
     * @return Response body in the form of string
     */
    public String getDetails() {
        if (response != null) {
            ApiError err = response.getError();
            if (err != null) {
                StringBuilder sb = new StringBuilder();
                if (err.getCode() != null) {
                    sb.append(err.getCode()).append(": ");
                }
                if (err.getMessage() != null) {
                    sb.append(err.getMessage());
                }
                if (err.getDescription() != null) {
                    sb.append(err.getDescription());
                }

                return sb.toString();
            }
        }
        if (responseBody != null) {
            return responseBody;
        }
        return "";
    }
}
