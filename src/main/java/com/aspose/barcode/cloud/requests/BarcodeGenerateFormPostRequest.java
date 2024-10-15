// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="BarcodeGenerateFormPostRequest.java">
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

/** Generate barcode using POST request with parameters in url ecncoded form. */
public class BarcodeGenerateFormPostRequest {
    /** . */
    public final EncodeBarcodeType barcodeType;

    /** String represents data to encode. */
    public final String data;

    /** . */
    public EncodeDataType dataType;

    /** . */
    public AvailableBarCodeImageFormat imageFormat;

    /**
     * Text that will be displayed instead of codetext in 2D barcodes. Used for: Aztec, Pdf417,
     * DataMatrix, QR, MaxiCode, DotCode.
     */
    public String twoDDisplayText;

    /** . */
    public CodeLocation textLocation;

    /** . */
    public TextAlignment textAlignment;

    /**
     * Specify the displaying bars and content Color. Value: Color name from
     * https://reference.aspose.com/drawing/net/system.drawing/color/ or ARGB value started with #.
     * For example: AliceBlue or #FF000000 Default value: Black..
     */
    public String foregroundColor;

    /**
     * Background color of the barcode image. Value: Color name from
     * https://reference.aspose.com/drawing/net/system.drawing/color/ or ARGB value started with #.
     * For example: AliceBlue or #FF000000 Default value: White..
     */
    public String backgroundColor;

    /** . */
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
     * Generate barcode using POST request with parameters in url ecncoded form..
     *
     * @param barcodeType
     * @param data String represents data to encode
     */
    public BarcodeGenerateFormPostRequest(EncodeBarcodeType barcodeType, String data) {
        this.barcodeType = barcodeType;
        this.data = data;
    }
}
