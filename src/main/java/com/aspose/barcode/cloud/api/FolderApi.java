// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="FolderApi.java">
//   Copyright (c) 2021 Aspose.BarCode for Cloud
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
import com.aspose.barcode.cloud.requests.*;
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
            CopyFolderRequest request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath =
                "/barcode/storage/folder/copy/{srcPath}"
                        .replaceAll("\\{" + "srcPath" + "}", request.srcPath);

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.destPath != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("destPath", request.destPath));
        if (request.srcStorageName != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("srcStorageName", request.srcStorageName));
        if (request.destStorageName != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("destStorageName", request.destStorageName));

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

        return apiClient.buildCall(
                localVarPath,
                "PUT",
                localVarQueryParams,
                localVarCollectionQueryParams,
                localVarPostBody,
                localVarHeaderParams,
                localVarFormParams,
                progressRequestListener);
    }

    private com.squareup.okhttp.Call copyFolderValidateBeforeCall(
            CopyFolderRequest request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {

        // verify the required parameter 'request.srcPath' is set
        if (request.srcPath == null) {
            throw new ApiException(
                    "Missing the required parameter 'request.srcPath' when calling"
                            + " copyFolder(Async)");
        }

        // verify the required parameter 'request.destPath' is set
        if (request.destPath == null) {
            throw new ApiException(
                    "Missing the required parameter 'request.destPath' when calling"
                            + " copyFolder(Async)");
        }

        com.squareup.okhttp.Call call =
                copyFolderCall(request, progressListener, progressRequestListener);
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
    public void copyFolder(CopyFolderRequest request) throws ApiException {
        copyFolderWithHttpInfo(request);
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
    public ApiResponse<Void> copyFolderWithHttpInfo(CopyFolderRequest request) throws ApiException {
        com.squareup.okhttp.Call call = copyFolderValidateBeforeCall(request, null, null);
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
            CopyFolderRequest request, final ApiCallback<Void> callback) throws ApiException {

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
                copyFolderValidateBeforeCall(request, progressListener, progressRequestListener);
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
            CreateFolderRequest request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath =
                "/barcode/storage/folder/{path}".replaceAll("\\{" + "path" + "}", request.path);

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.storageName != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("storageName", request.storageName));

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

        return apiClient.buildCall(
                localVarPath,
                "PUT",
                localVarQueryParams,
                localVarCollectionQueryParams,
                localVarPostBody,
                localVarHeaderParams,
                localVarFormParams,
                progressRequestListener);
    }

    private com.squareup.okhttp.Call createFolderValidateBeforeCall(
            CreateFolderRequest request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {

        // verify the required parameter 'request.path' is set
        if (request.path == null) {
            throw new ApiException(
                    "Missing the required parameter 'request.path' when calling"
                            + " createFolder(Async)");
        }

        com.squareup.okhttp.Call call =
                createFolderCall(request, progressListener, progressRequestListener);
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
    public void createFolder(CreateFolderRequest request) throws ApiException {
        createFolderWithHttpInfo(request);
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
    public ApiResponse<Void> createFolderWithHttpInfo(CreateFolderRequest request)
            throws ApiException {
        com.squareup.okhttp.Call call = createFolderValidateBeforeCall(request, null, null);
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
            CreateFolderRequest request, final ApiCallback<Void> callback) throws ApiException {

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
                createFolderValidateBeforeCall(request, progressListener, progressRequestListener);
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
            DeleteFolderRequest request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath =
                "/barcode/storage/folder/{path}".replaceAll("\\{" + "path" + "}", request.path);

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.storageName != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("storageName", request.storageName));
        if (request.recursive != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("recursive", request.recursive));

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

        return apiClient.buildCall(
                localVarPath,
                "DELETE",
                localVarQueryParams,
                localVarCollectionQueryParams,
                localVarPostBody,
                localVarHeaderParams,
                localVarFormParams,
                progressRequestListener);
    }

    private com.squareup.okhttp.Call deleteFolderValidateBeforeCall(
            DeleteFolderRequest request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {

        // verify the required parameter 'request.path' is set
        if (request.path == null) {
            throw new ApiException(
                    "Missing the required parameter 'request.path' when calling"
                            + " deleteFolder(Async)");
        }

        com.squareup.okhttp.Call call =
                deleteFolderCall(request, progressListener, progressRequestListener);
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
    public void deleteFolder(DeleteFolderRequest request) throws ApiException {
        deleteFolderWithHttpInfo(request);
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
    public ApiResponse<Void> deleteFolderWithHttpInfo(DeleteFolderRequest request)
            throws ApiException {
        com.squareup.okhttp.Call call = deleteFolderValidateBeforeCall(request, null, null);
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
            DeleteFolderRequest request, final ApiCallback<Void> callback) throws ApiException {

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
                deleteFolderValidateBeforeCall(request, progressListener, progressRequestListener);
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
            GetFilesListRequest request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath =
                "/barcode/storage/folder/{path}".replaceAll("\\{" + "path" + "}", request.path);

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.storageName != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("storageName", request.storageName));

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

        return apiClient.buildCall(
                localVarPath,
                "GET",
                localVarQueryParams,
                localVarCollectionQueryParams,
                localVarPostBody,
                localVarHeaderParams,
                localVarFormParams,
                progressRequestListener);
    }

    private com.squareup.okhttp.Call getFilesListValidateBeforeCall(
            GetFilesListRequest request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {

        // verify the required parameter 'request.path' is set
        if (request.path == null) {
            throw new ApiException(
                    "Missing the required parameter 'request.path' when calling"
                            + " getFilesList(Async)");
        }

        com.squareup.okhttp.Call call =
                getFilesListCall(request, progressListener, progressRequestListener);
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
    public FilesList getFilesList(GetFilesListRequest request) throws ApiException {
        ApiResponse<FilesList> resp = getFilesListWithHttpInfo(request);
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
    public ApiResponse<FilesList> getFilesListWithHttpInfo(GetFilesListRequest request)
            throws ApiException {
        com.squareup.okhttp.Call call = getFilesListValidateBeforeCall(request, null, null);
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
            GetFilesListRequest request, final ApiCallback<FilesList> callback)
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
                getFilesListValidateBeforeCall(request, progressListener, progressRequestListener);
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
            MoveFolderRequest request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath =
                "/barcode/storage/folder/move/{srcPath}"
                        .replaceAll("\\{" + "srcPath" + "}", request.srcPath);

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.destPath != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("destPath", request.destPath));
        if (request.srcStorageName != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("srcStorageName", request.srcStorageName));
        if (request.destStorageName != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("destStorageName", request.destStorageName));

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

        return apiClient.buildCall(
                localVarPath,
                "PUT",
                localVarQueryParams,
                localVarCollectionQueryParams,
                localVarPostBody,
                localVarHeaderParams,
                localVarFormParams,
                progressRequestListener);
    }

    private com.squareup.okhttp.Call moveFolderValidateBeforeCall(
            MoveFolderRequest request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {

        // verify the required parameter 'request.srcPath' is set
        if (request.srcPath == null) {
            throw new ApiException(
                    "Missing the required parameter 'request.srcPath' when calling"
                            + " moveFolder(Async)");
        }

        // verify the required parameter 'request.destPath' is set
        if (request.destPath == null) {
            throw new ApiException(
                    "Missing the required parameter 'request.destPath' when calling"
                            + " moveFolder(Async)");
        }

        com.squareup.okhttp.Call call =
                moveFolderCall(request, progressListener, progressRequestListener);
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
    public void moveFolder(MoveFolderRequest request) throws ApiException {
        moveFolderWithHttpInfo(request);
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
    public ApiResponse<Void> moveFolderWithHttpInfo(MoveFolderRequest request) throws ApiException {
        com.squareup.okhttp.Call call = moveFolderValidateBeforeCall(request, null, null);
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
            MoveFolderRequest request, final ApiCallback<Void> callback) throws ApiException {

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
                moveFolderValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
