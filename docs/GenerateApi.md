# GenerateApi

All URIs are relative to *<https://api.aspose.cloud/v4.0>*

Method | HTTP request | Description
------ | ------------ | -----------
[**generate**](GenerateApi.md#generate) | **GET** /barcode/generate/{barcodeType} | Generate barcode using GET request with parameters in route and query string.
[**generateBody**](GenerateApi.md#generateBody) | **POST** /barcode/generate-body | Generate barcode using POST request with parameters in body in json or xml format.
[**generateMultipart**](GenerateApi.md#generateMultipart) | **POST** /barcode/generate-multipart | Generate barcode using POST request with parameters in multipart form.

## generate

> File generate(barcodeType, data, dataType, imageFormat, textLocation, foregroundColor, backgroundColor, units, resolution, imageHeight, imageWidth, rotationAngle)

Generate barcode using GET request with parameters in route and query string.


### generate parameters

Name | Type | Description  | Notes
---- | ---- | ------------ | -----
 **barcodeType** | [**EncodeBarcodeType**](.md)| Type of barcode to generate. | [enum: QR, AustraliaPost, AustralianPosteParcel, Aztec, Codabar, CodablockF, Code11, Code128, Code16K, Code32, Code39, Code39FullASCII, Code93, DataLogic2of5, DataMatrix, DatabarExpanded, DatabarExpandedStacked, DatabarLimited, DatabarOmniDirectional, DatabarStacked, DatabarStackedOmniDirectional, DatabarTruncated, DeutschePostIdentcode, DeutschePostLeitcode, DotCode, DutchKIX, EAN13, EAN14, EAN8, GS1Aztec, GS1CodablockF, GS1Code128, GS1DataMatrix, GS1DotCode, GS1HanXin, GS1MicroPdf417, GS1QR, HanXin, IATA2of5, ISBN, ISMN, ISSN, ITF14, ITF6, Interleaved2of5, ItalianPost25, MSI, MacroPdf417, Mailmark, Matrix2of5, MaxiCode, MicroPdf417, MicroQR, OPC, OneCode, PZN, PatchCode, Pdf417, Pharmacode, Planet, Postnet, RM4SCC, RectMicroQR, SCC14, SSCC18, SingaporePost, Standard2of5, SwissPostParcel, UPCA, UPCE, UpcaGs1Code128Coupon, UpcaGs1DatabarCoupon, VIN]
 **data** | **String**| String represents data to encode |
 **dataType** | [**EncodeDataType**](.md)| Type of data to encode.  Default value: StringData. | [optional] [enum: StringData, Base64Bytes, HexBytes]
 **imageFormat** | [**BarcodeImageFormat**](.md)| Barcode output image format.  Default value: png | [optional] [enum: Png, Jpeg, Svg, Tiff, Gif]
 **textLocation** | [**CodeLocation**](.md)| Specify the displaying Text Location, set to CodeLocation.None to hide CodeText.  Default value: CodeLocation.Below. | [optional] [enum: Below, Above, None]
 **foregroundColor** | **String**| Specify the displaying bars and content Color.  Value: Color name from https://reference.aspose.com/drawing/net/system.drawing/color/ or ARGB value started with #.  For example: AliceBlue or #FF000000  Default value: Black. | [optional] [default to Black]
 **backgroundColor** | **String**| Background color of the barcode image.  Value: Color name from https://reference.aspose.com/drawing/net/system.drawing/color/ or ARGB value started with #.  For example: AliceBlue or #FF000000  Default value: White. | [optional] [default to White]
 **units** | [**GraphicsUnit**](.md)| Common Units for all measuring in query. Default units: pixel. | [optional] [enum: Pixel, Point, Inch, Millimeter]
 **resolution** | **Float**| Resolution of the BarCode image.  One value for both dimensions.  Default value: 96 dpi.  Decimal separator is dot. | [optional]
 **imageHeight** | **Float**| Height of the barcode image in given units. Default units: pixel.  Decimal separator is dot. | [optional]
 **imageWidth** | **Float**| Width of the barcode image in given units. Default units: pixel.  Decimal separator is dot. | [optional]
 **rotationAngle** | **Integer**| BarCode image rotation angle, measured in degree, e.g. RotationAngle &#x3D; 0 or RotationAngle &#x3D; 360 means no rotation.  If RotationAngle NOT equal to 90, 180, 270 or 0, it may increase the difficulty for the scanner to read the image.  Default value: 0. | [optional]

### generate return type

**File**

## generateBody

> File generateBody(generateParams)

Generate barcode using POST request with parameters in body in json or xml format.


### generateBody parameters

Name | Type | Description  | Notes
---- | ---- | ------------ | -----
 **generateParams** | [**GenerateParams**](GenerateParams.md)| Parameters of generation |

### generateBody return type

**File**

## generateMultipart

> File generateMultipart(barcodeType, data, dataType, imageFormat, textLocation, foregroundColor, backgroundColor, units, resolution, imageHeight, imageWidth, rotationAngle)

Generate barcode using POST request with parameters in multipart form.


### generateMultipart parameters

Name | Type | Description  | Notes
---- | ---- | ------------ | -----
 **barcodeType** | [**EncodeBarcodeType**](EncodeBarcodeType.md)|  | [enum: QR, AustraliaPost, AustralianPosteParcel, Aztec, Codabar, CodablockF, Code11, Code128, Code16K, Code32, Code39, Code39FullASCII, Code93, DataLogic2of5, DataMatrix, DatabarExpanded, DatabarExpandedStacked, DatabarLimited, DatabarOmniDirectional, DatabarStacked, DatabarStackedOmniDirectional, DatabarTruncated, DeutschePostIdentcode, DeutschePostLeitcode, DotCode, DutchKIX, EAN13, EAN14, EAN8, GS1Aztec, GS1CodablockF, GS1Code128, GS1DataMatrix, GS1DotCode, GS1HanXin, GS1MicroPdf417, GS1QR, HanXin, IATA2of5, ISBN, ISMN, ISSN, ITF14, ITF6, Interleaved2of5, ItalianPost25, MSI, MacroPdf417, Mailmark, Matrix2of5, MaxiCode, MicroPdf417, MicroQR, OPC, OneCode, PZN, PatchCode, Pdf417, Pharmacode, Planet, Postnet, RM4SCC, RectMicroQR, SCC14, SSCC18, SingaporePost, Standard2of5, SwissPostParcel, UPCA, UPCE, UpcaGs1Code128Coupon, UpcaGs1DatabarCoupon, VIN]
 **data** | **String**| String represents data to encode |
 **dataType** | [**EncodeDataType**](EncodeDataType.md)|  | [optional] [enum: StringData, Base64Bytes, HexBytes]
 **imageFormat** | [**BarcodeImageFormat**](BarcodeImageFormat.md)|  | [optional] [enum: Png, Jpeg, Svg, Tiff, Gif]
 **textLocation** | [**CodeLocation**](CodeLocation.md)|  | [optional] [enum: Below, Above, None]
 **foregroundColor** | **String**| Specify the displaying bars and content Color.  Value: Color name from https://reference.aspose.com/drawing/net/system.drawing/color/ or ARGB value started with #.  For example: AliceBlue or #FF000000  Default value: Black. | [optional] [default to Black]
 **backgroundColor** | **String**| Background color of the barcode image.  Value: Color name from https://reference.aspose.com/drawing/net/system.drawing/color/ or ARGB value started with #.  For example: AliceBlue or #FF000000  Default value: White. | [optional] [default to White]
 **units** | [**GraphicsUnit**](GraphicsUnit.md)|  | [optional] [enum: Pixel, Point, Inch, Millimeter]
 **resolution** | **Float**| Resolution of the BarCode image.  One value for both dimensions.  Default value: 96 dpi.  Decimal separator is dot. | [optional]
 **imageHeight** | **Float**| Height of the barcode image in given units. Default units: pixel.  Decimal separator is dot. | [optional]
 **imageWidth** | **Float**| Width of the barcode image in given units. Default units: pixel.  Decimal separator is dot. | [optional]
 **rotationAngle** | **Integer**| BarCode image rotation angle, measured in degree, e.g. RotationAngle &#x3D; 0 or RotationAngle &#x3D; 360 means no rotation.  If RotationAngle NOT equal to 90, 180, 270 or 0, it may increase the difficulty for the scanner to read the image.  Default value: 0. | [optional]

### generateMultipart return type

**File**

