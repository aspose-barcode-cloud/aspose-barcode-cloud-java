# GenerateApi

All URIs are relative to *<https://barcode.qa.aspose.cloud/v4.0>*

Method | HTTP request | Description
------ | ------------ | -----------
[**barcodeGenerateBarcodeTypeGet**](GenerateApi.md#barcodeGenerateBarcodeTypeGet) | **GET** /barcode/generate/{barcodeType} | Generate barcode using GET request with parameters in route and query string.
[**barcodeGenerateBodyPost**](GenerateApi.md#barcodeGenerateBodyPost) | **POST** /barcode/generate-body | Generate barcode using POST request with parameters in body in json or xml format.
[**barcodeGenerateMultipartPost**](GenerateApi.md#barcodeGenerateMultipartPost) | **POST** /barcode/generate-multipart | Generate barcode using POST request with parameters in multipart form.

## barcodeGenerateBarcodeTypeGet

> File barcodeGenerateBarcodeTypeGet(barcodeType, data, dataType, imageFormat, textLocation, foregroundColor, backgroundColor, units, resolution, imageHeight, imageWidth, rotationAngle)

Generate barcode using GET request with parameters in route and query string.

### barcodeGenerateBarcodeTypeGet example

```java
// Import classes:
import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.Configuration;
import com.aspose.barcode.cloud.auth.*;
import com.aspose.barcode.cloud.api.GenerateApi;

public class Main {

    public static void main(String[] args) {

        ApiClient client = new ApiClient(
            "Client Id from https://dashboard.aspose.cloud/applications",
            "Client Secret from https://dashboard.aspose.cloud/applications"
        );

        GenerateApi api = new GenerateApi(client);
        EncodeBarcodeType barcodeType = EncodeBarcodeType.fromValue("QR"); // EncodeBarcodeType | Type of barcode to generate.
        String data = "data_example"; // String | String represents data to encode
        try {
            File result = api.barcodeGenerateBarcodeTypeGet(barcodeType, data);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GenerateApi.barcodeGenerateBarcodeTypeGet");
            e.printStackTrace();
        }
    }
}
```

### barcodeGenerateBarcodeTypeGet parameters

Name | Type | Description  | Notes
---- | ---- | ------------ | -----
 **barcodeType** | [**EncodeBarcodeType**](.md)| Type of barcode to generate. | [enum: QR, AustraliaPost, AustralianPosteParcel, Aztec, Codabar, CodablockF, Code11, Code128, Code16K, Code32, Code39, Code39FullASCII, Code93, DataLogic2of5, DataMatrix, DatabarExpanded, DatabarExpandedStacked, DatabarLimited, DatabarOmniDirectional, DatabarStacked, DatabarStackedOmniDirectional, DatabarTruncated, DeutschePostIdentcode, DeutschePostLeitcode, DotCode, DutchKIX, EAN13, EAN14, EAN8, GS1Aztec, GS1CodablockF, GS1Code128, GS1DataMatrix, GS1DotCode, GS1HanXin, GS1MicroPdf417, GS1QR, HanXin, IATA2of5, ISBN, ISMN, ISSN, ITF14, ITF6, Interleaved2of5, ItalianPost25, MSI, MacroPdf417, Mailmark, Matrix2of5, MaxiCode, MicroPdf417, MicroQR, OPC, OneCode, PZN, PatchCode, Pdf417, Pharmacode, Planet, Postnet, RM4SCC, RectMicroQR, SCC14, SSCC18, SingaporePost, Standard2of5, SwissPostParcel, UPCA, UPCE, UpcaGs1Code128Coupon, UpcaGs1DatabarCoupon, VIN]
 **data** | **String**| String represents data to encode |
 **dataType** | [**EncodeDataType**](.md)| Type of data to encode.  Default value:  EncodeDataType.StringData. | [optional] [enum: StringData, Base64Bytes, HexBytes]
 **imageFormat** | [**BarcodeImageFormat**](.md)| Barcode output image format.  Default value: png | [optional] [enum: Gif, Jpeg, Png, Tiff, Svg]
 **textLocation** | [**CodeLocation**](.md)| Specify the displaying Text Location, set to CodeLocation.None to hide CodeText.  Default value: CodeLocation.Below. | [optional] [enum: Below, Above, None]
 **foregroundColor** | **String**| Specify the displaying bars and content Color.  Value: Color name from https://reference.aspose.com/drawing/net/system.drawing/color/ or ARGB value started with #.  For example: AliceBlue or #FF000000  Default value: Black. | [optional]
 **backgroundColor** | **String**| Background color of the barcode image.  Value: Color name from https://reference.aspose.com/drawing/net/system.drawing/color/ or ARGB value started with #.  For example: AliceBlue or #FF000000  Default value: White. | [optional]
 **units** | [**GraphicsUnit**](.md)| Common Units for all measuring in query. Default units: pixel. | [optional] [enum: Pixel, Point, Inch, Millimeter]
 **resolution** | **Float**| Resolution of the BarCode image.  One value for both dimensions.  Default value: 96 dpi.  Decimal separator is dot. | [optional]
 **imageHeight** | **Float**| Height of the barcode image in given units. Default units: pixel.  Decimal separator is dot. | [optional]
 **imageWidth** | **Float**| Width of the barcode image in given units. Default units: pixel.  Decimal separator is dot. | [optional]
 **rotationAngle** | **Integer**| BarCode image rotation angle, measured in degree, e.g. RotationAngle &#x3D; 0 or RotationAngle &#x3D; 360 means no rotation.  If RotationAngle NOT equal to 90, 180, 270 or 0, it may increase the difficulty for the scanner to read the image.  Default value: 0. | [optional]

### barcodeGenerateBarcodeTypeGet return type

**File**

## barcodeGenerateBodyPost

> File barcodeGenerateBodyPost(generateParams)

Generate barcode using POST request with parameters in body in json or xml format.

### barcodeGenerateBodyPost example

```java
// Import classes:
import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.Configuration;
import com.aspose.barcode.cloud.auth.*;
import com.aspose.barcode.cloud.api.GenerateApi;

public class Main {

    public static void main(String[] args) {

        ApiClient client = new ApiClient(
            "Client Id from https://dashboard.aspose.cloud/applications",
            "Client Secret from https://dashboard.aspose.cloud/applications"
        );

        GenerateApi api = new GenerateApi(client);
        GenerateParams generateParams = new GenerateParams(); // GenerateParams | Parameters of generation
        try {
            File result = api.barcodeGenerateBodyPost(generateParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GenerateApi.barcodeGenerateBodyPost");
            e.printStackTrace();
        }
    }
}
```

### barcodeGenerateBodyPost parameters

Name | Type | Description  | Notes
---- | ---- | ------------ | -----
 **generateParams** | [**GenerateParams**](GenerateParams.md)| Parameters of generation |

### barcodeGenerateBodyPost return type

**File**

## barcodeGenerateMultipartPost

> File barcodeGenerateMultipartPost(barcodeType, data, dataType, imageFormat, textLocation, foregroundColor, backgroundColor, units, resolution, imageHeight, imageWidth, rotationAngle)

Generate barcode using POST request with parameters in multipart form.

### barcodeGenerateMultipartPost example

```java
// Import classes:
import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.Configuration;
import com.aspose.barcode.cloud.auth.*;
import com.aspose.barcode.cloud.api.GenerateApi;

public class Main {

    public static void main(String[] args) {

        ApiClient client = new ApiClient(
            "Client Id from https://dashboard.aspose.cloud/applications",
            "Client Secret from https://dashboard.aspose.cloud/applications"
        );

        GenerateApi api = new GenerateApi(client);
        EncodeBarcodeType barcodeType = EncodeBarcodeType.fromValue("QR"); // EncodeBarcodeType | 
        String data = "data_example"; // String | String represents data to encode
        try {
            File result = api.barcodeGenerateMultipartPost(barcodeType, data);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GenerateApi.barcodeGenerateMultipartPost");
            e.printStackTrace();
        }
    }
}
```

### barcodeGenerateMultipartPost parameters

Name | Type | Description  | Notes
---- | ---- | ------------ | -----
 **barcodeType** | [**EncodeBarcodeType**](EncodeBarcodeType.md)|  | [enum: QR, AustraliaPost, AustralianPosteParcel, Aztec, Codabar, CodablockF, Code11, Code128, Code16K, Code32, Code39, Code39FullASCII, Code93, DataLogic2of5, DataMatrix, DatabarExpanded, DatabarExpandedStacked, DatabarLimited, DatabarOmniDirectional, DatabarStacked, DatabarStackedOmniDirectional, DatabarTruncated, DeutschePostIdentcode, DeutschePostLeitcode, DotCode, DutchKIX, EAN13, EAN14, EAN8, GS1Aztec, GS1CodablockF, GS1Code128, GS1DataMatrix, GS1DotCode, GS1HanXin, GS1MicroPdf417, GS1QR, HanXin, IATA2of5, ISBN, ISMN, ISSN, ITF14, ITF6, Interleaved2of5, ItalianPost25, MSI, MacroPdf417, Mailmark, Matrix2of5, MaxiCode, MicroPdf417, MicroQR, OPC, OneCode, PZN, PatchCode, Pdf417, Pharmacode, Planet, Postnet, RM4SCC, RectMicroQR, SCC14, SSCC18, SingaporePost, Standard2of5, SwissPostParcel, UPCA, UPCE, UpcaGs1Code128Coupon, UpcaGs1DatabarCoupon, VIN]
 **data** | **String**| String represents data to encode |
 **dataType** | [**EncodeDataType**](EncodeDataType.md)|  | [optional] [enum: StringData, Base64Bytes, HexBytes]
 **imageFormat** | [**BarcodeImageFormat**](BarcodeImageFormat.md)|  | [optional] [enum: Gif, Jpeg, Png, Tiff, Svg]
 **textLocation** | [**CodeLocation**](CodeLocation.md)|  | [optional] [enum: Below, Above, None]
 **foregroundColor** | **String**| Specify the displaying bars and content Color.  Value: Color name from https://reference.aspose.com/drawing/net/system.drawing/color/ or ARGB value started with #.  For example: AliceBlue or #FF000000  Default value: Black. | [optional]
 **backgroundColor** | **String**| Background color of the barcode image.  Value: Color name from https://reference.aspose.com/drawing/net/system.drawing/color/ or ARGB value started with #.  For example: AliceBlue or #FF000000  Default value: White. | [optional]
 **units** | [**GraphicsUnit**](GraphicsUnit.md)|  | [optional] [enum: Pixel, Point, Inch, Millimeter]
 **resolution** | **Float**| Resolution of the BarCode image.  One value for both dimensions.  Default value: 96 dpi.  Decimal separator is dot. | [optional]
 **imageHeight** | **Float**| Height of the barcode image in given units. Default units: pixel.  Decimal separator is dot. | [optional]
 **imageWidth** | **Float**| Width of the barcode image in given units. Default units: pixel.  Decimal separator is dot. | [optional]
 **rotationAngle** | **Integer**| BarCode image rotation angle, measured in degree, e.g. RotationAngle &#x3D; 0 or RotationAngle &#x3D; 360 means no rotation.  If RotationAngle NOT equal to 90, 180, 270 or 0, it may increase the difficulty for the scanner to read the image.  Default value: 0. | [optional]

### barcodeGenerateMultipartPost return type

**File**

