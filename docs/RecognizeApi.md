# RecognizeApi

All URIs are relative to *<https://barcode.qa.aspose.cloud/v4.0>*

Method | HTTP request | Description
------ | ------------ | -----------
[**barcodeRecognizeBarcodeTypeGet**](RecognizeApi.md#barcodeRecognizeBarcodeTypeGet) | **GET** /barcode/recognize/{barcodeType} | Recognize barcode from file on server using GET requests with parameters in route and query string.
[**barcodeRecognizeBodyPost**](RecognizeApi.md#barcodeRecognizeBodyPost) | **POST** /barcode/recognize-body | Recognize barcode from file in request body using POST requests with parameters in body in json or xml format.
[**barcodeRecognizeFormPost**](RecognizeApi.md#barcodeRecognizeFormPost) | **POST** /barcode/recognize-form | Recognize barcode from file in request body using POST requests with parameters in multipart form.

## barcodeRecognizeBarcodeTypeGet

> BarcodeResponseList barcodeRecognizeBarcodeTypeGet(barcodeType, fileUrl, recognitionMode, imageKind)

Recognize barcode from file on server using GET requests with parameters in route and query string.

### barcodeRecognizeBarcodeTypeGet example

```java
// Import classes:
import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.api.RecognizeApi;

public class Main {

    public static void main(String[] args) {

        ApiClient client = new ApiClient(
            "Client Id from https://dashboard.aspose.cloud/applications",
            "Client Secret from https://dashboard.aspose.cloud/applications"
        );

        RecognizeApi api = new RecognizeApi(client);
        DecodeBarcodeType barcodeType = DecodeBarcodeType.fromValue("mostCommonlyUsed"); // DecodeBarcodeType | Type of barcode to recognize
        URI fileUrl = new URI(); // URI | Url to barcode image
        try {
            BarcodeResponseList result = api.barcodeRecognizeBarcodeTypeGet(barcodeType, fileUrl);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RecognizeApi.barcodeRecognizeBarcodeTypeGet");
            e.printStackTrace();
        }
    }
}
```

### barcodeRecognizeBarcodeTypeGet parameters

Name | Type | Description  | Notes
---- | ---- | ------------ | -----
 **barcodeType** | [**DecodeBarcodeType**](.md)| Type of barcode to recognize | [enum: mostCommonlyUsed, AustraliaPost, Aztec, ISBN, Codabar, Code11, Code128, GS1Code128, Code39, Code39FullASCII, Code93, Code93FullASCII, DataMatrix, DeutschePostIdentcode, DeutschePostLeitcode, EAN13, EAN14, EAN8, IATA2of5, Interleaved2of5, ISSN, ISMN, ItalianPost25, ITF14, ITF6, MacroPdf417, Matrix2of5, MSI, OneCode, OPC, PatchCode, Pdf417, MicroPdf417, Planet, Postnet, PZN, QR, MicroQR, RectMicroQR, RM4SCC, SCC14, SSCC18, Standard2of5, Supplement, UPCA, UPCE, VIN, Pharmacode, GS1DataMatrix, DatabarOmniDirectional, DatabarTruncated, DatabarLimited, DatabarExpanded, SwissPostParcel, AustralianPosteParcel, Code16K, DatabarStackedOmniDirectional, DatabarStacked, DatabarExpandedStacked, CompactPdf417, GS1QR, MaxiCode, MicrE13B, Code32, DataLogic2of5, DotCode, DutchKIX, CodablockF, Mailmark, GS1DotCode, HIBCCode39LIC, HIBCCode128LIC, HIBCAztecLIC, HIBCDataMatrixLIC, HIBCQRLIC, HIBCCode39PAS, HIBCCode128PAS, HIBCAztecPAS, HIBCDataMatrixPAS, HIBCQRPAS, HanXin, GS1HanXin, GS1Aztec, GS1CompositeBar, GS1MicroPdf417]
 **fileUrl** | **URI**| Url to barcode image |
 **recognitionMode** | [**RecognitionMode**](.md)| Recognition mode | [optional] [enum: Fast, Normal, Excellent]
 **imageKind** | [**RecognitionImageKind**](.md)| Image kind | [optional] [enum: Photo, ScannedDocument, ClearImage]

### barcodeRecognizeBarcodeTypeGet return type

[**BarcodeResponseList**](BarcodeResponseList.md)

## barcodeRecognizeBodyPost

> BarcodeResponseList barcodeRecognizeBodyPost(recognizeBase64Request)

Recognize barcode from file in request body using POST requests with parameters in body in json or xml format.

### barcodeRecognizeBodyPost example

```java
// Import classes:
import com.aspose.barcode.cloud.ApiException;
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

## barcodeRecognizeFormPost

> BarcodeResponseList barcodeRecognizeFormPost(barcodeType, _file, recognitionMode, imageKind)

Recognize barcode from file in request body using POST requests with parameters in multipart form.

### barcodeRecognizeFormPost example

```java
// Import classes:
import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.api.RecognizeApi;

public class Main {

    public static void main(String[] args) {

        ApiClient client = new ApiClient(
            "Client Id from https://dashboard.aspose.cloud/applications",
            "Client Secret from https://dashboard.aspose.cloud/applications"
        );

        RecognizeApi api = new RecognizeApi(client);
        DecodeBarcodeType barcodeType = DecodeBarcodeType.fromValue("mostCommonlyUsed"); // DecodeBarcodeType | 
        File _file = new File("/path/to/file"); // File | Barcode image file
        try {
            BarcodeResponseList result = api.barcodeRecognizeFormPost(barcodeType, _file);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RecognizeApi.barcodeRecognizeFormPost");
            e.printStackTrace();
        }
    }
}
```

### barcodeRecognizeFormPost parameters

Name | Type | Description  | Notes
---- | ---- | ------------ | -----
 **barcodeType** | [**DecodeBarcodeType**](DecodeBarcodeType.md)|  | [enum: mostCommonlyUsed, AustraliaPost, Aztec, ISBN, Codabar, Code11, Code128, GS1Code128, Code39, Code39FullASCII, Code93, Code93FullASCII, DataMatrix, DeutschePostIdentcode, DeutschePostLeitcode, EAN13, EAN14, EAN8, IATA2of5, Interleaved2of5, ISSN, ISMN, ItalianPost25, ITF14, ITF6, MacroPdf417, Matrix2of5, MSI, OneCode, OPC, PatchCode, Pdf417, MicroPdf417, Planet, Postnet, PZN, QR, MicroQR, RectMicroQR, RM4SCC, SCC14, SSCC18, Standard2of5, Supplement, UPCA, UPCE, VIN, Pharmacode, GS1DataMatrix, DatabarOmniDirectional, DatabarTruncated, DatabarLimited, DatabarExpanded, SwissPostParcel, AustralianPosteParcel, Code16K, DatabarStackedOmniDirectional, DatabarStacked, DatabarExpandedStacked, CompactPdf417, GS1QR, MaxiCode, MicrE13B, Code32, DataLogic2of5, DotCode, DutchKIX, CodablockF, Mailmark, GS1DotCode, HIBCCode39LIC, HIBCCode128LIC, HIBCAztecLIC, HIBCDataMatrixLIC, HIBCQRLIC, HIBCCode39PAS, HIBCCode128PAS, HIBCAztecPAS, HIBCDataMatrixPAS, HIBCQRPAS, HanXin, GS1HanXin, GS1Aztec, GS1CompositeBar, GS1MicroPdf417]
 **_file** | **File**| Barcode image file |
 **recognitionMode** | [**RecognitionMode**](RecognitionMode.md)|  | [optional] [enum: Fast, Normal, Excellent]
 **imageKind** | [**RecognitionImageKind**](RecognitionImageKind.md)|  | [optional] [enum: Photo, ScannedDocument, ClearImage]

### barcodeRecognizeFormPost return type

[**BarcodeResponseList**](BarcodeResponseList.md)

