// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="ScanApi.java">
//   Copyright (c) 2025 Aspose.BarCode for Cloud
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

package com.aspose.barcode.cloud.api;

import com.aspose.barcode.cloud.ApiCallback;
import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.ApiResponse;
import com.aspose.barcode.cloud.Pair;
import com.aspose.barcode.cloud.ProgressRequestBody;
import com.aspose.barcode.cloud.ProgressResponseBody;
import com.aspose.barcode.cloud.model.BarcodeResponseList;
import com.aspose.barcode.cloud.requests.*;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** ScanApi. */
public class ScanApi {
    private final ApiClient apiClient;

    public ScanApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for scan
     *
     * @param request See {@link ScanRequestWrapper}
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    @SuppressWarnings("removal")
    protected com.squareup.okhttp.Call scanCall(
            ScanRequestWrapper request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        Object postBody = null;

        // create path and map variables
        String path = "/barcode/scan";

        List<Pair> queryParams = new ArrayList<>();
        List<Pair> collectionQueryParams = new ArrayList<>();
        if (request.fileUrl != null) {
            queryParams.addAll(apiClient.parameterToPair("fileUrl", request.fileUrl));
        }

        Map<String, String> headerParams = new HashMap<>();

        Map<String, Object> formParams = new HashMap<>();
        final String[] accepts = {"application/json", "application/xml"};
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) {
            headerParams.put("Accept", accept);
        }

        final String[] contentTypes = {};

        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if (progressListener != null) {
            apiClient
                    .getHttpClient()
                    .networkInterceptors()
                    .add(
                            new com.squareup.okhttp.Interceptor() {
                                @Override
                                public com.squareup.okhttp.Response intercept(
                                        com.squareup.okhttp.Interceptor.Chain chain)
                                        throws IOException {
                                    com.squareup.okhttp.Response originalResponse =
                                            chain.proceed(chain.request());
                                    return originalResponse
                                            .newBuilder()
                                            .body(
                                                    new ProgressResponseBody(
                                                            originalResponse.body(),
                                                            progressListener))
                                            .build();
                                }
                            });
        }

