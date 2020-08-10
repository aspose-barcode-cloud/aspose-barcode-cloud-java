// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="FileApi.java">
//   Copyright (c) 2020 Aspose.BarCode for Cloud
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
     * @param srcPath Source file path e.g. &#39;/folder/file.ext&#39; (required)
     * @param destPath Destination file path (required)
     * @param srcStorageName Source storage name (optional)
     * @param destStorageName Destination storage name (optional)
     * @param versionId File version ID to copy (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call copyFileCall(
            String srcPath,
            String destPath,
            String srcStorageName,
            String destStorageName,
            String versionId,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath =
                "/barcode/storage/file/copy/{srcPath}"
                        .replaceAll("\\{" + "srcPath" + "\\}", srcPath);

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (destPath != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("destPath", destPath));
        if (srcStorageName != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("srcStorageName", srcStorageName));
        if (destStorageName != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("destStorageName", destStorageName));
        if (versionId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("versionId", versionId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {"application/json"};
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

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

        String[] localVarAuthNames = new String[] {"JWT"};
        return apiClient.buildCall(
                localVarPath,
                "PUT",
                localVarQueryParams,
                localVarCollectionQueryParams,
                localVarPostBody,
                localVarHeaderParams,
                localVarFormParams,
                localVarAuthNames,
                progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call copyFileValidateBeforeCall(
            String srcPath,
            String destPath,
            String srcStorageName,
            String destStorageName,
            String versionId,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {

        // verify the required parameter 'srcPath' is set
        if (srcPath == null) {
            throw new ApiException(
                    "Missing the required parameter 'srcPath' when calling copyFile(Async)");
        }

        // verify the required parameter 'destPath' is set
        if (destPath == null) {
            throw new ApiException(
                    "Missing the required parameter 'destPath' when calling copyFile(Async)");
        }

        com.squareup.okhttp.Call call =
                copyFileCall(
                        srcPath,
                        destPath,
                        srcStorageName,
                        destStorageName,
                        versionId,
                        progressListener,
                        progressRequestListener);
        return call;
    }

    /**
     * Copy file
     *
     * @param srcPath Source file path e.g. &#39;/folder/file.ext&#39; (required)
     * @param destPath Destination file path (required)
     * @param srcStorageName Source storage name (optional)
     * @param destStorageName Destination storage name (optional)
     * @param versionId File version ID to copy (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public void copyFile(
            String srcPath,
            String destPath,
            String srcStorageName,
            String destStorageName,
            String versionId)
            throws ApiException {
        copyFileWithHttpInfo(srcPath, destPath, srcStorageName, destStorageName, versionId);
    }

    /**
     * Copy file
     *
     * @param srcPath Source file path e.g. &#39;/folder/file.ext&#39; (required)
     * @param destPath Destination file path (required)
     * @param srcStorageName Source storage name (optional)
     * @param destStorageName Destination storage name (optional)
     * @param versionId File version ID to copy (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public ApiResponse<Void> copyFileWithHttpInfo(
            String srcPath,
            String destPath,
            String srcStorageName,
            String destStorageName,
            String versionId)
            throws ApiException {
        com.squareup.okhttp.Call call =
                copyFileValidateBeforeCall(
                        srcPath, destPath, srcStorageName, destStorageName, versionId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Copy file (asynchronously)
     *
     * @param srcPath Source file path e.g. &#39;/folder/file.ext&#39; (required)
     * @param destPath Destination file path (required)
     * @param srcStorageName Source storage name (optional)
     * @param destStorageName Destination storage name (optional)
     * @param versionId File version ID to copy (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     */
    public com.squareup.okhttp.Call copyFileAsync(
            String srcPath,
            String destPath,
            String srcStorageName,
            String destStorageName,
            String versionId,
            final ApiCallback<Void> callback)
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
                copyFileValidateBeforeCall(
                        srcPath,
                        destPath,
                        srcStorageName,
                        destStorageName,
                        versionId,
                        progressListener,
                        progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for deleteFile
     *
     * @param path File path e.g. &#39;/folder/file.ext&#39; (required)
     * @param storageName Storage name (optional)
     * @param versionId File version ID to delete (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteFileCall(
            String path,
            String storageName,
            String versionId,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath =
                "/barcode/storage/file/{path}".replaceAll("\\{" + "path" + "\\}", path);

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (storageName != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storageName", storageName));
        if (versionId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("versionId", versionId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {"application/json"};
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

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

        String[] localVarAuthNames = new String[] {"JWT"};
        return apiClient.buildCall(
                localVarPath,
                "DELETE",
                localVarQueryParams,
                localVarCollectionQueryParams,
                localVarPostBody,
                localVarHeaderParams,
                localVarFormParams,
                localVarAuthNames,
                progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteFileValidateBeforeCall(
            String path,
            String storageName,
            String versionId,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {

        // verify the required parameter 'path' is set
        if (path == null) {
            throw new ApiException(
                    "Missing the required parameter 'path' when calling deleteFile(Async)");
        }

        com.squareup.okhttp.Call call =
                deleteFileCall(
                        path, storageName, versionId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Delete file
     *
     * @param path File path e.g. &#39;/folder/file.ext&#39; (required)
     * @param storageName Storage name (optional)
     * @param versionId File version ID to delete (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public void deleteFile(String path, String storageName, String versionId) throws ApiException {
        deleteFileWithHttpInfo(path, storageName, versionId);
    }

    /**
     * Delete file
     *
     * @param path File path e.g. &#39;/folder/file.ext&#39; (required)
     * @param storageName Storage name (optional)
     * @param versionId File version ID to delete (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public ApiResponse<Void> deleteFileWithHttpInfo(
            String path, String storageName, String versionId) throws ApiException {
        com.squareup.okhttp.Call call =
                deleteFileValidateBeforeCall(path, storageName, versionId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete file (asynchronously)
     *
     * @param path File path e.g. &#39;/folder/file.ext&#39; (required)
     * @param storageName Storage name (optional)
     * @param versionId File version ID to delete (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     */
    public com.squareup.okhttp.Call deleteFileAsync(
            String path, String storageName, String versionId, final ApiCallback<Void> callback)
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
                deleteFileValidateBeforeCall(
                        path, storageName, versionId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for downloadFile
     *
     * @param path File path e.g. &#39;/folder/file.ext&#39; (required)
     * @param storageName Storage name (optional)
     * @param versionId File version ID to download (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call downloadFileCall(
            String path,
            String storageName,
            String versionId,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath =
                "/barcode/storage/file/{path}".replaceAll("\\{" + "path" + "\\}", path);

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (storageName != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storageName", storageName));
        if (versionId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("versionId", versionId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {"multipart/form-data"};
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {"application/json"};
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

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

        String[] localVarAuthNames = new String[] {"JWT"};
        return apiClient.buildCall(
                localVarPath,
                "GET",
                localVarQueryParams,
                localVarCollectionQueryParams,
                localVarPostBody,
                localVarHeaderParams,
                localVarFormParams,
                localVarAuthNames,
                progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call downloadFileValidateBeforeCall(
            String path,
            String storageName,
            String versionId,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {

        // verify the required parameter 'path' is set
        if (path == null) {
            throw new ApiException(
                    "Missing the required parameter 'path' when calling downloadFile(Async)");
        }

        com.squareup.okhttp.Call call =
                downloadFileCall(
                        path, storageName, versionId, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Download file
     *
     * @param path File path e.g. &#39;/folder/file.ext&#39; (required)
     * @param storageName Storage name (optional)
     * @param versionId File version ID to download (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public File downloadFile(String path, String storageName, String versionId)
            throws ApiException {
        ApiResponse<File> resp = downloadFileWithHttpInfo(path, storageName, versionId);
        return resp.getData();
    }

    /**
     * Download file
     *
     * @param path File path e.g. &#39;/folder/file.ext&#39; (required)
     * @param storageName Storage name (optional)
     * @param versionId File version ID to download (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public ApiResponse<File> downloadFileWithHttpInfo(
            String path, String storageName, String versionId) throws ApiException {
        com.squareup.okhttp.Call call =
                downloadFileValidateBeforeCall(path, storageName, versionId, null, null);
        Type localVarReturnType = new TypeToken<File>() {}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Download file (asynchronously)
     *
     * @param path File path e.g. &#39;/folder/file.ext&#39; (required)
     * @param storageName Storage name (optional)
     * @param versionId File version ID to download (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     */
    public com.squareup.okhttp.Call downloadFileAsync(
            String path, String storageName, String versionId, final ApiCallback<File> callback)
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
                downloadFileValidateBeforeCall(
                        path, storageName, versionId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>() {}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for moveFile
     *
     * @param srcPath Source file path e.g. &#39;/src.ext&#39; (required)
     * @param destPath Destination file path e.g. &#39;/dest.ext&#39; (required)
     * @param srcStorageName Source storage name (optional)
     * @param destStorageName Destination storage name (optional)
     * @param versionId File version ID to move (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call moveFileCall(
            String srcPath,
            String destPath,
            String srcStorageName,
            String destStorageName,
            String versionId,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath =
                "/barcode/storage/file/move/{srcPath}"
                        .replaceAll("\\{" + "srcPath" + "\\}", srcPath);

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (destPath != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("destPath", destPath));
        if (srcStorageName != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("srcStorageName", srcStorageName));
        if (destStorageName != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("destStorageName", destStorageName));
        if (versionId != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("versionId", versionId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {"application/json"};
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

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

        String[] localVarAuthNames = new String[] {"JWT"};
        return apiClient.buildCall(
                localVarPath,
                "PUT",
                localVarQueryParams,
                localVarCollectionQueryParams,
                localVarPostBody,
                localVarHeaderParams,
                localVarFormParams,
                localVarAuthNames,
                progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call moveFileValidateBeforeCall(
            String srcPath,
            String destPath,
            String srcStorageName,
            String destStorageName,
            String versionId,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {

        // verify the required parameter 'srcPath' is set
        if (srcPath == null) {
            throw new ApiException(
                    "Missing the required parameter 'srcPath' when calling moveFile(Async)");
        }

        // verify the required parameter 'destPath' is set
        if (destPath == null) {
            throw new ApiException(
                    "Missing the required parameter 'destPath' when calling moveFile(Async)");
        }

        com.squareup.okhttp.Call call =
                moveFileCall(
                        srcPath,
                        destPath,
                        srcStorageName,
                        destStorageName,
                        versionId,
                        progressListener,
                        progressRequestListener);
        return call;
    }

    /**
     * Move file
     *
     * @param srcPath Source file path e.g. &#39;/src.ext&#39; (required)
     * @param destPath Destination file path e.g. &#39;/dest.ext&#39; (required)
     * @param srcStorageName Source storage name (optional)
     * @param destStorageName Destination storage name (optional)
     * @param versionId File version ID to move (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public void moveFile(
            String srcPath,
            String destPath,
            String srcStorageName,
            String destStorageName,
            String versionId)
            throws ApiException {
        moveFileWithHttpInfo(srcPath, destPath, srcStorageName, destStorageName, versionId);
    }

    /**
     * Move file
     *
     * @param srcPath Source file path e.g. &#39;/src.ext&#39; (required)
     * @param destPath Destination file path e.g. &#39;/dest.ext&#39; (required)
     * @param srcStorageName Source storage name (optional)
     * @param destStorageName Destination storage name (optional)
     * @param versionId File version ID to move (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public ApiResponse<Void> moveFileWithHttpInfo(
            String srcPath,
            String destPath,
            String srcStorageName,
            String destStorageName,
            String versionId)
            throws ApiException {
        com.squareup.okhttp.Call call =
                moveFileValidateBeforeCall(
                        srcPath, destPath, srcStorageName, destStorageName, versionId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Move file (asynchronously)
     *
     * @param srcPath Source file path e.g. &#39;/src.ext&#39; (required)
     * @param destPath Destination file path e.g. &#39;/dest.ext&#39; (required)
     * @param srcStorageName Source storage name (optional)
     * @param destStorageName Destination storage name (optional)
     * @param versionId File version ID to move (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     */
    public com.squareup.okhttp.Call moveFileAsync(
            String srcPath,
            String destPath,
            String srcStorageName,
            String destStorageName,
            String versionId,
            final ApiCallback<Void> callback)
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
                moveFileValidateBeforeCall(
                        srcPath,
                        destPath,
                        srcStorageName,
                        destStorageName,
                        versionId,
                        progressListener,
                        progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for uploadFile
     *
     * @param path Path where to upload including filename and extension e.g. /file.ext or /Folder
     *     1/file.ext If the content is multipart and path does not contains the file name it tries
     *     to get them from filename parameter from Content-Disposition header. (required)
     * @param file File to upload (required)
     * @param storageName Storage name (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call uploadFileCall(
            String path,
            File file,
            String storageName,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath =
                "/barcode/storage/file/{path}".replaceAll("\\{" + "path" + "\\}", path);

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (storageName != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storageName", storageName));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (file != null) localVarFormParams.put("File", file);

        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {"multipart/form-data"};
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

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

        String[] localVarAuthNames = new String[] {"JWT"};
        return apiClient.buildCall(
                localVarPath,
                "PUT",
                localVarQueryParams,
                localVarCollectionQueryParams,
                localVarPostBody,
                localVarHeaderParams,
                localVarFormParams,
                localVarAuthNames,
                progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call uploadFileValidateBeforeCall(
            String path,
            File file,
            String storageName,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {

        // verify the required parameter 'path' is set
        if (path == null) {
            throw new ApiException(
                    "Missing the required parameter 'path' when calling uploadFile(Async)");
        }

        // verify the required parameter 'file' is set
        if (file == null) {
            throw new ApiException(
                    "Missing the required parameter 'file' when calling uploadFile(Async)");
        }

        com.squareup.okhttp.Call call =
                uploadFileCall(path, file, storageName, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Upload file
     *
     * @param path Path where to upload including filename and extension e.g. /file.ext or /Folder
     *     1/file.ext If the content is multipart and path does not contains the file name it tries
     *     to get them from filename parameter from Content-Disposition header. (required)
     * @param file File to upload (required)
     * @param storageName Storage name (optional)
     * @return FilesUploadResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public FilesUploadResult uploadFile(String path, File file, String storageName)
            throws ApiException {
        ApiResponse<FilesUploadResult> resp = uploadFileWithHttpInfo(path, file, storageName);
        return resp.getData();
    }

    /**
     * Upload file
     *
     * @param path Path where to upload including filename and extension e.g. /file.ext or /Folder
     *     1/file.ext If the content is multipart and path does not contains the file name it tries
     *     to get them from filename parameter from Content-Disposition header. (required)
     * @param file File to upload (required)
     * @param storageName Storage name (optional)
     * @return ApiResponse&lt;FilesUploadResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public ApiResponse<FilesUploadResult> uploadFileWithHttpInfo(
            String path, File file, String storageName) throws ApiException {
        com.squareup.okhttp.Call call =
                uploadFileValidateBeforeCall(path, file, storageName, null, null);
        Type localVarReturnType = new TypeToken<FilesUploadResult>() {}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Upload file (asynchronously)
     *
     * @param path Path where to upload including filename and extension e.g. /file.ext or /Folder
     *     1/file.ext If the content is multipart and path does not contains the file name it tries
     *     to get them from filename parameter from Content-Disposition header. (required)
     * @param file File to upload (required)
     * @param storageName Storage name (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     */
    public com.squareup.okhttp.Call uploadFileAsync(
            String path,
            File file,
            String storageName,
            final ApiCallback<FilesUploadResult> callback)
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
                uploadFileValidateBeforeCall(
                        path, file, storageName, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FilesUploadResult>() {}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
