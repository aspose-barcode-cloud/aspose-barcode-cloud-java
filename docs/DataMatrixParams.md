
# DataMatrixParams

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aspectRatio** | **Double** | Height/Width ratio of 2D BarCode module |  [optional]
**textEncoding** | **String** | Encoding of codetext. |  [optional]
**columns** | **Integer** | Columns count. |  [optional]
**dataMatrixEcc** | [**DataMatrixEccType**](DataMatrixEccType.md) | Datamatrix ECC type. Default value: DataMatrixEccType.Ecc200. |  [optional]
**dataMatrixEncodeMode** | [**DataMatrixEncodeMode**](DataMatrixEncodeMode.md) | Encode mode of Datamatrix barcode. Default value: DataMatrixEncodeMode.Auto. |  [optional]
**rows** | **Integer** | Rows count. |  [optional]
**macroCharacters** | [**MacroCharacter**](MacroCharacter.md) | Macro Characters 05 and 06 values are used to obtain more compact encoding in special modes. Can be used only with DataMatrixEccType.Ecc200 or DataMatrixEccType.EccAuto. Cannot be used with EncodeTypes.GS1DataMatrix Default value: MacroCharacters.None. |  [optional]



