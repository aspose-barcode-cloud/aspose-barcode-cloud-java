// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="RecognizeApi.java">
//   Copyright (c) 2024 Aspose.BarCode for Cloud
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

/** RecognizeApi. */
public class RecognizeApi {
    private final ApiClient apiClient;

    public RecognizeApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for barcodeRecognizeBarcodeTypeGet
     *
     * @param request See {@link BarcodeRecognizeBarcodeTypeGetRequest}
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    @SuppressWarnings("removal")
    protected com.squareup.okhttp.Call barcodeRecognizeBarcodeTypeGetCall(
            BarcodeRecognizeBarcodeTypeGetRequest request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        Object postBody = null;

        // create path and map variables
        String path =
                "/barcode/recognize/{barcodeType}"
                        .replaceAll("\\{" + "barcodeType" + "}", request.barcodeType);

        List<Pair> queryParams = new ArrayList<>();
        List<Pair> collectionQueryParams = new ArrayList<>();
        if (request.url != null) {
            queryParams.addAll(apiClient.parameterToPair("url", request.url));
        }

        if (request.recognitionMode != null) {
            queryParams.addAll(
                    apiClient.parameterToPair("recognitionMode", request.recognitionMode));
        }

        if (request.imageKind != null) {
            queryParams.addAll(apiClient.parameterToPair("imageKind", request.imageKind));
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

    private com.squareup.okhttp.Call barcodeRecognizeBarcodeTypeGetValidateBeforeCall(
            BarcodeRecognizeBarcodeTypeGetRequest request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {

        // verify the required parameter 'request.barcodeType' is set
        if (request.barcodeType == null) {
            throw new ApiException(
                    "Missing the required parameter 'request.barcodeType'"
                            + " when calling barcodeRecognizeBarcodeTypeGet(...)");
        }

        // verify the required parameter 'request.url' is set
        if (request.url == null) {
            throw new ApiException(
                    "Missing the required parameter 'request.url'"
                            + " when calling barcodeRecognizeBarcodeTypeGet(...)");
        }

        com.squareup.okhttp.Call call =
                barcodeRecognizeBarcodeTypeGetCall(
                        request, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Recognize barcode from file on server using GET requests with parameters in route and query
     * string.
     *
     * @param request See {@link BarcodeRecognizeBarcodeTypeGetRequest}
     * @return BarcodeResponseList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public BarcodeResponseList barcodeRecognizeBarcodeTypeGet(
            BarcodeRecognizeBarcodeTypeGetRequest request) throws ApiException {
        ApiResponse<BarcodeResponseList> resp = barcodeRecognizeBarcodeTypeGetWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Recognize barcode from file on server using GET requests with parameters in route and query
     * string.
     *
     * @param request See {@link BarcodeRecognizeBarcodeTypeGetRequest}
     * @return ApiResponse&lt;BarcodeResponseList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public ApiResponse<BarcodeResponseList> barcodeRecognizeBarcodeTypeGetWithHttpInfo(
            BarcodeRecognizeBarcodeTypeGetRequest request) throws ApiException {
        com.squareup.okhttp.Call call =
                barcodeRecognizeBarcodeTypeGetValidateBeforeCall(request, null, null);
        Type returnType = new TypeToken<BarcodeResponseList>() {}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Recognize barcode from file on server using GET requests with parameters in route and query
     * string. (asynchronously)
     *
     * @param request See {@link BarcodeRecognizeBarcodeTypeGetRequest}
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     */
    public com.squareup.okhttp.Call barcodeRecognizeBarcodeTypeGetAsync(
            BarcodeRecognizeBarcodeTypeGetRequest request,
            final ApiCallback<BarcodeResponseList> callback)
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
                barcodeRecognizeBarcodeTypeGetValidateBeforeCall(
                        request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<BarcodeResponseList>() {}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }

    /**
     * Build call for barcodeRecognizeBodyPost
     *
     * @param request See {@link BarcodeRecognizeBodyPostRequest}
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    @SuppressWarnings("removal")
    protected com.squareup.okhttp.Call barcodeRecognizeBodyPostCall(
            BarcodeRecognizeBodyPostRequest request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        Object postBody = request.recognizeBase64Request;

        // create path and map variables
        String path = "/barcode/recognize-body";

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

    private com.squareup.okhttp.Call barcodeRecognizeBodyPostValidateBeforeCall(
            BarcodeRecognizeBodyPostRequest request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {

        // verify the required parameter 'request.recognizeBase64Request' is set
        if (request.recognizeBase64Request == null) {
            throw new ApiException(
                    "Missing the required parameter 'request.recognizeBase64Request'"
                            + " when calling barcodeRecognizeBodyPost(...)");
        }

        com.squareup.okhttp.Call call =
                barcodeRecognizeBodyPostCall(request, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Recognize barcode from file in request body using POST requests with parameters in body in
     * json or xml format.
     *
     * @param request See {@link BarcodeRecognizeBodyPostRequest}
     * @return BarcodeResponseList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public BarcodeResponseList barcodeRecognizeBodyPost(BarcodeRecognizeBodyPostRequest request)
            throws ApiException {
        ApiResponse<BarcodeResponseList> resp = barcodeRecognizeBodyPostWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Recognize barcode from file in request body using POST requests with parameters in body in
     * json or xml format.
     *
     * @param request See {@link BarcodeRecognizeBodyPostRequest}
     * @return ApiResponse&lt;BarcodeResponseList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public ApiResponse<BarcodeResponseList> barcodeRecognizeBodyPostWithHttpInfo(
            BarcodeRecognizeBodyPostRequest request) throws ApiException {
        com.squareup.okhttp.Call call =
                barcodeRecognizeBodyPostValidateBeforeCall(request, null, null);
        Type returnType = new TypeToken<BarcodeResponseList>() {}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Recognize barcode from file in request body using POST requests with parameters in body in
     * json or xml format. (asynchronously)
     *
     * @param request See {@link BarcodeRecognizeBodyPostRequest}
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     */
    public com.squareup.okhttp.Call barcodeRecognizeBodyPostAsync(
            BarcodeRecognizeBodyPostRequest request,
            final ApiCallback<BarcodeResponseList> callback)
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
                barcodeRecognizeBodyPostValidateBeforeCall(
                        request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<BarcodeResponseList>() {}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }

    /**
     * Build call for barcodeRecognizeFormPost
     *
     * @param request See {@link BarcodeRecognizeFormPostRequest}
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    @SuppressWarnings("removal")
    protected com.squareup.okhttp.Call barcodeRecognizeFormPostCall(
            BarcodeRecognizeFormPostRequest request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        Object postBody = null;

        // create path and map variables
        String path = "/barcode/recognize-form";

        List<Pair> queryParams = new ArrayList<>();
        List<Pair> collectionQueryParams = new ArrayList<>();
        Map<String, String> headerParams = new HashMap<>();

        Map<String, Object> formParams = new HashMap<>();
        if (request.barcodeType != null) {
            formParams.put("barcodeType", request.barcodeType);
        }

        if (request._file != null) {
            formParams.put("file", request._file);
        }

        if (request.recognitionMode != null) {
            formParams.put("recognitionMode", request.recognitionMode);
        }

        if (request.imageKind != null) {
            formParams.put("imageKind", request.imageKind);
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

    private com.squareup.okhttp.Call barcodeRecognizeFormPostValidateBeforeCall(
            BarcodeRecognizeFormPostRequest request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {

        // verify the required parameter 'request.barcodeType' is set
        if (request.barcodeType == null) {
            throw new ApiException(
                    "Missing the required parameter 'request.barcodeType'"
                            + " when calling barcodeRecognizeFormPost(...)");
        }

        // verify the required parameter 'request._file' is set
        if (request._file == null) {
            throw new ApiException(
                    "Missing the required parameter 'request._file'"
                            + " when calling barcodeRecognizeFormPost(...)");
        }

        com.squareup.okhttp.Call call =
                barcodeRecognizeFormPostCall(request, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Recognize barcode from file in request body using POST requests with parameters in multipart
     * form.
     *
     * @param request See {@link BarcodeRecognizeFormPostRequest}
     * @return BarcodeResponseList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public BarcodeResponseList barcodeRecognizeFormPost(BarcodeRecognizeFormPostRequest request)
            throws ApiException {
        ApiResponse<BarcodeResponseList> resp = barcodeRecognizeFormPostWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Recognize barcode from file in request body using POST requests with parameters in multipart
     * form.
     *
     * @param request See {@link BarcodeRecognizeFormPostRequest}
     * @return ApiResponse&lt;BarcodeResponseList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public ApiResponse<BarcodeResponseList> barcodeRecognizeFormPostWithHttpInfo(
            BarcodeRecognizeFormPostRequest request) throws ApiException {
        com.squareup.okhttp.Call call =
                barcodeRecognizeFormPostValidateBeforeCall(request, null, null);
        Type returnType = new TypeToken<BarcodeResponseList>() {}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Recognize barcode from file in request body using POST requests with parameters in multipart
     * form. (asynchronously)
     *
     * @param request See {@link BarcodeRecognizeFormPostRequest}
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     */
    public com.squareup.okhttp.Call barcodeRecognizeFormPostAsync(
            BarcodeRecognizeFormPostRequest request,
            final ApiCallback<BarcodeResponseList> callback)
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
                barcodeRecognizeFormPostValidateBeforeCall(
                        request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<BarcodeResponseList>() {}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
}
