# Aspose.BarCode Cloud SDK for Java

[![License](https://img.shields.io/github/license/aspose-barcode-cloud/aspose-barcode-cloud-java)](LICENSE)
[![Java CI with Maven](https://github.com/aspose-barcode-cloud/aspose-barcode-cloud-java/actions/workflows/maven.yml/badge.svg?branch=main)](https://github.com/aspose-barcode-cloud/aspose-barcode-cloud-java/actions/workflows/maven.yml)
[![Maven metadata URL](https://img.shields.io/maven-metadata/v?metadataUrl=https%3A%2F%2Freleases.aspose.cloud%2Fjava%2Frepo%2Fcom%2Faspose%2Faspose-barcode-cloud%2Fmaven-metadata.xml)](https://releases.aspose.cloud/java/repo/com/aspose/aspose-barcode-cloud/)

- API version: 4.0
- SDK version: 24.7.0

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
  <version>24.7.0</version>
  <scope>compile</scope>
</dependency>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/aspose-barcode-cloud-24.7.0.jar`
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

All URIs are relative to *<https://barcode.qa.aspose.cloud/v4.0>*

Class | Method | HTTP request | Description
----- | ------ | ------------ | -----------
*GenerateApi* | [**barcodeGenerateBarcodeTypeGet**](docs/GenerateApi.md#barcodeGenerateBarcodeTypeGet) | **GET** /barcode/generate/{barcodeType} | Generate barcode using GET request with parameters in route and query string.
*GenerateApi* | [**barcodeGenerateBodyPost**](docs/GenerateApi.md#barcodeGenerateBodyPost) | **POST** /barcode/generate-body | Generate barcode using POST request with parameters in body in json or xml format.
*GenerateApi* | [**barcodeGenerateFormPost**](docs/GenerateApi.md#barcodeGenerateFormPost) | **POST** /barcode/generate-form | Generate barcode using POST request with parameters in url ecncoded form.
*RecognizeApi* | [**barcodeRecognizeBarcodeTypeGet**](docs/RecognizeApi.md#barcodeRecognizeBarcodeTypeGet) | **GET** /barcode/recognize/{barcodeType} | Recognize barcode from file on server using GET requests with parameters in route and query string.
*RecognizeApi* | [**barcodeRecognizeBodyPost**](docs/RecognizeApi.md#barcodeRecognizeBodyPost) | **POST** /barcode/recognize-body | Recognize barcode from file in request body using POST requests with parameters in body in json or xml format.
*RecognizeApi* | [**barcodeRecognizeFormPost**](docs/RecognizeApi.md#barcodeRecognizeFormPost) | **POST** /barcode/recognize-form | Recognize barcode from file in request body using POST requests with parameters in multipart form.
*ScanApi* | [**barcodeScanBodyPost**](docs/ScanApi.md#barcodeScanBodyPost) | **POST** /barcode/scan-body | Scan barcode from file in request body using POST requests with parameter in body in json or xml format.
*ScanApi* | [**barcodeScanFormPost**](docs/ScanApi.md#barcodeScanFormPost) | **POST** /barcode/scan-form | Scan barcode from file in request body using POST requests with parameter in multipart form.
*ScanApi* | [**barcodeScanGet**](docs/ScanApi.md#barcodeScanGet) | **GET** /barcode/scan | Scan barcode from file on server using GET requests with parameter in query string.

## Documentation for Models

- [ApiError](docs/ApiError.md)
- [ApiErrorResponse](docs/ApiErrorResponse.md)
- [AvailableBarCodeImageFormat](docs/AvailableBarCodeImageFormat.md)
- [AvailableGraphicsUnit](docs/AvailableGraphicsUnit.md)
- [BarcodeImageParams](docs/BarcodeImageParams.md)
- [BarcodeResponse](docs/BarcodeResponse.md)
- [BarcodeResponseList](docs/BarcodeResponseList.md)
- [CodeLocation](docs/CodeLocation.md)
- [DecodeBarcodeType](docs/DecodeBarcodeType.md)
- [EncodeBarcodeType](docs/EncodeBarcodeType.md)
- [EncodeData](docs/EncodeData.md)
- [EncodeDataType](docs/EncodeDataType.md)
- [GenerateParams](docs/GenerateParams.md)
- [RecognitionImageKind](docs/RecognitionImageKind.md)
- [RecognitionMode](docs/RecognitionMode.md)
- [RecognizeBase64Request](docs/RecognizeBase64Request.md)
- [RegionPoint](docs/RegionPoint.md)
- [ScanBase64Request](docs/ScanBase64Request.md)
- [TextAlignment](docs/TextAlignment.md)

## Documentation for Authorization

Authentication schemes defined for the API:

### JWT

- **Type**: OAuth
- **Flow**: application

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

