
# Pdf417Params

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aspectRatio** | **Double** | Height/Width ratio of 2D BarCode module. |  [optional]
**textEncoding** | **String** | Encoding of codetext. |  [optional]
**columns** | **Integer** | Columns count. |  [optional]
**compactionMode** | [**Pdf417CompactionMode**](Pdf417CompactionMode.md) | Pdf417 symbology type of BarCode&#39;s compaction mode. Default value: Pdf417CompactionMode.Auto. |  [optional]
**errorLevel** | [**Pdf417ErrorLevel**](Pdf417ErrorLevel.md) | Pdf417 symbology type of BarCode&#39;s error correction level ranging from level0 to level8, level0 means no error correction info, level8 means best error correction which means a larger picture. |  [optional]
**macroFileID** | **Integer** | Macro Pdf417 barcode&#39;s file ID. Used for MacroPdf417. |  [optional]
**macroSegmentID** | **Integer** | Macro Pdf417 barcode&#39;s segment ID, which starts from 0, to MacroSegmentsCount - 1. |  [optional]
**macroSegmentsCount** | **Integer** | Macro Pdf417 barcode segments count. |  [optional]
**rows** | **Integer** | Rows count. |  [optional]
**truncate** | **Boolean** | Whether Pdf417 symbology type of BarCode is truncated (to reduce space). |  [optional]



