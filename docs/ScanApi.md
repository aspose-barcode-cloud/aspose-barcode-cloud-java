# ScanApi

All URIs are relative to *<https://api.aspose.cloud/v4.0>*

Method | HTTP request | Description
------ | ------------ | -----------
[**scan**](ScanApi.md#scan) | **GET** /barcode/scan | Scan barcode from file on server using GET requests with parameter in query string.
[**scanBase64**](ScanApi.md#scanBase64) | **POST** /barcode/scan-body | Scan barcode from file in request body using POST requests with parameter in body in json or xml format.
[**scanMultipart**](ScanApi.md#scanMultipart) | **POST** /barcode/scan-multipart | Scan barcode from file in request body using POST requests with parameter in multipart form.

## scan

> BarcodeResponseList scan(fileUrl)

Scan barcode from file on server using GET requests with parameter in query string.


### scan parameters

Name | Type | Description  | Notes
---- | ---- | ------------ | -----
 **fileUrl** | **URI**| Url to barcode image |

### scan return type

[**BarcodeResponseList**](BarcodeResponseList.md)

## scanBase64

> BarcodeResponseList scanBase64(scanBase64Request)

Scan barcode from file in request body using POST requests with parameter in body in json or xml format.


### scanBase64 parameters

Name | Type | Description  | Notes
---- | ---- | ------------ | -----
 **scanBase64Request** | [**ScanBase64Request**](ScanBase64Request.md)| Barcode scan request |

### scanBase64 return type

[**BarcodeResponseList**](BarcodeResponseList.md)

## scanMultipart

> BarcodeResponseList scanMultipart(_file)

Scan barcode from file in request body using POST requests with parameter in multipart form.


### scanMultipart parameters

Name | Type | Description  | Notes
---- | ---- | ------------ | -----
 **_file** | **File**| Barcode image file |

### scanMultipart return type

[**BarcodeResponseList**](BarcodeResponseList.md)

