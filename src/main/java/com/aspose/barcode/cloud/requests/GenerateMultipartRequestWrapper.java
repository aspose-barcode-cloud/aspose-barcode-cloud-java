// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="GenerateMultipartRequestWrapper.java">
//   Copyright (c) 2025 Aspose.BarCode for Cloud
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

import com.aspose.barcode.cloud.model.BarcodeImageFormat;
import com.aspose.barcode.cloud.model.CodeLocation;
import com.aspose.barcode.cloud.model.EncodeBarcodeType;
import com.aspose.barcode.cloud.model.EncodeDataType;
import com.aspose.barcode.cloud.model.GraphicsUnit;

/** Generate barcode using POST request with parameters in multipart form. */
public class GenerateMultipartRequestWrapper {
    /** . */
    public final EncodeBarcodeType barcodeType;

    /** String represents data to encode. */
    public final String data;

    /** . */
    public EncodeDataType dataType;

    /** . */
    public BarcodeImageFormat imageFormat;

    /** . */
    public CodeLocation textLocation;

    /**
     * Specify the displaying bars and content Color. Value: Color name from
     * https://reference.aspose.com/drawing/net/system.drawing/color/ or ARGB value started with #.
     * For example: AliceBlue or #FF000000 Default value: Black..
     */
    public String foregroundColor = "Black";

    /**
     * Background color of the barcode image. Value: Color name from
     * https://reference.aspose.com/drawing/net/system.drawing/color/ or ARGB value started with #.
     * For example: AliceBlue or #FF000000 Default value: White..
     */
    public String backgroundColor = "White";

    /** . */
    public GraphicsUnit units;

    /**
     * Resolution of the BarCode image. One value for both dimensions. Default value: 96 dpi.
     * Decimal separator is dot..
     */
    public Float resolution;

    /**
     * Height of the barcode image in given units. Default units: pixel. Decimal separator is dot..
     */
    public Float imageHeight;

    /**
     * Width of the barcode image in given units. Default units: pixel. Decimal separator is dot..
     */
    public Float imageWidth;

    /**
     * BarCode image rotation angle, measured in degree, e.g. RotationAngle = 0 or RotationAngle =
     * 360 means no rotation. If RotationAngle NOT equal to 90, 180, 270 or 0, it may increase the
     * difficulty for the scanner to read the image. Default value: 0..
     */
    public Integer rotationAngle;

    /**
     * Generate barcode using POST request with parameters in multipart form..
     *
     * @param barcodeType Param of type EncodeBarcodeType
     * @param data String represents data to encode
     */
    public GenerateMultipartRequestWrapper(EncodeBarcodeType barcodeType, String data) {
        this.barcodeType = barcodeType;
        this.data = data;
    }
}
