// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="FileApi.java">
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
import com.aspose.barcode.cloud.model.FilesUploadResult;
import com.aspose.barcode.cloud.requests.*;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileApi {
    private ApiClient apiClient;

    public FileApi() {
        this(Configuration.getDefaultApiClient());
    }

    public FileApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for copyFile
     *
     * @param request See {@link CopyFileRequest}
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    protected com.squareup.okhttp.Call copyFileCall(
            CopyFileRequest request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        Object postBody = null;

        // create path and map variables
        String path =
                "/barcode/storage/file/copy/{srcPath}"
                        .replaceAll("\\{" + "srcPath" + "}", request.srcPath);

        List<Pair> queryParams = new ArrayList<>();
        List<Pair> collectionQueryParams = new ArrayList<>();
        if (request.destPath != null)
            queryParams.addAll(apiClient.parameterToPair("destPath", request.destPath));
        if (request.srcStorageName != null)
            queryParams.addAll(apiClient.parameterToPair("srcStorageName", request.srcStorageName));
        if (request.destStorageName != null)
            queryParams.addAll(
                    apiClient.parameterToPair("destStorageName", request.destStorageName));
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
                "PUT",
                queryParams,
                collectionQueryParams,
                postBody,
                headerParams,
                formParams,
                progressRequestListener);
    }

    private com.squareup.okhttp.Call copyFileValidateBeforeCall(
            CopyFileRequest request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {

        // verify the required parameter 'request.srcPath' is set
        if (request.srcPath == null) {
            throw new ApiException(
                    "Missing the required parameter 'request.srcPath' when calling copyFile(Async)");
        }

        // verify the required parameter 'request.destPath' is set
        if (request.destPath == null) {
            throw new ApiException(
                    "Missing the required parameter 'request.destPath' when calling copyFile(Async)");
        }

        com.squareup.okhttp.Call call =
                copyFileCall(request, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Copy file
     *
     * @param request See {@link CopyFileRequest}
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public void copyFile(CopyFileRequest request) throws ApiException {
        copyFileWithHttpInfo(request);
    }

    /**
     * Copy file
     *
     * @param request See {@link CopyFileRequest}
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public ApiResponse<Void> copyFileWithHttpInfo(CopyFileRequest request) throws ApiException {
        com.squareup.okhttp.Call call = copyFileValidateBeforeCall(request, null, null);
        return apiClient.execute(call);
    }

    /**
     * Copy file (asynchronously)
     *
     * @param request See {@link CopyFileRequest}
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     */
    public com.squareup.okhttp.Call copyFileAsync(
            CopyFileRequest request, final ApiCallback<Void> callback) throws ApiException {

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
                copyFileValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for deleteFile
     *
     * @param request See {@link DeleteFileRequest}
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    protected com.squareup.okhttp.Call deleteFileCall(
            DeleteFileRequest request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        Object postBody = null;

        // create path and map variables
        String path = "/barcode/storage/file/{path}".replaceAll("\\{" + "path" + "}", request.path);

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
                "DELETE",
                queryParams,
                collectionQueryParams,
                postBody,
                headerParams,
                formParams,
                progressRequestListener);
    }

    private com.squareup.okhttp.Call deleteFileValidateBeforeCall(
            DeleteFileRequest request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {

        // verify the required parameter 'request.path' is set
        if (request.path == null) {
            throw new ApiException(
                    "Missing the required parameter 'request.path' when calling deleteFile(Async)");
        }

        com.squareup.okhttp.Call call =
                deleteFileCall(request, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Delete file
     *
     * @param request See {@link DeleteFileRequest}
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public void deleteFile(DeleteFileRequest request) throws ApiException {
        deleteFileWithHttpInfo(request);
    }

    /**
     * Delete file
     *
     * @param request See {@link DeleteFileRequest}
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public ApiResponse<Void> deleteFileWithHttpInfo(DeleteFileRequest request) throws ApiException {
        com.squareup.okhttp.Call call = deleteFileValidateBeforeCall(request, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete file (asynchronously)
     *
     * @param request See {@link DeleteFileRequest}
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     */
    public com.squareup.okhttp.Call deleteFileAsync(
            DeleteFileRequest request, final ApiCallback<Void> callback) throws ApiException {

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
                deleteFileValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for downloadFile
     *
     * @param request See {@link DownloadFileRequest}
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    protected com.squareup.okhttp.Call downloadFileCall(
            DownloadFileRequest request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        Object postBody = null;

        // create path and map variables
        String path = "/barcode/storage/file/{path}".replaceAll("\\{" + "path" + "}", request.path);

        List<Pair> queryParams = new ArrayList<>();
        List<Pair> collectionQueryParams = new ArrayList<>();
        if (request.storageName != null)
            queryParams.addAll(apiClient.parameterToPair("storageName", request.storageName));
        if (request.versionId != null)
            queryParams.addAll(apiClient.parameterToPair("versionId", request.versionId));

        Map<String, String> headerParams = new HashMap<>();

        Map<String, Object> formParams = new HashMap<>();

        final String[] accepts = {"multipart/form-data"};
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

    private com.squareup.okhttp.Call downloadFileValidateBeforeCall(
            DownloadFileRequest request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {

        // verify the required parameter 'request.path' is set
        if (request.path == null) {
            throw new ApiException(
                    "Missing the required parameter 'request.path' when calling downloadFile(Async)");
        }

        com.squareup.okhttp.Call call =
                downloadFileCall(request, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Download file
     *
     * @param request See {@link DownloadFileRequest}
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public File downloadFile(DownloadFileRequest request) throws ApiException {
        ApiResponse<File> resp = downloadFileWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Download file
     *
     * @param request See {@link DownloadFileRequest}
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public ApiResponse<File> downloadFileWithHttpInfo(DownloadFileRequest request)
            throws ApiException {
        com.squareup.okhttp.Call call = downloadFileValidateBeforeCall(request, null, null);
        Type returnType = new TypeToken<File>() {}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Download file (asynchronously)
     *
     * @param request See {@link DownloadFileRequest}
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     */
    public com.squareup.okhttp.Call downloadFileAsync(
            DownloadFileRequest request, final ApiCallback<File> callback) throws ApiException {

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
                downloadFileValidateBeforeCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<File>() {}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for moveFile
     *
     * @param request See {@link MoveFileRequest}
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    protected com.squareup.okhttp.Call moveFileCall(
            MoveFileRequest request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        Object postBody = null;

        // create path and map variables
        String path =
                "/barcode/storage/file/move/{srcPath}"
                        .replaceAll("\\{" + "srcPath" + "}", request.srcPath);

        List<Pair> queryParams = new ArrayList<>();
        List<Pair> collectionQueryParams = new ArrayList<>();
        if (request.destPath != null)
            queryParams.addAll(apiClient.parameterToPair("destPath", request.destPath));
        if (request.srcStorageName != null)
            queryParams.addAll(apiClient.parameterToPair("srcStorageName", request.srcStorageName));
        if (request.destStorageName != null)
            queryParams.addAll(
                    apiClient.parameterToPair("destStorageName", request.destStorageName));
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
                "PUT",
                queryParams,
                collectionQueryParams,
                postBody,
                headerParams,
                formParams,
                progressRequestListener);
    }

    private com.squareup.okhttp.Call moveFileValidateBeforeCall(
            MoveFileRequest request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {

        // verify the required parameter 'request.srcPath' is set
        if (request.srcPath == null) {
            throw new ApiException(
                    "Missing the required parameter 'request.srcPath' when calling moveFile(Async)");
        }

        // verify the required parameter 'request.destPath' is set
        if (request.destPath == null) {
            throw new ApiException(
                    "Missing the required parameter 'request.destPath' when calling moveFile(Async)");
        }

        com.squareup.okhttp.Call call =
                moveFileCall(request, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Move file
     *
     * @param request See {@link MoveFileRequest}
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public void moveFile(MoveFileRequest request) throws ApiException {
        moveFileWithHttpInfo(request);
    }

    /**
     * Move file
     *
     * @param request See {@link MoveFileRequest}
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public ApiResponse<Void> moveFileWithHttpInfo(MoveFileRequest request) throws ApiException {
        com.squareup.okhttp.Call call = moveFileValidateBeforeCall(request, null, null);
        return apiClient.execute(call);
    }

    /**
     * Move file (asynchronously)
     *
     * @param request See {@link MoveFileRequest}
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     */
    public com.squareup.okhttp.Call moveFileAsync(
            MoveFileRequest request, final ApiCallback<Void> callback) throws ApiException {

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
                moveFileValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for uploadFile
     *
     * @param request See {@link UploadFileRequest}
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    protected com.squareup.okhttp.Call uploadFileCall(
            UploadFileRequest request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        Object postBody = null;

        // create path and map variables
        String path = "/barcode/storage/file/{path}".replaceAll("\\{" + "path" + "}", request.path);

        List<Pair> queryParams = new ArrayList<>();
        List<Pair> collectionQueryParams = new ArrayList<>();
        if (request.storageName != null)
            queryParams.addAll(apiClient.parameterToPair("storageName", request.storageName));

        Map<String, String> headerParams = new HashMap<>();

        Map<String, Object> formParams = new HashMap<>();
        if (request.file != null) formParams.put("File", request.file);

        final String[] accepts = {"application/json"};
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

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
                "PUT",
                queryParams,
                collectionQueryParams,
                postBody,
                headerParams,
                formParams,
                progressRequestListener);
    }

    private com.squareup.okhttp.Call uploadFileValidateBeforeCall(
            UploadFileRequest request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {

        // verify the required parameter 'request.path' is set
        if (request.path == null) {
            throw new ApiException(
                    "Missing the required parameter 'request.path' when calling uploadFile(Async)");
        }

        // verify the required parameter 'request.file' is set
        if (request.file == null) {
            throw new ApiException(
                    "Missing the required parameter 'request.file' when calling uploadFile(Async)");
        }

        com.squareup.okhttp.Call call =
                uploadFileCall(request, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Upload file
     *
     * @param request See {@link UploadFileRequest}
     * @return FilesUploadResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public FilesUploadResult uploadFile(UploadFileRequest request) throws ApiException {
        ApiResponse<FilesUploadResult> resp = uploadFileWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Upload file
     *
     * @param request See {@link UploadFileRequest}
     * @return ApiResponse&lt;FilesUploadResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public ApiResponse<FilesUploadResult> uploadFileWithHttpInfo(UploadFileRequest request)
            throws ApiException {
        com.squareup.okhttp.Call call = uploadFileValidateBeforeCall(request, null, null);
        Type returnType = new TypeToken<FilesUploadResult>() {}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Upload file (asynchronously)
     *
     * @param request See {@link UploadFileRequest}
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     */
    public com.squareup.okhttp.Call uploadFileAsync(
            UploadFileRequest request, final ApiCallback<FilesUploadResult> callback)
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
                uploadFileValidateBeforeCall(request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<FilesUploadResult>() {}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
}
