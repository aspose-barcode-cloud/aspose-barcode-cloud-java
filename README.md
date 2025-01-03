# Aspose.BarCode Cloud SDK for Java

[![License](https://img.shields.io/github/license/aspose-barcode-cloud/aspose-barcode-cloud-java)](LICENSE)
[![Java CI with Maven](https://github.com/aspose-barcode-cloud/aspose-barcode-cloud-java/actions/workflows/maven.yml/badge.svg?branch=main)](https://github.com/aspose-barcode-cloud/aspose-barcode-cloud-java/actions/workflows/maven.yml)
[![Maven metadata URL](https://img.shields.io/maven-metadata/v?metadataUrl=https%3A%2F%2Freleases.aspose.cloud%2Fjava%2Frepo%2Fcom%2Faspose%2Faspose-barcode-cloud%2Fmaven-metadata.xml)](https://releases.aspose.cloud/java/repo/com/aspose/aspose-barcode-cloud/)

- API version: 3.0
- SDK version: 24.12.0

## Demo applications

[Scan QR](https://products.aspose.app/barcode/scanqr) | [Generate Barcode](https://products.aspose.app/barcode/generate) | [Recognize Barcode](https://products.aspose.app/barcode/recognize)
:---: | :---: | :---:
[![ScanQR](https://products.aspose.app/barcode/scanqr/img/aspose_scanqr-app-48.png)](https://products.aspose.app/barcode/scanqr) | [![Generate](https://products.aspose.app/barcode/generate/img/aspose_generate-app-48.png)](https://products.aspose.app/barcode/generate) | [![Recognize](https://products.aspose.app/barcode/recognize/img/aspose_recognize-app-48.png)](https://products.aspose.app/barcode/recognize)
[**Generate Wi-Fi QR**](https://products.aspose.app/barcode/wifi-qr) | [**Embed Barcode**](https://products.aspose.app/barcode/embed) | [**Scan Barcode**](https://products.aspose.app/barcode/scan)
[![Wi-FiQR](https://products.aspose.app/barcode/embed/img/aspose_wifi-qr-app-48.png)](https://products.aspose.app/barcode/wifi-qr) | [![Embed](https://products.aspose.app/barcode/embed/img/aspose_embed-app-48.png)](https://products.aspose.app/barcode/embed) | [![Scan](https://products.aspose.app/barcode/embed/img/aspose_scan-app-48.png)](https://products.aspose.app/barcode/scan)

[Aspose.BarCode for Cloud](https://products.aspose.cloud/barcode/) is a REST API for Linear, 2D and postal barcode generation and recognition in the cloud. API recognizes and generates barcode images in a variety of formats. Barcode REST API allows to specify barcode image attributes like image width, height, border style and output image format in order to customize the generation process. Developers can also specify the barcode type and text attributes such as text location and font styles in order to suit the application requirements.

This repository contains Aspose.BarCode Cloud SDK for Java source code. This SDK allows you to work with Aspose.BarCode for Cloud REST APIs in your Java applications quickly and easily.

## Requirements

Building the API client library requires:

1. Java 8 (JDK 1.8)
2. Maven

## Prerequisites

To use Aspose.BarCode Cloud SDK for Java you need to register an account with [Aspose Cloud](https://www.aspose.cloud) and lookup/create Client Id and Client Secret at [Cloud Dashboard](https://dashboard.aspose.cloud/applications). There is free quota available. For more details, see [Aspose Cloud Pricing](https://purchase.aspose.cloud/).

## Installation

### Install Aspose.BarCode-Cloud from Maven

Add Aspose Cloud repository to your application pom.xml

```xml
<repository>
    <id>aspose-cloud</id>
    <name>Aspose Cloud Repository</name>
    <url>https://releases.aspose.cloud/java/repo/</url>
</repository>
```

### Install from source

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.aspose</groupId>
  <artifactId>aspose-barcode-cloud</artifactId>
  <version>24.12.0</version>
  <scope>compile</scope>
</dependency>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/aspose-barcode-cloud-24.12.0.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
package com.aspose.barcode.cloud.examples;

import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.api.BarcodeApi;
import com.aspose.barcode.cloud.model.BarcodeResponseList;
import com.aspose.barcode.cloud.model.DecodeBarcodeType;
import com.aspose.barcode.cloud.model.EncodeBarcodeType;
import com.aspose.barcode.cloud.requests.GetBarcodeGenerateRequest;
import com.aspose.barcode.cloud.requests.ScanBarcodeRequest;

import java.io.File;
import java.util.Collections;

public class Example {
    public static void main(String[] args) {
        ApiClient client =
                new ApiClient(
                        "Client Id from https://dashboard.aspose.cloud/applications",
                        "Client Secret from https://dashboard.aspose.cloud/applications");
        client.setReadTimeout(5 * 60 * 1000);

        BarcodeApi api = new BarcodeApi(client);

        try {
            System.out.println("Generating barcode...");
            File barcodeImage = generateBarcode(api);
            System.out.println("Barcode image saved to file " + barcodeImage.getAbsolutePath());

            System.out.println("Recognizing barcode on image...");
            BarcodeResponseList recognized = scanBarcode(api, barcodeImage);
            System.out.print("Barcode on image:");
            System.out.println(recognized.toString());
        } catch (ApiException e) {
            System.err.println("Error");
            e.printStackTrace();
        }
    }

    private static File generateBarcode(BarcodeApi api) throws ApiException {
        String type = EncodeBarcodeType.QR.toString();
        String text = "Aspose.BarCode for Cloud Sample";
        GetBarcodeGenerateRequest request = new GetBarcodeGenerateRequest(type, text);
        request.textLocation = "None";

        return api.getBarcodeGenerate(request);
    }

    private static BarcodeResponseList scanBarcode(BarcodeApi api, File barcodeImage)
            throws ApiException {
        ScanBarcodeRequest request = new ScanBarcodeRequest(barcodeImage);
        request.decodeTypes = Collections.singletonList(DecodeBarcodeType.QR);

        return api.scanBarcode(request);
    }
}

```

## Licensing

All Aspose.BarCode for Cloud SDKs, helper scripts and templates are licensed under [MIT License](LICENSE).

## Resources

- [**Website**](https://www.aspose.cloud)
- [**Product Home**](https://products.aspose.cloud/barcode/)
- [**Documentation**](https://docs.aspose.cloud/barcode/)
- [**Free Support Forum**](https://forum.aspose.cloud/c/barcode)
- [**Paid Support Helpdesk**](https://helpdesk.aspose.cloud/)
- [**Blog**](https://blog.aspose.cloud/categories/aspose.barcode-cloud-product-family/)

## Documentation for API Endpoints

All URIs are relative to *<https://api.aspose.cloud/v3.0>*

Class | Method | HTTP request | Description
----- | ------ | ------------ | -----------
*BarcodeApi* | [**getBarcodeGenerate**](docs/BarcodeApi.md#getBarcodeGenerate) | **GET** /barcode/generate | Generate barcode.
*BarcodeApi* | [**getBarcodeRecognize**](docs/BarcodeApi.md#getBarcodeRecognize) | **GET** /barcode/{name}/recognize | Recognize barcode from a file on server.
*BarcodeApi* | [**postBarcodeRecognizeFromUrlOrContent**](docs/BarcodeApi.md#postBarcodeRecognizeFromUrlOrContent) | **POST** /barcode/recognize | Recognize barcode from an url or from request body. Request body can contain raw data bytes of the image with content-type \&quot;application/octet-stream\&quot;. An image can also be passed as a form field.
*BarcodeApi* | [**postGenerateMultiple**](docs/BarcodeApi.md#postGenerateMultiple) | **POST** /barcode/generateMultiple | Generate multiple barcodes and return in response stream
*BarcodeApi* | [**putBarcodeGenerateFile**](docs/BarcodeApi.md#putBarcodeGenerateFile) | **PUT** /barcode/{name}/generate | Generate barcode and save on server (from query params or from file with json or xml content)
*BarcodeApi* | [**putBarcodeRecognizeFromBody**](docs/BarcodeApi.md#putBarcodeRecognizeFromBody) | **PUT** /barcode/{name}/recognize | Recognition of a barcode from file on server with parameters in body.
*BarcodeApi* | [**putGenerateMultiple**](docs/BarcodeApi.md#putGenerateMultiple) | **PUT** /barcode/{name}/generateMultiple | Generate image with multiple barcodes and put new file on server
*BarcodeApi* | [**scanBarcode**](docs/BarcodeApi.md#scanBarcode) | **POST** /barcode/scan | Quickly scan a barcode from an image.
*FileApi* | [**copyFile**](docs/FileApi.md#copyFile) | **PUT** /barcode/storage/file/copy/{srcPath} | Copy file
*FileApi* | [**deleteFile**](docs/FileApi.md#deleteFile) | **DELETE** /barcode/storage/file/{path} | Delete file
*FileApi* | [**downloadFile**](docs/FileApi.md#downloadFile) | **GET** /barcode/storage/file/{path} | Download file
*FileApi* | [**moveFile**](docs/FileApi.md#moveFile) | **PUT** /barcode/storage/file/move/{srcPath} | Move file
*FileApi* | [**uploadFile**](docs/FileApi.md#uploadFile) | **PUT** /barcode/storage/file/{path} | Upload file
*FolderApi* | [**copyFolder**](docs/FolderApi.md#copyFolder) | **PUT** /barcode/storage/folder/copy/{srcPath} | Copy folder
*FolderApi* | [**createFolder**](docs/FolderApi.md#createFolder) | **PUT** /barcode/storage/folder/{path} | Create the folder
*FolderApi* | [**deleteFolder**](docs/FolderApi.md#deleteFolder) | **DELETE** /barcode/storage/folder/{path} | Delete folder
*FolderApi* | [**getFilesList**](docs/FolderApi.md#getFilesList) | **GET** /barcode/storage/folder/{path} | Get all files and folders within a folder
*FolderApi* | [**moveFolder**](docs/FolderApi.md#moveFolder) | **PUT** /barcode/storage/folder/move/{srcPath} | Move folder
*StorageApi* | [**getDiscUsage**](docs/StorageApi.md#getDiscUsage) | **GET** /barcode/storage/disc | Get disc usage
*StorageApi* | [**getFileVersions**](docs/StorageApi.md#getFileVersions) | **GET** /barcode/storage/version/{path} | Get file versions
*StorageApi* | [**objectExists**](docs/StorageApi.md#objectExists) | **GET** /barcode/storage/exist/{path} | Check if file or folder exists
*StorageApi* | [**storageExists**](docs/StorageApi.md#storageExists) | **GET** /barcode/storage/{storageName}/exist | Check if storage exists

## Documentation for Models

- [ApiError](docs/ApiError.md)
- [ApiErrorResponse](docs/ApiErrorResponse.md)
- [AustralianPostParams](docs/AustralianPostParams.md)
- [AutoSizeMode](docs/AutoSizeMode.md)
- [AvailableGraphicsUnit](docs/AvailableGraphicsUnit.md)
- [AztecEncodeMode](docs/AztecEncodeMode.md)
- [AztecParams](docs/AztecParams.md)
- [AztecSymbolMode](docs/AztecSymbolMode.md)
- [BarcodeResponse](docs/BarcodeResponse.md)
- [BarcodeResponseList](docs/BarcodeResponseList.md)
- [BorderDashStyle](docs/BorderDashStyle.md)
- [CaptionParams](docs/CaptionParams.md)
- [ChecksumValidation](docs/ChecksumValidation.md)
- [CodabarChecksumMode](docs/CodabarChecksumMode.md)
- [CodabarParams](docs/CodabarParams.md)
- [CodabarSymbol](docs/CodabarSymbol.md)
- [CodablockParams](docs/CodablockParams.md)
- [Code128Emulation](docs/Code128Emulation.md)
- [Code128EncodeMode](docs/Code128EncodeMode.md)
- [Code128Params](docs/Code128Params.md)
- [Code16KParams](docs/Code16KParams.md)
- [CodeLocation](docs/CodeLocation.md)
- [CouponParams](docs/CouponParams.md)
- [CustomerInformationInterpretingType](docs/CustomerInformationInterpretingType.md)
- [DataBarParams](docs/DataBarParams.md)
- [DataMatrixEccType](docs/DataMatrixEccType.md)
- [DataMatrixEncodeMode](docs/DataMatrixEncodeMode.md)
- [DataMatrixParams](docs/DataMatrixParams.md)
- [DataMatrixVersion](docs/DataMatrixVersion.md)
- [DecodeBarcodeType](docs/DecodeBarcodeType.md)
- [DiscUsage](docs/DiscUsage.md)
- [DotCodeEncodeMode](docs/DotCodeEncodeMode.md)
- [DotCodeParams](docs/DotCodeParams.md)
- [ECIEncodings](docs/ECIEncodings.md)
- [EnableChecksum](docs/EnableChecksum.md)
- [EncodeBarcodeType](docs/EncodeBarcodeType.md)
- [Error](docs/Error.md)
- [ErrorDetails](docs/ErrorDetails.md)
- [FileVersions](docs/FileVersions.md)
- [FilesList](docs/FilesList.md)
- [FilesUploadResult](docs/FilesUploadResult.md)
- [FontMode](docs/FontMode.md)
- [FontParams](docs/FontParams.md)
- [FontStyle](docs/FontStyle.md)
- [GeneratorParams](docs/GeneratorParams.md)
- [GeneratorParamsList](docs/GeneratorParamsList.md)
- [HanXinEncodeMode](docs/HanXinEncodeMode.md)
- [HanXinErrorLevel](docs/HanXinErrorLevel.md)
- [HanXinParams](docs/HanXinParams.md)
- [HanXinVersion](docs/HanXinVersion.md)
- [ITF14BorderType](docs/ITF14BorderType.md)
- [ITFParams](docs/ITFParams.md)
- [MacroCharacter](docs/MacroCharacter.md)
- [MaxiCodeEncodeMode](docs/MaxiCodeEncodeMode.md)
- [MaxiCodeMode](docs/MaxiCodeMode.md)
- [MaxiCodeParams](docs/MaxiCodeParams.md)
- [ObjectExist](docs/ObjectExist.md)
- [Padding](docs/Padding.md)
- [PatchCodeParams](docs/PatchCodeParams.md)
- [PatchFormat](docs/PatchFormat.md)
- [Pdf417CompactionMode](docs/Pdf417CompactionMode.md)
- [Pdf417ErrorLevel](docs/Pdf417ErrorLevel.md)
- [Pdf417MacroTerminator](docs/Pdf417MacroTerminator.md)
- [Pdf417Params](docs/Pdf417Params.md)
- [PostalParams](docs/PostalParams.md)
- [PresetType](docs/PresetType.md)
- [QREncodeMode](docs/QREncodeMode.md)
- [QREncodeType](docs/QREncodeType.md)
- [QRErrorLevel](docs/QRErrorLevel.md)
- [QRVersion](docs/QRVersion.md)
- [QrParams](docs/QrParams.md)
- [ReaderParams](docs/ReaderParams.md)
- [RegionPoint](docs/RegionPoint.md)
- [ResultImageInfo](docs/ResultImageInfo.md)
- [StorageExist](docs/StorageExist.md)
- [StorageFile](docs/StorageFile.md)
- [StructuredAppend](docs/StructuredAppend.md)
- [TextAlignment](docs/TextAlignment.md)
- [FileVersion](docs/FileVersion.md)

## Documentation for Authorization

Authentication schemes defined for the API:

### JWT

- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: <https://api.aspose.cloud/connect/token>

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

