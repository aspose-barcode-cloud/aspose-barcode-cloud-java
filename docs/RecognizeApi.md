# RecognizeApi

All URIs are relative to *<https://barcode.qa.aspose.cloud/v4.0>*

Method | HTTP request | Description
------ | ------------ | -----------
[**barcodeRecognizeBodyPost**](RecognizeApi.md#barcodeRecognizeBodyPost) | **POST** /barcode/recognize-body | Recognize barcode from file in request body using POST requests with parameters in body in json or xml format.
[**barcodeRecognizeGet**](RecognizeApi.md#barcodeRecognizeGet) | **GET** /barcode/recognize | Recognize barcode from file on server using GET requests with parameters in route and query string.
[**barcodeRecognizeMultipartPost**](RecognizeApi.md#barcodeRecognizeMultipartPost) | **POST** /barcode/recognize-multipart | Recognize barcode from file in request body using POST requests with parameters in multipart form.

## barcodeRecognizeBodyPost

> BarcodeResponseList barcodeRecognizeBodyPost(recognizeBase64Request)

Recognize barcode from file in request body using POST requests with parameters in body in json or xml format.

### barcodeRecognizeBodyPost example

```java
// Import classes:
import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.Configuration;
import com.aspose.barcode.cloud.auth.*;
import com.aspose.barcode.cloud.api.RecognizeApi;

public class Main {

    public static void main(String[] args) {

        ApiClient client = new ApiClient(
            "Client Id from https://dashboard.aspose.cloud/applications",
            "Client Secret from https://dashboard.aspose.cloud/applications"
        );

        RecognizeApi api = new RecognizeApi(client);
        RecognizeBase64Request recognizeBase64Request = new RecognizeBase64Request(); // RecognizeBase64Request | Barcode recognition request
        try {
            BarcodeResponseList result = api.barcodeRecognizeBodyPost(recognizeBase64Request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RecognizeApi.barcodeRecognizeBodyPost");
            e.printStackTrace();
        }
    }
}
```

### barcodeRecognizeBodyPost parameters

Name | Type | Description  | Notes
---- | ---- | ------------ | -----
 **recognizeBase64Request** | [**RecognizeBase64Request**](RecognizeBase64Request.md)| Barcode recognition request |

### barcodeRecognizeBodyPost return type

[**BarcodeResponseList**](BarcodeResponseList.md)

## barcodeRecognizeGet

> BarcodeResponseList barcodeRecognizeGet(barcodeType, fileUrl, recognitionMode, recognitionImageKind)

Recognize barcode from file on server using GET requests with parameters in route and query string.

### barcodeRecognizeGet example

```java
// Import classes:
import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.Configuration;
import com.aspose.barcode.cloud.auth.*;
import com.aspose.barcode.cloud.api.RecognizeApi;

public class Main {

    public static void main(String[] args) {

        ApiClient client = new ApiClient(
            "Client Id from https://dashboard.aspose.cloud/applications",
            "Client Secret from https://dashboard.aspose.cloud/applications"
        );

        RecognizeApi api = new RecognizeApi(client);
        DecodeBarcodeType barcodeType = DecodeBarcodeType.fromValue("MostCommonlyUsed"); // DecodeBarcodeType | Type of barcode to recognize
        URI fileUrl = new URI(); // URI | Url to barcode image
        try {
            BarcodeResponseList result = api.barcodeRecognizeGet(barcodeType, fileUrl);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RecognizeApi.barcodeRecognizeGet");
            e.printStackTrace();
        }
    }
}
```

### barcodeRecognizeGet parameters

Name | Type | Description  | Notes
---- | ---- | ------------ | -----
 **barcodeType** | [**DecodeBarcodeType**](.md)| Type of barcode to recognize | [enum: MostCommonlyUsed, QR, AustraliaPost, AustralianPosteParcel, Aztec, Codabar, CodablockF, Code11, Code128, Code16K, Code32, Code39, Code39FullASCII, Code93, CompactPdf417, DataLogic2of5, DataMatrix, DatabarExpanded, DatabarExpandedStacked, DatabarLimited, DatabarOmniDirectional, DatabarStacked, DatabarStackedOmniDirectional, DatabarTruncated, DeutschePostIdentcode, DeutschePostLeitcode, DotCode, DutchKIX, EAN13, EAN14, EAN8, GS1Aztec, GS1Code128, GS1CompositeBar, GS1DataMatrix, GS1DotCode, GS1HanXin, GS1MicroPdf417, GS1QR, HanXin, HIBCAztecLIC, HIBCAztecPAS, HIBCCode128LIC, HIBCCode128PAS, HIBCCode39LIC, HIBCCode39PAS, HIBCDataMatrixLIC, HIBCDataMatrixPAS, HIBCQRLIC, HIBCQRPAS, IATA2of5, ISBN, ISMN, ISSN, ITF14, ITF6, Interleaved2of5, ItalianPost25, MacroPdf417, Mailmark, Matrix2of5, MaxiCode, MicrE13B, MicroPdf417, MicroQR, MSI, OneCode, OPC, PatchCode, Pdf417, Pharmacode, Planet, Postnet, PZN, RectMicroQR, RM4SCC, SCC14, SSCC18, Standard2of5, Supplement, SwissPostParcel, UPCA, UPCE, VIN]
 **fileUrl** | **URI**| Url to barcode image |
 **recognitionMode** | [**RecognitionMode**](.md)| Recognition mode | [optional] [enum: Fast, Normal, Excellent]
 **recognitionImageKind** | [**RecognitionImageKind**](.md)| Image kind for recognition | [optional] [enum: Photo, ScannedDocument, ClearImage]

### barcodeRecognizeGet return type

[**BarcodeResponseList**](BarcodeResponseList.md)

## barcodeRecognizeMultipartPost

> BarcodeResponseList barcodeRecognizeMultipartPost(barcodeType, _file, recognitionMode, recognitionImageKind)

Recognize barcode from file in request body using POST requests with parameters in multipart form.

### barcodeRecognizeMultipartPost example

```java
// Import classes:
import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.Configuration;
import com.aspose.barcode.cloud.auth.*;
import com.aspose.barcode.cloud.api.RecognizeApi;

public class Main {

    public static void main(String[] args) {

        ApiClient client = new ApiClient(
            "Client Id from https://dashboard.aspose.cloud/applications",
            "Client Secret from https://dashboard.aspose.cloud/applications"
        );

        RecognizeApi api = new RecognizeApi(client);
        DecodeBarcodeType barcodeType = DecodeBarcodeType.fromValue("MostCommonlyUsed"); // DecodeBarcodeType | 
        File _file = new File("/path/to/file"); // File | Barcode image file
        try {
            BarcodeResponseList result = api.barcodeRecognizeMultipartPost(barcodeType, _file);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RecognizeApi.barcodeRecognizeMultipartPost");
            e.printStackTrace();
        }
    }
}
```

### barcodeRecognizeMultipartPost parameters

Name | Type | Description  | Notes
---- | ---- | ------------ | -----
 **barcodeType** | [**DecodeBarcodeType**](DecodeBarcodeType.md)|  | [enum: MostCommonlyUsed, QR, AustraliaPost, AustralianPosteParcel, Aztec, Codabar, CodablockF, Code11, Code128, Code16K, Code32, Code39, Code39FullASCII, Code93, CompactPdf417, DataLogic2of5, DataMatrix, DatabarExpanded, DatabarExpandedStacked, DatabarLimited, DatabarOmniDirectional, DatabarStacked, DatabarStackedOmniDirectional, DatabarTruncated, DeutschePostIdentcode, DeutschePostLeitcode, DotCode, DutchKIX, EAN13, EAN14, EAN8, GS1Aztec, GS1Code128, GS1CompositeBar, GS1DataMatrix, GS1DotCode, GS1HanXin, GS1MicroPdf417, GS1QR, HanXin, HIBCAztecLIC, HIBCAztecPAS, HIBCCode128LIC, HIBCCode128PAS, HIBCCode39LIC, HIBCCode39PAS, HIBCDataMatrixLIC, HIBCDataMatrixPAS, HIBCQRLIC, HIBCQRPAS, IATA2of5, ISBN, ISMN, ISSN, ITF14, ITF6, Interleaved2of5, ItalianPost25, MacroPdf417, Mailmark, Matrix2of5, MaxiCode, MicrE13B, MicroPdf417, MicroQR, MSI, OneCode, OPC, PatchCode, Pdf417, Pharmacode, Planet, Postnet, PZN, RectMicroQR, RM4SCC, SCC14, SSCC18, Standard2of5, Supplement, SwissPostParcel, UPCA, UPCE, VIN]
 **_file** | **File**| Barcode image file |
 **recognitionMode** | [**RecognitionMode**](RecognitionMode.md)|  | [optional] [enum: Fast, Normal, Excellent]
 **recognitionImageKind** | [**RecognitionImageKind**](RecognitionImageKind.md)|  | [optional] [enum: Photo, ScannedDocument, ClearImage]

### barcodeRecognizeMultipartPost return type

[**BarcodeResponseList**](BarcodeResponseList.md)

