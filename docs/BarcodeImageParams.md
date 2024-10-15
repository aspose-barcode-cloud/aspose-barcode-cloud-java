

# BarcodeImageParams

Barcode image optional parameters

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**imageFormat** | **AvailableBarCodeImageFormat** |  |  [optional] |
|**twoDDisplayText** | **String** | Text that will be displayed instead of codetext in 2D barcodes.  Used for: Aztec, Pdf417, DataMatrix, QR, MaxiCode, DotCode |  [optional] |
|**textLocation** | **CodeLocation** |  |  [optional] |
|**textAlignment** | **TextAlignment** |  |  [optional] |
|**foregroundColor** | **String** | Specify the displaying bars and content Color.   Value: Color name from https://reference.aspose.com/drawing/net/system.drawing/color/ or ARGB value started with #.   For example: AliceBlue or #FF000000  Default value: Black. |  [optional] |
|**backgroundColor** | **String** | Background color of the barcode image.  Value: Color name from https://reference.aspose.com/drawing/net/system.drawing/color/ or ARGB value started with #.   For example: AliceBlue or #FF000000  Default value: White. |  [optional] |
|**units** | **AvailableGraphicsUnit** |  |  [optional] |
|**resolution** | **Float** | Resolution of the BarCode image.  One value for both dimensions.  Default value: 96 dpi. |  [optional] |
|**imageHeight** | **Float** | Height of the barcode image in given units. Default units: pixel. |  [optional] |
|**imageWidth** | **Float** | Width of the barcode image in given units. Default units: pixel. |  [optional] |
|**rotationAngle** | **Integer** | BarCode image rotation angle, measured in degree, e.g. RotationAngle &#x3D; 0 or RotationAngle &#x3D; 360 means no rotation.  If RotationAngle NOT equal to 90, 180, 270 or 0, it may increase the difficulty for the scanner to read the image.  Default value: 0. |  [optional] |



