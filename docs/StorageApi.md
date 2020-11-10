# StorageApi

All URIs are relative to *<https://api.aspose.cloud/v3.0>*

Method | HTTP request | Description
------ | ------------ | -----------
[**getDiscUsage**](StorageApi.md#getDiscUsage) | **GET** /barcode/storage/disc | Get disc usage
[**getFileVersions**](StorageApi.md#getFileVersions) | **GET** /barcode/storage/version/{path} | Get file versions
[**objectExists**](StorageApi.md#objectExists) | **GET** /barcode/storage/exist/{path} | Check if file or folder exists
[**storageExists**](StorageApi.md#storageExists) | **GET** /barcode/storage/{storageName}/exist | Check if storage exists

## getDiscUsage

> DiscUsage getDiscUsage(storageName)

Get disc usage

### getDiscUsage example

```java
// Import classes:
import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.Configuration;
import com.aspose.barcode.cloud.auth.*;
import com.aspose.barcode.cloud.api.StorageApi;

public class Main {

    public static void main(String[] args) {

        ApiClient client = new ApiClient(
            "Client Id from https://dashboard.aspose.cloud/applications",
            "Client Secret from https://dashboard.aspose.cloud/applications"
        );

        StorageApi api = new StorageApi(client);
        try {
            DiscUsage result = api.getDiscUsage();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StorageApi.getDiscUsage");
            e.printStackTrace();
        }
    }
}
```

### getDiscUsage parameters

Name | Type | Description  | Notes
---- | ---- | ------------ | -----
 **storageName** | **String**| Storage name | [optional]

### getDiscUsage return type

[**DiscUsage**](DiscUsage.md)

## getFileVersions

> FileVersions getFileVersions(path, storageName)

Get file versions

### getFileVersions example

```java
// Import classes:
import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.Configuration;
import com.aspose.barcode.cloud.auth.*;
import com.aspose.barcode.cloud.api.StorageApi;

public class Main {

    public static void main(String[] args) {

        ApiClient client = new ApiClient(
            "Client Id from https://dashboard.aspose.cloud/applications",
            "Client Secret from https://dashboard.aspose.cloud/applications"
        );

        StorageApi api = new StorageApi(client);
        String path = "path_example"; // String | File path e.g. '/file.ext'
        try {
            FileVersions result = api.getFileVersions(path);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StorageApi.getFileVersions");
            e.printStackTrace();
        }
    }
}
```

### getFileVersions parameters

Name | Type | Description  | Notes
---- | ---- | ------------ | -----
 **path** | **String**| File path e.g. &#39;/file.ext&#39; |
 **storageName** | **String**| Storage name | [optional]

### getFileVersions return type

[**FileVersions**](FileVersions.md)

## objectExists

> ObjectExist objectExists(path, storageName, versionId)

Check if file or folder exists

### objectExists example

```java
// Import classes:
import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.Configuration;
import com.aspose.barcode.cloud.auth.*;
import com.aspose.barcode.cloud.api.StorageApi;

public class Main {

    public static void main(String[] args) {

        ApiClient client = new ApiClient(
            "Client Id from https://dashboard.aspose.cloud/applications",
            "Client Secret from https://dashboard.aspose.cloud/applications"
        );

        StorageApi api = new StorageApi(client);
        String path = "path_example"; // String | File or folder path e.g. '/file.ext' or '/folder'
        try {
            ObjectExist result = api.objectExists(path);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StorageApi.objectExists");
            e.printStackTrace();
        }
    }
}
```

### objectExists parameters

Name | Type | Description  | Notes
---- | ---- | ------------ | -----
 **path** | **String**| File or folder path e.g. &#39;/file.ext&#39; or &#39;/folder&#39; |
 **storageName** | **String**| Storage name | [optional]
 **versionId** | **String**| File version ID | [optional]

### objectExists return type

[**ObjectExist**](ObjectExist.md)

## storageExists

> StorageExist storageExists(storageName)

Check if storage exists

### storageExists example

```java
// Import classes:
import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.Configuration;
import com.aspose.barcode.cloud.auth.*;
import com.aspose.barcode.cloud.api.StorageApi;

public class Main {

    public static void main(String[] args) {

        ApiClient client = new ApiClient(
            "Client Id from https://dashboard.aspose.cloud/applications",
            "Client Secret from https://dashboard.aspose.cloud/applications"
        );

        StorageApi api = new StorageApi(client);
        String storageName = "storageName_example"; // String | Storage name
        try {
            StorageExist result = api.storageExists(storageName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StorageApi.storageExists");
            e.printStackTrace();
        }
    }
}
```

### storageExists parameters

Name | Type | Description  | Notes
---- | ---- | ------------ | -----
 **storageName** | **String**| Storage name |

### storageExists return type

[**StorageExist**](StorageExist.md)

