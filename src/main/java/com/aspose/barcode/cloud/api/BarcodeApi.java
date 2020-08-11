// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="BarcodeApi.java">
//   Copyright (c) 2020 Aspose.BarCode for Cloud
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
import com.aspose.barcode.cloud.model.GeneratorParamsList;
import com.aspose.barcode.cloud.model.ReaderParams;
import com.aspose.barcode.cloud.model.ResultImageInfo;
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
     * @param format Result image format. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    protected com.squareup.okhttp.Call getBarcodeGenerateCall(
            String type,
            String text,
            String twoDDisplayText,
            String textLocation,
            String textAlignment,
            String textColor,
            String fontSizeMode,
            Double resolution,
            Double resolutionX,
            Double resolutionY,
            Double dimensionX,
            Double textSpace,
            String units,
            String sizeMode,
            Double barHeight,
            Double imageHeight,
            Double imageWidth,
            Double rotationAngle,
            String backColor,
            String barColor,
            String borderColor,
            Double borderWidth,
            String borderDashStyle,
            Boolean borderVisible,
            String enableChecksum,
            Boolean enableEscape,
            Boolean filledBars,
            Boolean alwaysShowChecksum,
            Double wideNarrowRatio,
            Boolean validateText,
            String supplementData,
            Double supplementSpace,
            String format,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/barcode/generate";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (type != null) localVarQueryParams.addAll(apiClient.parameterToPair("Type", type));
        if (text != null) localVarQueryParams.addAll(apiClient.parameterToPair("Text", text));
        if (twoDDisplayText != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("TwoDDisplayText", twoDDisplayText));
        if (textLocation != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("TextLocation", textLocation));
        if (textAlignment != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("TextAlignment", textAlignment));
        if (textColor != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("TextColor", textColor));
        if (fontSizeMode != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("FontSizeMode", fontSizeMode));
        if (resolution != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("Resolution", resolution));
        if (resolutionX != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("ResolutionX", resolutionX));
        if (resolutionY != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("ResolutionY", resolutionY));
        if (dimensionX != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("DimensionX", dimensionX));
        if (textSpace != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("TextSpace", textSpace));
        if (units != null) localVarQueryParams.addAll(apiClient.parameterToPair("Units", units));
        if (sizeMode != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("SizeMode", sizeMode));
        if (barHeight != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("BarHeight", barHeight));
        if (imageHeight != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("ImageHeight", imageHeight));
        if (imageWidth != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("ImageWidth", imageWidth));
        if (rotationAngle != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("RotationAngle", rotationAngle));
        if (backColor != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("BackColor", backColor));
        if (barColor != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("BarColor", barColor));
        if (borderColor != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("BorderColor", borderColor));
        if (borderWidth != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("BorderWidth", borderWidth));
        if (borderDashStyle != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("BorderDashStyle", borderDashStyle));
        if (borderVisible != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("BorderVisible", borderVisible));
        if (enableChecksum != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("EnableChecksum", enableChecksum));
        if (enableEscape != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("EnableEscape", enableEscape));
        if (filledBars != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("FilledBars", filledBars));
        if (alwaysShowChecksum != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("AlwaysShowChecksum", alwaysShowChecksum));
        if (wideNarrowRatio != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("WideNarrowRatio", wideNarrowRatio));
        if (validateText != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("ValidateText", validateText));
        if (supplementData != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("SupplementData", supplementData));
        if (supplementSpace != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("SupplementSpace", supplementSpace));
        if (format != null) localVarQueryParams.addAll(apiClient.parameterToPair("format", format));

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
            String type,
            String text,
            String twoDDisplayText,
            String textLocation,
            String textAlignment,
            String textColor,
            String fontSizeMode,
            Double resolution,
            Double resolutionX,
            Double resolutionY,
            Double dimensionX,
            Double textSpace,
            String units,
            String sizeMode,
            Double barHeight,
            Double imageHeight,
            Double imageWidth,
            Double rotationAngle,
            String backColor,
            String barColor,
            String borderColor,
            Double borderWidth,
            String borderDashStyle,
            Boolean borderVisible,
            String enableChecksum,
            Boolean enableEscape,
            Boolean filledBars,
            Boolean alwaysShowChecksum,
            Double wideNarrowRatio,
            Boolean validateText,
            String supplementData,
            Double supplementSpace,
            String format,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {

        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException(
                    "Missing the required parameter 'type' when calling getBarcodeGenerate(Async)");
        }

        // verify the required parameter 'text' is set
        if (text == null) {
            throw new ApiException(
                    "Missing the required parameter 'text' when calling getBarcodeGenerate(Async)");
        }

        com.squareup.okhttp.Call call =
                getBarcodeGenerateCall(
                        type,
                        text,
                        twoDDisplayText,
                        textLocation,
                        textAlignment,
                        textColor,
                        fontSizeMode,
                        resolution,
                        resolutionX,
                        resolutionY,
                        dimensionX,
                        textSpace,
                        units,
                        sizeMode,
                        barHeight,
                        imageHeight,
                        imageWidth,
                        rotationAngle,
                        backColor,
                        barColor,
                        borderColor,
                        borderWidth,
                        borderDashStyle,
                        borderVisible,
                        enableChecksum,
                        enableEscape,
                        filledBars,
                        alwaysShowChecksum,
                        wideNarrowRatio,
                        validateText,
                        supplementData,
                        supplementSpace,
                        format,
                        progressListener,
                        progressRequestListener);
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
     * @param format Result image format. (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public File getBarcodeGenerate(
            String type,
            String text,
            String twoDDisplayText,
            String textLocation,
            String textAlignment,
            String textColor,
            String fontSizeMode,
            Double resolution,
            Double resolutionX,
            Double resolutionY,
            Double dimensionX,
            Double textSpace,
            String units,
            String sizeMode,
            Double barHeight,
            Double imageHeight,
            Double imageWidth,
            Double rotationAngle,
            String backColor,
            String barColor,
            String borderColor,
            Double borderWidth,
            String borderDashStyle,
            Boolean borderVisible,
            String enableChecksum,
            Boolean enableEscape,
            Boolean filledBars,
            Boolean alwaysShowChecksum,
            Double wideNarrowRatio,
            Boolean validateText,
            String supplementData,
            Double supplementSpace,
            String format)
            throws ApiException {
        ApiResponse<File> resp =
                getBarcodeGenerateWithHttpInfo(
                        type,
                        text,
                        twoDDisplayText,
                        textLocation,
                        textAlignment,
                        textColor,
                        fontSizeMode,
                        resolution,
                        resolutionX,
                        resolutionY,
                        dimensionX,
                        textSpace,
                        units,
                        sizeMode,
                        barHeight,
                        imageHeight,
                        imageWidth,
                        rotationAngle,
                        backColor,
                        barColor,
                        borderColor,
                        borderWidth,
                        borderDashStyle,
                        borderVisible,
                        enableChecksum,
                        enableEscape,
                        filledBars,
                        alwaysShowChecksum,
                        wideNarrowRatio,
                        validateText,
                        supplementData,
                        supplementSpace,
                        format);
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
     * @param format Result image format. (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public ApiResponse<File> getBarcodeGenerateWithHttpInfo(
            String type,
            String text,
            String twoDDisplayText,
            String textLocation,
            String textAlignment,
            String textColor,
            String fontSizeMode,
            Double resolution,
            Double resolutionX,
            Double resolutionY,
            Double dimensionX,
            Double textSpace,
            String units,
            String sizeMode,
            Double barHeight,
            Double imageHeight,
            Double imageWidth,
            Double rotationAngle,
            String backColor,
            String barColor,
            String borderColor,
            Double borderWidth,
            String borderDashStyle,
            Boolean borderVisible,
            String enableChecksum,
            Boolean enableEscape,
            Boolean filledBars,
            Boolean alwaysShowChecksum,
            Double wideNarrowRatio,
            Boolean validateText,
            String supplementData,
            Double supplementSpace,
            String format)
            throws ApiException {
        com.squareup.okhttp.Call call =
                getBarcodeGenerateValidateBeforeCall(
                        type,
                        text,
                        twoDDisplayText,
                        textLocation,
                        textAlignment,
                        textColor,
                        fontSizeMode,
                        resolution,
                        resolutionX,
                        resolutionY,
                        dimensionX,
                        textSpace,
                        units,
                        sizeMode,
                        barHeight,
                        imageHeight,
                        imageWidth,
                        rotationAngle,
                        backColor,
                        barColor,
                        borderColor,
                        borderWidth,
                        borderDashStyle,
                        borderVisible,
                        enableChecksum,
                        enableEscape,
                        filledBars,
                        alwaysShowChecksum,
                        wideNarrowRatio,
                        validateText,
                        supplementData,
                        supplementSpace,
                        format,
                        null,
                        null);
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
     * @param format Result image format. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     */
    public com.squareup.okhttp.Call getBarcodeGenerateAsync(
            String type,
            String text,
            String twoDDisplayText,
            String textLocation,
            String textAlignment,
            String textColor,
            String fontSizeMode,
            Double resolution,
            Double resolutionX,
            Double resolutionY,
            Double dimensionX,
            Double textSpace,
            String units,
            String sizeMode,
            Double barHeight,
            Double imageHeight,
            Double imageWidth,
            Double rotationAngle,
            String backColor,
            String barColor,
            String borderColor,
            Double borderWidth,
            String borderDashStyle,
            Boolean borderVisible,
            String enableChecksum,
            Boolean enableEscape,
            Boolean filledBars,
            Boolean alwaysShowChecksum,
            Double wideNarrowRatio,
            Boolean validateText,
            String supplementData,
            Double supplementSpace,
            String format,
            final ApiCallback<File> callback)
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
                        type,
                        text,
                        twoDDisplayText,
                        textLocation,
                        textAlignment,
                        textColor,
                        fontSizeMode,
                        resolution,
                        resolutionX,
                        resolutionY,
                        dimensionX,
                        textSpace,
                        units,
                        sizeMode,
                        barHeight,
                        imageHeight,
                        imageWidth,
                        rotationAngle,
                        backColor,
                        barColor,
                        borderColor,
                        borderWidth,
                        borderDashStyle,
                        borderVisible,
                        enableChecksum,
                        enableEscape,
                        filledBars,
                        alwaysShowChecksum,
                        wideNarrowRatio,
                        validateText,
                        supplementData,
                        supplementSpace,
                        format,
                        progressListener,
                        progressRequestListener);
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
            String name,
            String type,
            String checksumValidation,
            Boolean detectEncoding,
            String preset,
            Integer rectX,
            Integer rectY,
            Integer rectWidth,
            Integer rectHeight,
            Boolean stripFNC,
            Integer timeout,
            Integer medianSmoothingWindowSize,
            Boolean allowMedianSmoothing,
            Boolean allowComplexBackground,
            Boolean allowDatamatrixIndustrialBarcodes,
            Boolean allowDecreasedImage,
            Boolean allowDetectScanGap,
            Boolean allowIncorrectBarcodes,
            Boolean allowInvertImage,
            Boolean allowMicroWhiteSpotsRemoving,
            Boolean allowOneDFastBarcodesDetector,
            Boolean allowOneDWipedBarsRestoration,
            Boolean allowQRMicroQrRestoration,
            Boolean allowRegularImage,
            Boolean allowSaltAndPepperFiltering,
            Boolean allowWhiteSpotsRemoving,
            Double regionLikelihoodThresholdPercent,
            List<Integer> scanWindowSizes,
            Double similarity,
            Boolean skipDiagonalSearch,
            String australianPostEncodingTable,
            String rectangleRegion,
            String storage,
            String folder,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/barcode/{name}/recognize".replaceAll("\\{" + "name" + "}", name);

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (type != null) localVarQueryParams.addAll(apiClient.parameterToPair("Type", type));
        if (checksumValidation != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("ChecksumValidation", checksumValidation));
        if (detectEncoding != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("DetectEncoding", detectEncoding));
        if (preset != null) localVarQueryParams.addAll(apiClient.parameterToPair("Preset", preset));
        if (rectX != null) localVarQueryParams.addAll(apiClient.parameterToPair("RectX", rectX));
        if (rectY != null) localVarQueryParams.addAll(apiClient.parameterToPair("RectY", rectY));
        if (rectWidth != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("RectWidth", rectWidth));
        if (rectHeight != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("RectHeight", rectHeight));
        if (stripFNC != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("StripFNC", stripFNC));
        if (timeout != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("Timeout", timeout));
        if (medianSmoothingWindowSize != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair(
                            "MedianSmoothingWindowSize", medianSmoothingWindowSize));
        if (allowMedianSmoothing != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("AllowMedianSmoothing", allowMedianSmoothing));
        if (allowComplexBackground != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("AllowComplexBackground", allowComplexBackground));
        if (allowDatamatrixIndustrialBarcodes != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair(
                            "AllowDatamatrixIndustrialBarcodes",
                            allowDatamatrixIndustrialBarcodes));
        if (allowDecreasedImage != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("AllowDecreasedImage", allowDecreasedImage));
        if (allowDetectScanGap != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("AllowDetectScanGap", allowDetectScanGap));
        if (allowIncorrectBarcodes != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("AllowIncorrectBarcodes", allowIncorrectBarcodes));
        if (allowInvertImage != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("AllowInvertImage", allowInvertImage));
        if (allowMicroWhiteSpotsRemoving != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair(
                            "AllowMicroWhiteSpotsRemoving", allowMicroWhiteSpotsRemoving));
        if (allowOneDFastBarcodesDetector != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair(
                            "AllowOneDFastBarcodesDetector", allowOneDFastBarcodesDetector));
        if (allowOneDWipedBarsRestoration != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair(
                            "AllowOneDWipedBarsRestoration", allowOneDWipedBarsRestoration));
        if (allowQRMicroQrRestoration != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair(
                            "AllowQRMicroQrRestoration", allowQRMicroQrRestoration));
        if (allowRegularImage != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("AllowRegularImage", allowRegularImage));
        if (allowSaltAndPepperFiltering != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair(
                            "AllowSaltAndPepperFiltering", allowSaltAndPepperFiltering));
        if (allowWhiteSpotsRemoving != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("AllowWhiteSpotsRemoving", allowWhiteSpotsRemoving));
        if (regionLikelihoodThresholdPercent != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair(
                            "RegionLikelihoodThresholdPercent", regionLikelihoodThresholdPercent));
        if (scanWindowSizes != null)
            localVarCollectionQueryParams.addAll(
                    apiClient.parameterToPairs("multi", "ScanWindowSizes", scanWindowSizes));
        if (similarity != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("Similarity", similarity));
        if (skipDiagonalSearch != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("SkipDiagonalSearch", skipDiagonalSearch));
        if (australianPostEncodingTable != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair(
                            "AustralianPostEncodingTable", australianPostEncodingTable));
        if (rectangleRegion != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("RectangleRegion", rectangleRegion));
        if (storage != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", storage));
        if (folder != null) localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

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
            String name,
            String type,
            String checksumValidation,
            Boolean detectEncoding,
            String preset,
            Integer rectX,
            Integer rectY,
            Integer rectWidth,
            Integer rectHeight,
            Boolean stripFNC,
            Integer timeout,
            Integer medianSmoothingWindowSize,
            Boolean allowMedianSmoothing,
            Boolean allowComplexBackground,
            Boolean allowDatamatrixIndustrialBarcodes,
            Boolean allowDecreasedImage,
            Boolean allowDetectScanGap,
            Boolean allowIncorrectBarcodes,
            Boolean allowInvertImage,
            Boolean allowMicroWhiteSpotsRemoving,
            Boolean allowOneDFastBarcodesDetector,
            Boolean allowOneDWipedBarsRestoration,
            Boolean allowQRMicroQrRestoration,
            Boolean allowRegularImage,
            Boolean allowSaltAndPepperFiltering,
            Boolean allowWhiteSpotsRemoving,
            Double regionLikelihoodThresholdPercent,
            List<Integer> scanWindowSizes,
            Double similarity,
            Boolean skipDiagonalSearch,
            String australianPostEncodingTable,
            String rectangleRegion,
            String storage,
            String folder,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {

        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException(
                    "Missing the required parameter 'name' when calling"
                            + " getBarcodeRecognize(Async)");
        }

        com.squareup.okhttp.Call call =
                getBarcodeRecognizeCall(
                        name,
                        type,
                        checksumValidation,
                        detectEncoding,
                        preset,
                        rectX,
                        rectY,
                        rectWidth,
                        rectHeight,
                        stripFNC,
                        timeout,
                        medianSmoothingWindowSize,
                        allowMedianSmoothing,
                        allowComplexBackground,
                        allowDatamatrixIndustrialBarcodes,
                        allowDecreasedImage,
                        allowDetectScanGap,
                        allowIncorrectBarcodes,
                        allowInvertImage,
                        allowMicroWhiteSpotsRemoving,
                        allowOneDFastBarcodesDetector,
                        allowOneDWipedBarsRestoration,
                        allowQRMicroQrRestoration,
                        allowRegularImage,
                        allowSaltAndPepperFiltering,
                        allowWhiteSpotsRemoving,
                        regionLikelihoodThresholdPercent,
                        scanWindowSizes,
                        similarity,
                        skipDiagonalSearch,
                        australianPostEncodingTable,
                        rectangleRegion,
                        storage,
                        folder,
                        progressListener,
                        progressRequestListener);
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
     * @param australianPostEncodingTable Interpreting Type for the Customer Information of
     *     AustralianPost BarCode.Default is CustomerInformationInterpretingType.Other. (optional)
     * @param rectangleRegion (optional)
     * @param storage The image storage. (optional)
     * @param folder The image folder. (optional)
     * @return BarcodeResponseList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public BarcodeResponseList getBarcodeRecognize(
            String name,
            String type,
            String checksumValidation,
            Boolean detectEncoding,
            String preset,
            Integer rectX,
            Integer rectY,
            Integer rectWidth,
            Integer rectHeight,
            Boolean stripFNC,
            Integer timeout,
            Integer medianSmoothingWindowSize,
            Boolean allowMedianSmoothing,
            Boolean allowComplexBackground,
            Boolean allowDatamatrixIndustrialBarcodes,
            Boolean allowDecreasedImage,
            Boolean allowDetectScanGap,
            Boolean allowIncorrectBarcodes,
            Boolean allowInvertImage,
            Boolean allowMicroWhiteSpotsRemoving,
            Boolean allowOneDFastBarcodesDetector,
            Boolean allowOneDWipedBarsRestoration,
            Boolean allowQRMicroQrRestoration,
            Boolean allowRegularImage,
            Boolean allowSaltAndPepperFiltering,
            Boolean allowWhiteSpotsRemoving,
            Double regionLikelihoodThresholdPercent,
            List<Integer> scanWindowSizes,
            Double similarity,
            Boolean skipDiagonalSearch,
            String australianPostEncodingTable,
            String rectangleRegion,
            String storage,
            String folder)
            throws ApiException {
        ApiResponse<BarcodeResponseList> resp =
                getBarcodeRecognizeWithHttpInfo(
                        name,
                        type,
                        checksumValidation,
                        detectEncoding,
                        preset,
                        rectX,
                        rectY,
                        rectWidth,
                        rectHeight,
                        stripFNC,
                        timeout,
                        medianSmoothingWindowSize,
                        allowMedianSmoothing,
                        allowComplexBackground,
                        allowDatamatrixIndustrialBarcodes,
                        allowDecreasedImage,
                        allowDetectScanGap,
                        allowIncorrectBarcodes,
                        allowInvertImage,
                        allowMicroWhiteSpotsRemoving,
                        allowOneDFastBarcodesDetector,
                        allowOneDWipedBarsRestoration,
                        allowQRMicroQrRestoration,
                        allowRegularImage,
                        allowSaltAndPepperFiltering,
                        allowWhiteSpotsRemoving,
                        regionLikelihoodThresholdPercent,
                        scanWindowSizes,
                        similarity,
                        skipDiagonalSearch,
                        australianPostEncodingTable,
                        rectangleRegion,
                        storage,
                        folder);
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
            String name,
            String type,
            String checksumValidation,
            Boolean detectEncoding,
            String preset,
            Integer rectX,
            Integer rectY,
            Integer rectWidth,
            Integer rectHeight,
            Boolean stripFNC,
            Integer timeout,
            Integer medianSmoothingWindowSize,
            Boolean allowMedianSmoothing,
            Boolean allowComplexBackground,
            Boolean allowDatamatrixIndustrialBarcodes,
            Boolean allowDecreasedImage,
            Boolean allowDetectScanGap,
            Boolean allowIncorrectBarcodes,
            Boolean allowInvertImage,
            Boolean allowMicroWhiteSpotsRemoving,
            Boolean allowOneDFastBarcodesDetector,
            Boolean allowOneDWipedBarsRestoration,
            Boolean allowQRMicroQrRestoration,
            Boolean allowRegularImage,
            Boolean allowSaltAndPepperFiltering,
            Boolean allowWhiteSpotsRemoving,
            Double regionLikelihoodThresholdPercent,
            List<Integer> scanWindowSizes,
            Double similarity,
            Boolean skipDiagonalSearch,
            String australianPostEncodingTable,
            String rectangleRegion,
            String storage,
            String folder)
            throws ApiException {
        com.squareup.okhttp.Call call =
                getBarcodeRecognizeValidateBeforeCall(
                        name,
                        type,
                        checksumValidation,
                        detectEncoding,
                        preset,
                        rectX,
                        rectY,
                        rectWidth,
                        rectHeight,
                        stripFNC,
                        timeout,
                        medianSmoothingWindowSize,
                        allowMedianSmoothing,
                        allowComplexBackground,
                        allowDatamatrixIndustrialBarcodes,
                        allowDecreasedImage,
                        allowDetectScanGap,
                        allowIncorrectBarcodes,
                        allowInvertImage,
                        allowMicroWhiteSpotsRemoving,
                        allowOneDFastBarcodesDetector,
                        allowOneDWipedBarsRestoration,
                        allowQRMicroQrRestoration,
                        allowRegularImage,
                        allowSaltAndPepperFiltering,
                        allowWhiteSpotsRemoving,
                        regionLikelihoodThresholdPercent,
                        scanWindowSizes,
                        similarity,
                        skipDiagonalSearch,
                        australianPostEncodingTable,
                        rectangleRegion,
                        storage,
                        folder,
                        null,
                        null);
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
            String name,
            String type,
            String checksumValidation,
            Boolean detectEncoding,
            String preset,
            Integer rectX,
            Integer rectY,
            Integer rectWidth,
            Integer rectHeight,
            Boolean stripFNC,
            Integer timeout,
            Integer medianSmoothingWindowSize,
            Boolean allowMedianSmoothing,
            Boolean allowComplexBackground,
            Boolean allowDatamatrixIndustrialBarcodes,
            Boolean allowDecreasedImage,
            Boolean allowDetectScanGap,
            Boolean allowIncorrectBarcodes,
            Boolean allowInvertImage,
            Boolean allowMicroWhiteSpotsRemoving,
            Boolean allowOneDFastBarcodesDetector,
            Boolean allowOneDWipedBarsRestoration,
            Boolean allowQRMicroQrRestoration,
            Boolean allowRegularImage,
            Boolean allowSaltAndPepperFiltering,
            Boolean allowWhiteSpotsRemoving,
            Double regionLikelihoodThresholdPercent,
            List<Integer> scanWindowSizes,
            Double similarity,
            Boolean skipDiagonalSearch,
            String australianPostEncodingTable,
            String rectangleRegion,
            String storage,
            String folder,
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
                getBarcodeRecognizeValidateBeforeCall(
                        name,
                        type,
                        checksumValidation,
                        detectEncoding,
                        preset,
                        rectX,
                        rectY,
                        rectWidth,
                        rectHeight,
                        stripFNC,
                        timeout,
                        medianSmoothingWindowSize,
                        allowMedianSmoothing,
                        allowComplexBackground,
                        allowDatamatrixIndustrialBarcodes,
                        allowDecreasedImage,
                        allowDetectScanGap,
                        allowIncorrectBarcodes,
                        allowInvertImage,
                        allowMicroWhiteSpotsRemoving,
                        allowOneDFastBarcodesDetector,
                        allowOneDWipedBarsRestoration,
                        allowQRMicroQrRestoration,
                        allowRegularImage,
                        allowSaltAndPepperFiltering,
                        allowWhiteSpotsRemoving,
                        regionLikelihoodThresholdPercent,
                        scanWindowSizes,
                        similarity,
                        skipDiagonalSearch,
                        australianPostEncodingTable,
                        rectangleRegion,
                        storage,
                        folder,
                        progressListener,
                        progressRequestListener);
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
            String type,
            String checksumValidation,
            Boolean detectEncoding,
            String preset,
            Integer rectX,
            Integer rectY,
            Integer rectWidth,
            Integer rectHeight,
            Boolean stripFNC,
            Integer timeout,
            Integer medianSmoothingWindowSize,
            Boolean allowMedianSmoothing,
            Boolean allowComplexBackground,
            Boolean allowDatamatrixIndustrialBarcodes,
            Boolean allowDecreasedImage,
            Boolean allowDetectScanGap,
            Boolean allowIncorrectBarcodes,
            Boolean allowInvertImage,
            Boolean allowMicroWhiteSpotsRemoving,
            Boolean allowOneDFastBarcodesDetector,
            Boolean allowOneDWipedBarsRestoration,
            Boolean allowQRMicroQrRestoration,
            Boolean allowRegularImage,
            Boolean allowSaltAndPepperFiltering,
            Boolean allowWhiteSpotsRemoving,
            Double regionLikelihoodThresholdPercent,
            List<Integer> scanWindowSizes,
            Double similarity,
            Boolean skipDiagonalSearch,
            String australianPostEncodingTable,
            String rectangleRegion,
            String url,
            File image,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/barcode/recognize";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (type != null) localVarQueryParams.addAll(apiClient.parameterToPair("Type", type));
        if (checksumValidation != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("ChecksumValidation", checksumValidation));
        if (detectEncoding != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("DetectEncoding", detectEncoding));
        if (preset != null) localVarQueryParams.addAll(apiClient.parameterToPair("Preset", preset));
        if (rectX != null) localVarQueryParams.addAll(apiClient.parameterToPair("RectX", rectX));
        if (rectY != null) localVarQueryParams.addAll(apiClient.parameterToPair("RectY", rectY));
        if (rectWidth != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("RectWidth", rectWidth));
        if (rectHeight != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("RectHeight", rectHeight));
        if (stripFNC != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("StripFNC", stripFNC));
        if (timeout != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("Timeout", timeout));
        if (medianSmoothingWindowSize != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair(
                            "MedianSmoothingWindowSize", medianSmoothingWindowSize));
        if (allowMedianSmoothing != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("AllowMedianSmoothing", allowMedianSmoothing));
        if (allowComplexBackground != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("AllowComplexBackground", allowComplexBackground));
        if (allowDatamatrixIndustrialBarcodes != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair(
                            "AllowDatamatrixIndustrialBarcodes",
                            allowDatamatrixIndustrialBarcodes));
        if (allowDecreasedImage != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("AllowDecreasedImage", allowDecreasedImage));
        if (allowDetectScanGap != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("AllowDetectScanGap", allowDetectScanGap));
        if (allowIncorrectBarcodes != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("AllowIncorrectBarcodes", allowIncorrectBarcodes));
        if (allowInvertImage != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("AllowInvertImage", allowInvertImage));
        if (allowMicroWhiteSpotsRemoving != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair(
                            "AllowMicroWhiteSpotsRemoving", allowMicroWhiteSpotsRemoving));
        if (allowOneDFastBarcodesDetector != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair(
                            "AllowOneDFastBarcodesDetector", allowOneDFastBarcodesDetector));
        if (allowOneDWipedBarsRestoration != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair(
                            "AllowOneDWipedBarsRestoration", allowOneDWipedBarsRestoration));
        if (allowQRMicroQrRestoration != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair(
                            "AllowQRMicroQrRestoration", allowQRMicroQrRestoration));
        if (allowRegularImage != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("AllowRegularImage", allowRegularImage));
        if (allowSaltAndPepperFiltering != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair(
                            "AllowSaltAndPepperFiltering", allowSaltAndPepperFiltering));
        if (allowWhiteSpotsRemoving != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("AllowWhiteSpotsRemoving", allowWhiteSpotsRemoving));
        if (regionLikelihoodThresholdPercent != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair(
                            "RegionLikelihoodThresholdPercent", regionLikelihoodThresholdPercent));
        if (scanWindowSizes != null)
            localVarCollectionQueryParams.addAll(
                    apiClient.parameterToPairs("multi", "ScanWindowSizes", scanWindowSizes));
        if (similarity != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("Similarity", similarity));
        if (skipDiagonalSearch != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("SkipDiagonalSearch", skipDiagonalSearch));
        if (australianPostEncodingTable != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair(
                            "AustralianPostEncodingTable", australianPostEncodingTable));
        if (rectangleRegion != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("RectangleRegion", rectangleRegion));
        if (url != null) localVarQueryParams.addAll(apiClient.parameterToPair("url", url));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (image != null) localVarFormParams.put("image", image);

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
            String type,
            String checksumValidation,
            Boolean detectEncoding,
            String preset,
            Integer rectX,
            Integer rectY,
            Integer rectWidth,
            Integer rectHeight,
            Boolean stripFNC,
            Integer timeout,
            Integer medianSmoothingWindowSize,
            Boolean allowMedianSmoothing,
            Boolean allowComplexBackground,
            Boolean allowDatamatrixIndustrialBarcodes,
            Boolean allowDecreasedImage,
            Boolean allowDetectScanGap,
            Boolean allowIncorrectBarcodes,
            Boolean allowInvertImage,
            Boolean allowMicroWhiteSpotsRemoving,
            Boolean allowOneDFastBarcodesDetector,
            Boolean allowOneDWipedBarsRestoration,
            Boolean allowQRMicroQrRestoration,
            Boolean allowRegularImage,
            Boolean allowSaltAndPepperFiltering,
            Boolean allowWhiteSpotsRemoving,
            Double regionLikelihoodThresholdPercent,
            List<Integer> scanWindowSizes,
            Double similarity,
            Boolean skipDiagonalSearch,
            String australianPostEncodingTable,
            String rectangleRegion,
            String url,
            File image,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {

        com.squareup.okhttp.Call call =
                postBarcodeRecognizeFromUrlOrContentCall(
                        type,
                        checksumValidation,
                        detectEncoding,
                        preset,
                        rectX,
                        rectY,
                        rectWidth,
                        rectHeight,
                        stripFNC,
                        timeout,
                        medianSmoothingWindowSize,
                        allowMedianSmoothing,
                        allowComplexBackground,
                        allowDatamatrixIndustrialBarcodes,
                        allowDecreasedImage,
                        allowDetectScanGap,
                        allowIncorrectBarcodes,
                        allowInvertImage,
                        allowMicroWhiteSpotsRemoving,
                        allowOneDFastBarcodesDetector,
                        allowOneDWipedBarsRestoration,
                        allowQRMicroQrRestoration,
                        allowRegularImage,
                        allowSaltAndPepperFiltering,
                        allowWhiteSpotsRemoving,
                        regionLikelihoodThresholdPercent,
                        scanWindowSizes,
                        similarity,
                        skipDiagonalSearch,
                        australianPostEncodingTable,
                        rectangleRegion,
                        url,
                        image,
                        progressListener,
                        progressRequestListener);
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
            String type,
            String checksumValidation,
            Boolean detectEncoding,
            String preset,
            Integer rectX,
            Integer rectY,
            Integer rectWidth,
            Integer rectHeight,
            Boolean stripFNC,
            Integer timeout,
            Integer medianSmoothingWindowSize,
            Boolean allowMedianSmoothing,
            Boolean allowComplexBackground,
            Boolean allowDatamatrixIndustrialBarcodes,
            Boolean allowDecreasedImage,
            Boolean allowDetectScanGap,
            Boolean allowIncorrectBarcodes,
            Boolean allowInvertImage,
            Boolean allowMicroWhiteSpotsRemoving,
            Boolean allowOneDFastBarcodesDetector,
            Boolean allowOneDWipedBarsRestoration,
            Boolean allowQRMicroQrRestoration,
            Boolean allowRegularImage,
            Boolean allowSaltAndPepperFiltering,
            Boolean allowWhiteSpotsRemoving,
            Double regionLikelihoodThresholdPercent,
            List<Integer> scanWindowSizes,
            Double similarity,
            Boolean skipDiagonalSearch,
            String australianPostEncodingTable,
            String rectangleRegion,
            String url,
            File image)
            throws ApiException {
        ApiResponse<BarcodeResponseList> resp =
                postBarcodeRecognizeFromUrlOrContentWithHttpInfo(
                        type,
                        checksumValidation,
                        detectEncoding,
                        preset,
                        rectX,
                        rectY,
                        rectWidth,
                        rectHeight,
                        stripFNC,
                        timeout,
                        medianSmoothingWindowSize,
                        allowMedianSmoothing,
                        allowComplexBackground,
                        allowDatamatrixIndustrialBarcodes,
                        allowDecreasedImage,
                        allowDetectScanGap,
                        allowIncorrectBarcodes,
                        allowInvertImage,
                        allowMicroWhiteSpotsRemoving,
                        allowOneDFastBarcodesDetector,
                        allowOneDWipedBarsRestoration,
                        allowQRMicroQrRestoration,
                        allowRegularImage,
                        allowSaltAndPepperFiltering,
                        allowWhiteSpotsRemoving,
                        regionLikelihoodThresholdPercent,
                        scanWindowSizes,
                        similarity,
                        skipDiagonalSearch,
                        australianPostEncodingTable,
                        rectangleRegion,
                        url,
                        image);
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
            String type,
            String checksumValidation,
            Boolean detectEncoding,
            String preset,
            Integer rectX,
            Integer rectY,
            Integer rectWidth,
            Integer rectHeight,
            Boolean stripFNC,
            Integer timeout,
            Integer medianSmoothingWindowSize,
            Boolean allowMedianSmoothing,
            Boolean allowComplexBackground,
            Boolean allowDatamatrixIndustrialBarcodes,
            Boolean allowDecreasedImage,
            Boolean allowDetectScanGap,
            Boolean allowIncorrectBarcodes,
            Boolean allowInvertImage,
            Boolean allowMicroWhiteSpotsRemoving,
            Boolean allowOneDFastBarcodesDetector,
            Boolean allowOneDWipedBarsRestoration,
            Boolean allowQRMicroQrRestoration,
            Boolean allowRegularImage,
            Boolean allowSaltAndPepperFiltering,
            Boolean allowWhiteSpotsRemoving,
            Double regionLikelihoodThresholdPercent,
            List<Integer> scanWindowSizes,
            Double similarity,
            Boolean skipDiagonalSearch,
            String australianPostEncodingTable,
            String rectangleRegion,
            String url,
            File image)
            throws ApiException {
        com.squareup.okhttp.Call call =
                postBarcodeRecognizeFromUrlOrContentValidateBeforeCall(
                        type,
                        checksumValidation,
                        detectEncoding,
                        preset,
                        rectX,
                        rectY,
                        rectWidth,
                        rectHeight,
                        stripFNC,
                        timeout,
                        medianSmoothingWindowSize,
                        allowMedianSmoothing,
                        allowComplexBackground,
                        allowDatamatrixIndustrialBarcodes,
                        allowDecreasedImage,
                        allowDetectScanGap,
                        allowIncorrectBarcodes,
                        allowInvertImage,
                        allowMicroWhiteSpotsRemoving,
                        allowOneDFastBarcodesDetector,
                        allowOneDWipedBarsRestoration,
                        allowQRMicroQrRestoration,
                        allowRegularImage,
                        allowSaltAndPepperFiltering,
                        allowWhiteSpotsRemoving,
                        regionLikelihoodThresholdPercent,
                        scanWindowSizes,
                        similarity,
                        skipDiagonalSearch,
                        australianPostEncodingTable,
                        rectangleRegion,
                        url,
                        image,
                        null,
                        null);
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
            String type,
            String checksumValidation,
            Boolean detectEncoding,
            String preset,
            Integer rectX,
            Integer rectY,
            Integer rectWidth,
            Integer rectHeight,
            Boolean stripFNC,
            Integer timeout,
            Integer medianSmoothingWindowSize,
            Boolean allowMedianSmoothing,
            Boolean allowComplexBackground,
            Boolean allowDatamatrixIndustrialBarcodes,
            Boolean allowDecreasedImage,
            Boolean allowDetectScanGap,
            Boolean allowIncorrectBarcodes,
            Boolean allowInvertImage,
            Boolean allowMicroWhiteSpotsRemoving,
            Boolean allowOneDFastBarcodesDetector,
            Boolean allowOneDWipedBarsRestoration,
            Boolean allowQRMicroQrRestoration,
            Boolean allowRegularImage,
            Boolean allowSaltAndPepperFiltering,
            Boolean allowWhiteSpotsRemoving,
            Double regionLikelihoodThresholdPercent,
            List<Integer> scanWindowSizes,
            Double similarity,
            Boolean skipDiagonalSearch,
            String australianPostEncodingTable,
            String rectangleRegion,
            String url,
            File image,
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
                        type,
                        checksumValidation,
                        detectEncoding,
                        preset,
                        rectX,
                        rectY,
                        rectWidth,
                        rectHeight,
                        stripFNC,
                        timeout,
                        medianSmoothingWindowSize,
                        allowMedianSmoothing,
                        allowComplexBackground,
                        allowDatamatrixIndustrialBarcodes,
                        allowDecreasedImage,
                        allowDetectScanGap,
                        allowIncorrectBarcodes,
                        allowInvertImage,
                        allowMicroWhiteSpotsRemoving,
                        allowOneDFastBarcodesDetector,
                        allowOneDWipedBarsRestoration,
                        allowQRMicroQrRestoration,
                        allowRegularImage,
                        allowSaltAndPepperFiltering,
                        allowWhiteSpotsRemoving,
                        regionLikelihoodThresholdPercent,
                        scanWindowSizes,
                        similarity,
                        skipDiagonalSearch,
                        australianPostEncodingTable,
                        rectangleRegion,
                        url,
                        image,
                        progressListener,
                        progressRequestListener);
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
            GeneratorParamsList generatorParamsList,
            String format,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        Object localVarPostBody = generatorParamsList;

        // create path and map variables
        String localVarPath = "/barcode/generateMultiple";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (format != null) localVarQueryParams.addAll(apiClient.parameterToPair("format", format));

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
            GeneratorParamsList generatorParamsList,
            String format,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {

        // verify the required parameter 'generatorParamsList' is set
        if (generatorParamsList == null) {
            throw new ApiException(
                    "Missing the required parameter 'generatorParamsList' when calling"
                            + " postGenerateMultiple(Async)");
        }

        com.squareup.okhttp.Call call =
                postGenerateMultipleCall(
                        generatorParamsList, format, progressListener, progressRequestListener);
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
    public File postGenerateMultiple(GeneratorParamsList generatorParamsList, String format)
            throws ApiException {
        ApiResponse<File> resp = postGenerateMultipleWithHttpInfo(generatorParamsList, format);
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
    public ApiResponse<File> postGenerateMultipleWithHttpInfo(
            GeneratorParamsList generatorParamsList, String format) throws ApiException {
        com.squareup.okhttp.Call call =
                postGenerateMultipleValidateBeforeCall(generatorParamsList, format, null, null);
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
            GeneratorParamsList generatorParamsList,
            String format,
            final ApiCallback<File> callback)
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
                        generatorParamsList, format, progressListener, progressRequestListener);
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
     * @param storage Image&#39;s storage. (optional)
     * @param folder Image&#39;s folder. (optional)
     * @param format The image format. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    protected com.squareup.okhttp.Call putBarcodeGenerateFileCall(
            String name,
            String type,
            String text,
            String twoDDisplayText,
            String textLocation,
            String textAlignment,
            String textColor,
            String fontSizeMode,
            Double resolution,
            Double resolutionX,
            Double resolutionY,
            Double dimensionX,
            Double textSpace,
            String units,
            String sizeMode,
            Double barHeight,
            Double imageHeight,
            Double imageWidth,
            Double rotationAngle,
            String backColor,
            String barColor,
            String borderColor,
            Double borderWidth,
            String borderDashStyle,
            Boolean borderVisible,
            String enableChecksum,
            Boolean enableEscape,
            Boolean filledBars,
            Boolean alwaysShowChecksum,
            Double wideNarrowRatio,
            Boolean validateText,
            String supplementData,
            Double supplementSpace,
            String storage,
            String folder,
            String format,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/barcode/{name}/generate".replaceAll("\\{" + "name" + "}", name);

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (type != null) localVarQueryParams.addAll(apiClient.parameterToPair("Type", type));
        if (text != null) localVarQueryParams.addAll(apiClient.parameterToPair("Text", text));
        if (twoDDisplayText != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("TwoDDisplayText", twoDDisplayText));
        if (textLocation != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("TextLocation", textLocation));
        if (textAlignment != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("TextAlignment", textAlignment));
        if (textColor != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("TextColor", textColor));
        if (fontSizeMode != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("FontSizeMode", fontSizeMode));
        if (resolution != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("Resolution", resolution));
        if (resolutionX != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("ResolutionX", resolutionX));
        if (resolutionY != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("ResolutionY", resolutionY));
        if (dimensionX != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("DimensionX", dimensionX));
        if (textSpace != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("TextSpace", textSpace));
        if (units != null) localVarQueryParams.addAll(apiClient.parameterToPair("Units", units));
        if (sizeMode != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("SizeMode", sizeMode));
        if (barHeight != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("BarHeight", barHeight));
        if (imageHeight != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("ImageHeight", imageHeight));
        if (imageWidth != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("ImageWidth", imageWidth));
        if (rotationAngle != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("RotationAngle", rotationAngle));
        if (backColor != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("BackColor", backColor));
        if (barColor != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("BarColor", barColor));
        if (borderColor != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("BorderColor", borderColor));
        if (borderWidth != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("BorderWidth", borderWidth));
        if (borderDashStyle != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("BorderDashStyle", borderDashStyle));
        if (borderVisible != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("BorderVisible", borderVisible));
        if (enableChecksum != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("EnableChecksum", enableChecksum));
        if (enableEscape != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("EnableEscape", enableEscape));
        if (filledBars != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("FilledBars", filledBars));
        if (alwaysShowChecksum != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("AlwaysShowChecksum", alwaysShowChecksum));
        if (wideNarrowRatio != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("WideNarrowRatio", wideNarrowRatio));
        if (validateText != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("ValidateText", validateText));
        if (supplementData != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("SupplementData", supplementData));
        if (supplementSpace != null)
            localVarQueryParams.addAll(
                    apiClient.parameterToPair("SupplementSpace", supplementSpace));
        if (storage != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", storage));
        if (folder != null) localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));
        if (format != null) localVarQueryParams.addAll(apiClient.parameterToPair("format", format));

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
            String name,
            String type,
            String text,
            String twoDDisplayText,
            String textLocation,
            String textAlignment,
            String textColor,
            String fontSizeMode,
            Double resolution,
            Double resolutionX,
            Double resolutionY,
            Double dimensionX,
            Double textSpace,
            String units,
            String sizeMode,
            Double barHeight,
            Double imageHeight,
            Double imageWidth,
            Double rotationAngle,
            String backColor,
            String barColor,
            String borderColor,
            Double borderWidth,
            String borderDashStyle,
            Boolean borderVisible,
            String enableChecksum,
            Boolean enableEscape,
            Boolean filledBars,
            Boolean alwaysShowChecksum,
            Double wideNarrowRatio,
            Boolean validateText,
            String supplementData,
            Double supplementSpace,
            String storage,
            String folder,
            String format,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {

        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException(
                    "Missing the required parameter 'name' when calling"
                            + " putBarcodeGenerateFile(Async)");
        }

        // verify the required parameter 'type' is set
        if (type == null) {
            throw new ApiException(
                    "Missing the required parameter 'type' when calling"
                            + " putBarcodeGenerateFile(Async)");
        }

        // verify the required parameter 'text' is set
        if (text == null) {
            throw new ApiException(
                    "Missing the required parameter 'text' when calling"
                            + " putBarcodeGenerateFile(Async)");
        }

        com.squareup.okhttp.Call call =
                putBarcodeGenerateFileCall(
                        name,
                        type,
                        text,
                        twoDDisplayText,
                        textLocation,
                        textAlignment,
                        textColor,
                        fontSizeMode,
                        resolution,
                        resolutionX,
                        resolutionY,
                        dimensionX,
                        textSpace,
                        units,
                        sizeMode,
                        barHeight,
                        imageHeight,
                        imageWidth,
                        rotationAngle,
                        backColor,
                        barColor,
                        borderColor,
                        borderWidth,
                        borderDashStyle,
                        borderVisible,
                        enableChecksum,
                        enableEscape,
                        filledBars,
                        alwaysShowChecksum,
                        wideNarrowRatio,
                        validateText,
                        supplementData,
                        supplementSpace,
                        storage,
                        folder,
                        format,
                        progressListener,
                        progressRequestListener);
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
     * @param storage Image&#39;s storage. (optional)
     * @param folder Image&#39;s folder. (optional)
     * @param format The image format. (optional)
     * @return ResultImageInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public ResultImageInfo putBarcodeGenerateFile(
            String name,
            String type,
            String text,
            String twoDDisplayText,
            String textLocation,
            String textAlignment,
            String textColor,
            String fontSizeMode,
            Double resolution,
            Double resolutionX,
            Double resolutionY,
            Double dimensionX,
            Double textSpace,
            String units,
            String sizeMode,
            Double barHeight,
            Double imageHeight,
            Double imageWidth,
            Double rotationAngle,
            String backColor,
            String barColor,
            String borderColor,
            Double borderWidth,
            String borderDashStyle,
            Boolean borderVisible,
            String enableChecksum,
            Boolean enableEscape,
            Boolean filledBars,
            Boolean alwaysShowChecksum,
            Double wideNarrowRatio,
            Boolean validateText,
            String supplementData,
            Double supplementSpace,
            String storage,
            String folder,
            String format)
            throws ApiException {
        ApiResponse<ResultImageInfo> resp =
                putBarcodeGenerateFileWithHttpInfo(
                        name,
                        type,
                        text,
                        twoDDisplayText,
                        textLocation,
                        textAlignment,
                        textColor,
                        fontSizeMode,
                        resolution,
                        resolutionX,
                        resolutionY,
                        dimensionX,
                        textSpace,
                        units,
                        sizeMode,
                        barHeight,
                        imageHeight,
                        imageWidth,
                        rotationAngle,
                        backColor,
                        barColor,
                        borderColor,
                        borderWidth,
                        borderDashStyle,
                        borderVisible,
                        enableChecksum,
                        enableEscape,
                        filledBars,
                        alwaysShowChecksum,
                        wideNarrowRatio,
                        validateText,
                        supplementData,
                        supplementSpace,
                        storage,
                        folder,
                        format);
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
     * @param storage Image&#39;s storage. (optional)
     * @param folder Image&#39;s folder. (optional)
     * @param format The image format. (optional)
     * @return ApiResponse&lt;ResultImageInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     */
    public ApiResponse<ResultImageInfo> putBarcodeGenerateFileWithHttpInfo(
            String name,
            String type,
            String text,
            String twoDDisplayText,
            String textLocation,
            String textAlignment,
            String textColor,
            String fontSizeMode,
            Double resolution,
            Double resolutionX,
            Double resolutionY,
            Double dimensionX,
            Double textSpace,
            String units,
            String sizeMode,
            Double barHeight,
            Double imageHeight,
            Double imageWidth,
            Double rotationAngle,
            String backColor,
            String barColor,
            String borderColor,
            Double borderWidth,
            String borderDashStyle,
            Boolean borderVisible,
            String enableChecksum,
            Boolean enableEscape,
            Boolean filledBars,
            Boolean alwaysShowChecksum,
            Double wideNarrowRatio,
            Boolean validateText,
            String supplementData,
            Double supplementSpace,
            String storage,
            String folder,
            String format)
            throws ApiException {
        com.squareup.okhttp.Call call =
                putBarcodeGenerateFileValidateBeforeCall(
                        name,
                        type,
                        text,
                        twoDDisplayText,
                        textLocation,
                        textAlignment,
                        textColor,
                        fontSizeMode,
                        resolution,
                        resolutionX,
                        resolutionY,
                        dimensionX,
                        textSpace,
                        units,
                        sizeMode,
                        barHeight,
                        imageHeight,
                        imageWidth,
                        rotationAngle,
                        backColor,
                        barColor,
                        borderColor,
                        borderWidth,
                        borderDashStyle,
                        borderVisible,
                        enableChecksum,
                        enableEscape,
                        filledBars,
                        alwaysShowChecksum,
                        wideNarrowRatio,
                        validateText,
                        supplementData,
                        supplementSpace,
                        storage,
                        folder,
                        format,
                        null,
                        null);
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
     * @param storage Image&#39;s storage. (optional)
     * @param folder Image&#39;s folder. (optional)
     * @param format The image format. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     */
    public com.squareup.okhttp.Call putBarcodeGenerateFileAsync(
            String name,
            String type,
            String text,
            String twoDDisplayText,
            String textLocation,
            String textAlignment,
            String textColor,
            String fontSizeMode,
            Double resolution,
            Double resolutionX,
            Double resolutionY,
            Double dimensionX,
            Double textSpace,
            String units,
            String sizeMode,
            Double barHeight,
            Double imageHeight,
            Double imageWidth,
            Double rotationAngle,
            String backColor,
            String barColor,
            String borderColor,
            Double borderWidth,
            String borderDashStyle,
            Boolean borderVisible,
            String enableChecksum,
            Boolean enableEscape,
            Boolean filledBars,
            Boolean alwaysShowChecksum,
            Double wideNarrowRatio,
            Boolean validateText,
            String supplementData,
            Double supplementSpace,
            String storage,
            String folder,
            String format,
            final ApiCallback<ResultImageInfo> callback)
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
                        name,
                        type,
                        text,
                        twoDDisplayText,
                        textLocation,
                        textAlignment,
                        textColor,
                        fontSizeMode,
                        resolution,
                        resolutionX,
                        resolutionY,
                        dimensionX,
                        textSpace,
                        units,
                        sizeMode,
                        barHeight,
                        imageHeight,
                        imageWidth,
                        rotationAngle,
                        backColor,
                        barColor,
                        borderColor,
                        borderWidth,
                        borderDashStyle,
                        borderVisible,
                        enableChecksum,
                        enableEscape,
                        filledBars,
                        alwaysShowChecksum,
                        wideNarrowRatio,
                        validateText,
                        supplementData,
                        supplementSpace,
                        storage,
                        folder,
                        format,
                        progressListener,
                        progressRequestListener);
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
            String name,
            ReaderParams readerParams,
            String type,
            String storage,
            String folder,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        Object localVarPostBody = readerParams;

        // create path and map variables
        String localVarPath = "/barcode/{name}/recognize".replaceAll("\\{" + "name" + "}", name);

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (type != null) localVarQueryParams.addAll(apiClient.parameterToPair("type", type));
        if (storage != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", storage));
        if (folder != null) localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));

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
            String name,
            ReaderParams readerParams,
            String type,
            String storage,
            String folder,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {

        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException(
                    "Missing the required parameter 'name' when calling"
                            + " putBarcodeRecognizeFromBody(Async)");
        }

        // verify the required parameter 'readerParams' is set
        if (readerParams == null) {
            throw new ApiException(
                    "Missing the required parameter 'readerParams' when calling"
                            + " putBarcodeRecognizeFromBody(Async)");
        }

        com.squareup.okhttp.Call call =
                putBarcodeRecognizeFromBodyCall(
                        name,
                        readerParams,
                        type,
                        storage,
                        folder,
                        progressListener,
                        progressRequestListener);
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
            String name, ReaderParams readerParams, String type, String storage, String folder)
            throws ApiException {
        ApiResponse<BarcodeResponseList> resp =
                putBarcodeRecognizeFromBodyWithHttpInfo(name, readerParams, type, storage, folder);
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
            String name, ReaderParams readerParams, String type, String storage, String folder)
            throws ApiException {
        com.squareup.okhttp.Call call =
                putBarcodeRecognizeFromBodyValidateBeforeCall(
                        name, readerParams, type, storage, folder, null, null);
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
            String name,
            ReaderParams readerParams,
            String type,
            String storage,
            String folder,
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
                        name,
                        readerParams,
                        type,
                        storage,
                        folder,
                        progressListener,
                        progressRequestListener);
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
            String name,
            GeneratorParamsList generatorParamsList,
            String format,
            String folder,
            String storage,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {
        Object localVarPostBody = generatorParamsList;

        // create path and map variables
        String localVarPath =
                "/barcode/{name}/generateMultiple".replaceAll("\\{" + "name" + "}", name);

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (format != null) localVarQueryParams.addAll(apiClient.parameterToPair("format", format));
        if (folder != null) localVarQueryParams.addAll(apiClient.parameterToPair("folder", folder));
        if (storage != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", storage));

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
            String name,
            GeneratorParamsList generatorParamsList,
            String format,
            String folder,
            String storage,
            final ProgressResponseBody.ProgressListener progressListener,
            final ProgressRequestBody.ProgressRequestListener progressRequestListener)
            throws ApiException {

        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException(
                    "Missing the required parameter 'name' when calling"
                            + " putGenerateMultiple(Async)");
        }

        // verify the required parameter 'generatorParamsList' is set
        if (generatorParamsList == null) {
            throw new ApiException(
                    "Missing the required parameter 'generatorParamsList' when calling"
                            + " putGenerateMultiple(Async)");
        }

        com.squareup.okhttp.Call call =
                putGenerateMultipleCall(
                        name,
                        generatorParamsList,
                        format,
                        folder,
                        storage,
                        progressListener,
                        progressRequestListener);
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
    public ResultImageInfo putGenerateMultiple(
            String name,
            GeneratorParamsList generatorParamsList,
            String format,
            String folder,
            String storage)
            throws ApiException {
        ApiResponse<ResultImageInfo> resp =
                putGenerateMultipleWithHttpInfo(name, generatorParamsList, format, folder, storage);
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
            String name,
            GeneratorParamsList generatorParamsList,
            String format,
            String folder,
            String storage)
            throws ApiException {
        com.squareup.okhttp.Call call =
                putGenerateMultipleValidateBeforeCall(
                        name, generatorParamsList, format, folder, storage, null, null);
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
            String name,
            GeneratorParamsList generatorParamsList,
            String format,
            String folder,
            String storage,
            final ApiCallback<ResultImageInfo> callback)
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
                        name,
                        generatorParamsList,
                        format,
                        folder,
                        storage,
                        progressListener,
                        progressRequestListener);
        Type localVarReturnType = new TypeToken<ResultImageInfo>() {}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
