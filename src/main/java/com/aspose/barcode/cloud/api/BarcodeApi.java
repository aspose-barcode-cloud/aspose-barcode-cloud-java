// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="BarcodeApi.java">
//   Copyright (c) 2022 Aspose.BarCode for Cloud
// </copyright>
// <summary>
//   Permission is hereby granted, free of charge, to any person obtaining a copy
//  of this software and associated documentation files (the "Software"), to deal
//  in the Software without restriction, including without limitation the rights
//  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
//  copies of the Software, and to permit persons to whom the Software is
//  furnished to do so, subject to the following conditions:
//
//  The above copyright notice and this permission notice shall be included in all
//  copies or substantial portions of the Software.
//
//  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
//  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
//  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
//  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
//  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
//  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
//  SOFTWARE.
// </summary>
// --------------------------------------------------------------------------------------------------------------------

package com.aspose.barcode.cloud.api;

import com.aspose.barcode.cloud.ApiCallback;
import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.ApiResponse;
import com.aspose.barcode.cloud.Configuration;
import com.aspose.barcode.cloud.Pair;
import com.aspose.barcode.cloud.ProgressRequestBody;
import com.aspose.barcode.cloud.ProgressResponseBody;
import com.aspose.barcode.cloud.model.BarcodeResponseList;
import com.aspose.barcode.cloud.model.ResultImageInfo;
import com.aspose.barcode.cloud.requests.*;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BarcodeApi {
    private ApiClient apiClient;

    public BarcodeApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BarcodeApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getBarcodeGenerate
     *
     * @param request See {@link GetBarcodeGenerateRequest}
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    protected com.squareup.okhttp.Call getBarcodeGenerateCall(
            GetBarcodeGenerateRequest request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        Object postBody = null;

        // create path and map variables
        String path = "/barcode/generate";

        List<Pair> queryParams = new ArrayList<>();
        List<Pair> collectionQueryParams = new ArrayList<>();
        if (request.type != null)
            queryParams.addAll(apiClient.parameterToPair("Type", request.type));
        if (request.text != null)
            queryParams.addAll(apiClient.parameterToPair("Text", request.text));
        if (request.twoDDisplayText != null)
            queryParams.addAll(
                    apiClient.parameterToPair("TwoDDisplayText", request.twoDDisplayText));
        if (request.textLocation != null)
            queryParams.addAll(apiClient.parameterToPair("TextLocation", request.textLocation));
        if (request.textAlignment != null)
            queryParams.addAll(apiClient.parameterToPair("TextAlignment", request.textAlignment));
        if (request.textColor != null)
            queryParams.addAll(apiClient.parameterToPair("TextColor", request.textColor));
        if (request.fontSizeMode != null)
            queryParams.addAll(apiClient.parameterToPair("FontSizeMode", request.fontSizeMode));
        if (request.noWrap != null)
            queryParams.addAll(apiClient.parameterToPair("NoWrap", request.noWrap));
        if (request.resolution != null)
            queryParams.addAll(apiClient.parameterToPair("Resolution", request.resolution));
        if (request.resolutionX != null)
            queryParams.addAll(apiClient.parameterToPair("ResolutionX", request.resolutionX));
        if (request.resolutionY != null)
            queryParams.addAll(apiClient.parameterToPair("ResolutionY", request.resolutionY));
        if (request.dimensionX != null)
            queryParams.addAll(apiClient.parameterToPair("DimensionX", request.dimensionX));
        if (request.textSpace != null)
            queryParams.addAll(apiClient.parameterToPair("TextSpace", request.textSpace));
        if (request.units != null)
            queryParams.addAll(apiClient.parameterToPair("Units", request.units));
        if (request.sizeMode != null)
            queryParams.addAll(apiClient.parameterToPair("SizeMode", request.sizeMode));
        if (request.barHeight != null)
            queryParams.addAll(apiClient.parameterToPair("BarHeight", request.barHeight));
        if (request.imageHeight != null)
            queryParams.addAll(apiClient.parameterToPair("ImageHeight", request.imageHeight));
        if (request.imageWidth != null)
            queryParams.addAll(apiClient.parameterToPair("ImageWidth", request.imageWidth));
        if (request.rotationAngle != null)
            queryParams.addAll(apiClient.parameterToPair("RotationAngle", request.rotationAngle));
        if (request.backColor != null)
            queryParams.addAll(apiClient.parameterToPair("BackColor", request.backColor));
        if (request.barColor != null)
            queryParams.addAll(apiClient.parameterToPair("BarColor", request.barColor));
        if (request.borderColor != null)
            queryParams.addAll(apiClient.parameterToPair("BorderColor", request.borderColor));
        if (request.borderWidth != null)
            queryParams.addAll(apiClient.parameterToPair("BorderWidth", request.borderWidth));
        if (request.borderDashStyle != null)
            queryParams.addAll(
                    apiClient.parameterToPair("BorderDashStyle", request.borderDashStyle));
        if (request.borderVisible != null)
            queryParams.addAll(apiClient.parameterToPair("BorderVisible", request.borderVisible));
        if (request.enableChecksum != null)
            queryParams.addAll(apiClient.parameterToPair("EnableChecksum", request.enableChecksum));
        if (request.enableEscape != null)
            queryParams.addAll(apiClient.parameterToPair("EnableEscape", request.enableEscape));
        if (request.filledBars != null)
            queryParams.addAll(apiClient.parameterToPair("FilledBars", request.filledBars));
        if (request.alwaysShowChecksum != null)
            queryParams.addAll(
                    apiClient.parameterToPair("AlwaysShowChecksum", request.alwaysShowChecksum));
        if (request.wideNarrowRatio != null)
            queryParams.addAll(
                    apiClient.parameterToPair("WideNarrowRatio", request.wideNarrowRatio));
        if (request.validateText != null)
            queryParams.addAll(apiClient.parameterToPair("ValidateText", request.validateText));
        if (request.supplementData != null)
            queryParams.addAll(apiClient.parameterToPair("SupplementData", request.supplementData));
        if (request.supplementSpace != null)
            queryParams.addAll(
                    apiClient.parameterToPair("SupplementSpace", request.supplementSpace));
        if (request.barWidthReduction != null)
            queryParams.addAll(
                    apiClient.parameterToPair("BarWidthReduction", request.barWidthReduction));
        if (request.format != null)
            queryParams.addAll(apiClient.parameterToPair("format", request.format));

        Map<String, String> headerParams = new HashMap<>();

        Map<String, Object> formParams = new HashMap<>();

        final String[] accepts = {
            "image/png", "image/bmp", "image/gif", "image/jpeg", "image/svg+xml", "image/tiff"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {"application/json"};
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if (progressListener != null) {
            apiClient
                    .getHttpClient()
                    .networkInterceptors()
                    .add(
                            new com.squareup.okhttp.Interceptor() {
                                @Override
                                public com.squareup.okhttp.Response intercept(
                                        com.squareup.okhttp.Interceptor.Chain chain)
                                        throws IOException {
                                    com.squareup.okhttp.Response originalResponse =
                                            chain.proceed(chain.request());
                                    return originalResponse
                                            .newBuilder()
                                            .body(
                                                    new ProgressResponseBody(
                                                            originalResponse.body(),
                                                            progressListener))
                                            .build();
                                }
                            });
        }

        return apiClient.buildCall(
                path,
                "GET",
                queryParams,
                collectionQueryParams,
                postBody,
                headerParams,
                formParams,
                progressRequestListener);
    }

    private com.squareup.okhttp.Call getBarcodeGenerateValidateBeforeCall(
            GetBarcodeGenerateRequest request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {

        // verify the required parameter 'request.type' is set
        if (request.type == null) {
            throw new ApiException(
                    "Missing the required parameter 'request.type' when calling"
                            + " getBarcodeGenerate(Async)");
        }

        // verify the required parameter 'request.text' is set
        if (request.text == null) {
            throw new ApiException(
                    "Missing the required parameter 'request.text' when calling"
                            + " getBarcodeGenerate(Async)");
        }

        com.squareup.okhttp.Call call =
                getBarcodeGenerateCall(request, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Generate barcode.
     *
     * @param request See {@link GetBarcodeGenerateRequest}
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public File getBarcodeGenerate(GetBarcodeGenerateRequest request) throws ApiException {
        ApiResponse<File> resp = getBarcodeGenerateWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Generate barcode.
     *
     * @param request See {@link GetBarcodeGenerateRequest}
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public ApiResponse<File> getBarcodeGenerateWithHttpInfo(GetBarcodeGenerateRequest request)
            throws ApiException {
        com.squareup.okhttp.Call call = getBarcodeGenerateValidateBeforeCall(request, null, null);
        Type returnType = new TypeToken<File>() {}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Generate barcode. (asynchronously)
     *
     * @param request See {@link GetBarcodeGenerateRequest}
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     */
    public com.squareup.okhttp.Call getBarcodeGenerateAsync(
            GetBarcodeGenerateRequest request, final ApiCallback<File> callback)
            throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener =
                    new ProgressResponseBody.ProgressListener() {
                        @Override
                        public void update(long bytesRead, long contentLength, boolean done) {
                            callback.onDownloadProgress(bytesRead, contentLength, done);
                        }
                    };

            progressRequestListener =
                    new ProgressRequestBody.ProgressRequestListener() {
                        @Override
                        public void onRequestProgress(
                                long bytesWritten, long contentLength, boolean done) {
                            callback.onUploadProgress(bytesWritten, contentLength, done);
                        }
                    };
        }

        com.squareup.okhttp.Call call =
                getBarcodeGenerateValidateBeforeCall(
                        request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<File>() {}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for getBarcodeRecognize
     *
     * @param request See {@link GetBarcodeRecognizeRequest}
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    protected com.squareup.okhttp.Call getBarcodeRecognizeCall(
            GetBarcodeRecognizeRequest request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        Object postBody = null;

        // create path and map variables
        String path = "/barcode/{name}/recognize".replaceAll("\\{" + "name" + "}", request.name);

        List<Pair> queryParams = new ArrayList<>();
        List<Pair> collectionQueryParams = new ArrayList<>();
        if (request.type != null)
            queryParams.addAll(apiClient.parameterToPair("Type", request.type));
        if (request.checksumValidation != null)
            queryParams.addAll(
                    apiClient.parameterToPair("ChecksumValidation", request.checksumValidation));
        if (request.detectEncoding != null)
            queryParams.addAll(apiClient.parameterToPair("DetectEncoding", request.detectEncoding));
        if (request.preset != null)
            queryParams.addAll(apiClient.parameterToPair("Preset", request.preset));
        if (request.rectX != null)
            queryParams.addAll(apiClient.parameterToPair("RectX", request.rectX));
        if (request.rectY != null)
            queryParams.addAll(apiClient.parameterToPair("RectY", request.rectY));
        if (request.rectWidth != null)
            queryParams.addAll(apiClient.parameterToPair("RectWidth", request.rectWidth));
        if (request.rectHeight != null)
            queryParams.addAll(apiClient.parameterToPair("RectHeight", request.rectHeight));
        if (request.stripFNC != null)
            queryParams.addAll(apiClient.parameterToPair("StripFNC", request.stripFNC));
        if (request.timeout != null)
            queryParams.addAll(apiClient.parameterToPair("Timeout", request.timeout));
        if (request.medianSmoothingWindowSize != null)
            queryParams.addAll(
                    apiClient.parameterToPair(
                            "MedianSmoothingWindowSize", request.medianSmoothingWindowSize));
        if (request.allowMedianSmoothing != null)
            queryParams.addAll(
                    apiClient.parameterToPair(
                            "AllowMedianSmoothing", request.allowMedianSmoothing));
        if (request.allowComplexBackground != null)
            queryParams.addAll(
                    apiClient.parameterToPair(
                            "AllowComplexBackground", request.allowComplexBackground));
        if (request.allowDatamatrixIndustrialBarcodes != null)
            queryParams.addAll(
                    apiClient.parameterToPair(
                            "AllowDatamatrixIndustrialBarcodes",
                            request.allowDatamatrixIndustrialBarcodes));
        if (request.allowDecreasedImage != null)
            queryParams.addAll(
                    apiClient.parameterToPair("AllowDecreasedImage", request.allowDecreasedImage));
        if (request.allowDetectScanGap != null)
            queryParams.addAll(
                    apiClient.parameterToPair("AllowDetectScanGap", request.allowDetectScanGap));
        if (request.allowIncorrectBarcodes != null)
            queryParams.addAll(
                    apiClient.parameterToPair(
                            "AllowIncorrectBarcodes", request.allowIncorrectBarcodes));
        if (request.allowInvertImage != null)
            queryParams.addAll(
                    apiClient.parameterToPair("AllowInvertImage", request.allowInvertImage));
        if (request.allowMicroWhiteSpotsRemoving != null)
            queryParams.addAll(
                    apiClient.parameterToPair(
                            "AllowMicroWhiteSpotsRemoving", request.allowMicroWhiteSpotsRemoving));
        if (request.allowOneDFastBarcodesDetector != null)
            queryParams.addAll(
                    apiClient.parameterToPair(
                            "AllowOneDFastBarcodesDetector",
                            request.allowOneDFastBarcodesDetector));
        if (request.allowOneDWipedBarsRestoration != null)
            queryParams.addAll(
                    apiClient.parameterToPair(
                            "AllowOneDWipedBarsRestoration",
                            request.allowOneDWipedBarsRestoration));
        if (request.allowQRMicroQrRestoration != null)
            queryParams.addAll(
                    apiClient.parameterToPair(
                            "AllowQRMicroQrRestoration", request.allowQRMicroQrRestoration));
        if (request.allowRegularImage != null)
            queryParams.addAll(
                    apiClient.parameterToPair("AllowRegularImage", request.allowRegularImage));
        if (request.allowSaltAndPepperFiltering != null)
            queryParams.addAll(
                    apiClient.parameterToPair(
                            "AllowSaltAndPepperFiltering", request.allowSaltAndPepperFiltering));
        if (request.allowWhiteSpotsRemoving != null)
            queryParams.addAll(
                    apiClient.parameterToPair(
                            "AllowWhiteSpotsRemoving", request.allowWhiteSpotsRemoving));
        if (request.checkMore1DVariants != null)
            queryParams.addAll(
                    apiClient.parameterToPair("CheckMore1DVariants", request.checkMore1DVariants));
        if (request.fastScanOnly != null)
            queryParams.addAll(apiClient.parameterToPair("FastScanOnly", request.fastScanOnly));
        if (request.regionLikelihoodThresholdPercent != null)
            queryParams.addAll(
                    apiClient.parameterToPair(
                            "RegionLikelihoodThresholdPercent",
                            request.regionLikelihoodThresholdPercent));
        if (request.scanWindowSizes != null)
            collectionQueryParams.addAll(
                    apiClient.parameterToPairs(
                            "multi", "ScanWindowSizes", request.scanWindowSizes));
        if (request.similarity != null)
            queryParams.addAll(apiClient.parameterToPair("Similarity", request.similarity));
        if (request.skipDiagonalSearch != null)
            queryParams.addAll(
                    apiClient.parameterToPair("SkipDiagonalSearch", request.skipDiagonalSearch));
        if (request.readTinyBarcodes != null)
            queryParams.addAll(
                    apiClient.parameterToPair("ReadTinyBarcodes", request.readTinyBarcodes));
        if (request.australianPostEncodingTable != null)
            queryParams.addAll(
                    apiClient.parameterToPair(
                            "AustralianPostEncodingTable", request.australianPostEncodingTable));
        if (request.ignoreEndingFillingPatternsForCTable != null)
            queryParams.addAll(
                    apiClient.parameterToPair(
                            "IgnoreEndingFillingPatternsForCTable",
                            request.ignoreEndingFillingPatternsForCTable));
        if (request.rectangleRegion != null)
            queryParams.addAll(
                    apiClient.parameterToPair("RectangleRegion", request.rectangleRegion));
        if (request.storage != null)
            queryParams.addAll(apiClient.parameterToPair("storage", request.storage));
        if (request.folder != null)
            queryParams.addAll(apiClient.parameterToPair("folder", request.folder));

        Map<String, String> headerParams = new HashMap<>();

        Map<String, Object> formParams = new HashMap<>();

        final String[] accepts = {"application/json"};
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {"application/json"};
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if (progressListener != null) {
            apiClient
                    .getHttpClient()
                    .networkInterceptors()
                    .add(
                            new com.squareup.okhttp.Interceptor() {
                                @Override
                                public com.squareup.okhttp.Response intercept(
                                        com.squareup.okhttp.Interceptor.Chain chain)
                                        throws IOException {
                                    com.squareup.okhttp.Response originalResponse =
                                            chain.proceed(chain.request());
                                    return originalResponse
                                            .newBuilder()
                                            .body(
                                                    new ProgressResponseBody(
                                                            originalResponse.body(),
                                                            progressListener))
                                            .build();
                                }
                            });
        }

        return apiClient.buildCall(
                path,
                "GET",
                queryParams,
                collectionQueryParams,
                postBody,
                headerParams,
                formParams,
                progressRequestListener);
    }

    private com.squareup.okhttp.Call getBarcodeRecognizeValidateBeforeCall(
            GetBarcodeRecognizeRequest request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {

        // verify the required parameter 'request.name' is set
        if (request.name == null) {
            throw new ApiException(
                    "Missing the required parameter 'request.name' when calling"
                            + " getBarcodeRecognize(Async)");
        }

        com.squareup.okhttp.Call call =
                getBarcodeRecognizeCall(request, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Recognize barcode from a file on server.
     *
     * @param request See {@link GetBarcodeRecognizeRequest}
     * @return BarcodeResponseList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public BarcodeResponseList getBarcodeRecognize(GetBarcodeRecognizeRequest request)
            throws ApiException {
        ApiResponse<BarcodeResponseList> resp = getBarcodeRecognizeWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Recognize barcode from a file on server.
     *
     * @param request See {@link GetBarcodeRecognizeRequest}
     * @return ApiResponse&lt;BarcodeResponseList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public ApiResponse<BarcodeResponseList> getBarcodeRecognizeWithHttpInfo(
            GetBarcodeRecognizeRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getBarcodeRecognizeValidateBeforeCall(request, null, null);
        Type returnType = new TypeToken<BarcodeResponseList>() {}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Recognize barcode from a file on server. (asynchronously)
     *
     * @param request See {@link GetBarcodeRecognizeRequest}
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     */
    public com.squareup.okhttp.Call getBarcodeRecognizeAsync(
            GetBarcodeRecognizeRequest request, final ApiCallback<BarcodeResponseList> callback)
            throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener =
                    new ProgressResponseBody.ProgressListener() {
                        @Override
                        public void update(long bytesRead, long contentLength, boolean done) {
                            callback.onDownloadProgress(bytesRead, contentLength, done);
                        }
                    };

            progressRequestListener =
                    new ProgressRequestBody.ProgressRequestListener() {
                        @Override
                        public void onRequestProgress(
                                long bytesWritten, long contentLength, boolean done) {
                            callback.onUploadProgress(bytesWritten, contentLength, done);
                        }
                    };
        }

        com.squareup.okhttp.Call call =
                getBarcodeRecognizeValidateBeforeCall(
                        request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<BarcodeResponseList>() {}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for postBarcodeRecognizeFromUrlOrContent
     *
     * @param request See {@link PostBarcodeRecognizeFromUrlOrContentRequest}
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    protected com.squareup.okhttp.Call postBarcodeRecognizeFromUrlOrContentCall(
            PostBarcodeRecognizeFromUrlOrContentRequest request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        Object postBody = null;

        // create path and map variables
        String path = "/barcode/recognize";

        List<Pair> queryParams = new ArrayList<>();
        List<Pair> collectionQueryParams = new ArrayList<>();
        if (request.type != null)
            queryParams.addAll(apiClient.parameterToPair("Type", request.type));
        if (request.checksumValidation != null)
            queryParams.addAll(
                    apiClient.parameterToPair("ChecksumValidation", request.checksumValidation));
        if (request.detectEncoding != null)
            queryParams.addAll(apiClient.parameterToPair("DetectEncoding", request.detectEncoding));
        if (request.preset != null)
            queryParams.addAll(apiClient.parameterToPair("Preset", request.preset));
        if (request.rectX != null)
            queryParams.addAll(apiClient.parameterToPair("RectX", request.rectX));
        if (request.rectY != null)
            queryParams.addAll(apiClient.parameterToPair("RectY", request.rectY));
        if (request.rectWidth != null)
            queryParams.addAll(apiClient.parameterToPair("RectWidth", request.rectWidth));
        if (request.rectHeight != null)
            queryParams.addAll(apiClient.parameterToPair("RectHeight", request.rectHeight));
        if (request.stripFNC != null)
            queryParams.addAll(apiClient.parameterToPair("StripFNC", request.stripFNC));
        if (request.timeout != null)
            queryParams.addAll(apiClient.parameterToPair("Timeout", request.timeout));
        if (request.medianSmoothingWindowSize != null)
            queryParams.addAll(
                    apiClient.parameterToPair(
                            "MedianSmoothingWindowSize", request.medianSmoothingWindowSize));
        if (request.allowMedianSmoothing != null)
            queryParams.addAll(
                    apiClient.parameterToPair(
                            "AllowMedianSmoothing", request.allowMedianSmoothing));
        if (request.allowComplexBackground != null)
            queryParams.addAll(
                    apiClient.parameterToPair(
                            "AllowComplexBackground", request.allowComplexBackground));
        if (request.allowDatamatrixIndustrialBarcodes != null)
            queryParams.addAll(
                    apiClient.parameterToPair(
                            "AllowDatamatrixIndustrialBarcodes",
                            request.allowDatamatrixIndustrialBarcodes));
        if (request.allowDecreasedImage != null)
            queryParams.addAll(
                    apiClient.parameterToPair("AllowDecreasedImage", request.allowDecreasedImage));
        if (request.allowDetectScanGap != null)
            queryParams.addAll(
                    apiClient.parameterToPair("AllowDetectScanGap", request.allowDetectScanGap));
        if (request.allowIncorrectBarcodes != null)
            queryParams.addAll(
                    apiClient.parameterToPair(
                            "AllowIncorrectBarcodes", request.allowIncorrectBarcodes));
        if (request.allowInvertImage != null)
            queryParams.addAll(
                    apiClient.parameterToPair("AllowInvertImage", request.allowInvertImage));
        if (request.allowMicroWhiteSpotsRemoving != null)
            queryParams.addAll(
                    apiClient.parameterToPair(
                            "AllowMicroWhiteSpotsRemoving", request.allowMicroWhiteSpotsRemoving));
        if (request.allowOneDFastBarcodesDetector != null)
            queryParams.addAll(
                    apiClient.parameterToPair(
                            "AllowOneDFastBarcodesDetector",
                            request.allowOneDFastBarcodesDetector));
        if (request.allowOneDWipedBarsRestoration != null)
            queryParams.addAll(
                    apiClient.parameterToPair(
                            "AllowOneDWipedBarsRestoration",
                            request.allowOneDWipedBarsRestoration));
        if (request.allowQRMicroQrRestoration != null)
            queryParams.addAll(
                    apiClient.parameterToPair(
                            "AllowQRMicroQrRestoration", request.allowQRMicroQrRestoration));
        if (request.allowRegularImage != null)
            queryParams.addAll(
                    apiClient.parameterToPair("AllowRegularImage", request.allowRegularImage));
        if (request.allowSaltAndPepperFiltering != null)
            queryParams.addAll(
                    apiClient.parameterToPair(
                            "AllowSaltAndPepperFiltering", request.allowSaltAndPepperFiltering));
        if (request.allowWhiteSpotsRemoving != null)
            queryParams.addAll(
                    apiClient.parameterToPair(
                            "AllowWhiteSpotsRemoving", request.allowWhiteSpotsRemoving));
        if (request.checkMore1DVariants != null)
            queryParams.addAll(
                    apiClient.parameterToPair("CheckMore1DVariants", request.checkMore1DVariants));
        if (request.fastScanOnly != null)
            queryParams.addAll(apiClient.parameterToPair("FastScanOnly", request.fastScanOnly));
        if (request.regionLikelihoodThresholdPercent != null)
            queryParams.addAll(
                    apiClient.parameterToPair(
                            "RegionLikelihoodThresholdPercent",
                            request.regionLikelihoodThresholdPercent));
        if (request.scanWindowSizes != null)
            collectionQueryParams.addAll(
                    apiClient.parameterToPairs(
                            "multi", "ScanWindowSizes", request.scanWindowSizes));
        if (request.similarity != null)
            queryParams.addAll(apiClient.parameterToPair("Similarity", request.similarity));
        if (request.skipDiagonalSearch != null)
            queryParams.addAll(
                    apiClient.parameterToPair("SkipDiagonalSearch", request.skipDiagonalSearch));
        if (request.readTinyBarcodes != null)
            queryParams.addAll(
                    apiClient.parameterToPair("ReadTinyBarcodes", request.readTinyBarcodes));
        if (request.australianPostEncodingTable != null)
            queryParams.addAll(
                    apiClient.parameterToPair(
                            "AustralianPostEncodingTable", request.australianPostEncodingTable));
        if (request.ignoreEndingFillingPatternsForCTable != null)
            queryParams.addAll(
                    apiClient.parameterToPair(
                            "IgnoreEndingFillingPatternsForCTable",
                            request.ignoreEndingFillingPatternsForCTable));
        if (request.rectangleRegion != null)
            queryParams.addAll(
                    apiClient.parameterToPair("RectangleRegion", request.rectangleRegion));
        if (request.url != null) queryParams.addAll(apiClient.parameterToPair("url", request.url));

        Map<String, String> headerParams = new HashMap<>();

        Map<String, Object> formParams = new HashMap<>();
        if (request.image != null) formParams.put("image", request.image);

        final String[] accepts = {"application/json"};
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "multipart/form-data", "application/x-www-form-urlencoded", "application/octet-stream"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if (progressListener != null) {
            apiClient
                    .getHttpClient()
                    .networkInterceptors()
                    .add(
                            new com.squareup.okhttp.Interceptor() {
                                @Override
                                public com.squareup.okhttp.Response intercept(
                                        com.squareup.okhttp.Interceptor.Chain chain)
                                        throws IOException {
                                    com.squareup.okhttp.Response originalResponse =
                                            chain.proceed(chain.request());
                                    return originalResponse
                                            .newBuilder()
                                            .body(
                                                    new ProgressResponseBody(
                                                            originalResponse.body(),
                                                            progressListener))
                                            .build();
                                }
                            });
        }

        return apiClient.buildCall(
                path,
                "POST",
                queryParams,
                collectionQueryParams,
                postBody,
                headerParams,
                formParams,
                progressRequestListener);
    }

    private com.squareup.okhttp.Call postBarcodeRecognizeFromUrlOrContentValidateBeforeCall(
            PostBarcodeRecognizeFromUrlOrContentRequest request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {

        com.squareup.okhttp.Call call =
                postBarcodeRecognizeFromUrlOrContentCall(
                        request, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Recognize barcode from an url or from request body. Request body can contain raw data bytes
     * of the image or encoded with base64.
     *
     * @param request See {@link PostBarcodeRecognizeFromUrlOrContentRequest}
     * @return BarcodeResponseList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public BarcodeResponseList postBarcodeRecognizeFromUrlOrContent(
            PostBarcodeRecognizeFromUrlOrContentRequest request) throws ApiException {
        ApiResponse<BarcodeResponseList> resp =
                postBarcodeRecognizeFromUrlOrContentWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Recognize barcode from an url or from request body. Request body can contain raw data bytes
     * of the image or encoded with base64.
     *
     * @param request See {@link PostBarcodeRecognizeFromUrlOrContentRequest}
     * @return ApiResponse&lt;BarcodeResponseList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public ApiResponse<BarcodeResponseList> postBarcodeRecognizeFromUrlOrContentWithHttpInfo(
            PostBarcodeRecognizeFromUrlOrContentRequest request) throws ApiException {
        com.squareup.okhttp.Call call =
                postBarcodeRecognizeFromUrlOrContentValidateBeforeCall(request, null, null);
        Type returnType = new TypeToken<BarcodeResponseList>() {}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Recognize barcode from an url or from request body. Request body can contain raw data bytes
     * of the image or encoded with base64. (asynchronously)
     *
     * @param request See {@link PostBarcodeRecognizeFromUrlOrContentRequest}
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     */
    public com.squareup.okhttp.Call postBarcodeRecognizeFromUrlOrContentAsync(
            PostBarcodeRecognizeFromUrlOrContentRequest request,
            final ApiCallback<BarcodeResponseList> callback)
            throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener =
                    new ProgressResponseBody.ProgressListener() {
                        @Override
                        public void update(long bytesRead, long contentLength, boolean done) {
                            callback.onDownloadProgress(bytesRead, contentLength, done);
                        }
                    };

            progressRequestListener =
                    new ProgressRequestBody.ProgressRequestListener() {
                        @Override
                        public void onRequestProgress(
                                long bytesWritten, long contentLength, boolean done) {
                            callback.onUploadProgress(bytesWritten, contentLength, done);
                        }
                    };
        }

        com.squareup.okhttp.Call call =
                postBarcodeRecognizeFromUrlOrContentValidateBeforeCall(
                        request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<BarcodeResponseList>() {}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for postGenerateMultiple
     *
     * @param request See {@link PostGenerateMultipleRequest}
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    protected com.squareup.okhttp.Call postGenerateMultipleCall(
            PostGenerateMultipleRequest request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        Object postBody = request.generatorParamsList;

        // create path and map variables
        String path = "/barcode/generateMultiple";

        List<Pair> queryParams = new ArrayList<>();
        List<Pair> collectionQueryParams = new ArrayList<>();
        if (request.format != null)
            queryParams.addAll(apiClient.parameterToPair("format", request.format));

        Map<String, String> headerParams = new HashMap<>();

        Map<String, Object> formParams = new HashMap<>();

        final String[] accepts = {
            "image/png", "image/bmp", "image/gif", "image/jpeg", "image/svg+xml", "image/tiff"
        };
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {"application/json", "application/xml"};
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if (progressListener != null) {
            apiClient
                    .getHttpClient()
                    .networkInterceptors()
                    .add(
                            new com.squareup.okhttp.Interceptor() {
                                @Override
                                public com.squareup.okhttp.Response intercept(
                                        com.squareup.okhttp.Interceptor.Chain chain)
                                        throws IOException {
                                    com.squareup.okhttp.Response originalResponse =
                                            chain.proceed(chain.request());
                                    return originalResponse
                                            .newBuilder()
                                            .body(
                                                    new ProgressResponseBody(
                                                            originalResponse.body(),
                                                            progressListener))
                                            .build();
                                }
                            });
        }

        return apiClient.buildCall(
                path,
                "POST",
                queryParams,
                collectionQueryParams,
                postBody,
                headerParams,
                formParams,
                progressRequestListener);
    }

    private com.squareup.okhttp.Call postGenerateMultipleValidateBeforeCall(
            PostGenerateMultipleRequest request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {

        // verify the required parameter 'request.generatorParamsList' is set
        if (request.generatorParamsList == null) {
            throw new ApiException(
                    "Missing the required parameter 'request.generatorParamsList' when calling"
                            + " postGenerateMultiple(Async)");
        }

        com.squareup.okhttp.Call call =
                postGenerateMultipleCall(request, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Generate multiple barcodes and return in response stream
     *
     * @param request See {@link PostGenerateMultipleRequest}
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public File postGenerateMultiple(PostGenerateMultipleRequest request) throws ApiException {
        ApiResponse<File> resp = postGenerateMultipleWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Generate multiple barcodes and return in response stream
     *
     * @param request See {@link PostGenerateMultipleRequest}
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public ApiResponse<File> postGenerateMultipleWithHttpInfo(PostGenerateMultipleRequest request)
            throws ApiException {
        com.squareup.okhttp.Call call = postGenerateMultipleValidateBeforeCall(request, null, null);
        Type returnType = new TypeToken<File>() {}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Generate multiple barcodes and return in response stream (asynchronously)
     *
     * @param request See {@link PostGenerateMultipleRequest}
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     */
    public com.squareup.okhttp.Call postGenerateMultipleAsync(
            PostGenerateMultipleRequest request, final ApiCallback<File> callback)
            throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener =
                    new ProgressResponseBody.ProgressListener() {
                        @Override
                        public void update(long bytesRead, long contentLength, boolean done) {
                            callback.onDownloadProgress(bytesRead, contentLength, done);
                        }
                    };

            progressRequestListener =
                    new ProgressRequestBody.ProgressRequestListener() {
                        @Override
                        public void onRequestProgress(
                                long bytesWritten, long contentLength, boolean done) {
                            callback.onUploadProgress(bytesWritten, contentLength, done);
                        }
                    };
        }

        com.squareup.okhttp.Call call =
                postGenerateMultipleValidateBeforeCall(
                        request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<File>() {}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for putBarcodeGenerateFile
     *
     * @param request See {@link PutBarcodeGenerateFileRequest}
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    protected com.squareup.okhttp.Call putBarcodeGenerateFileCall(
            PutBarcodeGenerateFileRequest request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        Object postBody = null;

        // create path and map variables
        String path = "/barcode/{name}/generate".replaceAll("\\{" + "name" + "}", request.name);

        List<Pair> queryParams = new ArrayList<>();
        List<Pair> collectionQueryParams = new ArrayList<>();
        if (request.type != null)
            queryParams.addAll(apiClient.parameterToPair("Type", request.type));
        if (request.text != null)
            queryParams.addAll(apiClient.parameterToPair("Text", request.text));
        if (request.twoDDisplayText != null)
            queryParams.addAll(
                    apiClient.parameterToPair("TwoDDisplayText", request.twoDDisplayText));
        if (request.textLocation != null)
            queryParams.addAll(apiClient.parameterToPair("TextLocation", request.textLocation));
        if (request.textAlignment != null)
            queryParams.addAll(apiClient.parameterToPair("TextAlignment", request.textAlignment));
        if (request.textColor != null)
            queryParams.addAll(apiClient.parameterToPair("TextColor", request.textColor));
        if (request.fontSizeMode != null)
            queryParams.addAll(apiClient.parameterToPair("FontSizeMode", request.fontSizeMode));
        if (request.noWrap != null)
            queryParams.addAll(apiClient.parameterToPair("NoWrap", request.noWrap));
        if (request.resolution != null)
            queryParams.addAll(apiClient.parameterToPair("Resolution", request.resolution));
        if (request.resolutionX != null)
            queryParams.addAll(apiClient.parameterToPair("ResolutionX", request.resolutionX));
        if (request.resolutionY != null)
            queryParams.addAll(apiClient.parameterToPair("ResolutionY", request.resolutionY));
        if (request.dimensionX != null)
            queryParams.addAll(apiClient.parameterToPair("DimensionX", request.dimensionX));
        if (request.textSpace != null)
            queryParams.addAll(apiClient.parameterToPair("TextSpace", request.textSpace));
        if (request.units != null)
            queryParams.addAll(apiClient.parameterToPair("Units", request.units));
        if (request.sizeMode != null)
            queryParams.addAll(apiClient.parameterToPair("SizeMode", request.sizeMode));
        if (request.barHeight != null)
            queryParams.addAll(apiClient.parameterToPair("BarHeight", request.barHeight));
        if (request.imageHeight != null)
            queryParams.addAll(apiClient.parameterToPair("ImageHeight", request.imageHeight));
        if (request.imageWidth != null)
            queryParams.addAll(apiClient.parameterToPair("ImageWidth", request.imageWidth));
        if (request.rotationAngle != null)
            queryParams.addAll(apiClient.parameterToPair("RotationAngle", request.rotationAngle));
        if (request.backColor != null)
            queryParams.addAll(apiClient.parameterToPair("BackColor", request.backColor));
        if (request.barColor != null)
            queryParams.addAll(apiClient.parameterToPair("BarColor", request.barColor));
        if (request.borderColor != null)
            queryParams.addAll(apiClient.parameterToPair("BorderColor", request.borderColor));
        if (request.borderWidth != null)
            queryParams.addAll(apiClient.parameterToPair("BorderWidth", request.borderWidth));
        if (request.borderDashStyle != null)
            queryParams.addAll(
                    apiClient.parameterToPair("BorderDashStyle", request.borderDashStyle));
        if (request.borderVisible != null)
            queryParams.addAll(apiClient.parameterToPair("BorderVisible", request.borderVisible));
        if (request.enableChecksum != null)
            queryParams.addAll(apiClient.parameterToPair("EnableChecksum", request.enableChecksum));
        if (request.enableEscape != null)
            queryParams.addAll(apiClient.parameterToPair("EnableEscape", request.enableEscape));
        if (request.filledBars != null)
            queryParams.addAll(apiClient.parameterToPair("FilledBars", request.filledBars));
        if (request.alwaysShowChecksum != null)
            queryParams.addAll(
                    apiClient.parameterToPair("AlwaysShowChecksum", request.alwaysShowChecksum));
        if (request.wideNarrowRatio != null)
            queryParams.addAll(
                    apiClient.parameterToPair("WideNarrowRatio", request.wideNarrowRatio));
        if (request.validateText != null)
            queryParams.addAll(apiClient.parameterToPair("ValidateText", request.validateText));
        if (request.supplementData != null)
            queryParams.addAll(apiClient.parameterToPair("SupplementData", request.supplementData));
        if (request.supplementSpace != null)
            queryParams.addAll(
                    apiClient.parameterToPair("SupplementSpace", request.supplementSpace));
        if (request.barWidthReduction != null)
            queryParams.addAll(
                    apiClient.parameterToPair("BarWidthReduction", request.barWidthReduction));
        if (request.storage != null)
            queryParams.addAll(apiClient.parameterToPair("storage", request.storage));
        if (request.folder != null)
            queryParams.addAll(apiClient.parameterToPair("folder", request.folder));
        if (request.format != null)
            queryParams.addAll(apiClient.parameterToPair("format", request.format));

        Map<String, String> headerParams = new HashMap<>();

        Map<String, Object> formParams = new HashMap<>();

        final String[] accepts = {"application/json"};
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {
            "multipart/form-data",
            "application/x-www-form-urlencoded",
            "application/json",
            "application/xml"
        };
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if (progressListener != null) {
            apiClient
                    .getHttpClient()
                    .networkInterceptors()
                    .add(
                            new com.squareup.okhttp.Interceptor() {
                                @Override
                                public com.squareup.okhttp.Response intercept(
                                        com.squareup.okhttp.Interceptor.Chain chain)
                                        throws IOException {
                                    com.squareup.okhttp.Response originalResponse =
                                            chain.proceed(chain.request());
                                    return originalResponse
                                            .newBuilder()
                                            .body(
                                                    new ProgressResponseBody(
                                                            originalResponse.body(),
                                                            progressListener))
                                            .build();
                                }
                            });
        }

        return apiClient.buildCall(
                path,
                "PUT",
                queryParams,
                collectionQueryParams,
                postBody,
                headerParams,
                formParams,
                progressRequestListener);
    }

    private com.squareup.okhttp.Call putBarcodeGenerateFileValidateBeforeCall(
            PutBarcodeGenerateFileRequest request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {

        // verify the required parameter 'request.name' is set
        if (request.name == null) {
            throw new ApiException(
                    "Missing the required parameter 'request.name' when calling"
                            + " putBarcodeGenerateFile(Async)");
        }

        // verify the required parameter 'request.type' is set
        if (request.type == null) {
            throw new ApiException(
                    "Missing the required parameter 'request.type' when calling"
                            + " putBarcodeGenerateFile(Async)");
        }

        // verify the required parameter 'request.text' is set
        if (request.text == null) {
            throw new ApiException(
                    "Missing the required parameter 'request.text' when calling"
                            + " putBarcodeGenerateFile(Async)");
        }

        com.squareup.okhttp.Call call =
                putBarcodeGenerateFileCall(request, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Generate barcode and save on server (from query params or from file with json or xml content)
     *
     * @param request See {@link PutBarcodeGenerateFileRequest}
     * @return ResultImageInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public ResultImageInfo putBarcodeGenerateFile(PutBarcodeGenerateFileRequest request)
            throws ApiException {
        ApiResponse<ResultImageInfo> resp = putBarcodeGenerateFileWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Generate barcode and save on server (from query params or from file with json or xml content)
     *
     * @param request See {@link PutBarcodeGenerateFileRequest}
     * @return ApiResponse&lt;ResultImageInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public ApiResponse<ResultImageInfo> putBarcodeGenerateFileWithHttpInfo(
            PutBarcodeGenerateFileRequest request) throws ApiException {
        com.squareup.okhttp.Call call =
                putBarcodeGenerateFileValidateBeforeCall(request, null, null);
        Type returnType = new TypeToken<ResultImageInfo>() {}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Generate barcode and save on server (from query params or from file with json or xml content)
     * (asynchronously)
     *
     * @param request See {@link PutBarcodeGenerateFileRequest}
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     */
    public com.squareup.okhttp.Call putBarcodeGenerateFileAsync(
            PutBarcodeGenerateFileRequest request, final ApiCallback<ResultImageInfo> callback)
            throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener =
                    new ProgressResponseBody.ProgressListener() {
                        @Override
                        public void update(long bytesRead, long contentLength, boolean done) {
                            callback.onDownloadProgress(bytesRead, contentLength, done);
                        }
                    };

            progressRequestListener =
                    new ProgressRequestBody.ProgressRequestListener() {
                        @Override
                        public void onRequestProgress(
                                long bytesWritten, long contentLength, boolean done) {
                            callback.onUploadProgress(bytesWritten, contentLength, done);
                        }
                    };
        }

        com.squareup.okhttp.Call call =
                putBarcodeGenerateFileValidateBeforeCall(
                        request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<ResultImageInfo>() {}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for putBarcodeRecognizeFromBody
     *
     * @param request See {@link PutBarcodeRecognizeFromBodyRequest}
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    protected com.squareup.okhttp.Call putBarcodeRecognizeFromBodyCall(
            PutBarcodeRecognizeFromBodyRequest request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        Object postBody = request.readerParams;

        // create path and map variables
        String path = "/barcode/{name}/recognize".replaceAll("\\{" + "name" + "}", request.name);

        List<Pair> queryParams = new ArrayList<>();
        List<Pair> collectionQueryParams = new ArrayList<>();
        if (request.type != null)
            queryParams.addAll(apiClient.parameterToPair("type", request.type));
        if (request.storage != null)
            queryParams.addAll(apiClient.parameterToPair("storage", request.storage));
        if (request.folder != null)
            queryParams.addAll(apiClient.parameterToPair("folder", request.folder));

        Map<String, String> headerParams = new HashMap<>();

        Map<String, Object> formParams = new HashMap<>();

        final String[] accepts = {"application/json"};
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {"application/json"};
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if (progressListener != null) {
            apiClient
                    .getHttpClient()
                    .networkInterceptors()
                    .add(
                            new com.squareup.okhttp.Interceptor() {
                                @Override
                                public com.squareup.okhttp.Response intercept(
                                        com.squareup.okhttp.Interceptor.Chain chain)
                                        throws IOException {
                                    com.squareup.okhttp.Response originalResponse =
                                            chain.proceed(chain.request());
                                    return originalResponse
                                            .newBuilder()
                                            .body(
                                                    new ProgressResponseBody(
                                                            originalResponse.body(),
                                                            progressListener))
                                            .build();
                                }
                            });
        }

        return apiClient.buildCall(
                path,
                "PUT",
                queryParams,
                collectionQueryParams,
                postBody,
                headerParams,
                formParams,
                progressRequestListener);
    }

    private com.squareup.okhttp.Call putBarcodeRecognizeFromBodyValidateBeforeCall(
            PutBarcodeRecognizeFromBodyRequest request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {

        // verify the required parameter 'request.name' is set
        if (request.name == null) {
            throw new ApiException(
                    "Missing the required parameter 'request.name' when calling"
                            + " putBarcodeRecognizeFromBody(Async)");
        }

        // verify the required parameter 'request.readerParams' is set
        if (request.readerParams == null) {
            throw new ApiException(
                    "Missing the required parameter 'request.readerParams' when calling"
                            + " putBarcodeRecognizeFromBody(Async)");
        }

        com.squareup.okhttp.Call call =
                putBarcodeRecognizeFromBodyCall(request, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Recognition of a barcode from file on server with parameters in body.
     *
     * @param request See {@link PutBarcodeRecognizeFromBodyRequest}
     * @return BarcodeResponseList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public BarcodeResponseList putBarcodeRecognizeFromBody(
            PutBarcodeRecognizeFromBodyRequest request) throws ApiException {
        ApiResponse<BarcodeResponseList> resp = putBarcodeRecognizeFromBodyWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Recognition of a barcode from file on server with parameters in body.
     *
     * @param request See {@link PutBarcodeRecognizeFromBodyRequest}
     * @return ApiResponse&lt;BarcodeResponseList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public ApiResponse<BarcodeResponseList> putBarcodeRecognizeFromBodyWithHttpInfo(
            PutBarcodeRecognizeFromBodyRequest request) throws ApiException {
        com.squareup.okhttp.Call call =
                putBarcodeRecognizeFromBodyValidateBeforeCall(request, null, null);
        Type returnType = new TypeToken<BarcodeResponseList>() {}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Recognition of a barcode from file on server with parameters in body. (asynchronously)
     *
     * @param request See {@link PutBarcodeRecognizeFromBodyRequest}
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     */
    public com.squareup.okhttp.Call putBarcodeRecognizeFromBodyAsync(
            PutBarcodeRecognizeFromBodyRequest request,
            final ApiCallback<BarcodeResponseList> callback)
            throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener =
                    new ProgressResponseBody.ProgressListener() {
                        @Override
                        public void update(long bytesRead, long contentLength, boolean done) {
                            callback.onDownloadProgress(bytesRead, contentLength, done);
                        }
                    };

            progressRequestListener =
                    new ProgressRequestBody.ProgressRequestListener() {
                        @Override
                        public void onRequestProgress(
                                long bytesWritten, long contentLength, boolean done) {
                            callback.onUploadProgress(bytesWritten, contentLength, done);
                        }
                    };
        }

        com.squareup.okhttp.Call call =
                putBarcodeRecognizeFromBodyValidateBeforeCall(
                        request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<BarcodeResponseList>() {}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
    /**
     * Build call for putGenerateMultiple
     *
     * @param request See {@link PutGenerateMultipleRequest}
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    protected com.squareup.okhttp.Call putGenerateMultipleCall(
            PutGenerateMultipleRequest request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        Object postBody = request.generatorParamsList;

        // create path and map variables
        String path =
                "/barcode/{name}/generateMultiple".replaceAll("\\{" + "name" + "}", request.name);

        List<Pair> queryParams = new ArrayList<>();
        List<Pair> collectionQueryParams = new ArrayList<>();
        if (request.format != null)
            queryParams.addAll(apiClient.parameterToPair("format", request.format));
        if (request.folder != null)
            queryParams.addAll(apiClient.parameterToPair("folder", request.folder));
        if (request.storage != null)
            queryParams.addAll(apiClient.parameterToPair("storage", request.storage));

        Map<String, String> headerParams = new HashMap<>();

        Map<String, Object> formParams = new HashMap<>();

        final String[] accepts = {"application/json"};
        final String accept = apiClient.selectHeaderAccept(accepts);
        if (accept != null) headerParams.put("Accept", accept);

        final String[] contentTypes = {"application/json", "application/xml"};
        final String contentType = apiClient.selectHeaderContentType(contentTypes);
        headerParams.put("Content-Type", contentType);

        if (progressListener != null) {
            apiClient
                    .getHttpClient()
                    .networkInterceptors()
                    .add(
                            new com.squareup.okhttp.Interceptor() {
                                @Override
                                public com.squareup.okhttp.Response intercept(
                                        com.squareup.okhttp.Interceptor.Chain chain)
                                        throws IOException {
                                    com.squareup.okhttp.Response originalResponse =
                                            chain.proceed(chain.request());
                                    return originalResponse
                                            .newBuilder()
                                            .body(
                                                    new ProgressResponseBody(
                                                            originalResponse.body(),
                                                            progressListener))
                                            .build();
                                }
                            });
        }

        return apiClient.buildCall(
                path,
                "PUT",
                queryParams,
                collectionQueryParams,
                postBody,
                headerParams,
                formParams,
                progressRequestListener);
    }

    private com.squareup.okhttp.Call putGenerateMultipleValidateBeforeCall(
            PutGenerateMultipleRequest request,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {

        // verify the required parameter 'request.name' is set
        if (request.name == null) {
            throw new ApiException(
                    "Missing the required parameter 'request.name' when calling"
                            + " putGenerateMultiple(Async)");
        }

        // verify the required parameter 'request.generatorParamsList' is set
        if (request.generatorParamsList == null) {
            throw new ApiException(
                    "Missing the required parameter 'request.generatorParamsList' when calling"
                            + " putGenerateMultiple(Async)");
        }

        com.squareup.okhttp.Call call =
                putGenerateMultipleCall(request, progressListener, progressRequestListener);
        return call;
    }

    /**
     * Generate image with multiple barcodes and put new file on server
     *
     * @param request See {@link PutGenerateMultipleRequest}
     * @return ResultImageInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public ResultImageInfo putGenerateMultiple(PutGenerateMultipleRequest request)
            throws ApiException {
        ApiResponse<ResultImageInfo> resp = putGenerateMultipleWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Generate image with multiple barcodes and put new file on server
     *
     * @param request See {@link PutGenerateMultipleRequest}
     * @return ApiResponse&lt;ResultImageInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public ApiResponse<ResultImageInfo> putGenerateMultipleWithHttpInfo(
            PutGenerateMultipleRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putGenerateMultipleValidateBeforeCall(request, null, null);
        Type returnType = new TypeToken<ResultImageInfo>() {}.getType();
        return apiClient.execute(call, returnType);
    }

    /**
     * Generate image with multiple barcodes and put new file on server (asynchronously)
     *
     * @param request See {@link PutGenerateMultipleRequest}
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     */
    public com.squareup.okhttp.Call putGenerateMultipleAsync(
            PutGenerateMultipleRequest request, final ApiCallback<ResultImageInfo> callback)
            throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener =
                    new ProgressResponseBody.ProgressListener() {
                        @Override
                        public void update(long bytesRead, long contentLength, boolean done) {
                            callback.onDownloadProgress(bytesRead, contentLength, done);
                        }
                    };

            progressRequestListener =
                    new ProgressRequestBody.ProgressRequestListener() {
                        @Override
                        public void onRequestProgress(
                                long bytesWritten, long contentLength, boolean done) {
                            callback.onUploadProgress(bytesWritten, contentLength, done);
                        }
                    };
        }

        com.squareup.okhttp.Call call =
                putGenerateMultipleValidateBeforeCall(
                        request, progressListener, progressRequestListener);
        Type returnType = new TypeToken<ResultImageInfo>() {}.getType();
        apiClient.executeAsync(call, returnType, callback);
        return call;
    }
}
