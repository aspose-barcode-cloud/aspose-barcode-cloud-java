# GenerateApi

All URIs are relative to *<https://barcode.qa.aspose.cloud/v4.0>*

Method | HTTP request | Description
------ | ------------ | -----------
[**barcodeGenerateBarcodeTypeGet**](GenerateApi.md#barcodeGenerateBarcodeTypeGet) | **GET** /barcode/generate/{barcodeType} | Generate barcode using GET request with parameters in route and query string.
[**barcodeGenerateBodyPost**](GenerateApi.md#barcodeGenerateBodyPost) | **POST** /barcode/generate-body | Generate barcode using POST request with parameters in body in json or xml format.
[**barcodeGenerateFormPost**](GenerateApi.md#barcodeGenerateFormPost) | **POST** /barcode/generate-form | Generate barcode using POST request with parameters in url ecncoded form.

## barcodeGenerateBarcodeTypeGet

> File barcodeGenerateBarcodeTypeGet(barcodeType, data, dataType, imageFormat, twoDDisplayText, textLocation, textAlignment, foregroundColor, backgroundColor, units, resolution, imageHeight, imageWidth, rotationAngle)

Generate barcode using GET request with parameters in route and query string.

### barcodeGenerateBarcodeTypeGet example

```java
// Import classes:
import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.api.GenerateApi;

public class Main {

    public static void main(String[] args) {

        ApiClient client = new ApiClient(
            "Client Id from https://dashboard.aspose.cloud/applications",
            "Client Secret from https://dashboard.aspose.cloud/applications"
        );

        GenerateApi api = new GenerateApi(client);
        EncodeBarcodeType barcodeType = EncodeBarcodeType.fromValue("Codabar"); // EncodeBarcodeType | Type of barcode to generate.
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
 **barcodeType** | [**EncodeBarcodeType**](.md)| Type of barcode to generate. | [enum: Codabar, Code11, Code39, Code39FullASCII, Code93, Code128, GS1Code128, EAN8, EAN13, EAN14, SCC14, SSCC18, UPCA, UPCE, ISBN, ISSN, ISMN, Standard2of5, Interleaved2of5, Matrix2of5, ItalianPost25, IATA2of5, ITF14, ITF6, MSI, VIN, DeutschePostIdentcode, DeutschePostLeitcode, OPC, PZN, Code16K, Pharmacode, DataMatrix, QR, Aztec, Pdf417, MacroPdf417, AustraliaPost, Postnet, Planet, OneCode, RM4SCC, DatabarOmniDirectional, DatabarTruncated, DatabarLimited, DatabarExpanded, SingaporePost, GS1DataMatrix, AustralianPosteParcel, SwissPostParcel, PatchCode, DatabarExpandedStacked, DatabarStacked, DatabarStackedOmniDirectional, MicroPdf417, GS1QR, MaxiCode, Code32, DataLogic2of5, DotCode, DutchKIX, UpcaGs1Code128Coupon, UpcaGs1DatabarCoupon, CodablockF, GS1CodablockF, Mailmark, GS1DotCode, HanXin, GS1HanXin, GS1Aztec, GS1MicroPdf417, RectMicroQR, MicroQR]
 **data** | **String**| String represents data to encode |
 **dataType** | [**EncodeDataType**](.md)| Type of data to encode.  Default value:  EncodeDataType.StringData. | [optional] [enum: StringData, Base64Bytes, HexBytes]
 **imageFormat** | [**AvailableBarCodeImageFormat**](.md)| Barcode output image format.  Default value: png | [optional] [enum: Gif, Jpeg, Png, Tiff, Svg]
 **twoDDisplayText** | **String**| Text that will be displayed instead of codetext in 2D barcodes.  Used for: Aztec, Pdf417, DataMatrix, QR, MaxiCode, DotCode | [optional]
 **textLocation** | [**CodeLocation**](.md)| Specify the displaying Text Location, set to CodeLocation.None to hide CodeText.  Default value: CodeLocation.Below. | [optional] [enum: Below, Above, None]
 **textAlignment** | [**TextAlignment**](.md)| Text alignment.  Default value: TextAligment.Left | [optional] [enum: Left, Center, Right]
 **foregroundColor** | **String**| Specify the displaying bars and content Color.   Value: Color name from https://reference.aspose.com/drawing/net/system.drawing/color/ or ARGB value started with #.   For example: AliceBlue or #FF000000  Default value: Black. | [optional]
 **backgroundColor** | **String**| Background color of the barcode image.  Value: Color name from https://reference.aspose.com/drawing/net/system.drawing/color/ or ARGB value started with #.   For example: AliceBlue or #FF000000  Default value: White. | [optional]
 **units** | [**AvailableGraphicsUnit**](.md)| Common Units for all measuring in query. Default units: pixel. | [optional] [enum: Pixel, Point, Inch, Millimeter]
 **resolution** | **Float**| Resolution of the BarCode image.  One value for both dimensions.  Default value: 96 dpi. | [optional]
 **imageHeight** | **Float**| Height of the barcode image in given units. Default units: pixel. | [optional]
 **imageWidth** | **Float**| Width of the barcode image in given units. Default units: pixel. | [optional]
 **rotationAngle** | **Integer**| BarCode image rotation angle, measured in degree, e.g. RotationAngle &#x3D; 0 or RotationAngle &#x3D; 360 means no rotation.  If RotationAngle NOT equal to 90, 180, 270 or 0, it may increase the difficulty for the scanner to read the image.  Default value: 0. | [optional]

### barcodeGenerateBarcodeTypeGet return type

**File**

## barcodeGenerateBodyPost

> File barcodeGenerateBodyPost(generateParams)

Generate barcode using POST request with parameters in body in json or xml format.

### barcodeGenerateBodyPost example

```java
// Import classes:
import com.aspose.barcode.cloud.ApiException;
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

## barcodeGenerateFormPost

> File barcodeGenerateFormPost(barcodeType, data, dataType, imageFormat, twoDDisplayText, textLocation, textAlignment, foregroundColor, backgroundColor, units, resolution, imageHeight, imageWidth, rotationAngle)

Generate barcode using POST request with parameters in url ecncoded form.

### barcodeGenerateFormPost example

```java
// Import classes:
import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.api.GenerateApi;

public class Main {

    public static void main(String[] args) {

        ApiClient client = new ApiClient(
            "Client Id from https://dashboard.aspose.cloud/applications",
            "Client Secret from https://dashboard.aspose.cloud/applications"
        );

        GenerateApi api = new GenerateApi(client);
        EncodeBarcodeType barcodeType = EncodeBarcodeType.fromValue("Codabar"); // EncodeBarcodeType | 
        String data = "data_example"; // String | String represents data to encode
        try {
            File result = api.barcodeGenerateFormPost(barcodeType, data);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GenerateApi.barcodeGenerateFormPost");
            e.printStackTrace();
        }
    }
}
```

### barcodeGenerateFormPost parameters

Name | Type | Description  | Notes
---- | ---- | ------------ | -----
 **barcodeType** | [**EncodeBarcodeType**](EncodeBarcodeType.md)|  | [enum: Codabar, Code11, Code39, Code39FullASCII, Code93, Code128, GS1Code128, EAN8, EAN13, EAN14, SCC14, SSCC18, UPCA, UPCE, ISBN, ISSN, ISMN, Standard2of5, Interleaved2of5, Matrix2of5, ItalianPost25, IATA2of5, ITF14, ITF6, MSI, VIN, DeutschePostIdentcode, DeutschePostLeitcode, OPC, PZN, Code16K, Pharmacode, DataMatrix, QR, Aztec, Pdf417, MacroPdf417, AustraliaPost, Postnet, Planet, OneCode, RM4SCC, DatabarOmniDirectional, DatabarTruncated, DatabarLimited, DatabarExpanded, SingaporePost, GS1DataMatrix, AustralianPosteParcel, SwissPostParcel, PatchCode, DatabarExpandedStacked, DatabarStacked, DatabarStackedOmniDirectional, MicroPdf417, GS1QR, MaxiCode, Code32, DataLogic2of5, DotCode, DutchKIX, UpcaGs1Code128Coupon, UpcaGs1DatabarCoupon, CodablockF, GS1CodablockF, Mailmark, GS1DotCode, HanXin, GS1HanXin, GS1Aztec, GS1MicroPdf417, RectMicroQR, MicroQR]
 **data** | **String**| String represents data to encode |
 **dataType** | [**EncodeDataType**](EncodeDataType.md)|  | [optional] [enum: StringData, Base64Bytes, HexBytes]
 **imageFormat** | [**AvailableBarCodeImageFormat**](AvailableBarCodeImageFormat.md)|  | [optional] [enum: Gif, Jpeg, Png, Tiff, Svg]
 **twoDDisplayText** | **String**| Text that will be displayed instead of codetext in 2D barcodes.  Used for: Aztec, Pdf417, DataMatrix, QR, MaxiCode, DotCode | [optional]
 **textLocation** | [**CodeLocation**](CodeLocation.md)|  | [optional] [enum: Below, Above, None]
 **textAlignment** | [**TextAlignment**](TextAlignment.md)|  | [optional] [enum: Left, Center, Right]
 **foregroundColor** | **String**| Specify the displaying bars and content Color.   Value: Color name from https://reference.aspose.com/drawing/net/system.drawing/color/ or ARGB value started with #.   For example: AliceBlue or #FF000000  Default value: Black. | [optional]
 **backgroundColor** | **String**| Background color of the barcode image.  Value: Color name from https://reference.aspose.com/drawing/net/system.drawing/color/ or ARGB value started with #.   For example: AliceBlue or #FF000000  Default value: White. | [optional]
 **units** | [**AvailableGraphicsUnit**](AvailableGraphicsUnit.md)|  | [optional] [enum: Pixel, Point, Inch, Millimeter]
 **resolution** | **Float**| Resolution of the BarCode image.  One value for both dimensions.  Default value: 96 dpi. | [optional]
 **imageHeight** | **Float**| Height of the barcode image in given units. Default units: pixel. | [optional]
 **imageWidth** | **Float**| Width of the barcode image in given units. Default units: pixel. | [optional]
 **rotationAngle** | **Integer**| BarCode image rotation angle, measured in degree, e.g. RotationAngle &#x3D; 0 or RotationAngle &#x3D; 360 means no rotation.  If RotationAngle NOT equal to 90, 180, 270 or 0, it may increase the difficulty for the scanner to read the image.  Default value: 0. | [optional]

### barcodeGenerateFormPost return type

**File**

