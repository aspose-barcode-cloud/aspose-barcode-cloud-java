# StorageApi

All URIs are relative to *https://api.aspose.cloud/v3.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDiscUsage**](StorageApi.md#getDiscUsage) | **GET** /barcode/storage/disc | Get disc usage
[**getFileVersions**](StorageApi.md#getFileVersions) | **GET** /barcode/storage/version/{path} | Get file versions
[**objectExists**](StorageApi.md#objectExists) | **GET** /barcode/storage/exist/{path} | Check if file or folder exists
[**storageExists**](StorageApi.md#storageExists) | **GET** /barcode/storage/{storageName}/exist | Check if storage exists


<a name="getDiscUsage"></a>
# **getDiscUsage**
> DiscUsage getDiscUsage(storageName)

Get disc usage

### Example
```java
// Import classes:
//import com.aspose.barcode.cloud.ApiClient;
//import com.aspose.barcode.cloud.ApiException;
//import com.aspose.barcode.cloud.Configuration;
//import com.aspose.barcode.cloud.auth.*;
//import com.aspose.barcode.cloud.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: JWT
OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
JWT.setAccessToken("YOUR ACCESS TOKEN");

StorageApi apiInstance = new StorageApi();
String storageName = "storageName_example"; // String | Storage name
try {
    DiscUsage result = apiInstance.getDiscUsage(storageName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#getDiscUsage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storageName** | **String**| Storage name | [optional]

### Return type

[**DiscUsage**](DiscUsage.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFileVersions"></a>
# **getFileVersions**
> FileVersions getFileVersions(path, storageName)

Get file versions

### Example
```java
// Import classes:
//import com.aspose.barcode.cloud.ApiClient;
//import com.aspose.barcode.cloud.ApiException;
//import com.aspose.barcode.cloud.Configuration;
//import com.aspose.barcode.cloud.auth.*;
//import com.aspose.barcode.cloud.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: JWT
OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
JWT.setAccessToken("YOUR ACCESS TOKEN");

StorageApi apiInstance = new StorageApi();
String path = "path_example"; // String | File path e.g. '/file.ext'
String storageName = "storageName_example"; // String | Storage name
try {
    FileVersions result = apiInstance.getFileVersions(path, storageName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#getFileVersions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| File path e.g. &#39;/file.ext&#39; |
 **storageName** | **String**| Storage name | [optional]

### Return type

[**FileVersions**](FileVersions.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="objectExists"></a>
# **objectExists**
> ObjectExist objectExists(path, storageName, versionId)

Check if file or folder exists

### Example
```java
// Import classes:
//import com.aspose.barcode.cloud.ApiClient;
//import com.aspose.barcode.cloud.ApiException;
//import com.aspose.barcode.cloud.Configuration;
//import com.aspose.barcode.cloud.auth.*;
//import com.aspose.barcode.cloud.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: JWT
OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
JWT.setAccessToken("YOUR ACCESS TOKEN");

StorageApi apiInstance = new StorageApi();
String path = "path_example"; // String | File or folder path e.g. '/file.ext' or '/folder'
String storageName = "storageName_example"; // String | Storage name
String versionId = "versionId_example"; // String | File version ID
try {
    ObjectExist result = apiInstance.objectExists(path, storageName, versionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#objectExists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| File or folder path e.g. &#39;/file.ext&#39; or &#39;/folder&#39; |
 **storageName** | **String**| Storage name | [optional]
 **versionId** | **String**| File version ID | [optional]

### Return type

[**ObjectExist**](ObjectExist.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="storageExists"></a>
# **storageExists**
> StorageExist storageExists(storageName)

Check if storage exists

### Example
```java
// Import classes:
//import com.aspose.barcode.cloud.ApiClient;
//import com.aspose.barcode.cloud.ApiException;
//import com.aspose.barcode.cloud.Configuration;
//import com.aspose.barcode.cloud.auth.*;
//import com.aspose.barcode.cloud.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: JWT
OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
JWT.setAccessToken("YOUR ACCESS TOKEN");

StorageApi apiInstance = new StorageApi();
String storageName = "storageName_example"; // String | Storage name
try {
    StorageExist result = apiInstance.storageExists(storageName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#storageExists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storageName** | **String**| Storage name |

### Return type

[**StorageExist**](StorageExist.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

