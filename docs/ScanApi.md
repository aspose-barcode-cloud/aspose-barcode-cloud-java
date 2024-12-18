# ScanApi

All URIs are relative to *<https://api.aspose.cloud/v4.0>*

Method | HTTP request | Description
------ | ------------ | -----------
[**scan**](ScanApi.md#scan) | **GET** /barcode/scan | Scan barcode from file on server using GET requests with parameter in query string.
[**scanBase64**](ScanApi.md#scanBase64) | **POST** /barcode/scan-body | Scan barcode from file in request body using POST requests with parameter in body in json or xml format.
[**scanMultipart**](ScanApi.md#scanMultipart) | **POST** /barcode/scan-multipart | Scan barcode from file in request body using POST requests with parameter in multipart form.

## scan

> BarcodeResponseList scan(fileUrl)

Scan barcode from file on server using GET requests with parameter in query string.

### scan example

```java
// Import classes:
import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.Configuration;
import com.aspose.barcode.cloud.auth.*;
import com.aspose.barcode.cloud.api.ScanApi;

public class Main {

    public static void main(String[] args) {

        ApiClient client = new ApiClient(
            "Client Id from https://dashboard.aspose.cloud/applications",
            "Client Secret from https://dashboard.aspose.cloud/applications"
        );

        ScanApi api = new ScanApi(client);
        URI fileUrl = new URI(); // URI | Url to barcode image
        try {
            BarcodeResponseList result = api.scan(fileUrl);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScanApi.scan");
            e.printStackTrace();
        }
    }
}
```

### scan parameters

Name | Type | Description  | Notes
---- | ---- | ------------ | -----
 **fileUrl** | **URI**| Url to barcode image |

### scan return type

[**BarcodeResponseList**](BarcodeResponseList.md)

## scanBase64

> BarcodeResponseList scanBase64(ScanBase64RequestWrapper)

Scan barcode from file in request body using POST requests with parameter in body in json or xml format.

### scanBase64 example

```java
// Import classes:
import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.Configuration;
import com.aspose.barcode.cloud.auth.*;
import com.aspose.barcode.cloud.api.ScanApi;

public class Main {

    public static void main(String[] args) {

        ApiClient client = new ApiClient(
            "Client Id from https://dashboard.aspose.cloud/applications",
            "Client Secret from https://dashboard.aspose.cloud/applications"
        );

        ScanApi api = new ScanApi(client);
        ScanBase64RequestWrapper ScanBase64RequestWrapper = new ScanBase64RequestWrapper(); // ScanBase64RequestWrapper | Barcode scan request
        try {
            BarcodeResponseList result = api.scanBase64(ScanBase64RequestWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScanApi.scanBase64");
            e.printStackTrace();
        }
    }
}
```

### scanBase64 parameters

Name | Type | Description  | Notes
---- | ---- | ------------ | -----
 **ScanBase64RequestWrapper** | [**ScanBase64RequestWrapper**](ScanBase64RequestWrapper.md)| Barcode scan request |

### scanBase64 return type

[**BarcodeResponseList**](BarcodeResponseList.md)

## scanMultipart

> BarcodeResponseList scanMultipart(_file)

Scan barcode from file in request body using POST requests with parameter in multipart form.

### scanMultipart example

```java
// Import classes:
import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.Configuration;
import com.aspose.barcode.cloud.auth.*;
import com.aspose.barcode.cloud.api.ScanApi;

public class Main {

    public static void main(String[] args) {

        ApiClient client = new ApiClient(
            "Client Id from https://dashboard.aspose.cloud/applications",
            "Client Secret from https://dashboard.aspose.cloud/applications"
        );

        ScanApi api = new ScanApi(client);
        File _file = new File("/path/to/file"); // File | Barcode image file
        try {
            BarcodeResponseList result = api.scanMultipart(_file);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScanApi.scanMultipart");
            e.printStackTrace();
        }
    }
}
```

### scanMultipart parameters

Name | Type | Description  | Notes
---- | ---- | ------------ | -----
 **_file** | **File**| Barcode image file |

### scanMultipart return type

[**BarcodeResponseList**](BarcodeResponseList.md)

