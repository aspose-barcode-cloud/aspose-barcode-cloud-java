// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="getBarcodeGenerateRequest.java">
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

//
// This source code was auto-generated by AsposeBarcodeCloudCodegen.
//

package com.aspose.barcode.cloud.requests;

import com.aspose.barcode.cloud.model.*;

public class getBarcodeGenerateRequest {
    public final String type;
    public final String text;
    public String twoDDisplayText;
    public String textLocation;
    public String textAlignment;
    public String textColor;
    public String fontSizeMode;
    public Boolean noWrap;
    public Double resolution;
    public Double resolutionX;
    public Double resolutionY;
    public Double dimensionX;
    public Double textSpace;
    public String units;
    public String sizeMode;
    public Double barHeight;
    public Double imageHeight;
    public Double imageWidth;
    public Double rotationAngle;
    public String backColor;
    public String barColor;
    public String borderColor;
    public Double borderWidth;
    public String borderDashStyle;
    public Boolean borderVisible;
    public String enableChecksum;
    public Boolean enableEscape;
    public Boolean filledBars;
    public Boolean alwaysShowChecksum;
    public Double wideNarrowRatio;
    public Boolean validateText;
    public String supplementData;
    public Double supplementSpace;
    public Double barWidthReduction;
    public String format;

    public getBarcodeGenerateRequest(String type, String text) {
        this.type = type;
        this.text = text;
    }
}
