// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="FolderApi.java">
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
import com.aspose.barcode.cloud.model.FilesList;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FolderApi {
    private ApiClient apiClient;

    public FolderApi() {
        this(Configuration.getDefaultApiClient());
    }

    public FolderApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for copyFolder
     *
     * @param srcPath Source folder path e.g. &#39;/src&#39; (required)
     * @param destPath Destination folder path e.g. &#39;/dst&#39; (required)
     * @param srcStorageName Source storage name (optional)
     * @param destStorageName Destination storage name (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    protected com.squareup.okhttp.Call copyFolderCall(
            String srcPath,
            String destPath,
            String srcStorageName,
            String destStorageName,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath =
                "/barcode/storage/folder/copy/{srcPath}"
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
    private com.squareup.okhttp.Call copyFolderValidateBeforeCall(
            String srcPath,
            String destPath,
            String srcStorageName,
            String destStorageName,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {

        // verify the required parameter 'srcPath' is set
        if (srcPath == null) {
            throw new ApiException(
                    "Missing the required parameter 'srcPath' when calling copyFolder(Async)");
        }

        // verify the required parameter 'destPath' is set
        if (destPath == null) {
            throw new ApiException(
                    "Missing the required parameter 'destPath' when calling copyFolder(Async)");
        }

        com.squareup.okhttp.Call call =
                copyFolderCall(
                        srcPath,
                        destPath,
                        srcStorageName,
                        destStorageName,
                        progressListener,
                        progressRequestListener);
        return call;
    }

    /**
     * Copy folder
     *
     * @param srcPath Source folder path e.g. &#39;/src&#39; (required)
     * @param destPath Destination folder path e.g. &#39;/dst&#39; (required)
     * @param srcStorageName Source storage name (optional)
     * @param destStorageName Destination storage name (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public void copyFolder(
            String srcPath, String destPath, String srcStorageName, String destStorageName)
            throws ApiException {
        copyFolderWithHttpInfo(srcPath, destPath, srcStorageName, destStorageName);
    }

    /**
     * Copy folder
     *
     * @param srcPath Source folder path e.g. &#39;/src&#39; (required)
     * @param destPath Destination folder path e.g. &#39;/dst&#39; (required)
     * @param srcStorageName Source storage name (optional)
     * @param destStorageName Destination storage name (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public ApiResponse<Void> copyFolderWithHttpInfo(
            String srcPath, String destPath, String srcStorageName, String destStorageName)
            throws ApiException {
        com.squareup.okhttp.Call call =
                copyFolderValidateBeforeCall(
                        srcPath, destPath, srcStorageName, destStorageName, null, null);
        return apiClient.execute(call);
    }

    /**
     * Copy folder (asynchronously)
     *
     * @param srcPath Source folder path e.g. &#39;/src&#39; (required)
     * @param destPath Destination folder path e.g. &#39;/dst&#39; (required)
     * @param srcStorageName Source storage name (optional)
     * @param destStorageName Destination storage name (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     */
    public com.squareup.okhttp.Call copyFolderAsync(
            String srcPath,
            String destPath,
            String srcStorageName,
            String destStorageName,
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
                copyFolderValidateBeforeCall(
                        srcPath,
                        destPath,
                        srcStorageName,
                        destStorageName,
                        progressListener,
                        progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for createFolder
     *
     * @param path Folder path to create e.g. &#39;folder_1/folder_2/&#39; (required)
     * @param storageName Storage name (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    protected com.squareup.okhttp.Call createFolderCall(
            String path,
            String storageName,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath =
                "/barcode/storage/folder/{path}".replaceAll("\\{" + "path" + "\\}", path);

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (storageName != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storageName", storageName));

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
    private com.squareup.okhttp.Call createFolderValidateBeforeCall(
            String path,
            String storageName,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {

        // verify the required parameter 'path' is set
        if (path == null) {
            throw new ApiException(
                    "Missing the required parameter 'path' when calling createFolder(Async)");
        }

        com.squareup.okhttp.Call call =
                createFolderCall(path, storageName, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Create the folder
     *
     * @param path Folder path to create e.g. &#39;folder_1/folder_2/&#39; (required)
     * @param storageName Storage name (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public void createFolder(String path, String storageName) throws ApiException {
        createFolderWithHttpInfo(path, storageName);
    }

    /**
     * Create the folder
     *
     * @param path Folder path to create e.g. &#39;folder_1/folder_2/&#39; (required)
     * @param storageName Storage name (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public ApiResponse<Void> createFolderWithHttpInfo(String path, String storageName)
            throws ApiException {
        com.squareup.okhttp.Call call =
                createFolderValidateBeforeCall(path, storageName, null, null);
        return apiClient.execute(call);
    }

    /**
     * Create the folder (asynchronously)
     *
     * @param path Folder path to create e.g. &#39;folder_1/folder_2/&#39; (required)
     * @param storageName Storage name (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     */
    public com.squareup.okhttp.Call createFolderAsync(
            String path, String storageName, final ApiCallback<Void> callback) throws ApiException {

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
                createFolderValidateBeforeCall(
                        path, storageName, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for deleteFolder
     *
     * @param path Folder path e.g. &#39;/folder&#39; (required)
     * @param storageName Storage name (optional)
     * @param recursive Enable to delete folders, subfolders and files (optional, default to false)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    protected com.squareup.okhttp.Call deleteFolderCall(
            String path,
            String storageName,
            Boolean recursive,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath =
                "/barcode/storage/folder/{path}".replaceAll("\\{" + "path" + "\\}", path);

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (storageName != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storageName", storageName));
        if (recursive != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("recursive", recursive));

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
    private com.squareup.okhttp.Call deleteFolderValidateBeforeCall(
            String path,
            String storageName,
            Boolean recursive,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {

        // verify the required parameter 'path' is set
        if (path == null) {
            throw new ApiException(
                    "Missing the required parameter 'path' when calling deleteFolder(Async)");
        }

        com.squareup.okhttp.Call call =
                deleteFolderCall(
                        path, storageName, recursive, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Delete folder
     *
     * @param path Folder path e.g. &#39;/folder&#39; (required)
     * @param storageName Storage name (optional)
     * @param recursive Enable to delete folders, subfolders and files (optional, default to false)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public void deleteFolder(String path, String storageName, Boolean recursive)
            throws ApiException {
        deleteFolderWithHttpInfo(path, storageName, recursive);
    }

    /**
     * Delete folder
     *
     * @param path Folder path e.g. &#39;/folder&#39; (required)
     * @param storageName Storage name (optional)
     * @param recursive Enable to delete folders, subfolders and files (optional, default to false)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public ApiResponse<Void> deleteFolderWithHttpInfo(
            String path, String storageName, Boolean recursive) throws ApiException {
        com.squareup.okhttp.Call call =
                deleteFolderValidateBeforeCall(path, storageName, recursive, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete folder (asynchronously)
     *
     * @param path Folder path e.g. &#39;/folder&#39; (required)
     * @param storageName Storage name (optional)
     * @param recursive Enable to delete folders, subfolders and files (optional, default to false)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     */
    public com.squareup.okhttp.Call deleteFolderAsync(
            String path, String storageName, Boolean recursive, final ApiCallback<Void> callback)
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
                deleteFolderValidateBeforeCall(
                        path, storageName, recursive, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getFilesList
     *
     * @param path Folder path e.g. &#39;/folder&#39; (required)
     * @param storageName Storage name (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    protected com.squareup.okhttp.Call getFilesListCall(
            String path,
            String storageName,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath =
                "/barcode/storage/folder/{path}".replaceAll("\\{" + "path" + "\\}", path);

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (storageName != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storageName", storageName));

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
    private com.squareup.okhttp.Call getFilesListValidateBeforeCall(
            String path,
            String storageName,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {

        // verify the required parameter 'path' is set
        if (path == null) {
            throw new ApiException(
                    "Missing the required parameter 'path' when calling getFilesList(Async)");
        }

        com.squareup.okhttp.Call call =
                getFilesListCall(path, storageName, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Get all files and folders within a folder
     *
     * @param path Folder path e.g. &#39;/folder&#39; (required)
     * @param storageName Storage name (optional)
     * @return FilesList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public FilesList getFilesList(String path, String storageName) throws ApiException {
        ApiResponse<FilesList> resp = getFilesListWithHttpInfo(path, storageName);
        return resp.getData();
    }

    /**
     * Get all files and folders within a folder
     *
     * @param path Folder path e.g. &#39;/folder&#39; (required)
     * @param storageName Storage name (optional)
     * @return ApiResponse&lt;FilesList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public ApiResponse<FilesList> getFilesListWithHttpInfo(String path, String storageName)
            throws ApiException {
        com.squareup.okhttp.Call call =
                getFilesListValidateBeforeCall(path, storageName, null, null);
        Type localVarReturnType = new TypeToken<FilesList>() {}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get all files and folders within a folder (asynchronously)
     *
     * @param path Folder path e.g. &#39;/folder&#39; (required)
     * @param storageName Storage name (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     */
    public com.squareup.okhttp.Call getFilesListAsync(
            String path, String storageName, final ApiCallback<FilesList> callback)
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
                getFilesListValidateBeforeCall(
                        path, storageName, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FilesList>() {}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for moveFolder
     *
     * @param srcPath Folder path to move e.g. &#39;/folder&#39; (required)
     * @param destPath Destination folder path to move to e.g &#39;/dst&#39; (required)
     * @param srcStorageName Source storage name (optional)
     * @param destStorageName Destination storage name (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    protected com.squareup.okhttp.Call moveFolderCall(
            String srcPath,
            String destPath,
            String srcStorageName,
            String destStorageName,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath =
                "/barcode/storage/folder/move/{srcPath}"
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
    private com.squareup.okhttp.Call moveFolderValidateBeforeCall(
            String srcPath,
            String destPath,
            String srcStorageName,
            String destStorageName,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {

        // verify the required parameter 'srcPath' is set
        if (srcPath == null) {
            throw new ApiException(
                    "Missing the required parameter 'srcPath' when calling moveFolder(Async)");
        }

        // verify the required parameter 'destPath' is set
        if (destPath == null) {
            throw new ApiException(
                    "Missing the required parameter 'destPath' when calling moveFolder(Async)");
        }

        com.squareup.okhttp.Call call =
                moveFolderCall(
                        srcPath,
                        destPath,
                        srcStorageName,
                        destStorageName,
                        progressListener,
                        progressRequestListener);
        return call;
    }

    /**
     * Move folder
     *
     * @param srcPath Folder path to move e.g. &#39;/folder&#39; (required)
     * @param destPath Destination folder path to move to e.g &#39;/dst&#39; (required)
     * @param srcStorageName Source storage name (optional)
     * @param destStorageName Destination storage name (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public void moveFolder(
            String srcPath, String destPath, String srcStorageName, String destStorageName)
            throws ApiException {
        moveFolderWithHttpInfo(srcPath, destPath, srcStorageName, destStorageName);
    }

    /**
     * Move folder
     *
     * @param srcPath Folder path to move e.g. &#39;/folder&#39; (required)
     * @param destPath Destination folder path to move to e.g &#39;/dst&#39; (required)
     * @param srcStorageName Source storage name (optional)
     * @param destStorageName Destination storage name (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public ApiResponse<Void> moveFolderWithHttpInfo(
            String srcPath, String destPath, String srcStorageName, String destStorageName)
            throws ApiException {
        com.squareup.okhttp.Call call =
                moveFolderValidateBeforeCall(
                        srcPath, destPath, srcStorageName, destStorageName, null, null);
        return apiClient.execute(call);
    }

    /**
     * Move folder (asynchronously)
     *
     * @param srcPath Folder path to move e.g. &#39;/folder&#39; (required)
     * @param destPath Destination folder path to move to e.g &#39;/dst&#39; (required)
     * @param srcStorageName Source storage name (optional)
     * @param destStorageName Destination storage name (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     */
    public com.squareup.okhttp.Call moveFolderAsync(
            String srcPath,
            String destPath,
            String srcStorageName,
            String destStorageName,
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
                moveFolderValidateBeforeCall(
                        srcPath,
                        destPath,
                        srcStorageName,
                        destStorageName,
                        progressListener,
                        progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
