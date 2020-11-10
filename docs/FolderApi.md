# FolderApi

All URIs are relative to *<https://api.aspose.cloud/v3.0>*

Method | HTTP request | Description
------ | ------------ | -----------
[**copyFolder**](FolderApi.md#copyFolder) | **PUT** /barcode/storage/folder/copy/{srcPath} | Copy folder
[**createFolder**](FolderApi.md#createFolder) | **PUT** /barcode/storage/folder/{path} | Create the folder
[**deleteFolder**](FolderApi.md#deleteFolder) | **DELETE** /barcode/storage/folder/{path} | Delete folder
[**getFilesList**](FolderApi.md#getFilesList) | **GET** /barcode/storage/folder/{path} | Get all files and folders within a folder
[**moveFolder**](FolderApi.md#moveFolder) | **PUT** /barcode/storage/folder/move/{srcPath} | Move folder

## copyFolder

> copyFolder(srcPath, destPath, srcStorageName, destStorageName)

Copy folder

### copyFolder example

```java
// Import classes:
import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.Configuration;
import com.aspose.barcode.cloud.auth.*;
import com.aspose.barcode.cloud.api.FolderApi;

public class Main {

    public static void main(String[] args) {

        ApiClient client = new ApiClient(
            "Client Id from https://dashboard.aspose.cloud/applications",
            "Client Secret from https://dashboard.aspose.cloud/applications"
        );

        FolderApi api = new FolderApi(client);
        String srcPath = "srcPath_example"; // String | Source folder path e.g. '/src'
        String destPath = "destPath_example"; // String | Destination folder path e.g. '/dst'
        try {
            api.copyFolder(srcPath, destPath);
        } catch (ApiException e) {
            System.err.println("Exception when calling FolderApi.copyFolder");
            e.printStackTrace();
        }
    }
}
```

### copyFolder parameters

Name | Type | Description  | Notes
---- | ---- | ------------ | -----
 **srcPath** | **String**| Source folder path e.g. &#39;/src&#39; |
 **destPath** | **String**| Destination folder path e.g. &#39;/dst&#39; |
 **srcStorageName** | **String**| Source storage name | [optional]
 **destStorageName** | **String**| Destination storage name | [optional]

### copyFolder return type

null (empty response body)

## createFolder

> createFolder(path, storageName)

Create the folder

### createFolder example

```java
// Import classes:
import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.Configuration;
import com.aspose.barcode.cloud.auth.*;
import com.aspose.barcode.cloud.api.FolderApi;

public class Main {

    public static void main(String[] args) {

        ApiClient client = new ApiClient(
            "Client Id from https://dashboard.aspose.cloud/applications",
            "Client Secret from https://dashboard.aspose.cloud/applications"
        );

        FolderApi api = new FolderApi(client);
        String path = "path_example"; // String | Folder path to create e.g. 'folder_1/folder_2/'
        try {
            api.createFolder(path);
        } catch (ApiException e) {
            System.err.println("Exception when calling FolderApi.createFolder");
            e.printStackTrace();
        }
    }
}
```

### createFolder parameters

Name | Type | Description  | Notes
---- | ---- | ------------ | -----
 **path** | **String**| Folder path to create e.g. &#39;folder_1/folder_2/&#39; |
 **storageName** | **String**| Storage name | [optional]

### createFolder return type

null (empty response body)

## deleteFolder

> deleteFolder(path, storageName, recursive)

Delete folder

### deleteFolder example

```java
// Import classes:
import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.Configuration;
import com.aspose.barcode.cloud.auth.*;
import com.aspose.barcode.cloud.api.FolderApi;

public class Main {

    public static void main(String[] args) {

        ApiClient client = new ApiClient(
            "Client Id from https://dashboard.aspose.cloud/applications",
            "Client Secret from https://dashboard.aspose.cloud/applications"
        );

        FolderApi api = new FolderApi(client);
        String path = "path_example"; // String | Folder path e.g. '/folder'
        try {
            api.deleteFolder(path);
        } catch (ApiException e) {
            System.err.println("Exception when calling FolderApi.deleteFolder");
            e.printStackTrace();
        }
    }
}
```

### deleteFolder parameters

Name | Type | Description  | Notes
---- | ---- | ------------ | -----
 **path** | **String**| Folder path e.g. &#39;/folder&#39; |
 **storageName** | **String**| Storage name | [optional]
 **recursive** | **Boolean**| Enable to delete folders, subfolders and files | [optional] [default to false]

### deleteFolder return type

null (empty response body)

## getFilesList

> FilesList getFilesList(path, storageName)

Get all files and folders within a folder

### getFilesList example

```java
// Import classes:
import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.Configuration;
import com.aspose.barcode.cloud.auth.*;
import com.aspose.barcode.cloud.api.FolderApi;

public class Main {

    public static void main(String[] args) {

        ApiClient client = new ApiClient(
            "Client Id from https://dashboard.aspose.cloud/applications",
            "Client Secret from https://dashboard.aspose.cloud/applications"
        );

        FolderApi api = new FolderApi(client);
        String path = "path_example"; // String | Folder path e.g. '/folder'
        try {
            FilesList result = api.getFilesList(path);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FolderApi.getFilesList");
            e.printStackTrace();
        }
    }
}
```

### getFilesList parameters

Name | Type | Description  | Notes
---- | ---- | ------------ | -----
 **path** | **String**| Folder path e.g. &#39;/folder&#39; |
 **storageName** | **String**| Storage name | [optional]

### getFilesList return type

[**FilesList**](FilesList.md)

## moveFolder

> moveFolder(srcPath, destPath, srcStorageName, destStorageName)

Move folder

### moveFolder example

```java
// Import classes:
import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.Configuration;
import com.aspose.barcode.cloud.auth.*;
import com.aspose.barcode.cloud.api.FolderApi;

public class Main {

    public static void main(String[] args) {

        ApiClient client = new ApiClient(
            "Client Id from https://dashboard.aspose.cloud/applications",
            "Client Secret from https://dashboard.aspose.cloud/applications"
        );

        FolderApi api = new FolderApi(client);
        String srcPath = "srcPath_example"; // String | Folder path to move e.g. '/folder'
        String destPath = "destPath_example"; // String | Destination folder path to move to e.g '/dst'
        try {
            api.moveFolder(srcPath, destPath);
        } catch (ApiException e) {
            System.err.println("Exception when calling FolderApi.moveFolder");
            e.printStackTrace();
        }
    }
}
```

### moveFolder parameters

Name | Type | Description  | Notes
---- | ---- | ------------ | -----
 **srcPath** | **String**| Folder path to move e.g. &#39;/folder&#39; |
 **destPath** | **String**| Destination folder path to move to e.g &#39;/dst&#39; |
 **srcStorageName** | **String**| Source storage name | [optional]
 **destStorageName** | **String**| Destination storage name | [optional]

### moveFolder return type

null (empty response body)

