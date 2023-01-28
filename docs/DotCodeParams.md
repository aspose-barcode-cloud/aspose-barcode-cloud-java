
# DotCodeParams

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aspectRatio** | **Double** | Height/Width ratio of 2D BarCode module. |  [optional]
**columns** | **Integer** | Identifies columns count. Sum of the number of rows plus the number of columns of a DotCode symbol must be odd. Number of columns must be at least 5. |  [optional]
**encodeMode** | [**DotCodeEncodeMode**](DotCodeEncodeMode.md) | Identifies DotCode encode mode. Default value: Auto. |  [optional]
**ecIEncoding** | [**ECIEncodings**](ECIEncodings.md) | Identifies ECI encoding. Used when DotCodeEncodeMode is Auto. Default value: ISO-8859-1. |  [optional]
**isReaderInitialization** | **Boolean** | Indicates whether code is used for instruct reader to interpret the following data as instructions for initialization or reprogramming of the bar code reader. Default value is false. |  [optional]
**rows** | **Integer** | Identifies rows count. Sum of the number of rows plus the number of columns of a DotCode symbol must be odd. Number of rows must be at least 5. |  [optional]



