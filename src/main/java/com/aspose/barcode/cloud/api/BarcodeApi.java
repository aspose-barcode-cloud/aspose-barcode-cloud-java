// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="BarcodeApi.java">
//   Copyright (c) 2021 Aspose.BarCode for Cloud
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
     * @param type Type of barcode to generate. (required)
     * @param text Text to encode. (required)
     * @param twoDDisplayText Text that will be displayed instead of codetext in 2D barcodes. Used
     *     for: Aztec, Pdf417, DataMatrix, QR, MaxiCode, DotCode (optional)
     * @param textLocation Specify the displaying Text Location, set to CodeLocation.None to hide
     *     CodeText. Default value: CodeLocation.Below. (optional)
     * @param textAlignment Text alignment. (optional)
     * @param textColor Specify the displaying CodeText&#39;s Color. Default value: Color.Black.
     *     (optional)
     * @param fontSizeMode Specify FontSizeMode. If FontSizeMode is set to Auto, font size will be
     *     calculated automatically based on xDimension value. It is recommended to use
     *     FontSizeMode.Auto especially in AutoSizeMode.Nearest or AutoSizeMode.Interpolation.
     *     Default value: FontSizeMode.Auto. (optional)
     * @param noWrap Specify word wraps (line breaks) within text. Default value: false. (optional)
     * @param resolution Resolution of the BarCode image. One value for both dimensions. Default
     *     value: 96 dpi. (optional)
     * @param resolutionX DEPRECATED: Use &#39;Resolution&#39; instead. (optional)
     * @param resolutionY DEPRECATED: Use &#39;Resolution&#39; instead. (optional)
     * @param dimensionX The smallest width of the unit of BarCode bars or spaces. Increase this
     *     will increase the whole barcode image width. Ignored if AutoSizeMode property is set to
     *     AutoSizeMode.Nearest or AutoSizeMode.Interpolation. (optional)
     * @param textSpace Space between the CodeText and the BarCode in Unit value. Default value:
     *     2pt. Ignored for EAN8, EAN13, UPCE, UPCA, ISBN, ISMN, ISSN, UpcaGs1DatabarCoupon.
     *     (optional)
     * @param units Common Units for all measuring in query. Default units: pixel. (optional)
     * @param sizeMode Specifies the different types of automatic sizing modes. Default value:
     *     AutoSizeMode.None. (optional)
     * @param barHeight Height of the barcode in given units. Default units: pixel. (optional)
     * @param imageHeight Height of the barcode image in given units. Default units: pixel.
     *     (optional)
     * @param imageWidth Width of the barcode image in given units. Default units: pixel. (optional)
     * @param rotationAngle BarCode image rotation angle, measured in degree, e.g. RotationAngle
     *     &#x3D; 0 or RotationAngle &#x3D; 360 means no rotation. If RotationAngle NOT equal to 90,
     *     180, 270 or 0, it may increase the difficulty for the scanner to read the image. Default
     *     value: 0. (optional)
     * @param backColor Background color of the barcode image. Default value: Color.White.
     *     (optional)
     * @param barColor Bars color. Default value: Color.Black. (optional)
     * @param borderColor Border color. Default value: Color.Black. (optional)
     * @param borderWidth Border width. Default value: 0. Ignored if Visible is set to false.
     *     (optional)
     * @param borderDashStyle Border dash style. Default value: BorderDashStyle.Solid. (optional)
     * @param borderVisible Border visibility. If false than parameter Width is always ignored (0).
     *     Default value: false. (optional)
     * @param enableChecksum Enable checksum during generation 1D barcodes. Default is treated as
     *     Yes for symbology which must contain checksum, as No where checksum only possible.
     *     Checksum is possible: Code39 Standard/Extended, Standard2of5, Interleaved2of5,
     *     Matrix2of5, ItalianPost25, DeutschePostIdentcode, DeutschePostLeitcode, VIN, Codabar
     *     Checksum always used: Rest symbology (optional)
     * @param enableEscape Indicates whether explains the character \&quot;\\\&quot; as an escape
     *     character in CodeText property. Used for Pdf417, DataMatrix, Code128 only If the
     *     EnableEscape is true, \&quot;\\\&quot; will be explained as a special escape character.
     *     Otherwise, \&quot;\\\&quot; acts as normal characters. Aspose.BarCode supports input
     *     decimal ascii code and mnemonic for ASCII control-code characters. For example, \\013 and
     *     \\\\CR stands for CR. (optional)
     * @param filledBars Value indicating whether bars are filled. Only for 1D barcodes. Default
     *     value: true. (optional)
     * @param alwaysShowChecksum Always display checksum digit in the human readable text for
     *     Code128 and GS1Code128 barcodes. (optional)
     * @param wideNarrowRatio Wide bars to Narrow bars ratio. Default value: 3, that is, wide bars
     *     are 3 times as wide as narrow bars. Used for ITF, PZN, PharmaCode, Standard2of5,
     *     Interleaved2of5, Matrix2of5, ItalianPost25, IATA2of5, VIN, DeutschePost, OPC, Code32,
     *     DataLogic2of5, PatchCode, Code39Extended, Code39Standard (optional)
     * @param validateText Only for 1D barcodes. If codetext is incorrect and value set to true -
     *     exception will be thrown. Otherwise codetext will be corrected to match barcode&#39;s
     *     specification. Exception always will be thrown for: Databar symbology if codetext is
     *     incorrect. Exception always will not be thrown for: AustraliaPost, SingaporePost,
     *     Code39Extended, Code93Extended, Code16K, Code128 symbology if codetext is incorrect.
     *     (optional)
     * @param supplementData Supplement parameters. Used for Interleaved2of5, Standard2of5, EAN13,
     *     EAN8, UPCA, UPCE, ISBN, ISSN, ISMN. (optional)
     * @param supplementSpace Space between main the BarCode and supplement BarCode. (optional)
     * @param barWidthReduction Bars reduction value that is used to compensate ink spread while
     *     printing. (optional)
     * @param format Result image format. (optional)
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
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/barcode/generate";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.type != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("Type", request.type));
        if (request.text != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("Text", request.text));
        if (request.twoDDisplayText != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("TwoDDisplayText", request.twoDDisplayText));
        if (request.textLocation != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("TextLocation", request.textLocation));
        if (request.textAlignment != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("TextAlignment", request.textAlignment));
        if (request.textColor != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("TextColor", request.textColor));
        if (request.fontSizeMode != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("FontSizeMode", request.fontSizeMode));
        if (request.noWrap != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("NoWrap", request.noWrap));
        if (request.resolution != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("Resolution", request.resolution));
        if (request.resolutionX != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("ResolutionX", request.resolutionX));
        if (request.resolutionY != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("ResolutionY", request.resolutionY));
        if (request.dimensionX != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("DimensionX", request.dimensionX));
        if (request.textSpace != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("TextSpace", request.textSpace));
        if (request.units != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("Units", request.units));
        if (request.sizeMode != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("SizeMode", request.sizeMode));
        if (request.barHeight != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("BarHeight", request.barHeight));
        if (request.imageHeight != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("ImageHeight", request.imageHeight));
        if (request.imageWidth != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("ImageWidth", request.imageWidth));
        if (request.rotationAngle != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("RotationAngle", request.rotationAngle));
        if (request.backColor != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("BackColor", request.backColor));
        if (request.barColor != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("BarColor", request.barColor));
        if (request.borderColor != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("BorderColor", request.borderColor));
        if (request.borderWidth != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("BorderWidth", request.borderWidth));
        if (request.borderDashStyle != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("BorderDashStyle", request.borderDashStyle));
        if (request.borderVisible != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("BorderVisible", request.borderVisible));
        if (request.enableChecksum != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("EnableChecksum", request.enableChecksum));
        if (request.enableEscape != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("EnableEscape", request.enableEscape));
        if (request.filledBars != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("FilledBars", request.filledBars));
        if (request.alwaysShowChecksum != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("AlwaysShowChecksum", request.alwaysShowChecksum));
        if (request.wideNarrowRatio != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("WideNarrowRatio", request.wideNarrowRatio));
        if (request.validateText != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("ValidateText", request.validateText));
        if (request.supplementData != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("SupplementData", request.supplementData));
        if (request.supplementSpace != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("SupplementSpace", request.supplementSpace));
        if (request.barWidthReduction != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("BarWidthReduction", request.barWidthReduction));
        if (request.format != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("format", request.format));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "image/png", "image/bmp", "image/gif", "image/jpeg", "image/svg+xml", "image/tiff"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {"application/json"};
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

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
                localVarPath,
                "GET",
                localVarQueryParams,
                localVarCollectionQueryParams,
                localVarPostBody,
                localVarHeaderParams,
                localVarFormParams,
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
     * @param type Type of barcode to generate. (required)
     * @param text Text to encode. (required)
     * @param twoDDisplayText Text that will be displayed instead of codetext in 2D barcodes. Used
     *     for: Aztec, Pdf417, DataMatrix, QR, MaxiCode, DotCode (optional)
     * @param textLocation Specify the displaying Text Location, set to CodeLocation.None to hide
     *     CodeText. Default value: CodeLocation.Below. (optional)
     * @param textAlignment Text alignment. (optional)
     * @param textColor Specify the displaying CodeText&#39;s Color. Default value: Color.Black.
     *     (optional)
     * @param fontSizeMode Specify FontSizeMode. If FontSizeMode is set to Auto, font size will be
     *     calculated automatically based on xDimension value. It is recommended to use
     *     FontSizeMode.Auto especially in AutoSizeMode.Nearest or AutoSizeMode.Interpolation.
     *     Default value: FontSizeMode.Auto. (optional)
     * @param noWrap Specify word wraps (line breaks) within text. Default value: false. (optional)
     * @param resolution Resolution of the BarCode image. One value for both dimensions. Default
     *     value: 96 dpi. (optional)
     * @param resolutionX DEPRECATED: Use &#39;Resolution&#39; instead. (optional)
     * @param resolutionY DEPRECATED: Use &#39;Resolution&#39; instead. (optional)
     * @param dimensionX The smallest width of the unit of BarCode bars or spaces. Increase this
     *     will increase the whole barcode image width. Ignored if AutoSizeMode property is set to
     *     AutoSizeMode.Nearest or AutoSizeMode.Interpolation. (optional)
     * @param textSpace Space between the CodeText and the BarCode in Unit value. Default value:
     *     2pt. Ignored for EAN8, EAN13, UPCE, UPCA, ISBN, ISMN, ISSN, UpcaGs1DatabarCoupon.
     *     (optional)
     * @param units Common Units for all measuring in query. Default units: pixel. (optional)
     * @param sizeMode Specifies the different types of automatic sizing modes. Default value:
     *     AutoSizeMode.None. (optional)
     * @param barHeight Height of the barcode in given units. Default units: pixel. (optional)
     * @param imageHeight Height of the barcode image in given units. Default units: pixel.
     *     (optional)
     * @param imageWidth Width of the barcode image in given units. Default units: pixel. (optional)
     * @param rotationAngle BarCode image rotation angle, measured in degree, e.g. RotationAngle
     *     &#x3D; 0 or RotationAngle &#x3D; 360 means no rotation. If RotationAngle NOT equal to 90,
     *     180, 270 or 0, it may increase the difficulty for the scanner to read the image. Default
     *     value: 0. (optional)
     * @param backColor Background color of the barcode image. Default value: Color.White.
     *     (optional)
     * @param barColor Bars color. Default value: Color.Black. (optional)
     * @param borderColor Border color. Default value: Color.Black. (optional)
     * @param borderWidth Border width. Default value: 0. Ignored if Visible is set to false.
     *     (optional)
     * @param borderDashStyle Border dash style. Default value: BorderDashStyle.Solid. (optional)
     * @param borderVisible Border visibility. If false than parameter Width is always ignored (0).
     *     Default value: false. (optional)
     * @param enableChecksum Enable checksum during generation 1D barcodes. Default is treated as
     *     Yes for symbology which must contain checksum, as No where checksum only possible.
     *     Checksum is possible: Code39 Standard/Extended, Standard2of5, Interleaved2of5,
     *     Matrix2of5, ItalianPost25, DeutschePostIdentcode, DeutschePostLeitcode, VIN, Codabar
     *     Checksum always used: Rest symbology (optional)
     * @param enableEscape Indicates whether explains the character \&quot;\\\&quot; as an escape
     *     character in CodeText property. Used for Pdf417, DataMatrix, Code128 only If the
     *     EnableEscape is true, \&quot;\\\&quot; will be explained as a special escape character.
     *     Otherwise, \&quot;\\\&quot; acts as normal characters. Aspose.BarCode supports input
     *     decimal ascii code and mnemonic for ASCII control-code characters. For example, \\013 and
     *     \\\\CR stands for CR. (optional)
     * @param filledBars Value indicating whether bars are filled. Only for 1D barcodes. Default
     *     value: true. (optional)
     * @param alwaysShowChecksum Always display checksum digit in the human readable text for
     *     Code128 and GS1Code128 barcodes. (optional)
     * @param wideNarrowRatio Wide bars to Narrow bars ratio. Default value: 3, that is, wide bars
     *     are 3 times as wide as narrow bars. Used for ITF, PZN, PharmaCode, Standard2of5,
     *     Interleaved2of5, Matrix2of5, ItalianPost25, IATA2of5, VIN, DeutschePost, OPC, Code32,
     *     DataLogic2of5, PatchCode, Code39Extended, Code39Standard (optional)
     * @param validateText Only for 1D barcodes. If codetext is incorrect and value set to true -
     *     exception will be thrown. Otherwise codetext will be corrected to match barcode&#39;s
     *     specification. Exception always will be thrown for: Databar symbology if codetext is
     *     incorrect. Exception always will not be thrown for: AustraliaPost, SingaporePost,
     *     Code39Extended, Code93Extended, Code16K, Code128 symbology if codetext is incorrect.
     *     (optional)
     * @param supplementData Supplement parameters. Used for Interleaved2of5, Standard2of5, EAN13,
     *     EAN8, UPCA, UPCE, ISBN, ISSN, ISMN. (optional)
     * @param supplementSpace Space between main the BarCode and supplement BarCode. (optional)
     * @param barWidthReduction Bars reduction value that is used to compensate ink spread while
     *     printing. (optional)
     * @param format Result image format. (optional)
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
     * @param type Type of barcode to generate. (required)
     * @param text Text to encode. (required)
     * @param twoDDisplayText Text that will be displayed instead of codetext in 2D barcodes. Used
     *     for: Aztec, Pdf417, DataMatrix, QR, MaxiCode, DotCode (optional)
     * @param textLocation Specify the displaying Text Location, set to CodeLocation.None to hide
     *     CodeText. Default value: CodeLocation.Below. (optional)
     * @param textAlignment Text alignment. (optional)
     * @param textColor Specify the displaying CodeText&#39;s Color. Default value: Color.Black.
     *     (optional)
     * @param fontSizeMode Specify FontSizeMode. If FontSizeMode is set to Auto, font size will be
     *     calculated automatically based on xDimension value. It is recommended to use
     *     FontSizeMode.Auto especially in AutoSizeMode.Nearest or AutoSizeMode.Interpolation.
     *     Default value: FontSizeMode.Auto. (optional)
     * @param noWrap Specify word wraps (line breaks) within text. Default value: false. (optional)
     * @param resolution Resolution of the BarCode image. One value for both dimensions. Default
     *     value: 96 dpi. (optional)
     * @param resolutionX DEPRECATED: Use &#39;Resolution&#39; instead. (optional)
     * @param resolutionY DEPRECATED: Use &#39;Resolution&#39; instead. (optional)
     * @param dimensionX The smallest width of the unit of BarCode bars or spaces. Increase this
     *     will increase the whole barcode image width. Ignored if AutoSizeMode property is set to
     *     AutoSizeMode.Nearest or AutoSizeMode.Interpolation. (optional)
     * @param textSpace Space between the CodeText and the BarCode in Unit value. Default value:
     *     2pt. Ignored for EAN8, EAN13, UPCE, UPCA, ISBN, ISMN, ISSN, UpcaGs1DatabarCoupon.
     *     (optional)
     * @param units Common Units for all measuring in query. Default units: pixel. (optional)
     * @param sizeMode Specifies the different types of automatic sizing modes. Default value:
     *     AutoSizeMode.None. (optional)
     * @param barHeight Height of the barcode in given units. Default units: pixel. (optional)
     * @param imageHeight Height of the barcode image in given units. Default units: pixel.
     *     (optional)
     * @param imageWidth Width of the barcode image in given units. Default units: pixel. (optional)
     * @param rotationAngle BarCode image rotation angle, measured in degree, e.g. RotationAngle
     *     &#x3D; 0 or RotationAngle &#x3D; 360 means no rotation. If RotationAngle NOT equal to 90,
     *     180, 270 or 0, it may increase the difficulty for the scanner to read the image. Default
     *     value: 0. (optional)
     * @param backColor Background color of the barcode image. Default value: Color.White.
     *     (optional)
     * @param barColor Bars color. Default value: Color.Black. (optional)
     * @param borderColor Border color. Default value: Color.Black. (optional)
     * @param borderWidth Border width. Default value: 0. Ignored if Visible is set to false.
     *     (optional)
     * @param borderDashStyle Border dash style. Default value: BorderDashStyle.Solid. (optional)
     * @param borderVisible Border visibility. If false than parameter Width is always ignored (0).
     *     Default value: false. (optional)
     * @param enableChecksum Enable checksum during generation 1D barcodes. Default is treated as
     *     Yes for symbology which must contain checksum, as No where checksum only possible.
     *     Checksum is possible: Code39 Standard/Extended, Standard2of5, Interleaved2of5,
     *     Matrix2of5, ItalianPost25, DeutschePostIdentcode, DeutschePostLeitcode, VIN, Codabar
     *     Checksum always used: Rest symbology (optional)
     * @param enableEscape Indicates whether explains the character \&quot;\\\&quot; as an escape
     *     character in CodeText property. Used for Pdf417, DataMatrix, Code128 only If the
     *     EnableEscape is true, \&quot;\\\&quot; will be explained as a special escape character.
     *     Otherwise, \&quot;\\\&quot; acts as normal characters. Aspose.BarCode supports input
     *     decimal ascii code and mnemonic for ASCII control-code characters. For example, \\013 and
     *     \\\\CR stands for CR. (optional)
     * @param filledBars Value indicating whether bars are filled. Only for 1D barcodes. Default
     *     value: true. (optional)
     * @param alwaysShowChecksum Always display checksum digit in the human readable text for
     *     Code128 and GS1Code128 barcodes. (optional)
     * @param wideNarrowRatio Wide bars to Narrow bars ratio. Default value: 3, that is, wide bars
     *     are 3 times as wide as narrow bars. Used for ITF, PZN, PharmaCode, Standard2of5,
     *     Interleaved2of5, Matrix2of5, ItalianPost25, IATA2of5, VIN, DeutschePost, OPC, Code32,
     *     DataLogic2of5, PatchCode, Code39Extended, Code39Standard (optional)
     * @param validateText Only for 1D barcodes. If codetext is incorrect and value set to true -
     *     exception will be thrown. Otherwise codetext will be corrected to match barcode&#39;s
     *     specification. Exception always will be thrown for: Databar symbology if codetext is
     *     incorrect. Exception always will not be thrown for: AustraliaPost, SingaporePost,
     *     Code39Extended, Code93Extended, Code16K, Code128 symbology if codetext is incorrect.
     *     (optional)
     * @param supplementData Supplement parameters. Used for Interleaved2of5, Standard2of5, EAN13,
     *     EAN8, UPCA, UPCE, ISBN, ISSN, ISMN. (optional)
     * @param supplementSpace Space between main the BarCode and supplement BarCode. (optional)
     * @param barWidthReduction Bars reduction value that is used to compensate ink spread while
     *     printing. (optional)
     * @param format Result image format. (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public ApiResponse<File> getBarcodeGenerateWithHttpInfo(GetBarcodeGenerateRequest request)
            throws ApiException {
        com.squareup.okhttp.Call call = getBarcodeGenerateValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<File>() {}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Generate barcode. (asynchronously)
     *
     * @param type Type of barcode to generate. (required)
     * @param text Text to encode. (required)
     * @param twoDDisplayText Text that will be displayed instead of codetext in 2D barcodes. Used
     *     for: Aztec, Pdf417, DataMatrix, QR, MaxiCode, DotCode (optional)
     * @param textLocation Specify the displaying Text Location, set to CodeLocation.None to hide
     *     CodeText. Default value: CodeLocation.Below. (optional)
     * @param textAlignment Text alignment. (optional)
     * @param textColor Specify the displaying CodeText&#39;s Color. Default value: Color.Black.
     *     (optional)
     * @param fontSizeMode Specify FontSizeMode. If FontSizeMode is set to Auto, font size will be
     *     calculated automatically based on xDimension value. It is recommended to use
     *     FontSizeMode.Auto especially in AutoSizeMode.Nearest or AutoSizeMode.Interpolation.
     *     Default value: FontSizeMode.Auto. (optional)
     * @param noWrap Specify word wraps (line breaks) within text. Default value: false. (optional)
     * @param resolution Resolution of the BarCode image. One value for both dimensions. Default
     *     value: 96 dpi. (optional)
     * @param resolutionX DEPRECATED: Use &#39;Resolution&#39; instead. (optional)
     * @param resolutionY DEPRECATED: Use &#39;Resolution&#39; instead. (optional)
     * @param dimensionX The smallest width of the unit of BarCode bars or spaces. Increase this
     *     will increase the whole barcode image width. Ignored if AutoSizeMode property is set to
     *     AutoSizeMode.Nearest or AutoSizeMode.Interpolation. (optional)
     * @param textSpace Space between the CodeText and the BarCode in Unit value. Default value:
     *     2pt. Ignored for EAN8, EAN13, UPCE, UPCA, ISBN, ISMN, ISSN, UpcaGs1DatabarCoupon.
     *     (optional)
     * @param units Common Units for all measuring in query. Default units: pixel. (optional)
     * @param sizeMode Specifies the different types of automatic sizing modes. Default value:
     *     AutoSizeMode.None. (optional)
     * @param barHeight Height of the barcode in given units. Default units: pixel. (optional)
     * @param imageHeight Height of the barcode image in given units. Default units: pixel.
     *     (optional)
     * @param imageWidth Width of the barcode image in given units. Default units: pixel. (optional)
     * @param rotationAngle BarCode image rotation angle, measured in degree, e.g. RotationAngle
     *     &#x3D; 0 or RotationAngle &#x3D; 360 means no rotation. If RotationAngle NOT equal to 90,
     *     180, 270 or 0, it may increase the difficulty for the scanner to read the image. Default
     *     value: 0. (optional)
     * @param backColor Background color of the barcode image. Default value: Color.White.
     *     (optional)
     * @param barColor Bars color. Default value: Color.Black. (optional)
     * @param borderColor Border color. Default value: Color.Black. (optional)
     * @param borderWidth Border width. Default value: 0. Ignored if Visible is set to false.
     *     (optional)
     * @param borderDashStyle Border dash style. Default value: BorderDashStyle.Solid. (optional)
     * @param borderVisible Border visibility. If false than parameter Width is always ignored (0).
     *     Default value: false. (optional)
     * @param enableChecksum Enable checksum during generation 1D barcodes. Default is treated as
     *     Yes for symbology which must contain checksum, as No where checksum only possible.
     *     Checksum is possible: Code39 Standard/Extended, Standard2of5, Interleaved2of5,
     *     Matrix2of5, ItalianPost25, DeutschePostIdentcode, DeutschePostLeitcode, VIN, Codabar
     *     Checksum always used: Rest symbology (optional)
     * @param enableEscape Indicates whether explains the character \&quot;\\\&quot; as an escape
     *     character in CodeText property. Used for Pdf417, DataMatrix, Code128 only If the
     *     EnableEscape is true, \&quot;\\\&quot; will be explained as a special escape character.
     *     Otherwise, \&quot;\\\&quot; acts as normal characters. Aspose.BarCode supports input
     *     decimal ascii code and mnemonic for ASCII control-code characters. For example, \\013 and
     *     \\\\CR stands for CR. (optional)
     * @param filledBars Value indicating whether bars are filled. Only for 1D barcodes. Default
     *     value: true. (optional)
     * @param alwaysShowChecksum Always display checksum digit in the human readable text for
     *     Code128 and GS1Code128 barcodes. (optional)
     * @param wideNarrowRatio Wide bars to Narrow bars ratio. Default value: 3, that is, wide bars
     *     are 3 times as wide as narrow bars. Used for ITF, PZN, PharmaCode, Standard2of5,
     *     Interleaved2of5, Matrix2of5, ItalianPost25, IATA2of5, VIN, DeutschePost, OPC, Code32,
     *     DataLogic2of5, PatchCode, Code39Extended, Code39Standard (optional)
     * @param validateText Only for 1D barcodes. If codetext is incorrect and value set to true -
     *     exception will be thrown. Otherwise codetext will be corrected to match barcode&#39;s
     *     specification. Exception always will be thrown for: Databar symbology if codetext is
     *     incorrect. Exception always will not be thrown for: AustraliaPost, SingaporePost,
     *     Code39Extended, Code93Extended, Code16K, Code128 symbology if codetext is incorrect.
     *     (optional)
     * @param supplementData Supplement parameters. Used for Interleaved2of5, Standard2of5, EAN13,
     *     EAN8, UPCA, UPCE, ISBN, ISSN, ISMN. (optional)
     * @param supplementSpace Space between main the BarCode and supplement BarCode. (optional)
     * @param barWidthReduction Bars reduction value that is used to compensate ink spread while
     *     printing. (optional)
     * @param format Result image format. (optional)
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
        Type localVarReturnType = new TypeToken<File>() {}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getBarcodeRecognize
     *
     * @param name The image file name. (required)
     * @param type The type of barcode to read. (optional)
     * @param checksumValidation Enable checksum validation during recognition for 1D barcodes.
     *     Default is treated as Yes for symbologies which must contain checksum, as No where
     *     checksum only possible. Checksum never used: Codabar Checksum is possible: Code39
     *     Standard/Extended, Standard2of5, Interleaved2of5, Matrix2of5, ItalianPost25,
     *     DeutschePostIdentcode, DeutschePostLeitcode, VIN Checksum always used: Rest symbologies
     *     (optional)
     * @param detectEncoding A flag which force engine to detect codetext encoding for Unicode.
     *     (optional)
     * @param preset Preset allows to configure recognition quality and speed manually. You can
     *     quickly set up Preset by embedded presets: HighPerformance, NormalQuality, HighQuality,
     *     MaxBarCodes or you can manually configure separate options. Default value of Preset is
     *     NormalQuality. (optional)
     * @param rectX Set X for area for recognition. (optional)
     * @param rectY Set Y for area for recognition. (optional)
     * @param rectWidth Set Width of area for recognition. (optional)
     * @param rectHeight Set Height of area for recognition. (optional)
     * @param stripFNC Value indicating whether FNC symbol strip must be done. (optional)
     * @param timeout Timeout of recognition process. (optional)
     * @param medianSmoothingWindowSize Window size for median smoothing. Typical values are 3 or 4.
     *     Default value is 3. AllowMedianSmoothing must be set. (optional)
     * @param allowMedianSmoothing Allows engine to enable median smoothing as additional scan. Mode
     *     helps to recognize noised barcodes. (optional)
     * @param allowComplexBackground Allows engine to recognize color barcodes on color background
     *     as additional scan. Extremely slow mode. (optional)
     * @param allowDatamatrixIndustrialBarcodes Allows engine for Datamatrix to recognize dashed
     *     industrial Datamatrix barcodes. Slow mode which helps only for dashed barcodes which
     *     consist from spots. (optional)
     * @param allowDecreasedImage Allows engine to recognize decreased image as additional scan.
     *     Size for decreasing is selected by internal engine algorithms. Mode helps to recognize
     *     barcodes which are noised and blurred but captured with high resolution. (optional)
     * @param allowDetectScanGap Allows engine to use gap between scans to increase recognition
     *     speed. Mode can make recognition problems with low height barcodes. (optional)
     * @param allowIncorrectBarcodes Allows engine to recognize barcodes which has incorrect
     *     checksum or incorrect values. Mode can be used to recognize damaged barcodes with
     *     incorrect text. (optional)
     * @param allowInvertImage Allows engine to recognize inverse color image as additional scan.
     *     Mode can be used when barcode is white on black background. (optional)
     * @param allowMicroWhiteSpotsRemoving Allows engine for Postal barcodes to recognize slightly
     *     noised images. Mode helps to recognize slightly damaged Postal barcodes. (optional)
     * @param allowOneDFastBarcodesDetector Allows engine for 1D barcodes to quickly recognize high
     *     quality barcodes which fill almost whole image. Mode helps to quickly recognize generated
     *     barcodes from Internet. (optional)
     * @param allowOneDWipedBarsRestoration Allows engine for 1D barcodes to recognize barcodes with
     *     single wiped/glued bars in pattern. (optional)
     * @param allowQRMicroQrRestoration Allows engine for QR/MicroQR to recognize damaged MicroQR
     *     barcodes. (optional)
     * @param allowRegularImage Allows engine to recognize regular image without any restorations as
     *     main scan. Mode to recognize image as is. (optional)
     * @param allowSaltAndPepperFiltering Allows engine to recognize barcodes with salt and pepper
     *     noise type. Mode can remove small noise with white and black dots. (optional)
     * @param allowWhiteSpotsRemoving Allows engine to recognize image without small white spots as
     *     additional scan. Mode helps to recognize noised image as well as median smoothing
     *     filtering. (optional)
     * @param checkMore1DVariants Allows engine to recognize 1D barcodes with checksum by checking
     *     more recognition variants. Default value: False. (optional)
     * @param regionLikelihoodThresholdPercent Sets threshold for detected regions that may contain
     *     barcodes. Value 0.7 means that bottom 70% of possible regions are filtered out and not
     *     processed further. Region likelihood threshold must be between [0.05, 0.9] Use high
     *     values for clear images with few barcodes. Use low values for images with many barcodes
     *     or for noisy images. Low value may lead to a bigger recognition time. (optional)
     * @param scanWindowSizes Scan window sizes in pixels. Allowed sizes are 10, 15, 20, 25, 30.
     *     Scanning with small window size takes more time and provides more accuracy but may fail
     *     in detecting very big barcodes. Combining of several window sizes can improve detection
     *     quality. (optional)
     * @param similarity Similarity coefficient depends on how homogeneous barcodes are. Use high
     *     value for for clear barcodes. Use low values to detect barcodes that ara partly damaged
     *     or not lighten evenly. Similarity coefficient must be between [0.5, 0.9] (optional)
     * @param skipDiagonalSearch Allows detector to skip search for diagonal barcodes. Setting it to
     *     false will increase detection time but allow to find diagonal barcodes that can be missed
     *     otherwise. Enabling of diagonal search leads to a bigger detection time. (optional)
     * @param readTinyBarcodes Allows engine to recognize tiny barcodes on large images. Ignored if
     *     AllowIncorrectBarcodes is set to True. Default value: False. (optional)
     * @param australianPostEncodingTable Interpreting Type for the Customer Information of
     *     AustralianPost BarCode.Default is CustomerInformationInterpretingType.Other. (optional)
     * @param rectangleRegion (optional)
     * @param storage The image storage. (optional)
     * @param folder The image folder. (optional)
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
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath =
                "/barcode/{name}/recognize".replaceAll("\\{" + "name" + "}", request.name);

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.type != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("Type", request.type));
        if (request.checksumValidation != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("ChecksumValidation", request.checksumValidation));
        if (request.detectEncoding != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("DetectEncoding", request.detectEncoding));
        if (request.preset != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("Preset", request.preset));
        if (request.rectX != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("RectX", request.rectX));
        if (request.rectY != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("RectY", request.rectY));
        if (request.rectWidth != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("RectWidth", request.rectWidth));
        if (request.rectHeight != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("RectHeight", request.rectHeight));
        if (request.stripFNC != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("StripFNC", request.stripFNC));
        if (request.timeout != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("Timeout", request.timeout));
        if (request.medianSmoothingWindowSize != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair(
                            "MedianSmoothingWindowSize", request.medianSmoothingWindowSize));
        if (request.allowMedianSmoothing != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair(
                            "AllowMedianSmoothing", request.allowMedianSmoothing));
        if (request.allowComplexBackground != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair(
                            "AllowComplexBackground", request.allowComplexBackground));
        if (request.allowDatamatrixIndustrialBarcodes != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair(
                            "AllowDatamatrixIndustrialBarcodes",
                            request.allowDatamatrixIndustrialBarcodes));
        if (request.allowDecreasedImage != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("AllowDecreasedImage", request.allowDecreasedImage));
        if (request.allowDetectScanGap != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("AllowDetectScanGap", request.allowDetectScanGap));
        if (request.allowIncorrectBarcodes != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair(
                            "AllowIncorrectBarcodes", request.allowIncorrectBarcodes));
        if (request.allowInvertImage != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("AllowInvertImage", request.allowInvertImage));
        if (request.allowMicroWhiteSpotsRemoving != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair(
                            "AllowMicroWhiteSpotsRemoving", request.allowMicroWhiteSpotsRemoving));
        if (request.allowOneDFastBarcodesDetector != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair(
                            "AllowOneDFastBarcodesDetector",
                            request.allowOneDFastBarcodesDetector));
        if (request.allowOneDWipedBarsRestoration != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair(
                            "AllowOneDWipedBarsRestoration",
                            request.allowOneDWipedBarsRestoration));
        if (request.allowQRMicroQrRestoration != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair(
                            "AllowQRMicroQrRestoration", request.allowQRMicroQrRestoration));
        if (request.allowRegularImage != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("AllowRegularImage", request.allowRegularImage));
        if (request.allowSaltAndPepperFiltering != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair(
                            "AllowSaltAndPepperFiltering", request.allowSaltAndPepperFiltering));
        if (request.allowWhiteSpotsRemoving != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair(
                            "AllowWhiteSpotsRemoving", request.allowWhiteSpotsRemoving));
        if (request.checkMore1DVariants != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("CheckMore1DVariants", request.checkMore1DVariants));
        if (request.regionLikelihoodThresholdPercent != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair(
                            "RegionLikelihoodThresholdPercent",
                            request.regionLikelihoodThresholdPercent));
        if (request.scanWindowSizes != null)
            localVarCollectionQueryParams.addAll(
                    apiClient.parameterToPairs(
                            "multi", "ScanWindowSizes", request.scanWindowSizes));
        if (request.similarity != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("Similarity", request.similarity));
        if (request.skipDiagonalSearch != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("SkipDiagonalSearch", request.skipDiagonalSearch));
        if (request.readTinyBarcodes != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("ReadTinyBarcodes", request.readTinyBarcodes));
        if (request.australianPostEncodingTable != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair(
                            "AustralianPostEncodingTable", request.australianPostEncodingTable));
        if (request.rectangleRegion != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("RectangleRegion", request.rectangleRegion));
        if (request.storage != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.storage));
        if (request.folder != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {"application/json"};
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

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
                localVarPath,
                "GET",
                localVarQueryParams,
                localVarCollectionQueryParams,
                localVarPostBody,
                localVarHeaderParams,
                localVarFormParams,
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
     * @param name The image file name. (required)
     * @param type The type of barcode to read. (optional)
     * @param checksumValidation Enable checksum validation during recognition for 1D barcodes.
     *     Default is treated as Yes for symbologies which must contain checksum, as No where
     *     checksum only possible. Checksum never used: Codabar Checksum is possible: Code39
     *     Standard/Extended, Standard2of5, Interleaved2of5, Matrix2of5, ItalianPost25,
     *     DeutschePostIdentcode, DeutschePostLeitcode, VIN Checksum always used: Rest symbologies
     *     (optional)
     * @param detectEncoding A flag which force engine to detect codetext encoding for Unicode.
     *     (optional)
     * @param preset Preset allows to configure recognition quality and speed manually. You can
     *     quickly set up Preset by embedded presets: HighPerformance, NormalQuality, HighQuality,
     *     MaxBarCodes or you can manually configure separate options. Default value of Preset is
     *     NormalQuality. (optional)
     * @param rectX Set X for area for recognition. (optional)
     * @param rectY Set Y for area for recognition. (optional)
     * @param rectWidth Set Width of area for recognition. (optional)
     * @param rectHeight Set Height of area for recognition. (optional)
     * @param stripFNC Value indicating whether FNC symbol strip must be done. (optional)
     * @param timeout Timeout of recognition process. (optional)
     * @param medianSmoothingWindowSize Window size for median smoothing. Typical values are 3 or 4.
     *     Default value is 3. AllowMedianSmoothing must be set. (optional)
     * @param allowMedianSmoothing Allows engine to enable median smoothing as additional scan. Mode
     *     helps to recognize noised barcodes. (optional)
     * @param allowComplexBackground Allows engine to recognize color barcodes on color background
     *     as additional scan. Extremely slow mode. (optional)
     * @param allowDatamatrixIndustrialBarcodes Allows engine for Datamatrix to recognize dashed
     *     industrial Datamatrix barcodes. Slow mode which helps only for dashed barcodes which
     *     consist from spots. (optional)
     * @param allowDecreasedImage Allows engine to recognize decreased image as additional scan.
     *     Size for decreasing is selected by internal engine algorithms. Mode helps to recognize
     *     barcodes which are noised and blurred but captured with high resolution. (optional)
     * @param allowDetectScanGap Allows engine to use gap between scans to increase recognition
     *     speed. Mode can make recognition problems with low height barcodes. (optional)
     * @param allowIncorrectBarcodes Allows engine to recognize barcodes which has incorrect
     *     checksum or incorrect values. Mode can be used to recognize damaged barcodes with
     *     incorrect text. (optional)
     * @param allowInvertImage Allows engine to recognize inverse color image as additional scan.
     *     Mode can be used when barcode is white on black background. (optional)
     * @param allowMicroWhiteSpotsRemoving Allows engine for Postal barcodes to recognize slightly
     *     noised images. Mode helps to recognize slightly damaged Postal barcodes. (optional)
     * @param allowOneDFastBarcodesDetector Allows engine for 1D barcodes to quickly recognize high
     *     quality barcodes which fill almost whole image. Mode helps to quickly recognize generated
     *     barcodes from Internet. (optional)
     * @param allowOneDWipedBarsRestoration Allows engine for 1D barcodes to recognize barcodes with
     *     single wiped/glued bars in pattern. (optional)
     * @param allowQRMicroQrRestoration Allows engine for QR/MicroQR to recognize damaged MicroQR
     *     barcodes. (optional)
     * @param allowRegularImage Allows engine to recognize regular image without any restorations as
     *     main scan. Mode to recognize image as is. (optional)
     * @param allowSaltAndPepperFiltering Allows engine to recognize barcodes with salt and pepper
     *     noise type. Mode can remove small noise with white and black dots. (optional)
     * @param allowWhiteSpotsRemoving Allows engine to recognize image without small white spots as
     *     additional scan. Mode helps to recognize noised image as well as median smoothing
     *     filtering. (optional)
     * @param checkMore1DVariants Allows engine to recognize 1D barcodes with checksum by checking
     *     more recognition variants. Default value: False. (optional)
     * @param regionLikelihoodThresholdPercent Sets threshold for detected regions that may contain
     *     barcodes. Value 0.7 means that bottom 70% of possible regions are filtered out and not
     *     processed further. Region likelihood threshold must be between [0.05, 0.9] Use high
     *     values for clear images with few barcodes. Use low values for images with many barcodes
     *     or for noisy images. Low value may lead to a bigger recognition time. (optional)
     * @param scanWindowSizes Scan window sizes in pixels. Allowed sizes are 10, 15, 20, 25, 30.
     *     Scanning with small window size takes more time and provides more accuracy but may fail
     *     in detecting very big barcodes. Combining of several window sizes can improve detection
     *     quality. (optional)
     * @param similarity Similarity coefficient depends on how homogeneous barcodes are. Use high
     *     value for for clear barcodes. Use low values to detect barcodes that ara partly damaged
     *     or not lighten evenly. Similarity coefficient must be between [0.5, 0.9] (optional)
     * @param skipDiagonalSearch Allows detector to skip search for diagonal barcodes. Setting it to
     *     false will increase detection time but allow to find diagonal barcodes that can be missed
     *     otherwise. Enabling of diagonal search leads to a bigger detection time. (optional)
     * @param readTinyBarcodes Allows engine to recognize tiny barcodes on large images. Ignored if
     *     AllowIncorrectBarcodes is set to True. Default value: False. (optional)
     * @param australianPostEncodingTable Interpreting Type for the Customer Information of
     *     AustralianPost BarCode.Default is CustomerInformationInterpretingType.Other. (optional)
     * @param rectangleRegion (optional)
     * @param storage The image storage. (optional)
     * @param folder The image folder. (optional)
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
     * @param name The image file name. (required)
     * @param type The type of barcode to read. (optional)
     * @param checksumValidation Enable checksum validation during recognition for 1D barcodes.
     *     Default is treated as Yes for symbologies which must contain checksum, as No where
     *     checksum only possible. Checksum never used: Codabar Checksum is possible: Code39
     *     Standard/Extended, Standard2of5, Interleaved2of5, Matrix2of5, ItalianPost25,
     *     DeutschePostIdentcode, DeutschePostLeitcode, VIN Checksum always used: Rest symbologies
     *     (optional)
     * @param detectEncoding A flag which force engine to detect codetext encoding for Unicode.
     *     (optional)
     * @param preset Preset allows to configure recognition quality and speed manually. You can
     *     quickly set up Preset by embedded presets: HighPerformance, NormalQuality, HighQuality,
     *     MaxBarCodes or you can manually configure separate options. Default value of Preset is
     *     NormalQuality. (optional)
     * @param rectX Set X for area for recognition. (optional)
     * @param rectY Set Y for area for recognition. (optional)
     * @param rectWidth Set Width of area for recognition. (optional)
     * @param rectHeight Set Height of area for recognition. (optional)
     * @param stripFNC Value indicating whether FNC symbol strip must be done. (optional)
     * @param timeout Timeout of recognition process. (optional)
     * @param medianSmoothingWindowSize Window size for median smoothing. Typical values are 3 or 4.
     *     Default value is 3. AllowMedianSmoothing must be set. (optional)
     * @param allowMedianSmoothing Allows engine to enable median smoothing as additional scan. Mode
     *     helps to recognize noised barcodes. (optional)
     * @param allowComplexBackground Allows engine to recognize color barcodes on color background
     *     as additional scan. Extremely slow mode. (optional)
     * @param allowDatamatrixIndustrialBarcodes Allows engine for Datamatrix to recognize dashed
     *     industrial Datamatrix barcodes. Slow mode which helps only for dashed barcodes which
     *     consist from spots. (optional)
     * @param allowDecreasedImage Allows engine to recognize decreased image as additional scan.
     *     Size for decreasing is selected by internal engine algorithms. Mode helps to recognize
     *     barcodes which are noised and blurred but captured with high resolution. (optional)
     * @param allowDetectScanGap Allows engine to use gap between scans to increase recognition
     *     speed. Mode can make recognition problems with low height barcodes. (optional)
     * @param allowIncorrectBarcodes Allows engine to recognize barcodes which has incorrect
     *     checksum or incorrect values. Mode can be used to recognize damaged barcodes with
     *     incorrect text. (optional)
     * @param allowInvertImage Allows engine to recognize inverse color image as additional scan.
     *     Mode can be used when barcode is white on black background. (optional)
     * @param allowMicroWhiteSpotsRemoving Allows engine for Postal barcodes to recognize slightly
     *     noised images. Mode helps to recognize slightly damaged Postal barcodes. (optional)
     * @param allowOneDFastBarcodesDetector Allows engine for 1D barcodes to quickly recognize high
     *     quality barcodes which fill almost whole image. Mode helps to quickly recognize generated
     *     barcodes from Internet. (optional)
     * @param allowOneDWipedBarsRestoration Allows engine for 1D barcodes to recognize barcodes with
     *     single wiped/glued bars in pattern. (optional)
     * @param allowQRMicroQrRestoration Allows engine for QR/MicroQR to recognize damaged MicroQR
     *     barcodes. (optional)
     * @param allowRegularImage Allows engine to recognize regular image without any restorations as
     *     main scan. Mode to recognize image as is. (optional)
     * @param allowSaltAndPepperFiltering Allows engine to recognize barcodes with salt and pepper
     *     noise type. Mode can remove small noise with white and black dots. (optional)
     * @param allowWhiteSpotsRemoving Allows engine to recognize image without small white spots as
     *     additional scan. Mode helps to recognize noised image as well as median smoothing
     *     filtering. (optional)
     * @param checkMore1DVariants Allows engine to recognize 1D barcodes with checksum by checking
     *     more recognition variants. Default value: False. (optional)
     * @param regionLikelihoodThresholdPercent Sets threshold for detected regions that may contain
     *     barcodes. Value 0.7 means that bottom 70% of possible regions are filtered out and not
     *     processed further. Region likelihood threshold must be between [0.05, 0.9] Use high
     *     values for clear images with few barcodes. Use low values for images with many barcodes
     *     or for noisy images. Low value may lead to a bigger recognition time. (optional)
     * @param scanWindowSizes Scan window sizes in pixels. Allowed sizes are 10, 15, 20, 25, 30.
     *     Scanning with small window size takes more time and provides more accuracy but may fail
     *     in detecting very big barcodes. Combining of several window sizes can improve detection
     *     quality. (optional)
     * @param similarity Similarity coefficient depends on how homogeneous barcodes are. Use high
     *     value for for clear barcodes. Use low values to detect barcodes that ara partly damaged
     *     or not lighten evenly. Similarity coefficient must be between [0.5, 0.9] (optional)
     * @param skipDiagonalSearch Allows detector to skip search for diagonal barcodes. Setting it to
     *     false will increase detection time but allow to find diagonal barcodes that can be missed
     *     otherwise. Enabling of diagonal search leads to a bigger detection time. (optional)
     * @param readTinyBarcodes Allows engine to recognize tiny barcodes on large images. Ignored if
     *     AllowIncorrectBarcodes is set to True. Default value: False. (optional)
     * @param australianPostEncodingTable Interpreting Type for the Customer Information of
     *     AustralianPost BarCode.Default is CustomerInformationInterpretingType.Other. (optional)
     * @param rectangleRegion (optional)
     * @param storage The image storage. (optional)
     * @param folder The image folder. (optional)
     * @return ApiResponse&lt;BarcodeResponseList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public ApiResponse<BarcodeResponseList> getBarcodeRecognizeWithHttpInfo(
            GetBarcodeRecognizeRequest request) throws ApiException {
        com.squareup.okhttp.Call call = getBarcodeRecognizeValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<BarcodeResponseList>() {}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Recognize barcode from a file on server. (asynchronously)
     *
     * @param name The image file name. (required)
     * @param type The type of barcode to read. (optional)
     * @param checksumValidation Enable checksum validation during recognition for 1D barcodes.
     *     Default is treated as Yes for symbologies which must contain checksum, as No where
     *     checksum only possible. Checksum never used: Codabar Checksum is possible: Code39
     *     Standard/Extended, Standard2of5, Interleaved2of5, Matrix2of5, ItalianPost25,
     *     DeutschePostIdentcode, DeutschePostLeitcode, VIN Checksum always used: Rest symbologies
     *     (optional)
     * @param detectEncoding A flag which force engine to detect codetext encoding for Unicode.
     *     (optional)
     * @param preset Preset allows to configure recognition quality and speed manually. You can
     *     quickly set up Preset by embedded presets: HighPerformance, NormalQuality, HighQuality,
     *     MaxBarCodes or you can manually configure separate options. Default value of Preset is
     *     NormalQuality. (optional)
     * @param rectX Set X for area for recognition. (optional)
     * @param rectY Set Y for area for recognition. (optional)
     * @param rectWidth Set Width of area for recognition. (optional)
     * @param rectHeight Set Height of area for recognition. (optional)
     * @param stripFNC Value indicating whether FNC symbol strip must be done. (optional)
     * @param timeout Timeout of recognition process. (optional)
     * @param medianSmoothingWindowSize Window size for median smoothing. Typical values are 3 or 4.
     *     Default value is 3. AllowMedianSmoothing must be set. (optional)
     * @param allowMedianSmoothing Allows engine to enable median smoothing as additional scan. Mode
     *     helps to recognize noised barcodes. (optional)
     * @param allowComplexBackground Allows engine to recognize color barcodes on color background
     *     as additional scan. Extremely slow mode. (optional)
     * @param allowDatamatrixIndustrialBarcodes Allows engine for Datamatrix to recognize dashed
     *     industrial Datamatrix barcodes. Slow mode which helps only for dashed barcodes which
     *     consist from spots. (optional)
     * @param allowDecreasedImage Allows engine to recognize decreased image as additional scan.
     *     Size for decreasing is selected by internal engine algorithms. Mode helps to recognize
     *     barcodes which are noised and blurred but captured with high resolution. (optional)
     * @param allowDetectScanGap Allows engine to use gap between scans to increase recognition
     *     speed. Mode can make recognition problems with low height barcodes. (optional)
     * @param allowIncorrectBarcodes Allows engine to recognize barcodes which has incorrect
     *     checksum or incorrect values. Mode can be used to recognize damaged barcodes with
     *     incorrect text. (optional)
     * @param allowInvertImage Allows engine to recognize inverse color image as additional scan.
     *     Mode can be used when barcode is white on black background. (optional)
     * @param allowMicroWhiteSpotsRemoving Allows engine for Postal barcodes to recognize slightly
     *     noised images. Mode helps to recognize slightly damaged Postal barcodes. (optional)
     * @param allowOneDFastBarcodesDetector Allows engine for 1D barcodes to quickly recognize high
     *     quality barcodes which fill almost whole image. Mode helps to quickly recognize generated
     *     barcodes from Internet. (optional)
     * @param allowOneDWipedBarsRestoration Allows engine for 1D barcodes to recognize barcodes with
     *     single wiped/glued bars in pattern. (optional)
     * @param allowQRMicroQrRestoration Allows engine for QR/MicroQR to recognize damaged MicroQR
     *     barcodes. (optional)
     * @param allowRegularImage Allows engine to recognize regular image without any restorations as
     *     main scan. Mode to recognize image as is. (optional)
     * @param allowSaltAndPepperFiltering Allows engine to recognize barcodes with salt and pepper
     *     noise type. Mode can remove small noise with white and black dots. (optional)
     * @param allowWhiteSpotsRemoving Allows engine to recognize image without small white spots as
     *     additional scan. Mode helps to recognize noised image as well as median smoothing
     *     filtering. (optional)
     * @param checkMore1DVariants Allows engine to recognize 1D barcodes with checksum by checking
     *     more recognition variants. Default value: False. (optional)
     * @param regionLikelihoodThresholdPercent Sets threshold for detected regions that may contain
     *     barcodes. Value 0.7 means that bottom 70% of possible regions are filtered out and not
     *     processed further. Region likelihood threshold must be between [0.05, 0.9] Use high
     *     values for clear images with few barcodes. Use low values for images with many barcodes
     *     or for noisy images. Low value may lead to a bigger recognition time. (optional)
     * @param scanWindowSizes Scan window sizes in pixels. Allowed sizes are 10, 15, 20, 25, 30.
     *     Scanning with small window size takes more time and provides more accuracy but may fail
     *     in detecting very big barcodes. Combining of several window sizes can improve detection
     *     quality. (optional)
     * @param similarity Similarity coefficient depends on how homogeneous barcodes are. Use high
     *     value for for clear barcodes. Use low values to detect barcodes that ara partly damaged
     *     or not lighten evenly. Similarity coefficient must be between [0.5, 0.9] (optional)
     * @param skipDiagonalSearch Allows detector to skip search for diagonal barcodes. Setting it to
     *     false will increase detection time but allow to find diagonal barcodes that can be missed
     *     otherwise. Enabling of diagonal search leads to a bigger detection time. (optional)
     * @param readTinyBarcodes Allows engine to recognize tiny barcodes on large images. Ignored if
     *     AllowIncorrectBarcodes is set to True. Default value: False. (optional)
     * @param australianPostEncodingTable Interpreting Type for the Customer Information of
     *     AustralianPost BarCode.Default is CustomerInformationInterpretingType.Other. (optional)
     * @param rectangleRegion (optional)
     * @param storage The image storage. (optional)
     * @param folder The image folder. (optional)
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
        Type localVarReturnType = new TypeToken<BarcodeResponseList>() {}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postBarcodeRecognizeFromUrlOrContent
     *
     * @param type The type of barcode to read. (optional)
     * @param checksumValidation Enable checksum validation during recognition for 1D barcodes.
     *     Default is treated as Yes for symbologies which must contain checksum, as No where
     *     checksum only possible. Checksum never used: Codabar Checksum is possible: Code39
     *     Standard/Extended, Standard2of5, Interleaved2of5, Matrix2of5, ItalianPost25,
     *     DeutschePostIdentcode, DeutschePostLeitcode, VIN Checksum always used: Rest symbologies
     *     (optional)
     * @param detectEncoding A flag which force engine to detect codetext encoding for Unicode.
     *     (optional)
     * @param preset Preset allows to configure recognition quality and speed manually. You can
     *     quickly set up Preset by embedded presets: HighPerformance, NormalQuality, HighQuality,
     *     MaxBarCodes or you can manually configure separate options. Default value of Preset is
     *     NormalQuality. (optional)
     * @param rectX Set X for area for recognition. (optional)
     * @param rectY Set Y for area for recognition. (optional)
     * @param rectWidth Set Width of area for recognition. (optional)
     * @param rectHeight Set Height of area for recognition. (optional)
     * @param stripFNC Value indicating whether FNC symbol strip must be done. (optional)
     * @param timeout Timeout of recognition process. (optional)
     * @param medianSmoothingWindowSize Window size for median smoothing. Typical values are 3 or 4.
     *     Default value is 3. AllowMedianSmoothing must be set. (optional)
     * @param allowMedianSmoothing Allows engine to enable median smoothing as additional scan. Mode
     *     helps to recognize noised barcodes. (optional)
     * @param allowComplexBackground Allows engine to recognize color barcodes on color background
     *     as additional scan. Extremely slow mode. (optional)
     * @param allowDatamatrixIndustrialBarcodes Allows engine for Datamatrix to recognize dashed
     *     industrial Datamatrix barcodes. Slow mode which helps only for dashed barcodes which
     *     consist from spots. (optional)
     * @param allowDecreasedImage Allows engine to recognize decreased image as additional scan.
     *     Size for decreasing is selected by internal engine algorithms. Mode helps to recognize
     *     barcodes which are noised and blurred but captured with high resolution. (optional)
     * @param allowDetectScanGap Allows engine to use gap between scans to increase recognition
     *     speed. Mode can make recognition problems with low height barcodes. (optional)
     * @param allowIncorrectBarcodes Allows engine to recognize barcodes which has incorrect
     *     checksum or incorrect values. Mode can be used to recognize damaged barcodes with
     *     incorrect text. (optional)
     * @param allowInvertImage Allows engine to recognize inverse color image as additional scan.
     *     Mode can be used when barcode is white on black background. (optional)
     * @param allowMicroWhiteSpotsRemoving Allows engine for Postal barcodes to recognize slightly
     *     noised images. Mode helps to recognize slightly damaged Postal barcodes. (optional)
     * @param allowOneDFastBarcodesDetector Allows engine for 1D barcodes to quickly recognize high
     *     quality barcodes which fill almost whole image. Mode helps to quickly recognize generated
     *     barcodes from Internet. (optional)
     * @param allowOneDWipedBarsRestoration Allows engine for 1D barcodes to recognize barcodes with
     *     single wiped/glued bars in pattern. (optional)
     * @param allowQRMicroQrRestoration Allows engine for QR/MicroQR to recognize damaged MicroQR
     *     barcodes. (optional)
     * @param allowRegularImage Allows engine to recognize regular image without any restorations as
     *     main scan. Mode to recognize image as is. (optional)
     * @param allowSaltAndPepperFiltering Allows engine to recognize barcodes with salt and pepper
     *     noise type. Mode can remove small noise with white and black dots. (optional)
     * @param allowWhiteSpotsRemoving Allows engine to recognize image without small white spots as
     *     additional scan. Mode helps to recognize noised image as well as median smoothing
     *     filtering. (optional)
     * @param checkMore1DVariants Allows engine to recognize 1D barcodes with checksum by checking
     *     more recognition variants. Default value: False. (optional)
     * @param regionLikelihoodThresholdPercent Sets threshold for detected regions that may contain
     *     barcodes. Value 0.7 means that bottom 70% of possible regions are filtered out and not
     *     processed further. Region likelihood threshold must be between [0.05, 0.9] Use high
     *     values for clear images with few barcodes. Use low values for images with many barcodes
     *     or for noisy images. Low value may lead to a bigger recognition time. (optional)
     * @param scanWindowSizes Scan window sizes in pixels. Allowed sizes are 10, 15, 20, 25, 30.
     *     Scanning with small window size takes more time and provides more accuracy but may fail
     *     in detecting very big barcodes. Combining of several window sizes can improve detection
     *     quality. (optional)
     * @param similarity Similarity coefficient depends on how homogeneous barcodes are. Use high
     *     value for for clear barcodes. Use low values to detect barcodes that ara partly damaged
     *     or not lighten evenly. Similarity coefficient must be between [0.5, 0.9] (optional)
     * @param skipDiagonalSearch Allows detector to skip search for diagonal barcodes. Setting it to
     *     false will increase detection time but allow to find diagonal barcodes that can be missed
     *     otherwise. Enabling of diagonal search leads to a bigger detection time. (optional)
     * @param readTinyBarcodes Allows engine to recognize tiny barcodes on large images. Ignored if
     *     AllowIncorrectBarcodes is set to True. Default value: False. (optional)
     * @param australianPostEncodingTable Interpreting Type for the Customer Information of
     *     AustralianPost BarCode.Default is CustomerInformationInterpretingType.Other. (optional)
     * @param rectangleRegion (optional)
     * @param url The image file url. (optional)
     * @param image Image data (optional)
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
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/barcode/recognize";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.type != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("Type", request.type));
        if (request.checksumValidation != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("ChecksumValidation", request.checksumValidation));
        if (request.detectEncoding != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("DetectEncoding", request.detectEncoding));
        if (request.preset != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("Preset", request.preset));
        if (request.rectX != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("RectX", request.rectX));
        if (request.rectY != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("RectY", request.rectY));
        if (request.rectWidth != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("RectWidth", request.rectWidth));
        if (request.rectHeight != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("RectHeight", request.rectHeight));
        if (request.stripFNC != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("StripFNC", request.stripFNC));
        if (request.timeout != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("Timeout", request.timeout));
        if (request.medianSmoothingWindowSize != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair(
                            "MedianSmoothingWindowSize", request.medianSmoothingWindowSize));
        if (request.allowMedianSmoothing != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair(
                            "AllowMedianSmoothing", request.allowMedianSmoothing));
        if (request.allowComplexBackground != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair(
                            "AllowComplexBackground", request.allowComplexBackground));
        if (request.allowDatamatrixIndustrialBarcodes != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair(
                            "AllowDatamatrixIndustrialBarcodes",
                            request.allowDatamatrixIndustrialBarcodes));
        if (request.allowDecreasedImage != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("AllowDecreasedImage", request.allowDecreasedImage));
        if (request.allowDetectScanGap != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("AllowDetectScanGap", request.allowDetectScanGap));
        if (request.allowIncorrectBarcodes != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair(
                            "AllowIncorrectBarcodes", request.allowIncorrectBarcodes));
        if (request.allowInvertImage != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("AllowInvertImage", request.allowInvertImage));
        if (request.allowMicroWhiteSpotsRemoving != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair(
                            "AllowMicroWhiteSpotsRemoving", request.allowMicroWhiteSpotsRemoving));
        if (request.allowOneDFastBarcodesDetector != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair(
                            "AllowOneDFastBarcodesDetector",
                            request.allowOneDFastBarcodesDetector));
        if (request.allowOneDWipedBarsRestoration != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair(
                            "AllowOneDWipedBarsRestoration",
                            request.allowOneDWipedBarsRestoration));
        if (request.allowQRMicroQrRestoration != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair(
                            "AllowQRMicroQrRestoration", request.allowQRMicroQrRestoration));
        if (request.allowRegularImage != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("AllowRegularImage", request.allowRegularImage));
        if (request.allowSaltAndPepperFiltering != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair(
                            "AllowSaltAndPepperFiltering", request.allowSaltAndPepperFiltering));
        if (request.allowWhiteSpotsRemoving != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair(
                            "AllowWhiteSpotsRemoving", request.allowWhiteSpotsRemoving));
        if (request.checkMore1DVariants != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("CheckMore1DVariants", request.checkMore1DVariants));
        if (request.regionLikelihoodThresholdPercent != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair(
                            "RegionLikelihoodThresholdPercent",
                            request.regionLikelihoodThresholdPercent));
        if (request.scanWindowSizes != null)
            localVarCollectionQueryParams.addAll(
                    apiClient.parameterToPairs(
                            "multi", "ScanWindowSizes", request.scanWindowSizes));
        if (request.similarity != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("Similarity", request.similarity));
        if (request.skipDiagonalSearch != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("SkipDiagonalSearch", request.skipDiagonalSearch));
        if (request.readTinyBarcodes != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("ReadTinyBarcodes", request.readTinyBarcodes));
        if (request.australianPostEncodingTable != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair(
                            "AustralianPostEncodingTable", request.australianPostEncodingTable));
        if (request.rectangleRegion != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("RectangleRegion", request.rectangleRegion));
        if (request.url != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("url", request.url));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (request.image != null) localVarFormParams.put("image", request.image);

        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {"multipart/form-data", "application/octet-stream"};
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

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
                localVarPath,
                "POST",
                localVarQueryParams,
                localVarCollectionQueryParams,
                localVarPostBody,
                localVarHeaderParams,
                localVarFormParams,
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
     * @param type The type of barcode to read. (optional)
     * @param checksumValidation Enable checksum validation during recognition for 1D barcodes.
     *     Default is treated as Yes for symbologies which must contain checksum, as No where
     *     checksum only possible. Checksum never used: Codabar Checksum is possible: Code39
     *     Standard/Extended, Standard2of5, Interleaved2of5, Matrix2of5, ItalianPost25,
     *     DeutschePostIdentcode, DeutschePostLeitcode, VIN Checksum always used: Rest symbologies
     *     (optional)
     * @param detectEncoding A flag which force engine to detect codetext encoding for Unicode.
     *     (optional)
     * @param preset Preset allows to configure recognition quality and speed manually. You can
     *     quickly set up Preset by embedded presets: HighPerformance, NormalQuality, HighQuality,
     *     MaxBarCodes or you can manually configure separate options. Default value of Preset is
     *     NormalQuality. (optional)
     * @param rectX Set X for area for recognition. (optional)
     * @param rectY Set Y for area for recognition. (optional)
     * @param rectWidth Set Width of area for recognition. (optional)
     * @param rectHeight Set Height of area for recognition. (optional)
     * @param stripFNC Value indicating whether FNC symbol strip must be done. (optional)
     * @param timeout Timeout of recognition process. (optional)
     * @param medianSmoothingWindowSize Window size for median smoothing. Typical values are 3 or 4.
     *     Default value is 3. AllowMedianSmoothing must be set. (optional)
     * @param allowMedianSmoothing Allows engine to enable median smoothing as additional scan. Mode
     *     helps to recognize noised barcodes. (optional)
     * @param allowComplexBackground Allows engine to recognize color barcodes on color background
     *     as additional scan. Extremely slow mode. (optional)
     * @param allowDatamatrixIndustrialBarcodes Allows engine for Datamatrix to recognize dashed
     *     industrial Datamatrix barcodes. Slow mode which helps only for dashed barcodes which
     *     consist from spots. (optional)
     * @param allowDecreasedImage Allows engine to recognize decreased image as additional scan.
     *     Size for decreasing is selected by internal engine algorithms. Mode helps to recognize
     *     barcodes which are noised and blurred but captured with high resolution. (optional)
     * @param allowDetectScanGap Allows engine to use gap between scans to increase recognition
     *     speed. Mode can make recognition problems with low height barcodes. (optional)
     * @param allowIncorrectBarcodes Allows engine to recognize barcodes which has incorrect
     *     checksum or incorrect values. Mode can be used to recognize damaged barcodes with
     *     incorrect text. (optional)
     * @param allowInvertImage Allows engine to recognize inverse color image as additional scan.
     *     Mode can be used when barcode is white on black background. (optional)
     * @param allowMicroWhiteSpotsRemoving Allows engine for Postal barcodes to recognize slightly
     *     noised images. Mode helps to recognize slightly damaged Postal barcodes. (optional)
     * @param allowOneDFastBarcodesDetector Allows engine for 1D barcodes to quickly recognize high
     *     quality barcodes which fill almost whole image. Mode helps to quickly recognize generated
     *     barcodes from Internet. (optional)
     * @param allowOneDWipedBarsRestoration Allows engine for 1D barcodes to recognize barcodes with
     *     single wiped/glued bars in pattern. (optional)
     * @param allowQRMicroQrRestoration Allows engine for QR/MicroQR to recognize damaged MicroQR
     *     barcodes. (optional)
     * @param allowRegularImage Allows engine to recognize regular image without any restorations as
     *     main scan. Mode to recognize image as is. (optional)
     * @param allowSaltAndPepperFiltering Allows engine to recognize barcodes with salt and pepper
     *     noise type. Mode can remove small noise with white and black dots. (optional)
     * @param allowWhiteSpotsRemoving Allows engine to recognize image without small white spots as
     *     additional scan. Mode helps to recognize noised image as well as median smoothing
     *     filtering. (optional)
     * @param checkMore1DVariants Allows engine to recognize 1D barcodes with checksum by checking
     *     more recognition variants. Default value: False. (optional)
     * @param regionLikelihoodThresholdPercent Sets threshold for detected regions that may contain
     *     barcodes. Value 0.7 means that bottom 70% of possible regions are filtered out and not
     *     processed further. Region likelihood threshold must be between [0.05, 0.9] Use high
     *     values for clear images with few barcodes. Use low values for images with many barcodes
     *     or for noisy images. Low value may lead to a bigger recognition time. (optional)
     * @param scanWindowSizes Scan window sizes in pixels. Allowed sizes are 10, 15, 20, 25, 30.
     *     Scanning with small window size takes more time and provides more accuracy but may fail
     *     in detecting very big barcodes. Combining of several window sizes can improve detection
     *     quality. (optional)
     * @param similarity Similarity coefficient depends on how homogeneous barcodes are. Use high
     *     value for for clear barcodes. Use low values to detect barcodes that ara partly damaged
     *     or not lighten evenly. Similarity coefficient must be between [0.5, 0.9] (optional)
     * @param skipDiagonalSearch Allows detector to skip search for diagonal barcodes. Setting it to
     *     false will increase detection time but allow to find diagonal barcodes that can be missed
     *     otherwise. Enabling of diagonal search leads to a bigger detection time. (optional)
     * @param readTinyBarcodes Allows engine to recognize tiny barcodes on large images. Ignored if
     *     AllowIncorrectBarcodes is set to True. Default value: False. (optional)
     * @param australianPostEncodingTable Interpreting Type for the Customer Information of
     *     AustralianPost BarCode.Default is CustomerInformationInterpretingType.Other. (optional)
     * @param rectangleRegion (optional)
     * @param url The image file url. (optional)
     * @param image Image data (optional)
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
     * @param type The type of barcode to read. (optional)
     * @param checksumValidation Enable checksum validation during recognition for 1D barcodes.
     *     Default is treated as Yes for symbologies which must contain checksum, as No where
     *     checksum only possible. Checksum never used: Codabar Checksum is possible: Code39
     *     Standard/Extended, Standard2of5, Interleaved2of5, Matrix2of5, ItalianPost25,
     *     DeutschePostIdentcode, DeutschePostLeitcode, VIN Checksum always used: Rest symbologies
     *     (optional)
     * @param detectEncoding A flag which force engine to detect codetext encoding for Unicode.
     *     (optional)
     * @param preset Preset allows to configure recognition quality and speed manually. You can
     *     quickly set up Preset by embedded presets: HighPerformance, NormalQuality, HighQuality,
     *     MaxBarCodes or you can manually configure separate options. Default value of Preset is
     *     NormalQuality. (optional)
     * @param rectX Set X for area for recognition. (optional)
     * @param rectY Set Y for area for recognition. (optional)
     * @param rectWidth Set Width of area for recognition. (optional)
     * @param rectHeight Set Height of area for recognition. (optional)
     * @param stripFNC Value indicating whether FNC symbol strip must be done. (optional)
     * @param timeout Timeout of recognition process. (optional)
     * @param medianSmoothingWindowSize Window size for median smoothing. Typical values are 3 or 4.
     *     Default value is 3. AllowMedianSmoothing must be set. (optional)
     * @param allowMedianSmoothing Allows engine to enable median smoothing as additional scan. Mode
     *     helps to recognize noised barcodes. (optional)
     * @param allowComplexBackground Allows engine to recognize color barcodes on color background
     *     as additional scan. Extremely slow mode. (optional)
     * @param allowDatamatrixIndustrialBarcodes Allows engine for Datamatrix to recognize dashed
     *     industrial Datamatrix barcodes. Slow mode which helps only for dashed barcodes which
     *     consist from spots. (optional)
     * @param allowDecreasedImage Allows engine to recognize decreased image as additional scan.
     *     Size for decreasing is selected by internal engine algorithms. Mode helps to recognize
     *     barcodes which are noised and blurred but captured with high resolution. (optional)
     * @param allowDetectScanGap Allows engine to use gap between scans to increase recognition
     *     speed. Mode can make recognition problems with low height barcodes. (optional)
     * @param allowIncorrectBarcodes Allows engine to recognize barcodes which has incorrect
     *     checksum or incorrect values. Mode can be used to recognize damaged barcodes with
     *     incorrect text. (optional)
     * @param allowInvertImage Allows engine to recognize inverse color image as additional scan.
     *     Mode can be used when barcode is white on black background. (optional)
     * @param allowMicroWhiteSpotsRemoving Allows engine for Postal barcodes to recognize slightly
     *     noised images. Mode helps to recognize slightly damaged Postal barcodes. (optional)
     * @param allowOneDFastBarcodesDetector Allows engine for 1D barcodes to quickly recognize high
     *     quality barcodes which fill almost whole image. Mode helps to quickly recognize generated
     *     barcodes from Internet. (optional)
     * @param allowOneDWipedBarsRestoration Allows engine for 1D barcodes to recognize barcodes with
     *     single wiped/glued bars in pattern. (optional)
     * @param allowQRMicroQrRestoration Allows engine for QR/MicroQR to recognize damaged MicroQR
     *     barcodes. (optional)
     * @param allowRegularImage Allows engine to recognize regular image without any restorations as
     *     main scan. Mode to recognize image as is. (optional)
     * @param allowSaltAndPepperFiltering Allows engine to recognize barcodes with salt and pepper
     *     noise type. Mode can remove small noise with white and black dots. (optional)
     * @param allowWhiteSpotsRemoving Allows engine to recognize image without small white spots as
     *     additional scan. Mode helps to recognize noised image as well as median smoothing
     *     filtering. (optional)
     * @param checkMore1DVariants Allows engine to recognize 1D barcodes with checksum by checking
     *     more recognition variants. Default value: False. (optional)
     * @param regionLikelihoodThresholdPercent Sets threshold for detected regions that may contain
     *     barcodes. Value 0.7 means that bottom 70% of possible regions are filtered out and not
     *     processed further. Region likelihood threshold must be between [0.05, 0.9] Use high
     *     values for clear images with few barcodes. Use low values for images with many barcodes
     *     or for noisy images. Low value may lead to a bigger recognition time. (optional)
     * @param scanWindowSizes Scan window sizes in pixels. Allowed sizes are 10, 15, 20, 25, 30.
     *     Scanning with small window size takes more time and provides more accuracy but may fail
     *     in detecting very big barcodes. Combining of several window sizes can improve detection
     *     quality. (optional)
     * @param similarity Similarity coefficient depends on how homogeneous barcodes are. Use high
     *     value for for clear barcodes. Use low values to detect barcodes that ara partly damaged
     *     or not lighten evenly. Similarity coefficient must be between [0.5, 0.9] (optional)
     * @param skipDiagonalSearch Allows detector to skip search for diagonal barcodes. Setting it to
     *     false will increase detection time but allow to find diagonal barcodes that can be missed
     *     otherwise. Enabling of diagonal search leads to a bigger detection time. (optional)
     * @param readTinyBarcodes Allows engine to recognize tiny barcodes on large images. Ignored if
     *     AllowIncorrectBarcodes is set to True. Default value: False. (optional)
     * @param australianPostEncodingTable Interpreting Type for the Customer Information of
     *     AustralianPost BarCode.Default is CustomerInformationInterpretingType.Other. (optional)
     * @param rectangleRegion (optional)
     * @param url The image file url. (optional)
     * @param image Image data (optional)
     * @return ApiResponse&lt;BarcodeResponseList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public ApiResponse<BarcodeResponseList> postBarcodeRecognizeFromUrlOrContentWithHttpInfo(
            PostBarcodeRecognizeFromUrlOrContentRequest request) throws ApiException {
        com.squareup.okhttp.Call call =
                postBarcodeRecognizeFromUrlOrContentValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<BarcodeResponseList>() {}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Recognize barcode from an url or from request body. Request body can contain raw data bytes
     * of the image or encoded with base64. (asynchronously)
     *
     * @param type The type of barcode to read. (optional)
     * @param checksumValidation Enable checksum validation during recognition for 1D barcodes.
     *     Default is treated as Yes for symbologies which must contain checksum, as No where
     *     checksum only possible. Checksum never used: Codabar Checksum is possible: Code39
     *     Standard/Extended, Standard2of5, Interleaved2of5, Matrix2of5, ItalianPost25,
     *     DeutschePostIdentcode, DeutschePostLeitcode, VIN Checksum always used: Rest symbologies
     *     (optional)
     * @param detectEncoding A flag which force engine to detect codetext encoding for Unicode.
     *     (optional)
     * @param preset Preset allows to configure recognition quality and speed manually. You can
     *     quickly set up Preset by embedded presets: HighPerformance, NormalQuality, HighQuality,
     *     MaxBarCodes or you can manually configure separate options. Default value of Preset is
     *     NormalQuality. (optional)
     * @param rectX Set X for area for recognition. (optional)
     * @param rectY Set Y for area for recognition. (optional)
     * @param rectWidth Set Width of area for recognition. (optional)
     * @param rectHeight Set Height of area for recognition. (optional)
     * @param stripFNC Value indicating whether FNC symbol strip must be done. (optional)
     * @param timeout Timeout of recognition process. (optional)
     * @param medianSmoothingWindowSize Window size for median smoothing. Typical values are 3 or 4.
     *     Default value is 3. AllowMedianSmoothing must be set. (optional)
     * @param allowMedianSmoothing Allows engine to enable median smoothing as additional scan. Mode
     *     helps to recognize noised barcodes. (optional)
     * @param allowComplexBackground Allows engine to recognize color barcodes on color background
     *     as additional scan. Extremely slow mode. (optional)
     * @param allowDatamatrixIndustrialBarcodes Allows engine for Datamatrix to recognize dashed
     *     industrial Datamatrix barcodes. Slow mode which helps only for dashed barcodes which
     *     consist from spots. (optional)
     * @param allowDecreasedImage Allows engine to recognize decreased image as additional scan.
     *     Size for decreasing is selected by internal engine algorithms. Mode helps to recognize
     *     barcodes which are noised and blurred but captured with high resolution. (optional)
     * @param allowDetectScanGap Allows engine to use gap between scans to increase recognition
     *     speed. Mode can make recognition problems with low height barcodes. (optional)
     * @param allowIncorrectBarcodes Allows engine to recognize barcodes which has incorrect
     *     checksum or incorrect values. Mode can be used to recognize damaged barcodes with
     *     incorrect text. (optional)
     * @param allowInvertImage Allows engine to recognize inverse color image as additional scan.
     *     Mode can be used when barcode is white on black background. (optional)
     * @param allowMicroWhiteSpotsRemoving Allows engine for Postal barcodes to recognize slightly
     *     noised images. Mode helps to recognize slightly damaged Postal barcodes. (optional)
     * @param allowOneDFastBarcodesDetector Allows engine for 1D barcodes to quickly recognize high
     *     quality barcodes which fill almost whole image. Mode helps to quickly recognize generated
     *     barcodes from Internet. (optional)
     * @param allowOneDWipedBarsRestoration Allows engine for 1D barcodes to recognize barcodes with
     *     single wiped/glued bars in pattern. (optional)
     * @param allowQRMicroQrRestoration Allows engine for QR/MicroQR to recognize damaged MicroQR
     *     barcodes. (optional)
     * @param allowRegularImage Allows engine to recognize regular image without any restorations as
     *     main scan. Mode to recognize image as is. (optional)
     * @param allowSaltAndPepperFiltering Allows engine to recognize barcodes with salt and pepper
     *     noise type. Mode can remove small noise with white and black dots. (optional)
     * @param allowWhiteSpotsRemoving Allows engine to recognize image without small white spots as
     *     additional scan. Mode helps to recognize noised image as well as median smoothing
     *     filtering. (optional)
     * @param checkMore1DVariants Allows engine to recognize 1D barcodes with checksum by checking
     *     more recognition variants. Default value: False. (optional)
     * @param regionLikelihoodThresholdPercent Sets threshold for detected regions that may contain
     *     barcodes. Value 0.7 means that bottom 70% of possible regions are filtered out and not
     *     processed further. Region likelihood threshold must be between [0.05, 0.9] Use high
     *     values for clear images with few barcodes. Use low values for images with many barcodes
     *     or for noisy images. Low value may lead to a bigger recognition time. (optional)
     * @param scanWindowSizes Scan window sizes in pixels. Allowed sizes are 10, 15, 20, 25, 30.
     *     Scanning with small window size takes more time and provides more accuracy but may fail
     *     in detecting very big barcodes. Combining of several window sizes can improve detection
     *     quality. (optional)
     * @param similarity Similarity coefficient depends on how homogeneous barcodes are. Use high
     *     value for for clear barcodes. Use low values to detect barcodes that ara partly damaged
     *     or not lighten evenly. Similarity coefficient must be between [0.5, 0.9] (optional)
     * @param skipDiagonalSearch Allows detector to skip search for diagonal barcodes. Setting it to
     *     false will increase detection time but allow to find diagonal barcodes that can be missed
     *     otherwise. Enabling of diagonal search leads to a bigger detection time. (optional)
     * @param readTinyBarcodes Allows engine to recognize tiny barcodes on large images. Ignored if
     *     AllowIncorrectBarcodes is set to True. Default value: False. (optional)
     * @param australianPostEncodingTable Interpreting Type for the Customer Information of
     *     AustralianPost BarCode.Default is CustomerInformationInterpretingType.Other. (optional)
     * @param rectangleRegion (optional)
     * @param url The image file url. (optional)
     * @param image Image data (optional)
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
        Type localVarReturnType = new TypeToken<BarcodeResponseList>() {}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postGenerateMultiple
     *
     * @param generatorParamsList List of barcodes (required)
     * @param format Format to return stream in (optional, default to png)
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
        Object localVarPostBody = request.generatorParamsList;

        // create path and map variables
        String localVarPath = "/barcode/generateMultiple";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.format != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("format", request.format));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "image/png", "image/bmp", "image/gif", "image/jpeg", "image/svg+xml", "image/tiff"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {"application/json", "application/xml"};
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

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
                localVarPath,
                "POST",
                localVarQueryParams,
                localVarCollectionQueryParams,
                localVarPostBody,
                localVarHeaderParams,
                localVarFormParams,
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
     * @param generatorParamsList List of barcodes (required)
     * @param format Format to return stream in (optional, default to png)
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
     * @param generatorParamsList List of barcodes (required)
     * @param format Format to return stream in (optional, default to png)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public ApiResponse<File> postGenerateMultipleWithHttpInfo(PostGenerateMultipleRequest request)
            throws ApiException {
        com.squareup.okhttp.Call call = postGenerateMultipleValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<File>() {}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Generate multiple barcodes and return in response stream (asynchronously)
     *
     * @param generatorParamsList List of barcodes (required)
     * @param format Format to return stream in (optional, default to png)
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
        Type localVarReturnType = new TypeToken<File>() {}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putBarcodeGenerateFile
     *
     * @param name The image file name. (required)
     * @param type Type of barcode to generate. (required)
     * @param text Text to encode. (required)
     * @param twoDDisplayText Text that will be displayed instead of codetext in 2D barcodes. Used
     *     for: Aztec, Pdf417, DataMatrix, QR, MaxiCode, DotCode (optional)
     * @param textLocation Specify the displaying Text Location, set to CodeLocation.None to hide
     *     CodeText. Default value: CodeLocation.Below. (optional)
     * @param textAlignment Text alignment. (optional)
     * @param textColor Specify the displaying CodeText&#39;s Color. Default value: Color.Black.
     *     (optional)
     * @param fontSizeMode Specify FontSizeMode. If FontSizeMode is set to Auto, font size will be
     *     calculated automatically based on xDimension value. It is recommended to use
     *     FontSizeMode.Auto especially in AutoSizeMode.Nearest or AutoSizeMode.Interpolation.
     *     Default value: FontSizeMode.Auto. (optional)
     * @param noWrap Specify word wraps (line breaks) within text. Default value: false. (optional)
     * @param resolution Resolution of the BarCode image. One value for both dimensions. Default
     *     value: 96 dpi. (optional)
     * @param resolutionX DEPRECATED: Use &#39;Resolution&#39; instead. (optional)
     * @param resolutionY DEPRECATED: Use &#39;Resolution&#39; instead. (optional)
     * @param dimensionX The smallest width of the unit of BarCode bars or spaces. Increase this
     *     will increase the whole barcode image width. Ignored if AutoSizeMode property is set to
     *     AutoSizeMode.Nearest or AutoSizeMode.Interpolation. (optional)
     * @param textSpace Space between the CodeText and the BarCode in Unit value. Default value:
     *     2pt. Ignored for EAN8, EAN13, UPCE, UPCA, ISBN, ISMN, ISSN, UpcaGs1DatabarCoupon.
     *     (optional)
     * @param units Common Units for all measuring in query. Default units: pixel. (optional)
     * @param sizeMode Specifies the different types of automatic sizing modes. Default value:
     *     AutoSizeMode.None. (optional)
     * @param barHeight Height of the barcode in given units. Default units: pixel. (optional)
     * @param imageHeight Height of the barcode image in given units. Default units: pixel.
     *     (optional)
     * @param imageWidth Width of the barcode image in given units. Default units: pixel. (optional)
     * @param rotationAngle BarCode image rotation angle, measured in degree, e.g. RotationAngle
     *     &#x3D; 0 or RotationAngle &#x3D; 360 means no rotation. If RotationAngle NOT equal to 90,
     *     180, 270 or 0, it may increase the difficulty for the scanner to read the image. Default
     *     value: 0. (optional)
     * @param backColor Background color of the barcode image. Default value: Color.White.
     *     (optional)
     * @param barColor Bars color. Default value: Color.Black. (optional)
     * @param borderColor Border color. Default value: Color.Black. (optional)
     * @param borderWidth Border width. Default value: 0. Ignored if Visible is set to false.
     *     (optional)
     * @param borderDashStyle Border dash style. Default value: BorderDashStyle.Solid. (optional)
     * @param borderVisible Border visibility. If false than parameter Width is always ignored (0).
     *     Default value: false. (optional)
     * @param enableChecksum Enable checksum during generation 1D barcodes. Default is treated as
     *     Yes for symbology which must contain checksum, as No where checksum only possible.
     *     Checksum is possible: Code39 Standard/Extended, Standard2of5, Interleaved2of5,
     *     Matrix2of5, ItalianPost25, DeutschePostIdentcode, DeutschePostLeitcode, VIN, Codabar
     *     Checksum always used: Rest symbology (optional)
     * @param enableEscape Indicates whether explains the character \&quot;\\\&quot; as an escape
     *     character in CodeText property. Used for Pdf417, DataMatrix, Code128 only If the
     *     EnableEscape is true, \&quot;\\\&quot; will be explained as a special escape character.
     *     Otherwise, \&quot;\\\&quot; acts as normal characters. Aspose.BarCode supports input
     *     decimal ascii code and mnemonic for ASCII control-code characters. For example, \\013 and
     *     \\\\CR stands for CR. (optional)
     * @param filledBars Value indicating whether bars are filled. Only for 1D barcodes. Default
     *     value: true. (optional)
     * @param alwaysShowChecksum Always display checksum digit in the human readable text for
     *     Code128 and GS1Code128 barcodes. (optional)
     * @param wideNarrowRatio Wide bars to Narrow bars ratio. Default value: 3, that is, wide bars
     *     are 3 times as wide as narrow bars. Used for ITF, PZN, PharmaCode, Standard2of5,
     *     Interleaved2of5, Matrix2of5, ItalianPost25, IATA2of5, VIN, DeutschePost, OPC, Code32,
     *     DataLogic2of5, PatchCode, Code39Extended, Code39Standard (optional)
     * @param validateText Only for 1D barcodes. If codetext is incorrect and value set to true -
     *     exception will be thrown. Otherwise codetext will be corrected to match barcode&#39;s
     *     specification. Exception always will be thrown for: Databar symbology if codetext is
     *     incorrect. Exception always will not be thrown for: AustraliaPost, SingaporePost,
     *     Code39Extended, Code93Extended, Code16K, Code128 symbology if codetext is incorrect.
     *     (optional)
     * @param supplementData Supplement parameters. Used for Interleaved2of5, Standard2of5, EAN13,
     *     EAN8, UPCA, UPCE, ISBN, ISSN, ISMN. (optional)
     * @param supplementSpace Space between main the BarCode and supplement BarCode. (optional)
     * @param barWidthReduction Bars reduction value that is used to compensate ink spread while
     *     printing. (optional)
     * @param storage Image&#39;s storage. (optional)
     * @param folder Image&#39;s folder. (optional)
     * @param format The image format. (optional)
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
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath =
                "/barcode/{name}/generate".replaceAll("\\{" + "name" + "}", request.name);

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.type != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("Type", request.type));
        if (request.text != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("Text", request.text));
        if (request.twoDDisplayText != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("TwoDDisplayText", request.twoDDisplayText));
        if (request.textLocation != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("TextLocation", request.textLocation));
        if (request.textAlignment != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("TextAlignment", request.textAlignment));
        if (request.textColor != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("TextColor", request.textColor));
        if (request.fontSizeMode != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("FontSizeMode", request.fontSizeMode));
        if (request.noWrap != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("NoWrap", request.noWrap));
        if (request.resolution != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("Resolution", request.resolution));
        if (request.resolutionX != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("ResolutionX", request.resolutionX));
        if (request.resolutionY != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("ResolutionY", request.resolutionY));
        if (request.dimensionX != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("DimensionX", request.dimensionX));
        if (request.textSpace != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("TextSpace", request.textSpace));
        if (request.units != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("Units", request.units));
        if (request.sizeMode != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("SizeMode", request.sizeMode));
        if (request.barHeight != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("BarHeight", request.barHeight));
        if (request.imageHeight != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("ImageHeight", request.imageHeight));
        if (request.imageWidth != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("ImageWidth", request.imageWidth));
        if (request.rotationAngle != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("RotationAngle", request.rotationAngle));
        if (request.backColor != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("BackColor", request.backColor));
        if (request.barColor != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("BarColor", request.barColor));
        if (request.borderColor != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("BorderColor", request.borderColor));
        if (request.borderWidth != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("BorderWidth", request.borderWidth));
        if (request.borderDashStyle != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("BorderDashStyle", request.borderDashStyle));
        if (request.borderVisible != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("BorderVisible", request.borderVisible));
        if (request.enableChecksum != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("EnableChecksum", request.enableChecksum));
        if (request.enableEscape != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("EnableEscape", request.enableEscape));
        if (request.filledBars != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("FilledBars", request.filledBars));
        if (request.alwaysShowChecksum != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("AlwaysShowChecksum", request.alwaysShowChecksum));
        if (request.wideNarrowRatio != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("WideNarrowRatio", request.wideNarrowRatio));
        if (request.validateText != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("ValidateText", request.validateText));
        if (request.supplementData != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("SupplementData", request.supplementData));
        if (request.supplementSpace != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("SupplementSpace", request.supplementSpace));
        if (request.barWidthReduction != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("BarWidthReduction", request.barWidthReduction));
        if (request.storage != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.storage));
        if (request.folder != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.folder));
        if (request.format != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("format", request.format));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml", "multipart/form-data"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

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
                localVarPath,
                "PUT",
                localVarQueryParams,
                localVarCollectionQueryParams,
                localVarPostBody,
                localVarHeaderParams,
                localVarFormParams,
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
     * @param name The image file name. (required)
     * @param type Type of barcode to generate. (required)
     * @param text Text to encode. (required)
     * @param twoDDisplayText Text that will be displayed instead of codetext in 2D barcodes. Used
     *     for: Aztec, Pdf417, DataMatrix, QR, MaxiCode, DotCode (optional)
     * @param textLocation Specify the displaying Text Location, set to CodeLocation.None to hide
     *     CodeText. Default value: CodeLocation.Below. (optional)
     * @param textAlignment Text alignment. (optional)
     * @param textColor Specify the displaying CodeText&#39;s Color. Default value: Color.Black.
     *     (optional)
     * @param fontSizeMode Specify FontSizeMode. If FontSizeMode is set to Auto, font size will be
     *     calculated automatically based on xDimension value. It is recommended to use
     *     FontSizeMode.Auto especially in AutoSizeMode.Nearest or AutoSizeMode.Interpolation.
     *     Default value: FontSizeMode.Auto. (optional)
     * @param noWrap Specify word wraps (line breaks) within text. Default value: false. (optional)
     * @param resolution Resolution of the BarCode image. One value for both dimensions. Default
     *     value: 96 dpi. (optional)
     * @param resolutionX DEPRECATED: Use &#39;Resolution&#39; instead. (optional)
     * @param resolutionY DEPRECATED: Use &#39;Resolution&#39; instead. (optional)
     * @param dimensionX The smallest width of the unit of BarCode bars or spaces. Increase this
     *     will increase the whole barcode image width. Ignored if AutoSizeMode property is set to
     *     AutoSizeMode.Nearest or AutoSizeMode.Interpolation. (optional)
     * @param textSpace Space between the CodeText and the BarCode in Unit value. Default value:
     *     2pt. Ignored for EAN8, EAN13, UPCE, UPCA, ISBN, ISMN, ISSN, UpcaGs1DatabarCoupon.
     *     (optional)
     * @param units Common Units for all measuring in query. Default units: pixel. (optional)
     * @param sizeMode Specifies the different types of automatic sizing modes. Default value:
     *     AutoSizeMode.None. (optional)
     * @param barHeight Height of the barcode in given units. Default units: pixel. (optional)
     * @param imageHeight Height of the barcode image in given units. Default units: pixel.
     *     (optional)
     * @param imageWidth Width of the barcode image in given units. Default units: pixel. (optional)
     * @param rotationAngle BarCode image rotation angle, measured in degree, e.g. RotationAngle
     *     &#x3D; 0 or RotationAngle &#x3D; 360 means no rotation. If RotationAngle NOT equal to 90,
     *     180, 270 or 0, it may increase the difficulty for the scanner to read the image. Default
     *     value: 0. (optional)
     * @param backColor Background color of the barcode image. Default value: Color.White.
     *     (optional)
     * @param barColor Bars color. Default value: Color.Black. (optional)
     * @param borderColor Border color. Default value: Color.Black. (optional)
     * @param borderWidth Border width. Default value: 0. Ignored if Visible is set to false.
     *     (optional)
     * @param borderDashStyle Border dash style. Default value: BorderDashStyle.Solid. (optional)
     * @param borderVisible Border visibility. If false than parameter Width is always ignored (0).
     *     Default value: false. (optional)
     * @param enableChecksum Enable checksum during generation 1D barcodes. Default is treated as
     *     Yes for symbology which must contain checksum, as No where checksum only possible.
     *     Checksum is possible: Code39 Standard/Extended, Standard2of5, Interleaved2of5,
     *     Matrix2of5, ItalianPost25, DeutschePostIdentcode, DeutschePostLeitcode, VIN, Codabar
     *     Checksum always used: Rest symbology (optional)
     * @param enableEscape Indicates whether explains the character \&quot;\\\&quot; as an escape
     *     character in CodeText property. Used for Pdf417, DataMatrix, Code128 only If the
     *     EnableEscape is true, \&quot;\\\&quot; will be explained as a special escape character.
     *     Otherwise, \&quot;\\\&quot; acts as normal characters. Aspose.BarCode supports input
     *     decimal ascii code and mnemonic for ASCII control-code characters. For example, \\013 and
     *     \\\\CR stands for CR. (optional)
     * @param filledBars Value indicating whether bars are filled. Only for 1D barcodes. Default
     *     value: true. (optional)
     * @param alwaysShowChecksum Always display checksum digit in the human readable text for
     *     Code128 and GS1Code128 barcodes. (optional)
     * @param wideNarrowRatio Wide bars to Narrow bars ratio. Default value: 3, that is, wide bars
     *     are 3 times as wide as narrow bars. Used for ITF, PZN, PharmaCode, Standard2of5,
     *     Interleaved2of5, Matrix2of5, ItalianPost25, IATA2of5, VIN, DeutschePost, OPC, Code32,
     *     DataLogic2of5, PatchCode, Code39Extended, Code39Standard (optional)
     * @param validateText Only for 1D barcodes. If codetext is incorrect and value set to true -
     *     exception will be thrown. Otherwise codetext will be corrected to match barcode&#39;s
     *     specification. Exception always will be thrown for: Databar symbology if codetext is
     *     incorrect. Exception always will not be thrown for: AustraliaPost, SingaporePost,
     *     Code39Extended, Code93Extended, Code16K, Code128 symbology if codetext is incorrect.
     *     (optional)
     * @param supplementData Supplement parameters. Used for Interleaved2of5, Standard2of5, EAN13,
     *     EAN8, UPCA, UPCE, ISBN, ISSN, ISMN. (optional)
     * @param supplementSpace Space between main the BarCode and supplement BarCode. (optional)
     * @param barWidthReduction Bars reduction value that is used to compensate ink spread while
     *     printing. (optional)
     * @param storage Image&#39;s storage. (optional)
     * @param folder Image&#39;s folder. (optional)
     * @param format The image format. (optional)
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
     * @param name The image file name. (required)
     * @param type Type of barcode to generate. (required)
     * @param text Text to encode. (required)
     * @param twoDDisplayText Text that will be displayed instead of codetext in 2D barcodes. Used
     *     for: Aztec, Pdf417, DataMatrix, QR, MaxiCode, DotCode (optional)
     * @param textLocation Specify the displaying Text Location, set to CodeLocation.None to hide
     *     CodeText. Default value: CodeLocation.Below. (optional)
     * @param textAlignment Text alignment. (optional)
     * @param textColor Specify the displaying CodeText&#39;s Color. Default value: Color.Black.
     *     (optional)
     * @param fontSizeMode Specify FontSizeMode. If FontSizeMode is set to Auto, font size will be
     *     calculated automatically based on xDimension value. It is recommended to use
     *     FontSizeMode.Auto especially in AutoSizeMode.Nearest or AutoSizeMode.Interpolation.
     *     Default value: FontSizeMode.Auto. (optional)
     * @param noWrap Specify word wraps (line breaks) within text. Default value: false. (optional)
     * @param resolution Resolution of the BarCode image. One value for both dimensions. Default
     *     value: 96 dpi. (optional)
     * @param resolutionX DEPRECATED: Use &#39;Resolution&#39; instead. (optional)
     * @param resolutionY DEPRECATED: Use &#39;Resolution&#39; instead. (optional)
     * @param dimensionX The smallest width of the unit of BarCode bars or spaces. Increase this
     *     will increase the whole barcode image width. Ignored if AutoSizeMode property is set to
     *     AutoSizeMode.Nearest or AutoSizeMode.Interpolation. (optional)
     * @param textSpace Space between the CodeText and the BarCode in Unit value. Default value:
     *     2pt. Ignored for EAN8, EAN13, UPCE, UPCA, ISBN, ISMN, ISSN, UpcaGs1DatabarCoupon.
     *     (optional)
     * @param units Common Units for all measuring in query. Default units: pixel. (optional)
     * @param sizeMode Specifies the different types of automatic sizing modes. Default value:
     *     AutoSizeMode.None. (optional)
     * @param barHeight Height of the barcode in given units. Default units: pixel. (optional)
     * @param imageHeight Height of the barcode image in given units. Default units: pixel.
     *     (optional)
     * @param imageWidth Width of the barcode image in given units. Default units: pixel. (optional)
     * @param rotationAngle BarCode image rotation angle, measured in degree, e.g. RotationAngle
     *     &#x3D; 0 or RotationAngle &#x3D; 360 means no rotation. If RotationAngle NOT equal to 90,
     *     180, 270 or 0, it may increase the difficulty for the scanner to read the image. Default
     *     value: 0. (optional)
     * @param backColor Background color of the barcode image. Default value: Color.White.
     *     (optional)
     * @param barColor Bars color. Default value: Color.Black. (optional)
     * @param borderColor Border color. Default value: Color.Black. (optional)
     * @param borderWidth Border width. Default value: 0. Ignored if Visible is set to false.
     *     (optional)
     * @param borderDashStyle Border dash style. Default value: BorderDashStyle.Solid. (optional)
     * @param borderVisible Border visibility. If false than parameter Width is always ignored (0).
     *     Default value: false. (optional)
     * @param enableChecksum Enable checksum during generation 1D barcodes. Default is treated as
     *     Yes for symbology which must contain checksum, as No where checksum only possible.
     *     Checksum is possible: Code39 Standard/Extended, Standard2of5, Interleaved2of5,
     *     Matrix2of5, ItalianPost25, DeutschePostIdentcode, DeutschePostLeitcode, VIN, Codabar
     *     Checksum always used: Rest symbology (optional)
     * @param enableEscape Indicates whether explains the character \&quot;\\\&quot; as an escape
     *     character in CodeText property. Used for Pdf417, DataMatrix, Code128 only If the
     *     EnableEscape is true, \&quot;\\\&quot; will be explained as a special escape character.
     *     Otherwise, \&quot;\\\&quot; acts as normal characters. Aspose.BarCode supports input
     *     decimal ascii code and mnemonic for ASCII control-code characters. For example, \\013 and
     *     \\\\CR stands for CR. (optional)
     * @param filledBars Value indicating whether bars are filled. Only for 1D barcodes. Default
     *     value: true. (optional)
     * @param alwaysShowChecksum Always display checksum digit in the human readable text for
     *     Code128 and GS1Code128 barcodes. (optional)
     * @param wideNarrowRatio Wide bars to Narrow bars ratio. Default value: 3, that is, wide bars
     *     are 3 times as wide as narrow bars. Used for ITF, PZN, PharmaCode, Standard2of5,
     *     Interleaved2of5, Matrix2of5, ItalianPost25, IATA2of5, VIN, DeutschePost, OPC, Code32,
     *     DataLogic2of5, PatchCode, Code39Extended, Code39Standard (optional)
     * @param validateText Only for 1D barcodes. If codetext is incorrect and value set to true -
     *     exception will be thrown. Otherwise codetext will be corrected to match barcode&#39;s
     *     specification. Exception always will be thrown for: Databar symbology if codetext is
     *     incorrect. Exception always will not be thrown for: AustraliaPost, SingaporePost,
     *     Code39Extended, Code93Extended, Code16K, Code128 symbology if codetext is incorrect.
     *     (optional)
     * @param supplementData Supplement parameters. Used for Interleaved2of5, Standard2of5, EAN13,
     *     EAN8, UPCA, UPCE, ISBN, ISSN, ISMN. (optional)
     * @param supplementSpace Space between main the BarCode and supplement BarCode. (optional)
     * @param barWidthReduction Bars reduction value that is used to compensate ink spread while
     *     printing. (optional)
     * @param storage Image&#39;s storage. (optional)
     * @param folder Image&#39;s folder. (optional)
     * @param format The image format. (optional)
     * @return ApiResponse&lt;ResultImageInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public ApiResponse<ResultImageInfo> putBarcodeGenerateFileWithHttpInfo(
            PutBarcodeGenerateFileRequest request) throws ApiException {
        com.squareup.okhttp.Call call =
                putBarcodeGenerateFileValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<ResultImageInfo>() {}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Generate barcode and save on server (from query params or from file with json or xml content)
     * (asynchronously)
     *
     * @param name The image file name. (required)
     * @param type Type of barcode to generate. (required)
     * @param text Text to encode. (required)
     * @param twoDDisplayText Text that will be displayed instead of codetext in 2D barcodes. Used
     *     for: Aztec, Pdf417, DataMatrix, QR, MaxiCode, DotCode (optional)
     * @param textLocation Specify the displaying Text Location, set to CodeLocation.None to hide
     *     CodeText. Default value: CodeLocation.Below. (optional)
     * @param textAlignment Text alignment. (optional)
     * @param textColor Specify the displaying CodeText&#39;s Color. Default value: Color.Black.
     *     (optional)
     * @param fontSizeMode Specify FontSizeMode. If FontSizeMode is set to Auto, font size will be
     *     calculated automatically based on xDimension value. It is recommended to use
     *     FontSizeMode.Auto especially in AutoSizeMode.Nearest or AutoSizeMode.Interpolation.
     *     Default value: FontSizeMode.Auto. (optional)
     * @param noWrap Specify word wraps (line breaks) within text. Default value: false. (optional)
     * @param resolution Resolution of the BarCode image. One value for both dimensions. Default
     *     value: 96 dpi. (optional)
     * @param resolutionX DEPRECATED: Use &#39;Resolution&#39; instead. (optional)
     * @param resolutionY DEPRECATED: Use &#39;Resolution&#39; instead. (optional)
     * @param dimensionX The smallest width of the unit of BarCode bars or spaces. Increase this
     *     will increase the whole barcode image width. Ignored if AutoSizeMode property is set to
     *     AutoSizeMode.Nearest or AutoSizeMode.Interpolation. (optional)
     * @param textSpace Space between the CodeText and the BarCode in Unit value. Default value:
     *     2pt. Ignored for EAN8, EAN13, UPCE, UPCA, ISBN, ISMN, ISSN, UpcaGs1DatabarCoupon.
     *     (optional)
     * @param units Common Units for all measuring in query. Default units: pixel. (optional)
     * @param sizeMode Specifies the different types of automatic sizing modes. Default value:
     *     AutoSizeMode.None. (optional)
     * @param barHeight Height of the barcode in given units. Default units: pixel. (optional)
     * @param imageHeight Height of the barcode image in given units. Default units: pixel.
     *     (optional)
     * @param imageWidth Width of the barcode image in given units. Default units: pixel. (optional)
     * @param rotationAngle BarCode image rotation angle, measured in degree, e.g. RotationAngle
     *     &#x3D; 0 or RotationAngle &#x3D; 360 means no rotation. If RotationAngle NOT equal to 90,
     *     180, 270 or 0, it may increase the difficulty for the scanner to read the image. Default
     *     value: 0. (optional)
     * @param backColor Background color of the barcode image. Default value: Color.White.
     *     (optional)
     * @param barColor Bars color. Default value: Color.Black. (optional)
     * @param borderColor Border color. Default value: Color.Black. (optional)
     * @param borderWidth Border width. Default value: 0. Ignored if Visible is set to false.
     *     (optional)
     * @param borderDashStyle Border dash style. Default value: BorderDashStyle.Solid. (optional)
     * @param borderVisible Border visibility. If false than parameter Width is always ignored (0).
     *     Default value: false. (optional)
     * @param enableChecksum Enable checksum during generation 1D barcodes. Default is treated as
     *     Yes for symbology which must contain checksum, as No where checksum only possible.
     *     Checksum is possible: Code39 Standard/Extended, Standard2of5, Interleaved2of5,
     *     Matrix2of5, ItalianPost25, DeutschePostIdentcode, DeutschePostLeitcode, VIN, Codabar
     *     Checksum always used: Rest symbology (optional)
     * @param enableEscape Indicates whether explains the character \&quot;\\\&quot; as an escape
     *     character in CodeText property. Used for Pdf417, DataMatrix, Code128 only If the
     *     EnableEscape is true, \&quot;\\\&quot; will be explained as a special escape character.
     *     Otherwise, \&quot;\\\&quot; acts as normal characters. Aspose.BarCode supports input
     *     decimal ascii code and mnemonic for ASCII control-code characters. For example, \\013 and
     *     \\\\CR stands for CR. (optional)
     * @param filledBars Value indicating whether bars are filled. Only for 1D barcodes. Default
     *     value: true. (optional)
     * @param alwaysShowChecksum Always display checksum digit in the human readable text for
     *     Code128 and GS1Code128 barcodes. (optional)
     * @param wideNarrowRatio Wide bars to Narrow bars ratio. Default value: 3, that is, wide bars
     *     are 3 times as wide as narrow bars. Used for ITF, PZN, PharmaCode, Standard2of5,
     *     Interleaved2of5, Matrix2of5, ItalianPost25, IATA2of5, VIN, DeutschePost, OPC, Code32,
     *     DataLogic2of5, PatchCode, Code39Extended, Code39Standard (optional)
     * @param validateText Only for 1D barcodes. If codetext is incorrect and value set to true -
     *     exception will be thrown. Otherwise codetext will be corrected to match barcode&#39;s
     *     specification. Exception always will be thrown for: Databar symbology if codetext is
     *     incorrect. Exception always will not be thrown for: AustraliaPost, SingaporePost,
     *     Code39Extended, Code93Extended, Code16K, Code128 symbology if codetext is incorrect.
     *     (optional)
     * @param supplementData Supplement parameters. Used for Interleaved2of5, Standard2of5, EAN13,
     *     EAN8, UPCA, UPCE, ISBN, ISSN, ISMN. (optional)
     * @param supplementSpace Space between main the BarCode and supplement BarCode. (optional)
     * @param barWidthReduction Bars reduction value that is used to compensate ink spread while
     *     printing. (optional)
     * @param storage Image&#39;s storage. (optional)
     * @param folder Image&#39;s folder. (optional)
     * @param format The image format. (optional)
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
        Type localVarReturnType = new TypeToken<ResultImageInfo>() {}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putBarcodeRecognizeFromBody
     *
     * @param name The image file name. (required)
     * @param readerParams BarcodeReader object with parameters. (required)
     * @param type (optional)
     * @param storage The storage name (optional)
     * @param folder The image folder. (optional)
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
        Object localVarPostBody = request.readerParams;

        // create path and map variables
        String localVarPath =
                "/barcode/{name}/recognize".replaceAll("\\{" + "name" + "}", request.name);

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.type != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("type", request.type));
        if (request.storage != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.storage));
        if (request.folder != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.folder));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {"application/json"};
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

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
                localVarPath,
                "PUT",
                localVarQueryParams,
                localVarCollectionQueryParams,
                localVarPostBody,
                localVarHeaderParams,
                localVarFormParams,
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
     * @param name The image file name. (required)
     * @param readerParams BarcodeReader object with parameters. (required)
     * @param type (optional)
     * @param storage The storage name (optional)
     * @param folder The image folder. (optional)
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
     * @param name The image file name. (required)
     * @param readerParams BarcodeReader object with parameters. (required)
     * @param type (optional)
     * @param storage The storage name (optional)
     * @param folder The image folder. (optional)
     * @return ApiResponse&lt;BarcodeResponseList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public ApiResponse<BarcodeResponseList> putBarcodeRecognizeFromBodyWithHttpInfo(
            PutBarcodeRecognizeFromBodyRequest request) throws ApiException {
        com.squareup.okhttp.Call call =
                putBarcodeRecognizeFromBodyValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<BarcodeResponseList>() {}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Recognition of a barcode from file on server with parameters in body. (asynchronously)
     *
     * @param name The image file name. (required)
     * @param readerParams BarcodeReader object with parameters. (required)
     * @param type (optional)
     * @param storage The storage name (optional)
     * @param folder The image folder. (optional)
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
        Type localVarReturnType = new TypeToken<BarcodeResponseList>() {}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for putGenerateMultiple
     *
     * @param name New filename (required)
     * @param generatorParamsList List of barcodes (required)
     * @param format Format of file (optional, default to png)
     * @param folder Folder to place file to (optional)
     * @param storage The storage name (optional)
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
        Object localVarPostBody = request.generatorParamsList;

        // create path and map variables
        String localVarPath =
                "/barcode/{name}/generateMultiple".replaceAll("\\{" + "name" + "}", request.name);

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.format != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("format", request.format));
        if (request.folder != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.folder));
        if (request.storage != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.storage));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {"application/json", "application/xml"};
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

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
                localVarPath,
                "PUT",
                localVarQueryParams,
                localVarCollectionQueryParams,
                localVarPostBody,
                localVarHeaderParams,
                localVarFormParams,
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
     * @param name New filename (required)
     * @param generatorParamsList List of barcodes (required)
     * @param format Format of file (optional, default to png)
     * @param folder Folder to place file to (optional)
     * @param storage The storage name (optional)
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
     * @param name New filename (required)
     * @param generatorParamsList List of barcodes (required)
     * @param format Format of file (optional, default to png)
     * @param folder Folder to place file to (optional)
     * @param storage The storage name (optional)
     * @return ApiResponse&lt;ResultImageInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public ApiResponse<ResultImageInfo> putGenerateMultipleWithHttpInfo(
            PutGenerateMultipleRequest request) throws ApiException {
        com.squareup.okhttp.Call call = putGenerateMultipleValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<ResultImageInfo>() {}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Generate image with multiple barcodes and put new file on server (asynchronously)
     *
     * @param name New filename (required)
     * @param generatorParamsList List of barcodes (required)
     * @param format Format of file (optional, default to png)
     * @param folder Folder to place file to (optional)
     * @param storage The storage name (optional)
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
        Type localVarReturnType = new TypeToken<ResultImageInfo>() {}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
