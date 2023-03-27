// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="StorageApi.java">
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

package com.aspose.barcode.cloud.api;

import com.aspose.barcode.cloud.ApiCallback;
import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.ApiResponse;
import com.aspose.barcode.cloud.Configuration;
import com.aspose.barcode.cloud.Pair;
import com.aspose.barcode.cloud.ProgressRequestBody;
import com.aspose.barcode.cloud.ProgressResponseBody;
import com.aspose.barcode.cloud.model.DiscUsage;
import com.aspose.barcode.cloud.model.FileVersions;
import com.aspose.barcode.cloud.model.ObjectExist;
import com.aspose.barcode.cloud.model.StorageExist;
import com.aspose.barcode.cloud.requests.*;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StorageApi {
    private ApiClient apiClient;

    public StorageApi() {
        this(Configuration.getDefaultApiClient());
    }

    public StorageApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getDiscUsage
     *
     * @param request See {@link GetDiscUsageRequest}
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    protected com.squareup.okhttp.Call getDiscUsageCall(
            GetDiscUsageRequest request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        Object postBody = null;

        // create path and map variables
        String path = "/barcode/storage/disc";

        List<Pair> queryParams = new ArrayList<>();
        List<Pair> collectionQueryParams = new ArrayList<>();
        if (request.storageName != null)
            queryParams.addAll(apiClient.parameterToPair("storageName", request.storageName));

        Map<String, String> headerParams = new HashMap<>();

        Map<String, Object> formParams = new HashMap<>();

        final String[] accepts = {"application/json"};
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {"application/json"};
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

    private com.squareup.okhttp.Call getDiscUsageValidateBeforeCall(
            GetDiscUsageRequest request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {

        com.squareup.okhttp.Call call =
                getDiscUsageCall(request, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Get disc usage
     *
     * @param request See {@link GetDiscUsageRequest}
     * @return DiscUsage
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public DiscUsage getDiscUsage(GetDiscUsageRequest request) throws ApiException {
        ApiResponse<DiscUsage> resp = getDiscUsageWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Get disc usage
     *
     * @param request See {@link GetDiscUsageRequest}
     * @return ApiResponse&lt;DiscUsage&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public ApiResponse<DiscUsage> getDiscUsageWithHttpInfo(GetDiscUsageRequest request)
            throws ApiException {
        com.squareup.okhttp.Call call = getDiscUsageValidateBeforeCall(request, null, null);
        Type returnType = new TypeToken<DiscUsage>() {}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Get disc usage (asynchronously)
     *
     * @param request See {@link GetDiscUsageRequest}
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     */
    public com.squareup.okhttp.Call getDiscUsageAsync(
            GetDiscUsageRequest request, final ApiCallback<DiscUsage> callback)
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
                getDiscUsageValidateBeforeCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<DiscUsage>() {}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getFileVersions
     *
     * @param request See {@link GetFileVersionsRequest}
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    protected com.squareup.okhttp.Call getFileVersionsCall(
            GetFileVersionsRequest request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        Object postBody = null;

        // create path and map variables
        String path =
                "/barcode/storage/version/{path}".replaceAll("\\{" + "path" + "}", request.path);

        List<Pair> queryParams = new ArrayList<>();
        List<Pair> collectionQueryParams = new ArrayList<>();
        if (request.storageName != null)
            queryParams.addAll(apiClient.parameterToPair("storageName", request.storageName));

        Map<String, String> headerParams = new HashMap<>();

        Map<String, Object> formParams = new HashMap<>();

        final String[] accepts = {"application/json"};
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {"application/json"};
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

    private com.squareup.okhttp.Call getFileVersionsValidateBeforeCall(
            GetFileVersionsRequest request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {

        // verify the required parameter 'request.path' is set
        if (request.path == null) {
            throw new ApiException(
                    "Missing the required parameter 'request.path' when calling getFileVersions(Async)");
        }

        com.squareup.okhttp.Call call =
                getFileVersionsCall(request, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Get file versions
     *
     * @param request See {@link GetFileVersionsRequest}
     * @return FileVersions
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public FileVersions getFileVersions(GetFileVersionsRequest request) throws ApiException {
        ApiResponse<FileVersions> resp = getFileVersionsWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Get file versions
     *
     * @param request See {@link GetFileVersionsRequest}
     * @return ApiResponse&lt;FileVersions&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public ApiResponse<FileVersions> getFileVersionsWithHttpInfo(GetFileVersionsRequest request)
            throws ApiException {
        com.squareup.okhttp.Call call = getFileVersionsValidateBeforeCall(request, null, null);
        Type returnType = new TypeToken<FileVersions>() {}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Get file versions (asynchronously)
     *
     * @param request See {@link GetFileVersionsRequest}
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     */
    public com.squareup.okhttp.Call getFileVersionsAsync(
            GetFileVersionsRequest request, final ApiCallback<FileVersions> callback)
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
                getFileVersionsValidateBeforeCall(
                        request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<FileVersions>() {}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for objectExists
     *
     * @param request See {@link ObjectExistsRequest}
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    protected com.squareup.okhttp.Call objectExistsCall(
            ObjectExistsRequest request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        Object postBody = null;

        // create path and map variables
        String path =
                "/barcode/storage/exist/{path}".replaceAll("\\{" + "path" + "}", request.path);

        List<Pair> queryParams = new ArrayList<>();
        List<Pair> collectionQueryParams = new ArrayList<>();
        if (request.storageName != null)
            queryParams.addAll(apiClient.parameterToPair("storageName", request.storageName));
        if (request.versionId != null)
            queryParams.addAll(apiClient.parameterToPair("versionId", request.versionId));

        Map<String, String> headerParams = new HashMap<>();

        Map<String, Object> formParams = new HashMap<>();

        final String[] accepts = {"application/json"};
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {"application/json"};
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

    private com.squareup.okhttp.Call objectExistsValidateBeforeCall(
            ObjectExistsRequest request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {

        // verify the required parameter 'request.path' is set
        if (request.path == null) {
            throw new ApiException(
                    "Missing the required parameter 'request.path' when calling objectExists(Async)");
        }

        com.squareup.okhttp.Call call =
                objectExistsCall(request, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Check if file or folder exists
     *
     * @param request See {@link ObjectExistsRequest}
     * @return ObjectExist
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public ObjectExist objectExists(ObjectExistsRequest request) throws ApiException {
        ApiResponse<ObjectExist> resp = objectExistsWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Check if file or folder exists
     *
     * @param request See {@link ObjectExistsRequest}
     * @return ApiResponse&lt;ObjectExist&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public ApiResponse<ObjectExist> objectExistsWithHttpInfo(ObjectExistsRequest request)
            throws ApiException {
        com.squareup.okhttp.Call call = objectExistsValidateBeforeCall(request, null, null);
        Type returnType = new TypeToken<ObjectExist>() {}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Check if file or folder exists (asynchronously)
     *
     * @param request See {@link ObjectExistsRequest}
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     */
    public com.squareup.okhttp.Call objectExistsAsync(
            ObjectExistsRequest request, final ApiCallback<ObjectExist> callback)
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
                objectExistsValidateBeforeCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<ObjectExist>() {}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for storageExists
     *
     * @param request See {@link StorageExistsRequest}
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    protected com.squareup.okhttp.Call storageExistsCall(
            StorageExistsRequest request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        Object postBody = null;

        // create path and map variables
        String path =
                "/barcode/storage/{storageName}/exist"
                        .replaceAll("\\{" + "storageName" + "}", request.storageName);

        List<Pair> queryParams = new ArrayList<>();
        List<Pair> collectionQueryParams = new ArrayList<>();

        Map<String, String> headerParams = new HashMap<>();

        Map<String, Object> formParams = new HashMap<>();

        final String[] accepts = {"application/json"};
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {"application/json"};
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

    private com.squareup.okhttp.Call storageExistsValidateBeforeCall(
            StorageExistsRequest request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {

        // verify the required parameter 'request.storageName' is set
        if (request.storageName == null) {
            throw new ApiException(
                    "Missing the required parameter 'request.storageName' when calling storageExists(Async)");
        }

        com.squareup.okhttp.Call call =
                storageExistsCall(request, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Check if storage exists
     *
     * @param request See {@link StorageExistsRequest}
     * @return StorageExist
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public StorageExist storageExists(StorageExistsRequest request) throws ApiException {
        ApiResponse<StorageExist> resp = storageExistsWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Check if storage exists
     *
     * @param request See {@link StorageExistsRequest}
     * @return ApiResponse&lt;StorageExist&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public ApiResponse<StorageExist> storageExistsWithHttpInfo(StorageExistsRequest request)
            throws ApiException {
        com.squareup.okhttp.Call call = storageExistsValidateBeforeCall(request, null, null);
        Type returnType = new TypeToken<StorageExist>() {}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Check if storage exists (asynchronously)
     *
     * @param request See {@link StorageExistsRequest}
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     */
    public com.squareup.okhttp.Call storageExistsAsync(
            StorageExistsRequest request, final ApiCallback<StorageExist> callback)
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
                storageExistsValidateBeforeCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<StorageExist>() {}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
}
