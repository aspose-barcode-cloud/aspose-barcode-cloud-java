// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="GenerateApi.java">
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
import com.aspose.barcode.cloud.requests.*;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** GenerateApi. */
public class GenerateApi {
    private final ApiClient apiClient;

    public GenerateApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for barcodeGenerateBarcodeTypeGet
     *
     * @param request See {@link BarcodeGenerateBarcodeTypeGetRequest}
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    @SuppressWarnings("removal")
    protected com.squareup.okhttp.Call barcodeGenerateBarcodeTypeGetCall(
            BarcodeGenerateBarcodeTypeGetRequest request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        Object postBody = null;

        // create path and map variables
        String path =
                "/barcode/generate/{barcodeType}"
                        .replaceAll("\\{" + "barcodeType" + "}", request.barcodeType.toString());

        List<Pair> queryParams = new ArrayList<>();
        List<Pair> collectionQueryParams = new ArrayList<>();
        if (request.dataType != null) {
            queryParams.addAll(apiClient.parameterToPair("DataType", request.dataType));
        }

        if (request.data != null) {
            queryParams.addAll(apiClient.parameterToPair("Data", request.data));
        }

        if (request.imageFormat != null) {
            queryParams.addAll(apiClient.parameterToPair("ImageFormat", request.imageFormat));
        }

        if (request.twoDDisplayText != null) {
            queryParams.addAll(
                    apiClient.parameterToPair("TwoDDisplayText", request.twoDDisplayText));
        }

        if (request.textLocation != null) {
            queryParams.addAll(apiClient.parameterToPair("TextLocation", request.textLocation));
        }

        if (request.textAlignment != null) {
            queryParams.addAll(apiClient.parameterToPair("TextAlignment", request.textAlignment));
        }

        if (request.foregroundColor != null) {
            queryParams.addAll(
                    apiClient.parameterToPair("ForegroundColor", request.foregroundColor));
        }

        if (request.backgroundColor != null) {
            queryParams.addAll(
                    apiClient.parameterToPair("BackgroundColor", request.backgroundColor));
        }

        if (request.units != null) {
            queryParams.addAll(apiClient.parameterToPair("Units", request.units));
        }

        if (request.resolution != null) {
            queryParams.addAll(apiClient.parameterToPair("Resolution", request.resolution));
        }

        if (request.imageHeight != null) {
            queryParams.addAll(apiClient.parameterToPair("ImageHeight", request.imageHeight));
        }

        if (request.imageWidth != null) {
            queryParams.addAll(apiClient.parameterToPair("ImageWidth", request.imageWidth));
        }

        if (request.rotationAngle != null) {
            queryParams.addAll(apiClient.parameterToPair("RotationAngle", request.rotationAngle));
        }

        Map<String, String> headerParams = new HashMap<>();

        Map<String, Object> formParams = new HashMap<>();
        final String[] accepts = {
            "image/png",
            "image/bmp",
            "image/gif",
            "image/jpeg",
            "image/svg+xml",
            "image/tiff",
            "application/json",
            "application/xml"
        };
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

    private com.squareup.okhttp.Call barcodeGenerateBarcodeTypeGetValidateBeforeCall(
            BarcodeGenerateBarcodeTypeGetRequest request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {

        // verify the required parameter 'request.barcodeType' is set
        if (request.barcodeType == null) {
            throw new ApiException(
                    "Missing the required parameter 'request.barcodeType'"
                            + " when calling barcodeGenerateBarcodeTypeGet(...)");
        }

        // verify the required parameter 'request.dataType' is set
        if (request.dataType == null) {
            throw new ApiException(
                    "Missing the required parameter 'request.dataType'"
                            + " when calling barcodeGenerateBarcodeTypeGet(...)");
        }

        // verify the required parameter 'request.data' is set
        if (request.data == null) {
            throw new ApiException(
                    "Missing the required parameter 'request.data'"
                            + " when calling barcodeGenerateBarcodeTypeGet(...)");
        }

        com.squareup.okhttp.Call call =
                barcodeGenerateBarcodeTypeGetCall(
                        request, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Generate barcode using GET request with parameters in route and query string.
     *
     * @param request See {@link BarcodeGenerateBarcodeTypeGetRequest}
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public File barcodeGenerateBarcodeTypeGet(BarcodeGenerateBarcodeTypeGetRequest request)
            throws ApiException {
        ApiResponse<File> resp = barcodeGenerateBarcodeTypeGetWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Generate barcode using GET request with parameters in route and query string.
     *
     * @param request See {@link BarcodeGenerateBarcodeTypeGetRequest}
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public ApiResponse<File> barcodeGenerateBarcodeTypeGetWithHttpInfo(
            BarcodeGenerateBarcodeTypeGetRequest request) throws ApiException {
        com.squareup.okhttp.Call call =
                barcodeGenerateBarcodeTypeGetValidateBeforeCall(request, null, null);
        Type returnType = new TypeToken<File>() {}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Generate barcode using GET request with parameters in route and query string.
     * (asynchronously)
     *
     * @param request See {@link BarcodeGenerateBarcodeTypeGetRequest}
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     */
    public com.squareup.okhttp.Call barcodeGenerateBarcodeTypeGetAsync(
            BarcodeGenerateBarcodeTypeGetRequest request, final ApiCallback<File> callback)
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
                barcodeGenerateBarcodeTypeGetValidateBeforeCall(
                        request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<File>() {}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }

    /**
     * Build call for barcodeGenerateBodyPost
     *
     * @param request See {@link BarcodeGenerateBodyPostRequest}
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    @SuppressWarnings("removal")
    protected com.squareup.okhttp.Call barcodeGenerateBodyPostCall(
            BarcodeGenerateBodyPostRequest request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        Object postBody = request.generateParams;

        // create path and map variables
        String path = "/barcode/generate-body";

        List<Pair> queryParams = new ArrayList<>();
        List<Pair> collectionQueryParams = new ArrayList<>();
        Map<String, String> headerParams = new HashMap<>();

        Map<String, Object> formParams = new HashMap<>();
        final String[] accepts = {
            "image/png",
            "image/bmp",
            "image/gif",
            "image/jpeg",
            "image/svg+xml",
            "image/tiff",
            "application/json",
            "application/xml"
        };
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

    private com.squareup.okhttp.Call barcodeGenerateBodyPostValidateBeforeCall(
            BarcodeGenerateBodyPostRequest request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {

        // verify the required parameter 'request.generateParams' is set
        if (request.generateParams == null) {
            throw new ApiException(
                    "Missing the required parameter 'request.generateParams'"
                            + " when calling barcodeGenerateBodyPost(...)");
        }

        com.squareup.okhttp.Call call =
                barcodeGenerateBodyPostCall(request, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Generate barcode using POST request with parameters in body in json or xml format.
     *
     * @param request See {@link BarcodeGenerateBodyPostRequest}
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public File barcodeGenerateBodyPost(BarcodeGenerateBodyPostRequest request)
            throws ApiException {
        ApiResponse<File> resp = barcodeGenerateBodyPostWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Generate barcode using POST request with parameters in body in json or xml format.
     *
     * @param request See {@link BarcodeGenerateBodyPostRequest}
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public ApiResponse<File> barcodeGenerateBodyPostWithHttpInfo(
            BarcodeGenerateBodyPostRequest request) throws ApiException {
        com.squareup.okhttp.Call call =
                barcodeGenerateBodyPostValidateBeforeCall(request, null, null);
        Type returnType = new TypeToken<File>() {}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Generate barcode using POST request with parameters in body in json or xml format.
     * (asynchronously)
     *
     * @param request See {@link BarcodeGenerateBodyPostRequest}
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     */
    public com.squareup.okhttp.Call barcodeGenerateBodyPostAsync(
            BarcodeGenerateBodyPostRequest request, final ApiCallback<File> callback)
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
                barcodeGenerateBodyPostValidateBeforeCall(
                        request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<File>() {}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }

    /**
     * Build call for barcodeGenerateFormPost
     *
     * @param request See {@link BarcodeGenerateFormPostRequest}
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    @SuppressWarnings("removal")
    protected com.squareup.okhttp.Call barcodeGenerateFormPostCall(
            BarcodeGenerateFormPostRequest request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        Object postBody = null;

        // create path and map variables
        String path = "/barcode/generate-form";

        List<Pair> queryParams = new ArrayList<>();
        List<Pair> collectionQueryParams = new ArrayList<>();
        Map<String, String> headerParams = new HashMap<>();

        Map<String, Object> formParams = new HashMap<>();
        if (request.barcodeType != null) {
            formParams.put("barcodeType", request.barcodeType);
        }

        if (request.dataType != null) {
            formParams.put("DataType", request.dataType);
        }

        if (request.data != null) {
            formParams.put("Data", request.data);
        }

        if (request.imageFormat != null) {
            formParams.put("ImageFormat", request.imageFormat);
        }

        if (request.twoDDisplayText != null) {
            formParams.put("TwoDDisplayText", request.twoDDisplayText);
        }

        if (request.textLocation != null) {
            formParams.put("TextLocation", request.textLocation);
        }

        if (request.textAlignment != null) {
            formParams.put("TextAlignment", request.textAlignment);
        }

        if (request.foregroundColor != null) {
            formParams.put("ForegroundColor", request.foregroundColor);
        }

        if (request.backgroundColor != null) {
            formParams.put("BackgroundColor", request.backgroundColor);
        }

        if (request.units != null) {
            formParams.put("Units", request.units);
        }

        if (request.resolution != null) {
            formParams.put("Resolution", request.resolution);
        }

        if (request.imageHeight != null) {
            formParams.put("ImageHeight", request.imageHeight);
        }

        if (request.imageWidth != null) {
            formParams.put("ImageWidth", request.imageWidth);
        }

        if (request.rotationAngle != null) {
            formParams.put("RotationAngle", request.rotationAngle);
        }

        final String[] accepts = {
            "image/png",
            "image/bmp",
            "image/gif",
            "image/jpeg",
            "image/svg+xml",
            "image/tiff",
            "application/json",
            "application/xml"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) {
            headerParams.put("Accept", accept);
        }

        final String[] contentTypes = {"application/x-www-form-urlencoded"};
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

    private com.squareup.okhttp.Call barcodeGenerateFormPostValidateBeforeCall(
            BarcodeGenerateFormPostRequest request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {

        // verify the required parameter 'request.barcodeType' is set
        if (request.barcodeType == null) {
            throw new ApiException(
                    "Missing the required parameter 'request.barcodeType'"
                            + " when calling barcodeGenerateFormPost(...)");
        }

        // verify the required parameter 'request.dataType' is set
        if (request.dataType == null) {
            throw new ApiException(
                    "Missing the required parameter 'request.dataType'"
                            + " when calling barcodeGenerateFormPost(...)");
        }

        // verify the required parameter 'request.data' is set
        if (request.data == null) {
            throw new ApiException(
                    "Missing the required parameter 'request.data'"
                            + " when calling barcodeGenerateFormPost(...)");
        }

        com.squareup.okhttp.Call call =
                barcodeGenerateFormPostCall(request, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Generate barcode using POST request with parameters in url ecncoded form.
     *
     * @param request See {@link BarcodeGenerateFormPostRequest}
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public File barcodeGenerateFormPost(BarcodeGenerateFormPostRequest request)
            throws ApiException {
        ApiResponse<File> resp = barcodeGenerateFormPostWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Generate barcode using POST request with parameters in url ecncoded form.
     *
     * @param request See {@link BarcodeGenerateFormPostRequest}
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public ApiResponse<File> barcodeGenerateFormPostWithHttpInfo(
            BarcodeGenerateFormPostRequest request) throws ApiException {
        com.squareup.okhttp.Call call =
                barcodeGenerateFormPostValidateBeforeCall(request, null, null);
        Type returnType = new TypeToken<File>() {}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Generate barcode using POST request with parameters in url ecncoded form. (asynchronously)
     *
     * @param request See {@link BarcodeGenerateFormPostRequest}
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     */
    public com.squareup.okhttp.Call barcodeGenerateFormPostAsync(
            BarcodeGenerateFormPostRequest request, final ApiCallback<File> callback)
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
                barcodeGenerateFormPostValidateBeforeCall(
                        request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<File>() {}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
}