        return apiClient.buildCall(
                path,
                "GET",
                queryParams,
                collectionQueryParams,
                postBody,
                headerParams,
                formParams,
                progressRequestListener);
    }

    private com.squareup.okhttp.Call scanValidateBeforeCall(
            ScanRequestWrapper request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {

        // verify the required parameter 'request.fileUrl' is set
        if (request.fileUrl == null) {
            throw new ApiException(
                    "Missing the required parameter 'request.fileUrl'" + " when calling scan(...)");
        }

        com.squareup.okhttp.Call call =
                scanCall(request, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Scan barcode from file on server using GET requests with parameter in query string.
     *
     * @param request See {@link ScanRequestWrapper}
     * @return BarcodeResponseList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public BarcodeResponseList scan(ScanRequestWrapper request) throws ApiException {
        ApiResponse<BarcodeResponseList> resp = scanWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Scan barcode from file on server using GET requests with parameter in query string.
     *
     * @param request See {@link ScanRequestWrapper}
     * @return ApiResponse&lt;BarcodeResponseList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public ApiResponse<BarcodeResponseList> scanWithHttpInfo(ScanRequestWrapper request)
            throws ApiException {
        com.squareup.okhttp.Call call = scanValidateBeforeCall(request, null, null);
        Type returnType = new TypeToken<BarcodeResponseList>() {}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Scan barcode from file on server using GET requests with parameter in query string.
     * (asynchronously)
     *
     * @param request See {@link ScanRequestWrapper}
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     */
    public com.squareup.okhttp.Call scanAsync(
            ScanRequestWrapper request, final ApiCallback<BarcodeResponseList> callback)
            throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener =
                    new ProgressResponseBody.ProgressListener() {
                        @Override
                        public void update(long bytesRead, long contentLength, boolean done) {
                            callback.onDownloadProgress(bytesRead, contentLength, done);
                        }
                    };

            progressRequestListener =
                    new ProgressRequestBody.ProgressRequestListener() {
                        @Override
                        public void onRequestProgress(
                                long bytesWritten, long contentLength, boolean done) {
                            callback.onUploadProgress(bytesWritten, contentLength, done);
                        }
                    };
        }

        com.squareup.okhttp.Call call =
                scanValidateBeforeCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<BarcodeResponseList>() {}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }

    /**
     * Build call for scanBase64
     *
     * @param request See {@link ScanBase64RequestWrapper}
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    @SuppressWarnings("removal")
    protected com.squareup.okhttp.Call scanBase64Call(
            ScanBase64RequestWrapper request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        Object postBody = request.scanBase64Request;

        // create path and map variables
        String path = "/barcode/scan-body";

        List<Pair> queryParams = new ArrayList<>();
        List<Pair> collectionQueryParams = new ArrayList<>();
        Map<String, String> headerParams = new HashMap<>();

        Map<String, Object> formParams = new HashMap<>();
        final String[] accepts = {"application/json", "application/xml"};
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) {
            headerParams.put("Accept", accept);
        }

        final String[] contentTypes = {"application/json", "application/xml"};
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if (progressListener != null) {
            apiClient
                    .getHttpClient()
                    .networkInterceptors()
                    .add(
                            new com.squareup.okhttp.Interceptor() {
                                @Override
                                public com.squareup.okhttp.Response intercept(
                                        com.squareup.okhttp.Interceptor.Chain chain)
                                        throws IOException {
                                    com.squareup.okhttp.Response originalResponse =
                                            chain.proceed(chain.request());
                                    return originalResponse
                                            .newBuilder()
                                            .body(
                                                    new ProgressResponseBody(
                                                            originalResponse.body(),
                                                            progressListener))
                                            .build();
                                }
                            });
        }

        return apiClient.buildCall(
                path,
                "POST",
                queryParams,
                collectionQueryParams,
                postBody,
                headerParams,
                formParams,
                progressRequestListener);
    }

    private com.squareup.okhttp.Call scanBase64ValidateBeforeCall(
            ScanBase64RequestWrapper request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {

        // verify the required parameter 'request.scanBase64Request' is set
        if (request.scanBase64Request == null) {
            throw new ApiException(
                    "Missing the required parameter 'request.scanBase64Request'"
                            + " when calling scanBase64(...)");
        }

        com.squareup.okhttp.Call call =
                scanBase64Call(request, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Scan barcode from file in request body using POST requests with parameter in body in json or
     * xml format.
     *
     * @param request See {@link ScanBase64RequestWrapper}
     * @return BarcodeResponseList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public BarcodeResponseList scanBase64(ScanBase64RequestWrapper request) throws ApiException {
        ApiResponse<BarcodeResponseList> resp = scanBase64WithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Scan barcode from file in request body using POST requests with parameter in body in json or
     * xml format.
     *
     * @param request See {@link ScanBase64RequestWrapper}
     * @return ApiResponse&lt;BarcodeResponseList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public ApiResponse<BarcodeResponseList> scanBase64WithHttpInfo(ScanBase64RequestWrapper request)
            throws ApiException {
        com.squareup.okhttp.Call call = scanBase64ValidateBeforeCall(request, null, null);
        Type returnType = new TypeToken<BarcodeResponseList>() {}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Scan barcode from file in request body using POST requests with parameter in body in json or
     * xml format. (asynchronously)
     *
     * @param request See {@link ScanBase64RequestWrapper}
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     */
    public com.squareup.okhttp.Call scanBase64Async(
            ScanBase64RequestWrapper request, final ApiCallback<BarcodeResponseList> callback)
            throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener =
                    new ProgressResponseBody.ProgressListener() {
                        @Override
                        public void update(long bytesRead, long contentLength, boolean done) {
                            callback.onDownloadProgress(bytesRead, contentLength, done);
                        }
                    };

            progressRequestListener =
                    new ProgressRequestBody.ProgressRequestListener() {
                        @Override
                        public void onRequestProgress(
                                long bytesWritten, long contentLength, boolean done) {
                            callback.onUploadProgress(bytesWritten, contentLength, done);
                        }
                    };
        }

        com.squareup.okhttp.Call call =
                scanBase64ValidateBeforeCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<BarcodeResponseList>() {}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }

    /**
     * Build call for scanMultipart
     *
     * @param request See {@link ScanMultipartRequestWrapper}
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    @SuppressWarnings("removal")
    protected com.squareup.okhttp.Call scanMultipartCall(
            ScanMultipartRequestWrapper request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        Object postBody = null;

        // create path and map variables
        String path = "/barcode/scan-multipart";

        List<Pair> queryParams = new ArrayList<>();
        List<Pair> collectionQueryParams = new ArrayList<>();
        Map<String, String> headerParams = new HashMap<>();

        Map<String, Object> formParams = new HashMap<>();
        if (request._file != null) {
            formParams.put("file", request._file);
        }

        final String[] accepts = {"application/json", "application/xml"};
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) {
            headerParams.put("Accept", accept);
        }

        final String[] contentTypes = {"multipart/form-data"};
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if (progressListener != null) {
            apiClient
                    .getHttpClient()
                    .networkInterceptors()
                    .add(
                            new com.squareup.okhttp.Interceptor() {
                                @Override
                                public com.squareup.okhttp.Response intercept(
                                        com.squareup.okhttp.Interceptor.Chain chain)
                                        throws IOException {
                                    com.squareup.okhttp.Response originalResponse =
                                            chain.proceed(chain.request());
                                    return originalResponse
                                            .newBuilder()
                                            .body(
                                                    new ProgressResponseBody(
                                                            originalResponse.body(),
                                                            progressListener))
                                            .build();
                                }
                            });
        }

        return apiClient.buildCall(
                path,
                "POST",
                queryParams,
                collectionQueryParams,
                postBody,
                headerParams,
                formParams,
                progressRequestListener);
    }

    private com.squareup.okhttp.Call scanMultipartValidateBeforeCall(
            ScanMultipartRequestWrapper request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {

        // verify the required parameter 'request._file' is set
        if (request._file == null) {
            throw new ApiException(
                    "Missing the required parameter 'request._file'"
                            + " when calling scanMultipart(...)");
        }

        com.squareup.okhttp.Call call =
                scanMultipartCall(request, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Scan barcode from file in request body using POST requests with parameter in multipart form.
     *
     * @param request See {@link ScanMultipartRequestWrapper}
     * @return BarcodeResponseList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public BarcodeResponseList scanMultipart(ScanMultipartRequestWrapper request)
            throws ApiException {
        ApiResponse<BarcodeResponseList> resp = scanMultipartWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Scan barcode from file in request body using POST requests with parameter in multipart form.
     *
     * @param request See {@link ScanMultipartRequestWrapper}
     * @return ApiResponse&lt;BarcodeResponseList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public ApiResponse<BarcodeResponseList> scanMultipartWithHttpInfo(
            ScanMultipartRequestWrapper request) throws ApiException {
        com.squareup.okhttp.Call call = scanMultipartValidateBeforeCall(request, null, null);
        Type returnType = new TypeToken<BarcodeResponseList>() {}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Scan barcode from file in request body using POST requests with parameter in multipart form.
     * (asynchronously)
     *
     * @param request See {@link ScanMultipartRequestWrapper}
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     */
    public com.squareup.okhttp.Call scanMultipartAsync(
            ScanMultipartRequestWrapper request, final ApiCallback<BarcodeResponseList> callback)
            throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener =
                    new ProgressResponseBody.ProgressListener() {
                        @Override
                        public void update(long bytesRead, long contentLength, boolean done) {
                            callback.onDownloadProgress(bytesRead, contentLength, done);
                        }
                    };

            progressRequestListener =
                    new ProgressRequestBody.ProgressRequestListener() {
                        @Override
                        public void onRequestProgress(
                                long bytesWritten, long contentLength, boolean done) {
                            callback.onUploadProgress(bytesWritten, contentLength, done);
                        }
                    };
        }

        com.squareup.okhttp.Call call =
                scanMultipartValidateBeforeCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<BarcodeResponseList>() {}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
}
