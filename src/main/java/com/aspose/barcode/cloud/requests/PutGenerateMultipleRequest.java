// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="PutGenerateMultipleRequest.java">
//   Copyright (c) 2023 Aspose.BarCode for Cloud
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

import com.aspose.barcode.cloud.model.GeneratorParamsList;

/** Generate image with multiple barcodes and put new file on server */
public class PutGenerateMultipleRequest {
    /** New filename. */
    public final String name;

    /** List of barcodes. */
    public final GeneratorParamsList generatorParamsList;

    /** Format of file. */
    public String format = "png";

    /** Folder to place file to. */
    public String folder;

    /** The storage name. */
    public String storage;

    /**
     * Generate image with multiple barcodes and put new file on server.
     *
     * @param name New filename
     * @param generatorParamsList List of barcodes
     */
    public PutGenerateMultipleRequest(String name, GeneratorParamsList generatorParamsList) {
        this.name = name;
        this.generatorParamsList = generatorParamsList;
    }
}
