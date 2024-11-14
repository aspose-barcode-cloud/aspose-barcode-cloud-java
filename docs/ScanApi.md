# ScanApi

All URIs are relative to *<https://barcode.qa.aspose.cloud/v4.0>*

Method | HTTP request | Description
------ | ------------ | -----------
[**barcodeScanBodyPost**](ScanApi.md#barcodeScanBodyPost) | **POST** /barcode/scan-body | Scan barcode from file in request body using POST requests with parameter in body in json or xml format.
[**barcodeScanGet**](ScanApi.md#barcodeScanGet) | **GET** /barcode/scan | Scan barcode from file on server using GET requests with parameter in query string.
[**barcodeScanMultipartPost**](ScanApi.md#barcodeScanMultipartPost) | **POST** /barcode/scan-multipart | Scan barcode from file in request body using POST requests with parameter in multipart form.

## barcodeScanBodyPost

> BarcodeResponseList barcodeScanBodyPost(scanBase64Request)

Scan barcode from file in request body using POST requests with parameter in body in json or xml format.

### barcodeScanBodyPost example

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
        ScanBase64Request scanBase64Request = new ScanBase64Request(); // ScanBase64Request | Barcode scan request
        try {
            BarcodeResponseList result = api.barcodeScanBodyPost(scanBase64Request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScanApi.barcodeScanBodyPost");
            e.printStackTrace();
        }
    }
}
```

### barcodeScanBodyPost parameters

Name | Type | Description  | Notes
---- | ---- | ------------ | -----
 **scanBase64Request** | [**ScanBase64Request**](ScanBase64Request.md)| Barcode scan request |

### barcodeScanBodyPost return type

[**BarcodeResponseList**](BarcodeResponseList.md)

## barcodeScanGet

> BarcodeResponseList barcodeScanGet(fileUrl)

Scan barcode from file on server using GET requests with parameter in query string.

### barcodeScanGet example

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
            BarcodeResponseList result = api.barcodeScanGet(fileUrl);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScanApi.barcodeScanGet");
            e.printStackTrace();
        }
    }
}
```

### barcodeScanGet parameters

Name | Type | Description  | Notes
---- | ---- | ------------ | -----
 **fileUrl** | **URI**| Url to barcode image |

### barcodeScanGet return type

[**BarcodeResponseList**](BarcodeResponseList.md)

## barcodeScanMultipartPost

> BarcodeResponseList barcodeScanMultipartPost(_file)

Scan barcode from file in request body using POST requests with parameter in multipart form.

### barcodeScanMultipartPost example

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
            BarcodeResponseList result = api.barcodeScanMultipartPost(_file);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScanApi.barcodeScanMultipartPost");
            e.printStackTrace();
        }
    }
}
```

### barcodeScanMultipartPost parameters

Name | Type | Description  | Notes
---- | ---- | ------------ | -----
 **_file** | **File**| Barcode image file |

### barcodeScanMultipartPost return type

[**BarcodeResponseList**](BarcodeResponseList.md)

