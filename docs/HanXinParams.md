
# HanXinParams

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**encodeMode** | [**HanXinEncodeMode**](HanXinEncodeMode.md) | Encoding mode for XanXin barcodes. Default value: HanXinEncodeMode.Auto. |  [optional]
**errorLevel** | [**HanXinErrorLevel**](HanXinErrorLevel.md) | Allowed Han Xin error correction levels from L1 to L4. Default value: HanXinErrorLevel.L1. |  [optional]
**version** | [**HanXinVersion**](HanXinVersion.md) | Allowed Han Xin versions, Auto and Version01 - Version84. Default value: HanXinVersion.Auto. |  [optional]
**ecIEncoding** | [**ECIEncodings**](ECIEncodings.md) | Extended Channel Interpretation Identifiers. It is used to tell the barcode reader details about the used references for encoding the data in the symbol. Current implementation consists all well known charset encodings. Default value: ECIEncodings.ISO_8859_1 |  [optional]



