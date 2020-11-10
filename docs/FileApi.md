# FileApi

All URIs are relative to *<https://api.aspose.cloud/v3.0>*

Method | HTTP request | Description
------ | ------------ | -----------
[**copyFile**](FileApi.md#copyFile) | **PUT** /barcode/storage/file/copy/{srcPath} | Copy file
[**deleteFile**](FileApi.md#deleteFile) | **DELETE** /barcode/storage/file/{path} | Delete file
[**downloadFile**](FileApi.md#downloadFile) | **GET** /barcode/storage/file/{path} | Download file
[**moveFile**](FileApi.md#moveFile) | **PUT** /barcode/storage/file/move/{srcPath} | Move file
[**uploadFile**](FileApi.md#uploadFile) | **PUT** /barcode/storage/file/{path} | Upload file

## copyFile

> copyFile(srcPath, destPath, srcStorageName, destStorageName, versionId)

Copy file

### copyFile example

```java
// Import classes:
import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.Configuration;
import com.aspose.barcode.cloud.auth.*;
import com.aspose.barcode.cloud.api.FileApi;

public class Main {

    public static void main(String[] args) {

        ApiClient client = new ApiClient(
            "Client Id from https://dashboard.aspose.cloud/applications",
            "Client Secret from https://dashboard.aspose.cloud/applications"
        );

        FileApi api = new FileApi(client);
        String srcPath = "srcPath_example"; // String | Source file path e.g. '/folder/file.ext'
        String destPath = "destPath_example"; // String | Destination file path
        try {
            api.copyFile(srcPath, destPath);
        } catch (ApiException e) {
            System.err.println("Exception when calling FileApi.copyFile");
            e.printStackTrace();
        }
    }
}
```

### copyFile parameters

Name | Type | Description  | Notes
---- | ---- | ------------ | -----
 **srcPath** | **String**| Source file path e.g. &#39;/folder/file.ext&#39; |
 **destPath** | **String**| Destination file path |
 **srcStorageName** | **String**| Source storage name | [optional]
 **destStorageName** | **String**| Destination storage name | [optional]
 **versionId** | **String**| File version ID to copy | [optional]

### copyFile return type

null (empty response body)

## deleteFile

> deleteFile(path, storageName, versionId)

Delete file

### deleteFile example

```java
// Import classes:
import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.Configuration;
import com.aspose.barcode.cloud.auth.*;
import com.aspose.barcode.cloud.api.FileApi;

public class Main {

    public static void main(String[] args) {

        ApiClient client = new ApiClient(
            "Client Id from https://dashboard.aspose.cloud/applications",
            "Client Secret from https://dashboard.aspose.cloud/applications"
        );

        FileApi api = new FileApi(client);
        String path = "path_example"; // String | File path e.g. '/folder/file.ext'
        try {
            api.deleteFile(path);
        } catch (ApiException e) {
            System.err.println("Exception when calling FileApi.deleteFile");
            e.printStackTrace();
        }
    }
}
```

### deleteFile parameters

Name | Type | Description  | Notes
---- | ---- | ------------ | -----
 **path** | **String**| File path e.g. &#39;/folder/file.ext&#39; |
 **storageName** | **String**| Storage name | [optional]
 **versionId** | **String**| File version ID to delete | [optional]

### deleteFile return type

null (empty response body)

## downloadFile

> File downloadFile(path, storageName, versionId)

Download file

### downloadFile example

```java
// Import classes:
import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.Configuration;
import com.aspose.barcode.cloud.auth.*;
import com.aspose.barcode.cloud.api.FileApi;

public class Main {

    public static void main(String[] args) {

        ApiClient client = new ApiClient(
            "Client Id from https://dashboard.aspose.cloud/applications",
            "Client Secret from https://dashboard.aspose.cloud/applications"
        );

        FileApi api = new FileApi(client);
        String path = "path_example"; // String | File path e.g. '/folder/file.ext'
        try {
            File result = api.downloadFile(path);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FileApi.downloadFile");
            e.printStackTrace();
        }
    }
}
```

### downloadFile parameters

Name | Type | Description  | Notes
---- | ---- | ------------ | -----
 **path** | **String**| File path e.g. &#39;/folder/file.ext&#39; |
 **storageName** | **String**| Storage name | [optional]
 **versionId** | **String**| File version ID to download | [optional]

### downloadFile return type

**File**

## moveFile

> moveFile(srcPath, destPath, srcStorageName, destStorageName, versionId)

Move file

### moveFile example

```java
// Import classes:
import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.Configuration;
import com.aspose.barcode.cloud.auth.*;
import com.aspose.barcode.cloud.api.FileApi;

public class Main {

    public static void main(String[] args) {

        ApiClient client = new ApiClient(
            "Client Id from https://dashboard.aspose.cloud/applications",
            "Client Secret from https://dashboard.aspose.cloud/applications"
        );

        FileApi api = new FileApi(client);
        String srcPath = "srcPath_example"; // String | Source file path e.g. '/src.ext'
        String destPath = "destPath_example"; // String | Destination file path e.g. '/dest.ext'
        try {
            api.moveFile(srcPath, destPath);
        } catch (ApiException e) {
            System.err.println("Exception when calling FileApi.moveFile");
            e.printStackTrace();
        }
    }
}
```

### moveFile parameters

Name | Type | Description  | Notes
---- | ---- | ------------ | -----
 **srcPath** | **String**| Source file path e.g. &#39;/src.ext&#39; |
 **destPath** | **String**| Destination file path e.g. &#39;/dest.ext&#39; |
 **srcStorageName** | **String**| Source storage name | [optional]
 **destStorageName** | **String**| Destination storage name | [optional]
 **versionId** | **String**| File version ID to move | [optional]

### moveFile return type

null (empty response body)

## uploadFile

> FilesUploadResult uploadFile(path, file, storageName)

Upload file

### uploadFile example

```java
// Import classes:
import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.Configuration;
import com.aspose.barcode.cloud.auth.*;
import com.aspose.barcode.cloud.api.FileApi;

public class Main {

    public static void main(String[] args) {

        ApiClient client = new ApiClient(
            "Client Id from https://dashboard.aspose.cloud/applications",
            "Client Secret from https://dashboard.aspose.cloud/applications"
        );

        FileApi api = new FileApi(client);
        String path = "path_example"; // String | Path where to upload including filename and extension e.g. /file.ext or /Folder 1/file.ext  If the content is multipart and path does not contains the file name it tries to get them from filename parameter  from Content-Disposition header.
        File file = new File("/path/to/file.txt"); // File | File to upload
        try {
            FilesUploadResult result = api.uploadFile(path, file);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FileApi.uploadFile");
            e.printStackTrace();
        }
    }
}
```

### uploadFile parameters

Name | Type | Description  | Notes
---- | ---- | ------------ | -----
 **path** | **String**| Path where to upload including filename and extension e.g. /file.ext or /Folder 1/file.ext  If the content is multipart and path does not contains the file name it tries to get them from filename parameter  from Content-Disposition header. |
 **file** | **File**| File to upload |
 **storageName** | **String**| Storage name | [optional]

### uploadFile return type

[**FilesUploadResult**](FilesUploadResult.md)

