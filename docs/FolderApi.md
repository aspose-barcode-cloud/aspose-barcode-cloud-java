# FolderApi

All URIs are relative to *https://api.aspose.cloud/v3.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**copyFolder**](FolderApi.md#copyFolder) | **PUT** /barcode/storage/folder/copy/{srcPath} | Copy folder
[**createFolder**](FolderApi.md#createFolder) | **PUT** /barcode/storage/folder/{path} | Create the folder
[**deleteFolder**](FolderApi.md#deleteFolder) | **DELETE** /barcode/storage/folder/{path} | Delete folder
[**getFilesList**](FolderApi.md#getFilesList) | **GET** /barcode/storage/folder/{path} | Get all files and folders within a folder
[**moveFolder**](FolderApi.md#moveFolder) | **PUT** /barcode/storage/folder/move/{srcPath} | Move folder


<a name="copyFolder"></a>
# **copyFolder**
> copyFolder(srcPath, destPath, srcStorageName, destStorageName)

Copy folder

### Example
```java
// Import classes:
//import com.aspose.barcode.cloud.ApiClient;
//import com.aspose.barcode.cloud.ApiException;
//import com.aspose.barcode.cloud.Configuration;
//import com.aspose.barcode.cloud.auth.*;
//import com.aspose.barcode.cloud.api.FolderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: JWT
OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
JWT.setAccessToken("YOUR ACCESS TOKEN");

FolderApi apiInstance = new FolderApi();
String srcPath = "srcPath_example"; // String | Source folder path e.g. '/src'
String destPath = "destPath_example"; // String | Destination folder path e.g. '/dst'
String srcStorageName = "srcStorageName_example"; // String | Source storage name
String destStorageName = "destStorageName_example"; // String | Destination storage name
try {
    apiInstance.copyFolder(srcPath, destPath, srcStorageName, destStorageName);
} catch (ApiException e) {
    System.err.println("Exception when calling FolderApi#copyFolder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcPath** | **String**| Source folder path e.g. &#39;/src&#39; |
 **destPath** | **String**| Destination folder path e.g. &#39;/dst&#39; |
 **srcStorageName** | **String**| Source storage name | [optional]
 **destStorageName** | **String**| Destination storage name | [optional]

### Return type

null (empty response body)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createFolder"></a>
# **createFolder**
> createFolder(path, storageName)

Create the folder

### Example
```java
// Import classes:
//import com.aspose.barcode.cloud.ApiClient;
//import com.aspose.barcode.cloud.ApiException;
//import com.aspose.barcode.cloud.Configuration;
//import com.aspose.barcode.cloud.auth.*;
//import com.aspose.barcode.cloud.api.FolderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: JWT
OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
JWT.setAccessToken("YOUR ACCESS TOKEN");

FolderApi apiInstance = new FolderApi();
String path = "path_example"; // String | Folder path to create e.g. 'folder_1/folder_2/'
String storageName = "storageName_example"; // String | Storage name
try {
    apiInstance.createFolder(path, storageName);
} catch (ApiException e) {
    System.err.println("Exception when calling FolderApi#createFolder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Folder path to create e.g. &#39;folder_1/folder_2/&#39; |
 **storageName** | **String**| Storage name | [optional]

### Return type

null (empty response body)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteFolder"></a>
# **deleteFolder**
> deleteFolder(path, storageName, recursive)

Delete folder

### Example
```java
// Import classes:
//import com.aspose.barcode.cloud.ApiClient;
//import com.aspose.barcode.cloud.ApiException;
//import com.aspose.barcode.cloud.Configuration;
//import com.aspose.barcode.cloud.auth.*;
//import com.aspose.barcode.cloud.api.FolderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: JWT
OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
JWT.setAccessToken("YOUR ACCESS TOKEN");

FolderApi apiInstance = new FolderApi();
String path = "path_example"; // String | Folder path e.g. '/folder'
String storageName = "storageName_example"; // String | Storage name
Boolean recursive = false; // Boolean | Enable to delete folders, subfolders and files
try {
    apiInstance.deleteFolder(path, storageName, recursive);
} catch (ApiException e) {
    System.err.println("Exception when calling FolderApi#deleteFolder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Folder path e.g. &#39;/folder&#39; |
 **storageName** | **String**| Storage name | [optional]
 **recursive** | **Boolean**| Enable to delete folders, subfolders and files | [optional] [default to false]

### Return type

null (empty response body)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFilesList"></a>
# **getFilesList**
> FilesList getFilesList(path, storageName)

Get all files and folders within a folder

### Example
```java
// Import classes:
//import com.aspose.barcode.cloud.ApiClient;
//import com.aspose.barcode.cloud.ApiException;
//import com.aspose.barcode.cloud.Configuration;
//import com.aspose.barcode.cloud.auth.*;
//import com.aspose.barcode.cloud.api.FolderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: JWT
OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
JWT.setAccessToken("YOUR ACCESS TOKEN");

FolderApi apiInstance = new FolderApi();
String path = "path_example"; // String | Folder path e.g. '/folder'
String storageName = "storageName_example"; // String | Storage name
try {
    FilesList result = apiInstance.getFilesList(path, storageName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FolderApi#getFilesList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Folder path e.g. &#39;/folder&#39; |
 **storageName** | **String**| Storage name | [optional]

### Return type

[**FilesList**](FilesList.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="moveFolder"></a>
# **moveFolder**
> moveFolder(srcPath, destPath, srcStorageName, destStorageName)

Move folder

### Example
```java
// Import classes:
//import com.aspose.barcode.cloud.ApiClient;
//import com.aspose.barcode.cloud.ApiException;
//import com.aspose.barcode.cloud.Configuration;
//import com.aspose.barcode.cloud.auth.*;
//import com.aspose.barcode.cloud.api.FolderApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: JWT
OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
JWT.setAccessToken("YOUR ACCESS TOKEN");

FolderApi apiInstance = new FolderApi();
String srcPath = "srcPath_example"; // String | Folder path to move e.g. '/folder'
String destPath = "destPath_example"; // String | Destination folder path to move to e.g '/dst'
String srcStorageName = "srcStorageName_example"; // String | Source storage name
String destStorageName = "destStorageName_example"; // String | Destination storage name
try {
    apiInstance.moveFolder(srcPath, destPath, srcStorageName, destStorageName);
} catch (ApiException e) {
    System.err.println("Exception when calling FolderApi#moveFolder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcPath** | **String**| Folder path to move e.g. &#39;/folder&#39; |
 **destPath** | **String**| Destination folder path to move to e.g &#39;/dst&#39; |
 **srcStorageName** | **String**| Source storage name | [optional]
 **destStorageName** | **String**| Destination storage name | [optional]

### Return type

null (empty response body)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

