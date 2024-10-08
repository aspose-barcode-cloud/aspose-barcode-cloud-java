// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="PutBarcodeGenerateFileRequest.java">
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

/** Generate barcode and save on server (from query params or from file with json or xml content) */
public class PutBarcodeGenerateFileRequest {
    /** The image file name.. */
    public final String name;

    /** Type of barcode to generate.. */
    public final String type;

    /** Text to encode.. */
    public final String text;

    /**
     * Text that will be displayed instead of codetext in 2D barcodes. Used for: Aztec, Pdf417,
     * DataMatrix, QR, MaxiCode, DotCode.
     */
    public String twoDDisplayText;

    /**
     * Specify the displaying Text Location, set to CodeLocation.None to hide CodeText. Default
     * value: CodeLocation.Below..
     */
    public String textLocation;

    /** Text alignment.. */
    public String textAlignment;

    /**
     * Specify the displaying CodeText's Color. Default value: black. Use named colors like: red,
     * green, blue Or HTML colors like: #FF0000, #00FF00, #0000FF.
     */
    public String textColor;

    /** Specify word wraps (line breaks) within text. Default value: false.. */
    public Boolean noWrap;

    /** Resolution of the BarCode image. One value for both dimensions. Default value: 96 dpi.. */
    public Double resolution;

    /** DEPRECATED: Use 'Resolution' instead.. */
    @Deprecated() public Double resolutionX;

    /** DEPRECATED: Use 'Resolution' instead.. */
    @Deprecated() public Double resolutionY;

    /**
     * The smallest width of the unit of BarCode bars or spaces. Increase this will increase the
     * whole barcode image width. Ignored if AutoSizeMode property is set to AutoSizeMode.Nearest or
     * AutoSizeMode.Interpolation..
     */
    public Double dimensionX;

    /**
     * Space between the CodeText and the BarCode in Unit value. Default value: 2pt. Ignored for
     * EAN8, EAN13, UPCE, UPCA, ISBN, ISMN, ISSN, UpcaGs1DatabarCoupon..
     */
    public Double textSpace;

    /** Common Units for all measuring in query. Default units: pixel.. */
    public String units;

    /**
     * Specifies the different types of automatic sizing modes. Default value: AutoSizeMode.None..
     */
    public String sizeMode;

    /** Height of the barcode in given units. Default units: pixel.. */
    public Double barHeight;

    /** Height of the barcode image in given units. Default units: pixel.. */
    public Double imageHeight;

    /** Width of the barcode image in given units. Default units: pixel.. */
    public Double imageWidth;

    /**
     * BarCode image rotation angle, measured in degree, e.g. RotationAngle = 0 or RotationAngle =
     * 360 means no rotation. If RotationAngle NOT equal to 90, 180, 270 or 0, it may increase the
     * difficulty for the scanner to read the image. Default value: 0..
     */
    public Double rotationAngle;

    /**
     * Background color of the barcode image. Default value: white. Use named colors like: red,
     * green, blue Or HTML colors like: #FF0000, #00FF00, #0000FF.
     */
    public String backColor;

    /**
     * Bars color. Default value: black. Use named colors like: red, green, blue Or HTML colors
     * like: #FF0000, #00FF00, #0000FF.
     */
    public String barColor;

    /**
     * Border color. Default value: black. Use named colors like: red, green, blue Or HTML colors
     * like: #FF0000, #00FF00, #0000FF.
     */
    public String borderColor;

    /** Border width. Default value: 0. Ignored if Visible is set to false.. */
    public Double borderWidth;

    /** Border dash style. Default value: BorderDashStyle.Solid.. */
    public String borderDashStyle;

    /**
     * Border visibility. If false than parameter Width is always ignored (0). Default value:
     * false..
     */
    public Boolean borderVisible;

    /**
     * Enable checksum during generation 1D barcodes. Default is treated as Yes for symbology which
     * must contain checksum, as No where checksum only possible. Checksum is possible: Code39
     * Standard/Extended, Standard2of5, Interleaved2of5, Matrix2of5, ItalianPost25,
     * DeutschePostIdentcode, DeutschePostLeitcode, VIN, Codabar Checksum always used: Rest
     * symbology.
     */
    public String enableChecksum;

    /**
     * Indicates whether explains the character "\" as an escape character in CodeText property.
     * Used for Pdf417, DataMatrix, Code128 only If the EnableEscape is true, "\" will be explained
     * as a special escape character. Otherwise, "\" acts as normal characters. Aspose.BarCode
     * supports input decimal ascii code and mnemonic for ASCII control-code characters. For
     * example, \013 and \\CR stands for CR..
     */
    public Boolean enableEscape;

    /** Value indicating whether bars are filled. Only for 1D barcodes. Default value: true.. */
    public Boolean filledBars;

    /**
     * Always display checksum digit in the human readable text for Code128 and GS1Code128
     * barcodes..
     */
    public Boolean alwaysShowChecksum;

    /**
     * Wide bars to Narrow bars ratio. Default value: 3, that is, wide bars are 3 times as wide as
     * narrow bars. Used for ITF, PZN, PharmaCode, Standard2of5, Interleaved2of5, Matrix2of5,
     * ItalianPost25, IATA2of5, VIN, DeutschePost, OPC, Code32, DataLogic2of5, PatchCode,
     * Code39Extended, Code39Standard.
     */
    public Double wideNarrowRatio;

    /**
     * Only for 1D barcodes. If codetext is incorrect and value set to true - exception will be
     * thrown. Otherwise codetext will be corrected to match barcode's specification. Exception
     * always will be thrown for: Databar symbology if codetext is incorrect. Exception always will
     * not be thrown for: AustraliaPost, SingaporePost, Code39Extended, Code93Extended, Code16K,
     * Code128 symbology if codetext is incorrect..
     */
    public Boolean validateText;

    /**
     * Supplement parameters. Used for Interleaved2of5, Standard2of5, EAN13, EAN8, UPCA, UPCE, ISBN,
     * ISSN, ISMN..
     */
    public String supplementData;

    /** Space between main the BarCode and supplement BarCode.. */
    public Double supplementSpace;

    /** Bars reduction value that is used to compensate ink spread while printing.. */
    public Double barWidthReduction;

    /**
     * Indicates whether is used anti-aliasing mode to render image. Anti-aliasing mode is applied
     * to barcode and text drawing..
     */
    public Boolean useAntiAlias;

    /** Image's storage.. */
    public String storage;

    /** Image's folder.. */
    public String folder;

    /** The image format.. */
    public String format;

    /**
     * Generate barcode and save on server (from query params or from file with json or xml
     * content).
     *
     * @param name The image file name.
     * @param type Type of barcode to generate.
     * @param text Text to encode.
     */
    public PutBarcodeGenerateFileRequest(String name, String type, String text) {
        this.name = name;
        this.type = type;
        this.text = text;
    }
}
