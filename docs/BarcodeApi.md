# BarcodeApi

All URIs are relative to *<https://api.aspose.cloud/v3.0>*

Method | HTTP request | Description
------ | ------------ | -----------
[**getBarcodeGenerate**](BarcodeApi.md#getBarcodeGenerate) | **GET** /barcode/generate | Generate barcode.
[**getBarcodeRecognize**](BarcodeApi.md#getBarcodeRecognize) | **GET** /barcode/{name}/recognize | Recognize barcode from a file on server.
[**postBarcodeRecognizeFromUrlOrContent**](BarcodeApi.md#postBarcodeRecognizeFromUrlOrContent) | **POST** /barcode/recognize | Recognize barcode from an url or from request body. Request body can contain raw data bytes of the image or encoded with base64.
[**postGenerateMultiple**](BarcodeApi.md#postGenerateMultiple) | **POST** /barcode/generateMultiple | Generate multiple barcodes and return in response stream
[**putBarcodeGenerateFile**](BarcodeApi.md#putBarcodeGenerateFile) | **PUT** /barcode/{name}/generate | Generate barcode and save on server (from query params or from file with json or xml content)
[**putBarcodeRecognizeFromBody**](BarcodeApi.md#putBarcodeRecognizeFromBody) | **PUT** /barcode/{name}/recognize | Recognition of a barcode from file on server with parameters in body.
[**putGenerateMultiple**](BarcodeApi.md#putGenerateMultiple) | **PUT** /barcode/{name}/generateMultiple | Generate image with multiple barcodes and put new file on server

## getBarcodeGenerate

> File getBarcodeGenerate(type, text, twoDDisplayText, textLocation, textAlignment, textColor, fontSizeMode, resolution, resolutionX, resolutionY, dimensionX, textSpace, units, sizeMode, barHeight, imageHeight, imageWidth, rotationAngle, backColor, barColor, borderColor, borderWidth, borderDashStyle, borderVisible, enableChecksum, enableEscape, filledBars, alwaysShowChecksum, wideNarrowRatio, validateText, supplementData, supplementSpace, barWidthReduction, format)

Generate barcode.

### getBarcodeGenerate example

```java
// Import classes:
import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.Configuration;
import com.aspose.barcode.cloud.auth.*;
import com.aspose.barcode.cloud.api.BarcodeApi;

public class Main {

    public static void main(String[] args) {

        ApiClient client = new ApiClient(
            "Client Id from https://dashboard.aspose.cloud/applications",
            "Client Secret from https://dashboard.aspose.cloud/applications"
        );

        BarcodeApi api = new BarcodeApi(client);
        String type = "type_example"; // String | Type of barcode to generate.
        String text = "text_example"; // String | Text to encode.
        try {
            File result = api.getBarcodeGenerate(type, text);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BarcodeApi.getBarcodeGenerate");
            e.printStackTrace();
        }
    }
}
```

### getBarcodeGenerate parameters

Name | Type | Description  | Notes
---- | ---- | ------------ | -----
 **type** | **String**| Type of barcode to generate. | [enum: Codabar, Code11, Code39Standard, Code39Extended, Code93Standard, Code93Extended, Code128, GS1Code128, EAN8, EAN13, EAN14, SCC14, SSCC18, UPCA, UPCE, ISBN, ISSN, ISMN, Standard2of5, Interleaved2of5, Matrix2of5, ItalianPost25, IATA2of5, ITF14, ITF6, MSI, VIN, DeutschePostIdentcode, DeutschePostLeitcode, OPC, PZN, Code16K, Pharmacode, DataMatrix, QR, Aztec, Pdf417, MacroPdf417, AustraliaPost, Postnet, Planet, OneCode, RM4SCC, DatabarOmniDirectional, DatabarTruncated, DatabarLimited, DatabarExpanded, SingaporePost, GS1DataMatrix, AustralianPosteParcel, SwissPostParcel, PatchCode, DatabarExpandedStacked, DatabarStacked, DatabarStackedOmniDirectional, MicroPdf417, GS1QR, MaxiCode, Code32, DataLogic2of5, DotCode, DutchKIX, UpcaGs1Code128Coupon, UpcaGs1DatabarCoupon, CodablockF, GS1CodablockF]
 **text** | **String**| Text to encode. |
 **twoDDisplayText** | **String**| Text that will be displayed instead of codetext in 2D barcodes. Used for: Aztec, Pdf417, DataMatrix, QR, MaxiCode, DotCode | [optional]
 **textLocation** | **String**| Specify the displaying Text Location, set to CodeLocation.None to hide CodeText. Default value: CodeLocation.Below. | [optional] [enum: Below, Above, None]
 **textAlignment** | **String**| Text alignment. | [optional] [enum: Left, Center, Right]
 **textColor** | **String**| Specify the displaying CodeText&#39;s Color. Default value: Color.Black. | [optional]
 **fontSizeMode** | **String**| Specify FontSizeMode. If FontSizeMode is set to Auto, font size will be calculated automatically based on xDimension value. It is recommended to use FontSizeMode.Auto especially in AutoSizeMode.Nearest or AutoSizeMode.Interpolation. Default value: FontSizeMode.Auto. | [optional] [enum: Auto, Manual]
 **resolution** | **Double**| Resolution of the BarCode image. One value for both dimensions. Default value: 96 dpi. | [optional]
 **resolutionX** | **Double**| DEPRECATED: Use &#39;Resolution&#39; instead. | [optional]
 **resolutionY** | **Double**| DEPRECATED: Use &#39;Resolution&#39; instead. | [optional]
 **dimensionX** | **Double**| The smallest width of the unit of BarCode bars or spaces. Increase this will increase the whole barcode image width. Ignored if AutoSizeMode property is set to AutoSizeMode.Nearest or AutoSizeMode.Interpolation. | [optional]
 **textSpace** | **Double**| Space between the CodeText and the BarCode in Unit value. Default value: 2pt. Ignored for EAN8, EAN13, UPCE, UPCA, ISBN, ISMN, ISSN, UpcaGs1DatabarCoupon. | [optional]
 **units** | **String**| Common Units for all measuring in query. Default units: pixel. | [optional] [enum: Pixel, Point, Inch, Millimeter]
 **sizeMode** | **String**| Specifies the different types of automatic sizing modes. Default value: AutoSizeMode.None. | [optional] [enum: None, Nearest, Interpolation]
 **barHeight** | **Double**| Height of the barcode in given units. Default units: pixel. | [optional]
 **imageHeight** | **Double**| Height of the barcode image in given units. Default units: pixel. | [optional]
 **imageWidth** | **Double**| Width of the barcode image in given units. Default units: pixel. | [optional]
 **rotationAngle** | **Double**| BarCode image rotation angle, measured in degree, e.g. RotationAngle &#x3D; 0 or RotationAngle &#x3D; 360 means no rotation. If RotationAngle NOT equal to 90, 180, 270 or 0, it may increase the difficulty for the scanner to read the image. Default value: 0. | [optional]
 **backColor** | **String**| Background color of the barcode image. Default value: Color.White. | [optional]
 **barColor** | **String**| Bars color. Default value: Color.Black. | [optional]
 **borderColor** | **String**| Border color. Default value: Color.Black. | [optional]
 **borderWidth** | **Double**| Border width. Default value: 0. Ignored if Visible is set to false. | [optional]
 **borderDashStyle** | **String**| Border dash style. Default value: BorderDashStyle.Solid. | [optional] [enum: Solid, Dash, Dot, DashDot, DashDotDot]
 **borderVisible** | **Boolean**| Border visibility. If false than parameter Width is always ignored (0). Default value: false. | [optional]
 **enableChecksum** | **String**| Enable checksum during generation 1D barcodes. Default is treated as Yes for symbology which must contain checksum, as No where checksum only possible. Checksum is possible: Code39 Standard/Extended, Standard2of5, Interleaved2of5, Matrix2of5, ItalianPost25, DeutschePostIdentcode, DeutschePostLeitcode, VIN, Codabar Checksum always used: Rest symbology | [optional] [enum: Default, Yes, No]
 **enableEscape** | **Boolean**| Indicates whether explains the character \&quot;\\\&quot; as an escape character in CodeText property. Used for Pdf417, DataMatrix, Code128 only If the EnableEscape is true, \&quot;\\\&quot; will be explained as a special escape character. Otherwise, \&quot;\\\&quot; acts as normal characters. Aspose.BarCode supports input decimal ascii code and mnemonic for ASCII control-code characters. For example, \\013 and \\\\CR stands for CR. | [optional]
 **filledBars** | **Boolean**| Value indicating whether bars are filled. Only for 1D barcodes. Default value: true. | [optional]
 **alwaysShowChecksum** | **Boolean**| Always display checksum digit in the human readable text for Code128 and GS1Code128 barcodes. | [optional]
 **wideNarrowRatio** | **Double**| Wide bars to Narrow bars ratio. Default value: 3, that is, wide bars are 3 times as wide as narrow bars. Used for ITF, PZN, PharmaCode, Standard2of5, Interleaved2of5, Matrix2of5, ItalianPost25, IATA2of5, VIN, DeutschePost, OPC, Code32, DataLogic2of5, PatchCode, Code39Extended, Code39Standard | [optional]
 **validateText** | **Boolean**| Only for 1D barcodes. If codetext is incorrect and value set to true - exception will be thrown. Otherwise codetext will be corrected to match barcode&#39;s specification. Exception always will be thrown for: Databar symbology if codetext is incorrect. Exception always will not be thrown for: AustraliaPost, SingaporePost, Code39Extended, Code93Extended, Code16K, Code128 symbology if codetext is incorrect. | [optional]
 **supplementData** | **String**| Supplement parameters. Used for Interleaved2of5, Standard2of5, EAN13, EAN8, UPCA, UPCE, ISBN, ISSN, ISMN. | [optional]
 **supplementSpace** | **Double**| Space between main the BarCode and supplement BarCode. | [optional]
 **barWidthReduction** | **Double**| Bars reduction value that is used to compensate ink spread while printing. | [optional]
 **format** | **String**| Result image format. | [optional]

### getBarcodeGenerate return type

**File**

## getBarcodeRecognize

> BarcodeResponseList getBarcodeRecognize(name, type, checksumValidation, detectEncoding, preset, rectX, rectY, rectWidth, rectHeight, stripFNC, timeout, medianSmoothingWindowSize, allowMedianSmoothing, allowComplexBackground, allowDatamatrixIndustrialBarcodes, allowDecreasedImage, allowDetectScanGap, allowIncorrectBarcodes, allowInvertImage, allowMicroWhiteSpotsRemoving, allowOneDFastBarcodesDetector, allowOneDWipedBarsRestoration, allowQRMicroQrRestoration, allowRegularImage, allowSaltAndPepperFiltering, allowWhiteSpotsRemoving, regionLikelihoodThresholdPercent, scanWindowSizes, similarity, skipDiagonalSearch, readTinyBarcodes, australianPostEncodingTable, rectangleRegion, storage, folder)

Recognize barcode from a file on server.

### getBarcodeRecognize example

```java
// Import classes:
import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.Configuration;
import com.aspose.barcode.cloud.auth.*;
import com.aspose.barcode.cloud.api.BarcodeApi;

public class Main {

    public static void main(String[] args) {

        ApiClient client = new ApiClient(
            "Client Id from https://dashboard.aspose.cloud/applications",
            "Client Secret from https://dashboard.aspose.cloud/applications"
        );

        BarcodeApi api = new BarcodeApi(client);
        String name = "name_example"; // String | The image file name.
        try {
            BarcodeResponseList result = api.getBarcodeRecognize(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BarcodeApi.getBarcodeRecognize");
            e.printStackTrace();
        }
    }
}
```

### getBarcodeRecognize parameters

Name | Type | Description  | Notes
---- | ---- | ------------ | -----
 **name** | **String**| The image file name. |
 **type** | **String**| The type of barcode to read. | [optional] [enum: all, AustraliaPost, Aztec, ISBN, Codabar, Code11, Code128, GS1Code128, Code39Extended, Code39Standard, Code93Extended, Code93Standard, DataMatrix, DeutschePostIdentcode, DeutschePostLeitcode, EAN13, EAN14, EAN8, IATA2of5, Interleaved2of5, ISSN, ISMN, ItalianPost25, ITF14, ITF6, MacroPdf417, Matrix2of5, MSI, OneCode, OPC, PatchCode, Pdf417, MicroPdf417, Planet, Postnet, PZN, QR, MicroQR, RM4SCC, SCC14, SSCC18, Standard2of5, Supplement, UPCA, UPCE, VIN, Pharmacode, GS1DataMatrix, DatabarOmniDirectional, DatabarTruncated, DatabarLimited, DatabarExpanded, SwissPostParcel, AustralianPosteParcel, Code16K, DatabarStackedOmniDirectional, DatabarStacked, DatabarExpandedStacked, CompactPdf417, GS1QR, MaxiCode, MicrE13B, Code32, DataLogic2of5, DotCode, DutchKIX, CodablockF]
 **checksumValidation** | **String**| Enable checksum validation during recognition for 1D barcodes. Default is treated as Yes for symbologies which must contain checksum, as No where checksum only possible. Checksum never used: Codabar Checksum is possible: Code39 Standard/Extended, Standard2of5, Interleaved2of5, Matrix2of5, ItalianPost25, DeutschePostIdentcode, DeutschePostLeitcode, VIN Checksum always used: Rest symbologies | [optional] [enum: Default, On, Off]
 **detectEncoding** | **Boolean**| A flag which force engine to detect codetext encoding for Unicode. | [optional]
 **preset** | **String**| Preset allows to configure recognition quality and speed manually. You can quickly set up Preset by embedded presets: HighPerformance, NormalQuality, HighQuality, MaxBarCodes or you can manually configure separate options. Default value of Preset is NormalQuality. | [optional] [enum: HighPerformance, NormalQuality, HighQualityDetection, MaxQualityDetection, HighQuality, MaxBarCodes]
 **rectX** | **Integer**| Set X for area for recognition. | [optional]
 **rectY** | **Integer**| Set Y for area for recognition. | [optional]
 **rectWidth** | **Integer**| Set Width of area for recognition. | [optional]
 **rectHeight** | **Integer**| Set Height of area for recognition. | [optional]
 **stripFNC** | **Boolean**| Value indicating whether FNC symbol strip must be done. | [optional]
 **timeout** | **Integer**| Timeout of recognition process. | [optional]
 **medianSmoothingWindowSize** | **Integer**| Window size for median smoothing. Typical values are 3 or 4. Default value is 3. AllowMedianSmoothing must be set. | [optional]
 **allowMedianSmoothing** | **Boolean**| Allows engine to enable median smoothing as additional scan. Mode helps to recognize noised barcodes. | [optional]
 **allowComplexBackground** | **Boolean**| Allows engine to recognize color barcodes on color background as additional scan. Extremely slow mode. | [optional]
 **allowDatamatrixIndustrialBarcodes** | **Boolean**| Allows engine for Datamatrix to recognize dashed industrial Datamatrix barcodes. Slow mode which helps only for dashed barcodes which consist from spots. | [optional]
 **allowDecreasedImage** | **Boolean**| Allows engine to recognize decreased image as additional scan. Size for decreasing is selected by internal engine algorithms. Mode helps to recognize barcodes which are noised and blurred but captured with high resolution. | [optional]
 **allowDetectScanGap** | **Boolean**| Allows engine to use gap between scans to increase recognition speed. Mode can make recognition problems with low height barcodes. | [optional]
 **allowIncorrectBarcodes** | **Boolean**| Allows engine to recognize barcodes which has incorrect checksum or incorrect values. Mode can be used to recognize damaged barcodes with incorrect text. | [optional]
 **allowInvertImage** | **Boolean**| Allows engine to recognize inverse color image as additional scan. Mode can be used when barcode is white on black background. | [optional]
 **allowMicroWhiteSpotsRemoving** | **Boolean**| Allows engine for Postal barcodes to recognize slightly noised images. Mode helps to recognize slightly damaged Postal barcodes. | [optional]
 **allowOneDFastBarcodesDetector** | **Boolean**| Allows engine for 1D barcodes to quickly recognize high quality barcodes which fill almost whole image. Mode helps to quickly recognize generated barcodes from Internet. | [optional]
 **allowOneDWipedBarsRestoration** | **Boolean**| Allows engine for 1D barcodes to recognize barcodes with single wiped/glued bars in pattern. | [optional]
 **allowQRMicroQrRestoration** | **Boolean**| Allows engine for QR/MicroQR to recognize damaged MicroQR barcodes. | [optional]
 **allowRegularImage** | **Boolean**| Allows engine to recognize regular image without any restorations as main scan. Mode to recognize image as is. | [optional]
 **allowSaltAndPepperFiltering** | **Boolean**| Allows engine to recognize barcodes with salt and pepper noise type. Mode can remove small noise with white and black dots. | [optional]
 **allowWhiteSpotsRemoving** | **Boolean**| Allows engine to recognize image without small white spots as additional scan. Mode helps to recognize noised image as well as median smoothing filtering. | [optional]
 **regionLikelihoodThresholdPercent** | **Double**| Sets threshold for detected regions that may contain barcodes. Value 0.7 means that bottom 70% of possible regions are filtered out and not processed further. Region likelihood threshold must be between [0.05, 0.9] Use high values for clear images with few barcodes. Use low values for images with many barcodes or for noisy images. Low value may lead to a bigger recognition time. | [optional]
 **scanWindowSizes** | **List&lt;Integer&gt;**| Scan window sizes in pixels. Allowed sizes are 10, 15, 20, 25, 30. Scanning with small window size takes more time and provides more accuracy but may fail in detecting very big barcodes. Combining of several window sizes can improve detection quality. | [optional]
 **similarity** | **Double**| Similarity coefficient depends on how homogeneous barcodes are. Use high value for for clear barcodes. Use low values to detect barcodes that ara partly damaged or not lighten evenly. Similarity coefficient must be between [0.5, 0.9] | [optional]
 **skipDiagonalSearch** | **Boolean**| Allows detector to skip search for diagonal barcodes. Setting it to false will increase detection time but allow to find diagonal barcodes that can be missed otherwise. Enabling of diagonal search leads to a bigger detection time. | [optional]
 **readTinyBarcodes** | **Boolean**| Allows engine to recognize tiny barcodes on large images. Ignored if AllowIncorrectBarcodes is set to True. Default value: False. | [optional]
 **australianPostEncodingTable** | **String**| Interpreting Type for the Customer Information of AustralianPost BarCode.Default is CustomerInformationInterpretingType.Other. | [optional] [enum: CTable, NTable, Other]
 **rectangleRegion** | **String**|  | [optional]
 **storage** | **String**| The image storage. | [optional]
 **folder** | **String**| The image folder. | [optional]

### getBarcodeRecognize return type

[**BarcodeResponseList**](BarcodeResponseList.md)

## postBarcodeRecognizeFromUrlOrContent

> BarcodeResponseList postBarcodeRecognizeFromUrlOrContent(type, checksumValidation, detectEncoding, preset, rectX, rectY, rectWidth, rectHeight, stripFNC, timeout, medianSmoothingWindowSize, allowMedianSmoothing, allowComplexBackground, allowDatamatrixIndustrialBarcodes, allowDecreasedImage, allowDetectScanGap, allowIncorrectBarcodes, allowInvertImage, allowMicroWhiteSpotsRemoving, allowOneDFastBarcodesDetector, allowOneDWipedBarsRestoration, allowQRMicroQrRestoration, allowRegularImage, allowSaltAndPepperFiltering, allowWhiteSpotsRemoving, regionLikelihoodThresholdPercent, scanWindowSizes, similarity, skipDiagonalSearch, readTinyBarcodes, australianPostEncodingTable, rectangleRegion, url, image)

Recognize barcode from an url or from request body. Request body can contain raw data bytes of the image or encoded with base64.

### postBarcodeRecognizeFromUrlOrContent example

```java
// Import classes:
import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.Configuration;
import com.aspose.barcode.cloud.auth.*;
import com.aspose.barcode.cloud.api.BarcodeApi;

public class Main {

    public static void main(String[] args) {

        ApiClient client = new ApiClient(
            "Client Id from https://dashboard.aspose.cloud/applications",
            "Client Secret from https://dashboard.aspose.cloud/applications"
        );

        BarcodeApi api = new BarcodeApi(client);
        try {
            BarcodeResponseList result = api.postBarcodeRecognizeFromUrlOrContent();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BarcodeApi.postBarcodeRecognizeFromUrlOrContent");
            e.printStackTrace();
        }
    }
}
```

### postBarcodeRecognizeFromUrlOrContent parameters

Name | Type | Description  | Notes
---- | ---- | ------------ | -----
 **type** | **String**| The type of barcode to read. | [optional] [enum: all, AustraliaPost, Aztec, ISBN, Codabar, Code11, Code128, GS1Code128, Code39Extended, Code39Standard, Code93Extended, Code93Standard, DataMatrix, DeutschePostIdentcode, DeutschePostLeitcode, EAN13, EAN14, EAN8, IATA2of5, Interleaved2of5, ISSN, ISMN, ItalianPost25, ITF14, ITF6, MacroPdf417, Matrix2of5, MSI, OneCode, OPC, PatchCode, Pdf417, MicroPdf417, Planet, Postnet, PZN, QR, MicroQR, RM4SCC, SCC14, SSCC18, Standard2of5, Supplement, UPCA, UPCE, VIN, Pharmacode, GS1DataMatrix, DatabarOmniDirectional, DatabarTruncated, DatabarLimited, DatabarExpanded, SwissPostParcel, AustralianPosteParcel, Code16K, DatabarStackedOmniDirectional, DatabarStacked, DatabarExpandedStacked, CompactPdf417, GS1QR, MaxiCode, MicrE13B, Code32, DataLogic2of5, DotCode, DutchKIX, CodablockF]
 **checksumValidation** | **String**| Enable checksum validation during recognition for 1D barcodes. Default is treated as Yes for symbologies which must contain checksum, as No where checksum only possible. Checksum never used: Codabar Checksum is possible: Code39 Standard/Extended, Standard2of5, Interleaved2of5, Matrix2of5, ItalianPost25, DeutschePostIdentcode, DeutschePostLeitcode, VIN Checksum always used: Rest symbologies | [optional] [enum: Default, On, Off]
 **detectEncoding** | **Boolean**| A flag which force engine to detect codetext encoding for Unicode. | [optional]
 **preset** | **String**| Preset allows to configure recognition quality and speed manually. You can quickly set up Preset by embedded presets: HighPerformance, NormalQuality, HighQuality, MaxBarCodes or you can manually configure separate options. Default value of Preset is NormalQuality. | [optional] [enum: HighPerformance, NormalQuality, HighQualityDetection, MaxQualityDetection, HighQuality, MaxBarCodes]
 **rectX** | **Integer**| Set X for area for recognition. | [optional]
 **rectY** | **Integer**| Set Y for area for recognition. | [optional]
 **rectWidth** | **Integer**| Set Width of area for recognition. | [optional]
 **rectHeight** | **Integer**| Set Height of area for recognition. | [optional]
 **stripFNC** | **Boolean**| Value indicating whether FNC symbol strip must be done. | [optional]
 **timeout** | **Integer**| Timeout of recognition process. | [optional]
 **medianSmoothingWindowSize** | **Integer**| Window size for median smoothing. Typical values are 3 or 4. Default value is 3. AllowMedianSmoothing must be set. | [optional]
 **allowMedianSmoothing** | **Boolean**| Allows engine to enable median smoothing as additional scan. Mode helps to recognize noised barcodes. | [optional]
 **allowComplexBackground** | **Boolean**| Allows engine to recognize color barcodes on color background as additional scan. Extremely slow mode. | [optional]
 **allowDatamatrixIndustrialBarcodes** | **Boolean**| Allows engine for Datamatrix to recognize dashed industrial Datamatrix barcodes. Slow mode which helps only for dashed barcodes which consist from spots. | [optional]
 **allowDecreasedImage** | **Boolean**| Allows engine to recognize decreased image as additional scan. Size for decreasing is selected by internal engine algorithms. Mode helps to recognize barcodes which are noised and blurred but captured with high resolution. | [optional]
 **allowDetectScanGap** | **Boolean**| Allows engine to use gap between scans to increase recognition speed. Mode can make recognition problems with low height barcodes. | [optional]
 **allowIncorrectBarcodes** | **Boolean**| Allows engine to recognize barcodes which has incorrect checksum or incorrect values. Mode can be used to recognize damaged barcodes with incorrect text. | [optional]
 **allowInvertImage** | **Boolean**| Allows engine to recognize inverse color image as additional scan. Mode can be used when barcode is white on black background. | [optional]
 **allowMicroWhiteSpotsRemoving** | **Boolean**| Allows engine for Postal barcodes to recognize slightly noised images. Mode helps to recognize slightly damaged Postal barcodes. | [optional]
 **allowOneDFastBarcodesDetector** | **Boolean**| Allows engine for 1D barcodes to quickly recognize high quality barcodes which fill almost whole image. Mode helps to quickly recognize generated barcodes from Internet. | [optional]
 **allowOneDWipedBarsRestoration** | **Boolean**| Allows engine for 1D barcodes to recognize barcodes with single wiped/glued bars in pattern. | [optional]
 **allowQRMicroQrRestoration** | **Boolean**| Allows engine for QR/MicroQR to recognize damaged MicroQR barcodes. | [optional]
 **allowRegularImage** | **Boolean**| Allows engine to recognize regular image without any restorations as main scan. Mode to recognize image as is. | [optional]
 **allowSaltAndPepperFiltering** | **Boolean**| Allows engine to recognize barcodes with salt and pepper noise type. Mode can remove small noise with white and black dots. | [optional]
 **allowWhiteSpotsRemoving** | **Boolean**| Allows engine to recognize image without small white spots as additional scan. Mode helps to recognize noised image as well as median smoothing filtering. | [optional]
 **regionLikelihoodThresholdPercent** | **Double**| Sets threshold for detected regions that may contain barcodes. Value 0.7 means that bottom 70% of possible regions are filtered out and not processed further. Region likelihood threshold must be between [0.05, 0.9] Use high values for clear images with few barcodes. Use low values for images with many barcodes or for noisy images. Low value may lead to a bigger recognition time. | [optional]
 **scanWindowSizes** | **List&lt;Integer&gt;**| Scan window sizes in pixels. Allowed sizes are 10, 15, 20, 25, 30. Scanning with small window size takes more time and provides more accuracy but may fail in detecting very big barcodes. Combining of several window sizes can improve detection quality. | [optional]
 **similarity** | **Double**| Similarity coefficient depends on how homogeneous barcodes are. Use high value for for clear barcodes. Use low values to detect barcodes that ara partly damaged or not lighten evenly. Similarity coefficient must be between [0.5, 0.9] | [optional]
 **skipDiagonalSearch** | **Boolean**| Allows detector to skip search for diagonal barcodes. Setting it to false will increase detection time but allow to find diagonal barcodes that can be missed otherwise. Enabling of diagonal search leads to a bigger detection time. | [optional]
 **readTinyBarcodes** | **Boolean**| Allows engine to recognize tiny barcodes on large images. Ignored if AllowIncorrectBarcodes is set to True. Default value: False. | [optional]
 **australianPostEncodingTable** | **String**| Interpreting Type for the Customer Information of AustralianPost BarCode.Default is CustomerInformationInterpretingType.Other. | [optional] [enum: CTable, NTable, Other]
 **rectangleRegion** | **String**|  | [optional]
 **url** | **String**| The image file url. | [optional]
 **image** | **File**| Image data | [optional]

### postBarcodeRecognizeFromUrlOrContent return type

[**BarcodeResponseList**](BarcodeResponseList.md)

## postGenerateMultiple

> File postGenerateMultiple(generatorParamsList, format)

Generate multiple barcodes and return in response stream

### postGenerateMultiple example

```java
// Import classes:
import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.Configuration;
import com.aspose.barcode.cloud.auth.*;
import com.aspose.barcode.cloud.api.BarcodeApi;

public class Main {

    public static void main(String[] args) {

        ApiClient client = new ApiClient(
            "Client Id from https://dashboard.aspose.cloud/applications",
            "Client Secret from https://dashboard.aspose.cloud/applications"
        );

        BarcodeApi api = new BarcodeApi(client);
        GeneratorParamsList generatorParamsList = new GeneratorParamsList(); // GeneratorParamsList | List of barcodes
        try {
            File result = api.postGenerateMultiple(generatorParamsList);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BarcodeApi.postGenerateMultiple");
            e.printStackTrace();
        }
    }
}
```

### postGenerateMultiple parameters

Name | Type | Description  | Notes
---- | ---- | ------------ | -----
 **generatorParamsList** | [**GeneratorParamsList**](GeneratorParamsList.md)| List of barcodes |
 **format** | **String**| Format to return stream in | [optional] [default to png]

### postGenerateMultiple return type

**File**

## putBarcodeGenerateFile

> ResultImageInfo putBarcodeGenerateFile(name, type, text, twoDDisplayText, textLocation, textAlignment, textColor, fontSizeMode, resolution, resolutionX, resolutionY, dimensionX, textSpace, units, sizeMode, barHeight, imageHeight, imageWidth, rotationAngle, backColor, barColor, borderColor, borderWidth, borderDashStyle, borderVisible, enableChecksum, enableEscape, filledBars, alwaysShowChecksum, wideNarrowRatio, validateText, supplementData, supplementSpace, barWidthReduction, storage, folder, format)

Generate barcode and save on server (from query params or from file with json or xml content)

### putBarcodeGenerateFile example

```java
// Import classes:
import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.Configuration;
import com.aspose.barcode.cloud.auth.*;
import com.aspose.barcode.cloud.api.BarcodeApi;

public class Main {

    public static void main(String[] args) {

        ApiClient client = new ApiClient(
            "Client Id from https://dashboard.aspose.cloud/applications",
            "Client Secret from https://dashboard.aspose.cloud/applications"
        );

        BarcodeApi api = new BarcodeApi(client);
        String name = "name_example"; // String | The image file name.
        String type = "type_example"; // String | Type of barcode to generate.
        String text = "text_example"; // String | Text to encode.
        try {
            ResultImageInfo result = api.putBarcodeGenerateFile(name, type, text);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BarcodeApi.putBarcodeGenerateFile");
            e.printStackTrace();
        }
    }
}
```

### putBarcodeGenerateFile parameters

Name | Type | Description  | Notes
---- | ---- | ------------ | -----
 **name** | **String**| The image file name. |
 **type** | **String**| Type of barcode to generate. | [enum: Codabar, Code11, Code39Standard, Code39Extended, Code93Standard, Code93Extended, Code128, GS1Code128, EAN8, EAN13, EAN14, SCC14, SSCC18, UPCA, UPCE, ISBN, ISSN, ISMN, Standard2of5, Interleaved2of5, Matrix2of5, ItalianPost25, IATA2of5, ITF14, ITF6, MSI, VIN, DeutschePostIdentcode, DeutschePostLeitcode, OPC, PZN, Code16K, Pharmacode, DataMatrix, QR, Aztec, Pdf417, MacroPdf417, AustraliaPost, Postnet, Planet, OneCode, RM4SCC, DatabarOmniDirectional, DatabarTruncated, DatabarLimited, DatabarExpanded, SingaporePost, GS1DataMatrix, AustralianPosteParcel, SwissPostParcel, PatchCode, DatabarExpandedStacked, DatabarStacked, DatabarStackedOmniDirectional, MicroPdf417, GS1QR, MaxiCode, Code32, DataLogic2of5, DotCode, DutchKIX, UpcaGs1Code128Coupon, UpcaGs1DatabarCoupon, CodablockF, GS1CodablockF]
 **text** | **String**| Text to encode. |
 **twoDDisplayText** | **String**| Text that will be displayed instead of codetext in 2D barcodes. Used for: Aztec, Pdf417, DataMatrix, QR, MaxiCode, DotCode | [optional]
 **textLocation** | **String**| Specify the displaying Text Location, set to CodeLocation.None to hide CodeText. Default value: CodeLocation.Below. | [optional] [enum: Below, Above, None]
 **textAlignment** | **String**| Text alignment. | [optional] [enum: Left, Center, Right]
 **textColor** | **String**| Specify the displaying CodeText&#39;s Color. Default value: Color.Black. | [optional]
 **fontSizeMode** | **String**| Specify FontSizeMode. If FontSizeMode is set to Auto, font size will be calculated automatically based on xDimension value. It is recommended to use FontSizeMode.Auto especially in AutoSizeMode.Nearest or AutoSizeMode.Interpolation. Default value: FontSizeMode.Auto. | [optional] [enum: Auto, Manual]
 **resolution** | **Double**| Resolution of the BarCode image. One value for both dimensions. Default value: 96 dpi. | [optional]
 **resolutionX** | **Double**| DEPRECATED: Use &#39;Resolution&#39; instead. | [optional]
 **resolutionY** | **Double**| DEPRECATED: Use &#39;Resolution&#39; instead. | [optional]
 **dimensionX** | **Double**| The smallest width of the unit of BarCode bars or spaces. Increase this will increase the whole barcode image width. Ignored if AutoSizeMode property is set to AutoSizeMode.Nearest or AutoSizeMode.Interpolation. | [optional]
 **textSpace** | **Double**| Space between the CodeText and the BarCode in Unit value. Default value: 2pt. Ignored for EAN8, EAN13, UPCE, UPCA, ISBN, ISMN, ISSN, UpcaGs1DatabarCoupon. | [optional]
 **units** | **String**| Common Units for all measuring in query. Default units: pixel. | [optional] [enum: Pixel, Point, Inch, Millimeter]
 **sizeMode** | **String**| Specifies the different types of automatic sizing modes. Default value: AutoSizeMode.None. | [optional] [enum: None, Nearest, Interpolation]
 **barHeight** | **Double**| Height of the barcode in given units. Default units: pixel. | [optional]
 **imageHeight** | **Double**| Height of the barcode image in given units. Default units: pixel. | [optional]
 **imageWidth** | **Double**| Width of the barcode image in given units. Default units: pixel. | [optional]
 **rotationAngle** | **Double**| BarCode image rotation angle, measured in degree, e.g. RotationAngle &#x3D; 0 or RotationAngle &#x3D; 360 means no rotation. If RotationAngle NOT equal to 90, 180, 270 or 0, it may increase the difficulty for the scanner to read the image. Default value: 0. | [optional]
 **backColor** | **String**| Background color of the barcode image. Default value: Color.White. | [optional]
 **barColor** | **String**| Bars color. Default value: Color.Black. | [optional]
 **borderColor** | **String**| Border color. Default value: Color.Black. | [optional]
 **borderWidth** | **Double**| Border width. Default value: 0. Ignored if Visible is set to false. | [optional]
 **borderDashStyle** | **String**| Border dash style. Default value: BorderDashStyle.Solid. | [optional] [enum: Solid, Dash, Dot, DashDot, DashDotDot]
 **borderVisible** | **Boolean**| Border visibility. If false than parameter Width is always ignored (0). Default value: false. | [optional]
 **enableChecksum** | **String**| Enable checksum during generation 1D barcodes. Default is treated as Yes for symbology which must contain checksum, as No where checksum only possible. Checksum is possible: Code39 Standard/Extended, Standard2of5, Interleaved2of5, Matrix2of5, ItalianPost25, DeutschePostIdentcode, DeutschePostLeitcode, VIN, Codabar Checksum always used: Rest symbology | [optional] [enum: Default, Yes, No]
 **enableEscape** | **Boolean**| Indicates whether explains the character \&quot;\\\&quot; as an escape character in CodeText property. Used for Pdf417, DataMatrix, Code128 only If the EnableEscape is true, \&quot;\\\&quot; will be explained as a special escape character. Otherwise, \&quot;\\\&quot; acts as normal characters. Aspose.BarCode supports input decimal ascii code and mnemonic for ASCII control-code characters. For example, \\013 and \\\\CR stands for CR. | [optional]
 **filledBars** | **Boolean**| Value indicating whether bars are filled. Only for 1D barcodes. Default value: true. | [optional]
 **alwaysShowChecksum** | **Boolean**| Always display checksum digit in the human readable text for Code128 and GS1Code128 barcodes. | [optional]
 **wideNarrowRatio** | **Double**| Wide bars to Narrow bars ratio. Default value: 3, that is, wide bars are 3 times as wide as narrow bars. Used for ITF, PZN, PharmaCode, Standard2of5, Interleaved2of5, Matrix2of5, ItalianPost25, IATA2of5, VIN, DeutschePost, OPC, Code32, DataLogic2of5, PatchCode, Code39Extended, Code39Standard | [optional]
 **validateText** | **Boolean**| Only for 1D barcodes. If codetext is incorrect and value set to true - exception will be thrown. Otherwise codetext will be corrected to match barcode&#39;s specification. Exception always will be thrown for: Databar symbology if codetext is incorrect. Exception always will not be thrown for: AustraliaPost, SingaporePost, Code39Extended, Code93Extended, Code16K, Code128 symbology if codetext is incorrect. | [optional]
 **supplementData** | **String**| Supplement parameters. Used for Interleaved2of5, Standard2of5, EAN13, EAN8, UPCA, UPCE, ISBN, ISSN, ISMN. | [optional]
 **supplementSpace** | **Double**| Space between main the BarCode and supplement BarCode. | [optional]
 **barWidthReduction** | **Double**| Bars reduction value that is used to compensate ink spread while printing. | [optional]
 **storage** | **String**| Image&#39;s storage. | [optional]
 **folder** | **String**| Image&#39;s folder. | [optional]
 **format** | **String**| The image format. | [optional]

### putBarcodeGenerateFile return type

[**ResultImageInfo**](ResultImageInfo.md)

## putBarcodeRecognizeFromBody

> BarcodeResponseList putBarcodeRecognizeFromBody(name, readerParams, type, storage, folder)

Recognition of a barcode from file on server with parameters in body.

### putBarcodeRecognizeFromBody example

```java
// Import classes:
import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.Configuration;
import com.aspose.barcode.cloud.auth.*;
import com.aspose.barcode.cloud.api.BarcodeApi;

public class Main {

    public static void main(String[] args) {

        ApiClient client = new ApiClient(
            "Client Id from https://dashboard.aspose.cloud/applications",
            "Client Secret from https://dashboard.aspose.cloud/applications"
        );

        BarcodeApi api = new BarcodeApi(client);
        String name = "name_example"; // String | The image file name.
        ReaderParams readerParams = new ReaderParams(); // ReaderParams | BarcodeReader object with parameters.
        try {
            BarcodeResponseList result = api.putBarcodeRecognizeFromBody(name, readerParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BarcodeApi.putBarcodeRecognizeFromBody");
            e.printStackTrace();
        }
    }
}
```

### putBarcodeRecognizeFromBody parameters

Name | Type | Description  | Notes
---- | ---- | ------------ | -----
 **name** | **String**| The image file name. |
 **readerParams** | [**ReaderParams**](ReaderParams.md)| BarcodeReader object with parameters. |
 **type** | **String**|  | [optional] [enum: all, AustraliaPost, Aztec, ISBN, Codabar, Code11, Code128, GS1Code128, Code39Extended, Code39Standard, Code93Extended, Code93Standard, DataMatrix, DeutschePostIdentcode, DeutschePostLeitcode, EAN13, EAN14, EAN8, IATA2of5, Interleaved2of5, ISSN, ISMN, ItalianPost25, ITF14, ITF6, MacroPdf417, Matrix2of5, MSI, OneCode, OPC, PatchCode, Pdf417, MicroPdf417, Planet, Postnet, PZN, QR, MicroQR, RM4SCC, SCC14, SSCC18, Standard2of5, Supplement, UPCA, UPCE, VIN, Pharmacode, GS1DataMatrix, DatabarOmniDirectional, DatabarTruncated, DatabarLimited, DatabarExpanded, SwissPostParcel, AustralianPosteParcel, Code16K, DatabarStackedOmniDirectional, DatabarStacked, DatabarExpandedStacked, CompactPdf417, GS1QR, MaxiCode, MicrE13B, Code32, DataLogic2of5, DotCode, DutchKIX, CodablockF]
 **storage** | **String**| The storage name | [optional]
 **folder** | **String**| The image folder. | [optional]

### putBarcodeRecognizeFromBody return type

[**BarcodeResponseList**](BarcodeResponseList.md)

## putGenerateMultiple

> ResultImageInfo putGenerateMultiple(name, generatorParamsList, format, folder, storage)

Generate image with multiple barcodes and put new file on server

### putGenerateMultiple example

```java
// Import classes:
import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.Configuration;
import com.aspose.barcode.cloud.auth.*;
import com.aspose.barcode.cloud.api.BarcodeApi;

public class Main {

    public static void main(String[] args) {

        ApiClient client = new ApiClient(
            "Client Id from https://dashboard.aspose.cloud/applications",
            "Client Secret from https://dashboard.aspose.cloud/applications"
        );

        BarcodeApi api = new BarcodeApi(client);
        String name = "name_example"; // String | New filename
        GeneratorParamsList generatorParamsList = new GeneratorParamsList(); // GeneratorParamsList | List of barcodes
        try {
            ResultImageInfo result = api.putGenerateMultiple(name, generatorParamsList);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BarcodeApi.putGenerateMultiple");
            e.printStackTrace();
        }
    }
}
```

### putGenerateMultiple parameters

Name | Type | Description  | Notes
---- | ---- | ------------ | -----
 **name** | **String**| New filename |
 **generatorParamsList** | [**GeneratorParamsList**](GeneratorParamsList.md)| List of barcodes |
 **format** | **String**| Format of file | [optional] [default to png]
 **folder** | **String**| Folder to place file to | [optional]
 **storage** | **String**| The storage name | [optional]

### putGenerateMultiple return type

[**ResultImageInfo**](ResultImageInfo.md)

