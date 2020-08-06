# FileApi

All URIs are relative to *https://api.aspose.cloud/v3.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**copyFile**](FileApi.md#copyFile) | **PUT** /barcode/storage/file/copy/{srcPath} | Copy file
[**deleteFile**](FileApi.md#deleteFile) | **DELETE** /barcode/storage/file/{path} | Delete file
[**downloadFile**](FileApi.md#downloadFile) | **GET** /barcode/storage/file/{path} | Download file
[**moveFile**](FileApi.md#moveFile) | **PUT** /barcode/storage/file/move/{srcPath} | Move file
[**uploadFile**](FileApi.md#uploadFile) | **PUT** /barcode/storage/file/{path} | Upload file


<a name="copyFile"></a>
# **copyFile**
> copyFile(srcPath, destPath, srcStorageName, destStorageName, versionId)

Copy file

### Example
```java
// Import classes:
//import com.aspose.barcode.cloud.ApiClient;
//import com.aspose.barcode.cloud.ApiException;
//import com.aspose.barcode.cloud.Configuration;
//import com.aspose.barcode.cloud.auth.*;
//import com.aspose.barcode.cloud.api.FileApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: JWT
OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
JWT.setAccessToken("YOUR ACCESS TOKEN");

FileApi apiInstance = new FileApi();
String srcPath = "srcPath_example"; // String | Source file path e.g. '/folder/file.ext'
String destPath = "destPath_example"; // String | Destination file path
String srcStorageName = "srcStorageName_example"; // String | Source storage name
String destStorageName = "destStorageName_example"; // String | Destination storage name
String versionId = "versionId_example"; // String | File version ID to copy
try {
    apiInstance.copyFile(srcPath, destPath, srcStorageName, destStorageName, versionId);
} catch (ApiException e) {
    System.err.println("Exception when calling FileApi#copyFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcPath** | **String**| Source file path e.g. &#39;/folder/file.ext&#39; |
 **destPath** | **String**| Destination file path |
 **srcStorageName** | **String**| Source storage name | [optional]
 **destStorageName** | **String**| Destination storage name | [optional]
 **versionId** | **String**| File version ID to copy | [optional]

### Return type

null (empty response body)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteFile"></a>
# **deleteFile**
> deleteFile(path, storageName, versionId)

Delete file

### Example
```java
// Import classes:
//import com.aspose.barcode.cloud.ApiClient;
//import com.aspose.barcode.cloud.ApiException;
//import com.aspose.barcode.cloud.Configuration;
//import com.aspose.barcode.cloud.auth.*;
//import com.aspose.barcode.cloud.api.FileApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: JWT
OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
JWT.setAccessToken("YOUR ACCESS TOKEN");

FileApi apiInstance = new FileApi();
String path = "path_example"; // String | File path e.g. '/folder/file.ext'
String storageName = "storageName_example"; // String | Storage name
String versionId = "versionId_example"; // String | File version ID to delete
try {
    apiInstance.deleteFile(path, storageName, versionId);
} catch (ApiException e) {
    System.err.println("Exception when calling FileApi#deleteFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| File path e.g. &#39;/folder/file.ext&#39; |
 **storageName** | **String**| Storage name | [optional]
 **versionId** | **String**| File version ID to delete | [optional]

### Return type

null (empty response body)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="downloadFile"></a>
# **downloadFile**
> File downloadFile(path, storageName, versionId)

Download file

### Example
```java
// Import classes:
//import com.aspose.barcode.cloud.ApiClient;
//import com.aspose.barcode.cloud.ApiException;
//import com.aspose.barcode.cloud.Configuration;
//import com.aspose.barcode.cloud.auth.*;
//import com.aspose.barcode.cloud.api.FileApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: JWT
OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
JWT.setAccessToken("YOUR ACCESS TOKEN");

FileApi apiInstance = new FileApi();
String path = "path_example"; // String | File path e.g. '/folder/file.ext'
String storageName = "storageName_example"; // String | Storage name
String versionId = "versionId_example"; // String | File version ID to download
try {
    File result = apiInstance.downloadFile(path, storageName, versionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FileApi#downloadFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| File path e.g. &#39;/folder/file.ext&#39; |
 **storageName** | **String**| Storage name | [optional]
 **versionId** | **String**| File version ID to download | [optional]

### Return type

[**File**](File.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="moveFile"></a>
# **moveFile**
> moveFile(srcPath, destPath, srcStorageName, destStorageName, versionId)

Move file

### Example
```java
// Import classes:
//import com.aspose.barcode.cloud.ApiClient;
//import com.aspose.barcode.cloud.ApiException;
//import com.aspose.barcode.cloud.Configuration;
//import com.aspose.barcode.cloud.auth.*;
//import com.aspose.barcode.cloud.api.FileApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: JWT
OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
JWT.setAccessToken("YOUR ACCESS TOKEN");

FileApi apiInstance = new FileApi();
String srcPath = "srcPath_example"; // String | Source file path e.g. '/src.ext'
String destPath = "destPath_example"; // String | Destination file path e.g. '/dest.ext'
String srcStorageName = "srcStorageName_example"; // String | Source storage name
String destStorageName = "destStorageName_example"; // String | Destination storage name
String versionId = "versionId_example"; // String | File version ID to move
try {
    apiInstance.moveFile(srcPath, destPath, srcStorageName, destStorageName, versionId);
} catch (ApiException e) {
    System.err.println("Exception when calling FileApi#moveFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcPath** | **String**| Source file path e.g. &#39;/src.ext&#39; |
 **destPath** | **String**| Destination file path e.g. &#39;/dest.ext&#39; |
 **srcStorageName** | **String**| Source storage name | [optional]
 **destStorageName** | **String**| Destination storage name | [optional]
 **versionId** | **String**| File version ID to move | [optional]

### Return type

null (empty response body)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="uploadFile"></a>
# **uploadFile**
> FilesUploadResult uploadFile(path, file, storageName)

Upload file

### Example
```java
// Import classes:
//import com.aspose.barcode.cloud.ApiClient;
//import com.aspose.barcode.cloud.ApiException;
//import com.aspose.barcode.cloud.Configuration;
//import com.aspose.barcode.cloud.auth.*;
//import com.aspose.barcode.cloud.api.FileApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: JWT
OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
JWT.setAccessToken("YOUR ACCESS TOKEN");

FileApi apiInstance = new FileApi();
String path = "path_example"; // String | Path where to upload including filename and extension e.g. /file.ext or /Folder 1/file.ext  If the content is multipart and path does not contains the file name it tries to get them from filename parameter  from Content-Disposition header.
File file = new File("/path/to/file.txt"); // File | File to upload
String storageName = "storageName_example"; // String | Storage name
try {
    FilesUploadResult result = apiInstance.uploadFile(path, file, storageName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FileApi#uploadFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Path where to upload including filename and extension e.g. /file.ext or /Folder 1/file.ext  If the content is multipart and path does not contains the file name it tries to get them from filename parameter  from Content-Disposition header. |
 **file** | **File**| File to upload |
 **storageName** | **String**| Storage name | [optional]

### Return type

[**FilesUploadResult**](FilesUploadResult.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

