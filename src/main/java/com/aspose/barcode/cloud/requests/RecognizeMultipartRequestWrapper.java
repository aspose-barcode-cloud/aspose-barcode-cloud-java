// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="RecognizeMultipartRequestWrapper.java">
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

import com.aspose.barcode.cloud.model.DecodeBarcodeType;
import com.aspose.barcode.cloud.model.RecognitionImageKind;
import com.aspose.barcode.cloud.model.RecognitionMode;

import java.io.File;

/**
 * Recognize barcode from file in request body using POST requests with parameters in multipart
 * form.
 */
public class RecognizeMultipartRequestWrapper {
    /** . */
    public final DecodeBarcodeType barcodeType;

    /** Barcode image file. */
    public final File _file;

    /** . */
    public RecognitionMode recognitionMode;

    /** . */
    public RecognitionImageKind recognitionImageKind;

    /**
     * Recognize barcode from file in request body using POST requests with parameters in multipart
     * form..
     *
     * @param barcodeType
     * @param _file Barcode image file
     */
    public RecognizeMultipartRequestWrapper(DecodeBarcodeType barcodeType, File _file) {
        this.barcodeType = barcodeType;
        this._file = _file;
    }
}
