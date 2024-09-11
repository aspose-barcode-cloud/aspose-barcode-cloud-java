// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="BarcodeGenerateBarcodeTypeGetRequest.java">
//   Copyright (c) 2024 Aspose.BarCode for Cloud
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

package com.aspose.barcode.cloud.requests;

import com.aspose.barcode.cloud.model.AvailableBarCodeImageFormat;
import com.aspose.barcode.cloud.model.AvailableGraphicsUnit;
import com.aspose.barcode.cloud.model.CodeLocation;
import com.aspose.barcode.cloud.model.EncodeBarcodeType;
import com.aspose.barcode.cloud.model.EncodeDataType;
import com.aspose.barcode.cloud.model.TextAlignment;

/** Generate barcode using GET request with parameters in route and query string. */
public class BarcodeGenerateBarcodeTypeGetRequest {
    /** Type of barcode to generate.. */
    public final EncodeBarcodeType barcodeType;

    /** Type of data to encode.. */
    public final EncodeDataType dataType;

    /** String represents data to encode. */
    public final String data;

    /** Barcode output image format. Default value: png. */
    public AvailableBarCodeImageFormat imageFormat;

    /**
     * Text that will be displayed instead of codetext in 2D barcodes. Used for: Aztec, Pdf417,
     * DataMatrix, QR, MaxiCode, DotCode.
     */
    public String twoDDisplayText;

    /**
     * Specify the displaying Text Location, set to CodeLocation.None to hide CodeText. Default
     * value: CodeLocation.Below..
     */
    public CodeLocation textLocation;

    /** Text alignment. Default value: TextAligment.Left. */
    public TextAlignment textAlignment;

    /**
     * Specify the displaying bars and content Color. Value: Color name from
     * https://reference.aspose.com/drawing/net/system.drawing/color/ or ARGB value started with #.
     * For example: Color.AliceBlue or #FF000000 Default value: Color.Black..
     */
    public String foregroundColor;

    /**
     * Background color of the barcode image. Value: Color name from
     * https://reference.aspose.com/drawing/net/system.drawing/color/ or ARGB value started with #.
     * For example: Color.AliceBlue or #FF000000 Default value: Color.White..
     */
    public String backgroundColor;

    /** Common Units for all measuring in query. Default units: pixel.. */
    public AvailableGraphicsUnit units;

    /** Resolution of the BarCode image. One value for both dimensions. Default value: 96 dpi.. */
    public Float resolution;

    /** Height of the barcode image in given units. Default units: pixel.. */
    public Float imageHeight;

    /** Width of the barcode image in given units. Default units: pixel.. */
    public Float imageWidth;

    /**
     * BarCode image rotation angle, measured in degree, e.g. RotationAngle = 0 or RotationAngle =
     * 360 means no rotation. If RotationAngle NOT equal to 90, 180, 270 or 0, it may increase the
     * difficulty for the scanner to read the image. Default value: 0..
     */
    public Integer rotationAngle;

    /**
     * Generate barcode using GET request with parameters in route and query string..
     *
     * @param barcodeType Type of barcode to generate.
     * @param dataType Type of data to encode.
     * @param data String represents data to encode
     */
    public BarcodeGenerateBarcodeTypeGetRequest(
            EncodeBarcodeType barcodeType, EncodeDataType dataType, String data) {
        this.barcodeType = barcodeType;
        this.dataType = dataType;
        this.data = data;
    }
}
