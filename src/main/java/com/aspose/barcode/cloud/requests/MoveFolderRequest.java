// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="MoveFolderRequest.java">
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

/** Move folder */
public class MoveFolderRequest {
    /** Folder path to move e.g. '/folder'. */
    public final String srcPath;

    /** Destination folder path to move to e.g '/dst'. */
    public final String destPath;

    /** Source storage name. */
    public String srcStorageName;

    /** Destination storage name. */
    public String destStorageName;

    /**
     * Move folder.
     *
     * @param srcPath Folder path to move e.g. '/folder'
     * @param destPath Destination folder path to move to e.g '/dst'
     */
    public MoveFolderRequest(String srcPath, String destPath) {
        this.srcPath = srcPath;
        this.destPath = destPath;
    }
}
