// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="GeneratorParams.java">
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

package com.aspose.barcode.cloud.model;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/** Represents extended BarcodeGenerator params. */
@ApiModel(description = "Represents extended BarcodeGenerator params.")
public class GeneratorParams {
    @SerializedName(value = "typeOfBarcode")
    private EncodeBarcodeType typeOfBarcode = null;

    @SerializedName(value = "text")
    private String text = null;

    @SerializedName(value = "twoDDisplayText")
    private String twoDDisplayText = null;

    @SerializedName(value = "textLocation")
    private CodeLocation textLocation = null;

    @SerializedName(value = "textAlignment")
    private TextAlignment textAlignment = null;

    @SerializedName(value = "textColor")
    private String textColor = null;

    @SerializedName(value = "font")
    private FontParams font = null;

    @SerializedName(value = "fontSizeMode")
    private FontMode fontSizeMode = null;

    @SerializedName(value = "resolution")
    private Double resolution = null;

    @SerializedName(value = "resolutionX")
    private Double resolutionX = null;

    @SerializedName(value = "resolutionY")
    private Double resolutionY = null;

    @SerializedName(value = "dimensionX")
    private Double dimensionX = null;

    @SerializedName(value = "textSpace")
    private Double textSpace = null;

    @SerializedName(value = "units")
    private AvailableGraphicsUnit units = null;

    @SerializedName(value = "sizeMode")
    private AutoSizeMode sizeMode = null;

    @SerializedName(value = "barHeight")
    private Double barHeight = null;

    @SerializedName(value = "imageHeight")
    private Double imageHeight = null;

    @SerializedName(value = "imageWidth")
    private Double imageWidth = null;

    @SerializedName(value = "rotationAngle")
    private Double rotationAngle = null;

    @SerializedName(value = "padding")
    private Padding padding = null;

    @SerializedName(value = "captionAbove")
    private CaptionParams captionAbove = null;

    @SerializedName(value = "captionBelow")
    private CaptionParams captionBelow = null;

    @SerializedName(value = "backColor")
    private String backColor = null;

    @SerializedName(value = "barColor")
    private String barColor = null;

    @SerializedName(value = "borderColor")
    private String borderColor = null;

    @SerializedName(value = "borderWidth")
    private Double borderWidth = null;

    @SerializedName(value = "borderDashStyle")
    private BorderDashStyle borderDashStyle = null;

    @SerializedName(value = "borderVisible")
    private Boolean borderVisible = null;

    @SerializedName(value = "enableChecksum")
    private EnableChecksum enableChecksum = null;

    @SerializedName(value = "enableEscape")
    private Boolean enableEscape = null;

    @SerializedName(value = "filledBars")
    private Boolean filledBars = null;

    @SerializedName(value = "alwaysShowChecksum")
    private Boolean alwaysShowChecksum = null;

    @SerializedName(value = "wideNarrowRatio")
    private Double wideNarrowRatio = null;

    @SerializedName(value = "validateText")
    private Boolean validateText = null;

    @SerializedName(value = "supplementData")
    private String supplementData = null;

    @SerializedName(value = "supplementSpace")
    private Double supplementSpace = null;

    @SerializedName(value = "australianPost")
    private AustralianPostParams australianPost = null;

    @SerializedName(value = "aztec")
    private AztecParams aztec = null;

    @SerializedName(value = "codabar")
    private CodabarParams codabar = null;

    @SerializedName(value = "codablock")
    private CodablockParams codablock = null;

    @SerializedName(value = "code16K")
    private Code16KParams code16K = null;

    @SerializedName(value = "coupon")
    private CouponParams coupon = null;

    @SerializedName(value = "dataBar")
    private DataBarParams dataBar = null;

    @SerializedName(value = "dataMatrix")
    private DataMatrixParams dataMatrix = null;

    @SerializedName(value = "dotCode")
    private DotCodeParams dotCode = null;

    @SerializedName(value = "ITF")
    private ITFParams ITF = null;

    @SerializedName(value = "maxiCode")
    private MaxiCodeParams maxiCode = null;

    @SerializedName(value = "pdf417")
    private Pdf417Params pdf417 = null;

    @SerializedName(value = "postal")
    private PostalParams postal = null;

    @SerializedName(value = "QR")
    private QrParams QR = null;

    @SerializedName(value = "patchCode")
    private PatchCodeParams patchCode = null;

    /**
     * Type of barcode to generate.
     *
     * @return typeOfBarcode
     */
    @ApiModelProperty(required = true, value = "Type of barcode to generate.")
    public EncodeBarcodeType getTypeOfBarcode() {
        return typeOfBarcode;
    }

    public void setTypeOfBarcode(EncodeBarcodeType typeOfBarcode) {
        this.typeOfBarcode = typeOfBarcode;
    }

    /**
     * Text to encode.
     *
     * @return text
     */
    @ApiModelProperty(required = true, value = "Text to encode.")
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    /**
     * Text that will be displayed instead of codetext in 2D barcodes. Used for: Aztec, Pdf417,
     * DataMatrix, QR, MaxiCode, DotCode
     *
     * @return twoDDisplayText
     */
    @ApiModelProperty(
            value =
                    "Text that will be displayed instead of codetext in 2D barcodes. Used for:"
                            + " Aztec, Pdf417, DataMatrix, QR, MaxiCode, DotCode")
    public String getTwoDDisplayText() {
        return twoDDisplayText;
    }

    public void setTwoDDisplayText(String twoDDisplayText) {
        this.twoDDisplayText = twoDDisplayText;
    }

    /**
     * Specify the displaying Text Location, set to CodeLocation.None to hide CodeText. Default
     * value: CodeLocation.Below.
     *
     * @return textLocation
     */
    @ApiModelProperty(
            value =
                    "Specify the displaying Text Location, set to CodeLocation.None to hide"
                            + " CodeText. Default value: CodeLocation.Below.")
    public CodeLocation getTextLocation() {
        return textLocation;
    }

    public void setTextLocation(CodeLocation textLocation) {
        this.textLocation = textLocation;
    }

    /**
     * Text alignment.
     *
     * @return textAlignment
     */
    @ApiModelProperty(value = "Text alignment.")
    public TextAlignment getTextAlignment() {
        return textAlignment;
    }

    public void setTextAlignment(TextAlignment textAlignment) {
        this.textAlignment = textAlignment;
    }

    /**
     * Specify the displaying CodeText&#39;s Color. Default value: Color.Black.
     *
     * @return textColor
     */
    @ApiModelProperty(
            value = "Specify the displaying CodeText's Color. Default value: Color.Black.")
    public String getTextColor() {
        return textColor;
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    /**
     * Specify the displaying Text&#39;s font. Default value: Arial 5pt regular. Ignored if
     * FontSizeMode is set to FontSizeMode.Auto.
     *
     * @return font
     */
    @ApiModelProperty(
            value =
                    "Specify the displaying Text's font. Default value: Arial 5pt regular. Ignored"
                            + " if FontSizeMode is set to FontSizeMode.Auto.")
    public FontParams getFont() {
        return font;
    }

    public void setFont(FontParams font) {
        this.font = font;
    }

    /**
     * Specify FontSizeMode. If FontSizeMode is set to Auto, font size will be calculated
     * automatically based on xDimension value. It is recommended to use FontSizeMode.Auto
     * especially in AutoSizeMode.Nearest or AutoSizeMode.Interpolation. Default value:
     * FontSizeMode.Auto.
     *
     * @return fontSizeMode
     */
    @ApiModelProperty(
            value =
                    "Specify FontSizeMode. If FontSizeMode is set to Auto, font size will be"
                        + " calculated automatically based on xDimension value. It is recommended"
                        + " to use FontSizeMode.Auto especially in AutoSizeMode.Nearest or"
                        + " AutoSizeMode.Interpolation. Default value: FontSizeMode.Auto.")
    public FontMode getFontSizeMode() {
        return fontSizeMode;
    }

    public void setFontSizeMode(FontMode fontSizeMode) {
        this.fontSizeMode = fontSizeMode;
    }

    /**
     * Resolution of the BarCode image. One value for both dimensions. Default value: 96 dpi.
     *
     * @return resolution
     */
    @ApiModelProperty(
            value =
                    "Resolution of the BarCode image. One value for both dimensions. Default"
                            + " value: 96 dpi.")
    public Double getResolution() {
        return resolution;
    }

    public void setResolution(Double resolution) {
        this.resolution = resolution;
    }

    /**
     * DEPRECATED: Use &#39;Resolution&#39; instead.
     *
     * @return resolutionX
     */
    @ApiModelProperty(value = "DEPRECATED: Use 'Resolution' instead.")
    public Double getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(Double resolutionX) {
        this.resolutionX = resolutionX;
    }

    /**
     * DEPRECATED: Use &#39;Resolution&#39; instead.
     *
     * @return resolutionY
     */
    @ApiModelProperty(value = "DEPRECATED: Use 'Resolution' instead.")
    public Double getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(Double resolutionY) {
        this.resolutionY = resolutionY;
    }

    /**
     * The smallest width of the unit of BarCode bars or spaces. Increase this will increase the
     * whole barcode image width. Ignored if AutoSizeMode property is set to AutoSizeMode.Nearest or
     * AutoSizeMode.Interpolation.
     *
     * @return dimensionX
     */
    @ApiModelProperty(
            value =
                    "The smallest width of the unit of BarCode bars or spaces. Increase this will"
                            + " increase the whole barcode image width. Ignored if AutoSizeMode"
                            + " property is set to AutoSizeMode.Nearest or"
                            + " AutoSizeMode.Interpolation.")
    public Double getDimensionX() {
        return dimensionX;
    }

    public void setDimensionX(Double dimensionX) {
        this.dimensionX = dimensionX;
    }

    /**
     * Space between the CodeText and the BarCode in Unit value. Default value: 2pt. Ignored for
     * EAN8, EAN13, UPCE, UPCA, ISBN, ISMN, ISSN, UpcaGs1DatabarCoupon.
     *
     * @return textSpace
     */
    @ApiModelProperty(
            value =
                    "Space between the CodeText and the BarCode in Unit value. Default value: 2pt."
                            + " Ignored for EAN8, EAN13, UPCE, UPCA, ISBN, ISMN, ISSN,"
                            + " UpcaGs1DatabarCoupon.")
    public Double getTextSpace() {
        return textSpace;
    }

    public void setTextSpace(Double textSpace) {
        this.textSpace = textSpace;
    }

    /**
     * Common Units for all measuring in query. Default units: pixel.
     *
     * @return units
     */
    @ApiModelProperty(value = "Common Units for all measuring in query. Default units: pixel.")
    public AvailableGraphicsUnit getUnits() {
        return units;
    }

    public void setUnits(AvailableGraphicsUnit units) {
        this.units = units;
    }

    /**
     * Specifies the different types of automatic sizing modes. Default value: AutoSizeMode.None.
     *
     * @return sizeMode
     */
    @ApiModelProperty(
            value =
                    "Specifies the different types of automatic sizing modes. Default value:"
                            + " AutoSizeMode.None.")
    public AutoSizeMode getSizeMode() {
        return sizeMode;
    }

    public void setSizeMode(AutoSizeMode sizeMode) {
        this.sizeMode = sizeMode;
    }

    /**
     * Height of the barcode in given units. Default units: pixel.
     *
     * @return barHeight
     */
    @ApiModelProperty(value = "Height of the barcode in given units. Default units: pixel.")
    public Double getBarHeight() {
        return barHeight;
    }

    public void setBarHeight(Double barHeight) {
        this.barHeight = barHeight;
    }

    /**
     * Height of the barcode image in given units. Default units: pixel.
     *
     * @return imageHeight
     */
    @ApiModelProperty(value = "Height of the barcode image in given units. Default units: pixel.")
    public Double getImageHeight() {
        return imageHeight;
    }

    public void setImageHeight(Double imageHeight) {
        this.imageHeight = imageHeight;
    }

    /**
     * Width of the barcode image in given units. Default units: pixel.
     *
     * @return imageWidth
     */
    @ApiModelProperty(value = "Width of the barcode image in given units. Default units: pixel.")
    public Double getImageWidth() {
        return imageWidth;
    }

    public void setImageWidth(Double imageWidth) {
        this.imageWidth = imageWidth;
    }

    /**
     * BarCode image rotation angle, measured in degree, e.g. RotationAngle &#x3D; 0 or
     * RotationAngle &#x3D; 360 means no rotation. If RotationAngle NOT equal to 90, 180, 270 or 0,
     * it may increase the difficulty for the scanner to read the image. Default value: 0.
     *
     * @return rotationAngle
     */
    @ApiModelProperty(
            value =
                    "BarCode image rotation angle, measured in degree, e.g. RotationAngle = 0 or"
                        + " RotationAngle = 360 means no rotation. If RotationAngle NOT equal to"
                        + " 90, 180, 270 or 0, it may increase the difficulty for the scanner to"
                        + " read the image. Default value: 0.")
    public Double getRotationAngle() {
        return rotationAngle;
    }

    public void setRotationAngle(Double rotationAngle) {
        this.rotationAngle = rotationAngle;
    }

    /**
     * Barcode paddings. Default value: 5pt 5pt 5pt 5pt.
     *
     * @return padding
     */
    @ApiModelProperty(value = "Barcode paddings. Default value: 5pt 5pt 5pt 5pt.")
    public Padding getPadding() {
        return padding;
    }

    public void setPadding(Padding padding) {
        this.padding = padding;
    }

    /**
     * Additional caption above barcode.
     *
     * @return captionAbove
     */
    @ApiModelProperty(value = "Additional caption above barcode.")
    public CaptionParams getCaptionAbove() {
        return captionAbove;
    }

    public void setCaptionAbove(CaptionParams captionAbove) {
        this.captionAbove = captionAbove;
    }

    /**
     * Additional caption below barcode.
     *
     * @return captionBelow
     */
    @ApiModelProperty(value = "Additional caption below barcode.")
    public CaptionParams getCaptionBelow() {
        return captionBelow;
    }

    public void setCaptionBelow(CaptionParams captionBelow) {
        this.captionBelow = captionBelow;
    }

    /**
     * Background color of the barcode image. Default value: Color.White.
     *
     * @return backColor
     */
    @ApiModelProperty(value = "Background color of the barcode image. Default value: Color.White.")
    public String getBackColor() {
        return backColor;
    }

    public void setBackColor(String backColor) {
        this.backColor = backColor;
    }

    /**
     * Bars color. Default value: Color.Black.
     *
     * @return barColor
     */
    @ApiModelProperty(value = "Bars color. Default value: Color.Black.")
    public String getBarColor() {
        return barColor;
    }

    public void setBarColor(String barColor) {
        this.barColor = barColor;
    }

    /**
     * Border color. Default value: Color.Black.
     *
     * @return borderColor
     */
    @ApiModelProperty(value = "Border color. Default value: Color.Black.")
    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    /**
     * Border width. Default value: 0. Ignored if Visible is set to false.
     *
     * @return borderWidth
     */
    @ApiModelProperty(value = "Border width. Default value: 0. Ignored if Visible is set to false.")
    public Double getBorderWidth() {
        return borderWidth;
    }

    public void setBorderWidth(Double borderWidth) {
        this.borderWidth = borderWidth;
    }

    /**
     * Border dash style. Default value: BorderDashStyle.Solid.
     *
     * @return borderDashStyle
     */
    @ApiModelProperty(value = "Border dash style. Default value: BorderDashStyle.Solid.")
    public BorderDashStyle getBorderDashStyle() {
        return borderDashStyle;
    }

    public void setBorderDashStyle(BorderDashStyle borderDashStyle) {
        this.borderDashStyle = borderDashStyle;
    }

    /**
     * Border visibility. If false than parameter Width is always ignored (0). Default value: false.
     *
     * @return borderVisible
     */
    @ApiModelProperty(
            value =
                    "Border visibility. If false than parameter Width is always ignored (0)."
                            + " Default value: false.")
    public Boolean isBorderVisible() {
        return borderVisible;
    }

    public void setBorderVisible(Boolean borderVisible) {
        this.borderVisible = borderVisible;
    }

    /**
     * Enable checksum during generation 1D barcodes. Default is treated as Yes for symbology which
     * must contain checksum, as No where checksum only possible. Checksum is possible: Code39
     * Standard/Extended, Standard2of5, Interleaved2of5, Matrix2of5, ItalianPost25,
     * DeutschePostIdentcode, DeutschePostLeitcode, VIN, Codabar Checksum always used: Rest
     * symbology
     *
     * @return enableChecksum
     */
    @ApiModelProperty(
            value =
                    "Enable checksum during generation 1D barcodes. Default is treated as Yes for"
                            + " symbology which must contain checksum, as No where checksum only"
                            + " possible. Checksum is possible: Code39 Standard/Extended,"
                            + " Standard2of5, Interleaved2of5, Matrix2of5, ItalianPost25,"
                            + " DeutschePostIdentcode, DeutschePostLeitcode, VIN, Codabar Checksum"
                            + " always used: Rest symbology")
    public EnableChecksum getEnableChecksum() {
        return enableChecksum;
    }

    public void setEnableChecksum(EnableChecksum enableChecksum) {
        this.enableChecksum = enableChecksum;
    }

    /**
     * Indicates whether explains the character \&quot;\\\&quot; as an escape character in CodeText
     * property. Used for Pdf417, DataMatrix, Code128 only If the EnableEscape is true,
     * \&quot;\\\&quot; will be explained as a special escape character. Otherwise, \&quot;\\\&quot;
     * acts as normal characters. Aspose.BarCode supports input decimal ascii code and mnemonic for
     * ASCII control-code characters. For example, \\013 and \\\\CR stands for CR.
     *
     * @return enableEscape
     */
    @ApiModelProperty(
            value =
                    "Indicates whether explains the character \"\\\" as an escape character in"
                        + " CodeText property. Used for Pdf417, DataMatrix, Code128 only If the"
                        + " EnableEscape is true, \"\\\" will be explained as a special escape"
                        + " character. Otherwise, \"\\\" acts as normal characters. Aspose.BarCode"
                        + " supports input decimal ascii code and mnemonic for ASCII control-code"
                        + " characters. For example, \\013 and \\\\CR stands for CR.")
    public Boolean isEnableEscape() {
        return enableEscape;
    }

    public void setEnableEscape(Boolean enableEscape) {
        this.enableEscape = enableEscape;
    }

    /**
     * Value indicating whether bars are filled. Only for 1D barcodes. Default value: true.
     *
     * @return filledBars
     */
    @ApiModelProperty(
            value =
                    "Value indicating whether bars are filled. Only for 1D barcodes. Default"
                            + " value: true.")
    public Boolean isFilledBars() {
        return filledBars;
    }

    public void setFilledBars(Boolean filledBars) {
        this.filledBars = filledBars;
    }

    /**
     * Always display checksum digit in the human readable text for Code128 and GS1Code128 barcodes.
     *
     * @return alwaysShowChecksum
     */
    @ApiModelProperty(
            value =
                    "Always display checksum digit in the human readable text for Code128 and"
                            + " GS1Code128 barcodes.")
    public Boolean isAlwaysShowChecksum() {
        return alwaysShowChecksum;
    }

    public void setAlwaysShowChecksum(Boolean alwaysShowChecksum) {
        this.alwaysShowChecksum = alwaysShowChecksum;
    }

    /**
     * Wide bars to Narrow bars ratio. Default value: 3, that is, wide bars are 3 times as wide as
     * narrow bars. Used for ITF, PZN, PharmaCode, Standard2of5, Interleaved2of5, Matrix2of5,
     * ItalianPost25, IATA2of5, VIN, DeutschePost, OPC, Code32, DataLogic2of5, PatchCode,
     * Code39Extended, Code39Standard
     *
     * @return wideNarrowRatio
     */
    @ApiModelProperty(
            value =
                    "Wide bars to Narrow bars ratio. Default value: 3, that is, wide bars are 3"
                            + " times as wide as narrow bars. Used for ITF, PZN, PharmaCode,"
                            + " Standard2of5, Interleaved2of5, Matrix2of5, ItalianPost25, IATA2of5,"
                            + " VIN, DeutschePost, OPC, Code32, DataLogic2of5, PatchCode,"
                            + " Code39Extended, Code39Standard")
    public Double getWideNarrowRatio() {
        return wideNarrowRatio;
    }

    public void setWideNarrowRatio(Double wideNarrowRatio) {
        this.wideNarrowRatio = wideNarrowRatio;
    }

    /**
     * Only for 1D barcodes. If codetext is incorrect and value set to true - exception will be
     * thrown. Otherwise codetext will be corrected to match barcode&#39;s specification. Exception
     * always will be thrown for: Databar symbology if codetext is incorrect. Exception always will
     * not be thrown for: AustraliaPost, SingaporePost, Code39Extended, Code93Extended, Code16K,
     * Code128 symbology if codetext is incorrect.
     *
     * @return validateText
     */
    @ApiModelProperty(
            value =
                    "Only for 1D barcodes. If codetext is incorrect and value set to true -"
                        + " exception will be thrown. Otherwise codetext will be corrected to"
                        + " match barcode's specification. Exception always will be thrown for:"
                        + " Databar symbology if codetext is incorrect. Exception always will not"
                        + " be thrown for: AustraliaPost, SingaporePost, Code39Extended,"
                        + " Code93Extended, Code16K, Code128 symbology if codetext is incorrect.")
    public Boolean isValidateText() {
        return validateText;
    }

    public void setValidateText(Boolean validateText) {
        this.validateText = validateText;
    }

    /**
     * Supplement parameters. Used for Interleaved2of5, Standard2of5, EAN13, EAN8, UPCA, UPCE, ISBN,
     * ISSN, ISMN.
     *
     * @return supplementData
     */
    @ApiModelProperty(
            value =
                    "Supplement parameters. Used for Interleaved2of5, Standard2of5, EAN13, EAN8,"
                            + " UPCA, UPCE, ISBN, ISSN, ISMN.")
    public String getSupplementData() {
        return supplementData;
    }

    public void setSupplementData(String supplementData) {
        this.supplementData = supplementData;
    }

    /**
     * Space between main the BarCode and supplement BarCode.
     *
     * @return supplementSpace
     */
    @ApiModelProperty(value = "Space between main the BarCode and supplement BarCode.")
    public Double getSupplementSpace() {
        return supplementSpace;
    }

    public void setSupplementSpace(Double supplementSpace) {
        this.supplementSpace = supplementSpace;
    }

    /**
     * AustralianPost params.
     *
     * @return australianPost
     */
    @ApiModelProperty(value = "AustralianPost params.")
    public AustralianPostParams getAustralianPost() {
        return australianPost;
    }

    public void setAustralianPost(AustralianPostParams australianPost) {
        this.australianPost = australianPost;
    }

    /**
     * Aztec params.
     *
     * @return aztec
     */
    @ApiModelProperty(value = "Aztec params.")
    public AztecParams getAztec() {
        return aztec;
    }

    public void setAztec(AztecParams aztec) {
        this.aztec = aztec;
    }

    /**
     * Codabar params.
     *
     * @return codabar
     */
    @ApiModelProperty(value = "Codabar params.")
    public CodabarParams getCodabar() {
        return codabar;
    }

    public void setCodabar(CodabarParams codabar) {
        this.codabar = codabar;
    }

    /**
     * Codablock params.
     *
     * @return codablock
     */
    @ApiModelProperty(value = "Codablock params.")
    public CodablockParams getCodablock() {
        return codablock;
    }

    public void setCodablock(CodablockParams codablock) {
        this.codablock = codablock;
    }

    /**
     * Code16K params.
     *
     * @return code16K
     */
    @ApiModelProperty(value = "Code16K params.")
    public Code16KParams getCode16K() {
        return code16K;
    }

    public void setCode16K(Code16KParams code16K) {
        this.code16K = code16K;
    }

    /**
     * Coupon params.
     *
     * @return coupon
     */
    @ApiModelProperty(value = "Coupon params.")
    public CouponParams getCoupon() {
        return coupon;
    }

    public void setCoupon(CouponParams coupon) {
        this.coupon = coupon;
    }

    /**
     * DataBar params.
     *
     * @return dataBar
     */
    @ApiModelProperty(value = "DataBar params.")
    public DataBarParams getDataBar() {
        return dataBar;
    }

    public void setDataBar(DataBarParams dataBar) {
        this.dataBar = dataBar;
    }

    /**
     * DataMatrix params.
     *
     * @return dataMatrix
     */
    @ApiModelProperty(value = "DataMatrix params.")
    public DataMatrixParams getDataMatrix() {
        return dataMatrix;
    }

    public void setDataMatrix(DataMatrixParams dataMatrix) {
        this.dataMatrix = dataMatrix;
    }

    /**
     * DotCode params.
     *
     * @return dotCode
     */
    @ApiModelProperty(value = "DotCode params.")
    public DotCodeParams getDotCode() {
        return dotCode;
    }

    public void setDotCode(DotCodeParams dotCode) {
        this.dotCode = dotCode;
    }

    /**
     * ITF params.
     *
     * @return ITF
     */
    @ApiModelProperty(value = "ITF params.")
    public ITFParams getITF() {
        return ITF;
    }

    public void setITF(ITFParams ITF) {
        this.ITF = ITF;
    }

    /**
     * MaxiCode params.
     *
     * @return maxiCode
     */
    @ApiModelProperty(value = "MaxiCode params.")
    public MaxiCodeParams getMaxiCode() {
        return maxiCode;
    }

    public void setMaxiCode(MaxiCodeParams maxiCode) {
        this.maxiCode = maxiCode;
    }

    /**
     * Pdf417 params.
     *
     * @return pdf417
     */
    @ApiModelProperty(value = "Pdf417 params.")
    public Pdf417Params getPdf417() {
        return pdf417;
    }

    public void setPdf417(Pdf417Params pdf417) {
        this.pdf417 = pdf417;
    }

    /**
     * Postal params.
     *
     * @return postal
     */
    @ApiModelProperty(value = "Postal params.")
    public PostalParams getPostal() {
        return postal;
    }

    public void setPostal(PostalParams postal) {
        this.postal = postal;
    }

    /**
     * QR params.
     *
     * @return QR
     */
    @ApiModelProperty(value = "QR params.")
    public QrParams getQR() {
        return QR;
    }

    public void setQR(QrParams QR) {
        this.QR = QR;
    }

    /**
     * PatchCode params.
     *
     * @return patchCode
     */
    @ApiModelProperty(value = "PatchCode params.")
    public PatchCodeParams getPatchCode() {
        return patchCode;
    }

    public void setPatchCode(PatchCodeParams patchCode) {
        this.patchCode = patchCode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GeneratorParams generatorParams = (GeneratorParams) o;
        return Objects.equals(this.typeOfBarcode, generatorParams.typeOfBarcode)
                && Objects.equals(this.text, generatorParams.text)
                && Objects.equals(this.twoDDisplayText, generatorParams.twoDDisplayText)
                && Objects.equals(this.textLocation, generatorParams.textLocation)
                && Objects.equals(this.textAlignment, generatorParams.textAlignment)
                && Objects.equals(this.textColor, generatorParams.textColor)
                && Objects.equals(this.font, generatorParams.font)
                && Objects.equals(this.fontSizeMode, generatorParams.fontSizeMode)
                && Objects.equals(this.resolution, generatorParams.resolution)
                && Objects.equals(this.resolutionX, generatorParams.resolutionX)
                && Objects.equals(this.resolutionY, generatorParams.resolutionY)
                && Objects.equals(this.dimensionX, generatorParams.dimensionX)
                && Objects.equals(this.textSpace, generatorParams.textSpace)
                && Objects.equals(this.units, generatorParams.units)
                && Objects.equals(this.sizeMode, generatorParams.sizeMode)
                && Objects.equals(this.barHeight, generatorParams.barHeight)
                && Objects.equals(this.imageHeight, generatorParams.imageHeight)
                && Objects.equals(this.imageWidth, generatorParams.imageWidth)
                && Objects.equals(this.rotationAngle, generatorParams.rotationAngle)
                && Objects.equals(this.padding, generatorParams.padding)
                && Objects.equals(this.captionAbove, generatorParams.captionAbove)
                && Objects.equals(this.captionBelow, generatorParams.captionBelow)
                && Objects.equals(this.backColor, generatorParams.backColor)
                && Objects.equals(this.barColor, generatorParams.barColor)
                && Objects.equals(this.borderColor, generatorParams.borderColor)
                && Objects.equals(this.borderWidth, generatorParams.borderWidth)
                && Objects.equals(this.borderDashStyle, generatorParams.borderDashStyle)
                && Objects.equals(this.borderVisible, generatorParams.borderVisible)
                && Objects.equals(this.enableChecksum, generatorParams.enableChecksum)
                && Objects.equals(this.enableEscape, generatorParams.enableEscape)
                && Objects.equals(this.filledBars, generatorParams.filledBars)
                && Objects.equals(this.alwaysShowChecksum, generatorParams.alwaysShowChecksum)
                && Objects.equals(this.wideNarrowRatio, generatorParams.wideNarrowRatio)
                && Objects.equals(this.validateText, generatorParams.validateText)
                && Objects.equals(this.supplementData, generatorParams.supplementData)
                && Objects.equals(this.supplementSpace, generatorParams.supplementSpace)
                && Objects.equals(this.australianPost, generatorParams.australianPost)
                && Objects.equals(this.aztec, generatorParams.aztec)
                && Objects.equals(this.codabar, generatorParams.codabar)
                && Objects.equals(this.codablock, generatorParams.codablock)
                && Objects.equals(this.code16K, generatorParams.code16K)
                && Objects.equals(this.coupon, generatorParams.coupon)
                && Objects.equals(this.dataBar, generatorParams.dataBar)
                && Objects.equals(this.dataMatrix, generatorParams.dataMatrix)
                && Objects.equals(this.dotCode, generatorParams.dotCode)
                && Objects.equals(this.ITF, generatorParams.ITF)
                && Objects.equals(this.maxiCode, generatorParams.maxiCode)
                && Objects.equals(this.pdf417, generatorParams.pdf417)
                && Objects.equals(this.postal, generatorParams.postal)
                && Objects.equals(this.QR, generatorParams.QR)
                && Objects.equals(this.patchCode, generatorParams.patchCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                typeOfBarcode,
                text,
                twoDDisplayText,
                textLocation,
                textAlignment,
                textColor,
                font,
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
                padding,
                captionAbove,
                captionBelow,
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
                australianPost,
                aztec,
                codabar,
                codablock,
                code16K,
                coupon,
                dataBar,
                dataMatrix,
                dotCode,
                ITF,
                maxiCode,
                pdf417,
                postal,
                QR,
                patchCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GeneratorParams {\n");

        sb.append("    typeOfBarcode: ").append(toIndentedString(typeOfBarcode)).append("\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    twoDDisplayText: ").append(toIndentedString(twoDDisplayText)).append("\n");
        sb.append("    textLocation: ").append(toIndentedString(textLocation)).append("\n");
        sb.append("    textAlignment: ").append(toIndentedString(textAlignment)).append("\n");
        sb.append("    textColor: ").append(toIndentedString(textColor)).append("\n");
        sb.append("    font: ").append(toIndentedString(font)).append("\n");
        sb.append("    fontSizeMode: ").append(toIndentedString(fontSizeMode)).append("\n");
        sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
        sb.append("    resolutionX: ").append(toIndentedString(resolutionX)).append("\n");
        sb.append("    resolutionY: ").append(toIndentedString(resolutionY)).append("\n");
        sb.append("    dimensionX: ").append(toIndentedString(dimensionX)).append("\n");
        sb.append("    textSpace: ").append(toIndentedString(textSpace)).append("\n");
        sb.append("    units: ").append(toIndentedString(units)).append("\n");
        sb.append("    sizeMode: ").append(toIndentedString(sizeMode)).append("\n");
        sb.append("    barHeight: ").append(toIndentedString(barHeight)).append("\n");
        sb.append("    imageHeight: ").append(toIndentedString(imageHeight)).append("\n");
        sb.append("    imageWidth: ").append(toIndentedString(imageWidth)).append("\n");
        sb.append("    rotationAngle: ").append(toIndentedString(rotationAngle)).append("\n");
        sb.append("    padding: ").append(toIndentedString(padding)).append("\n");
        sb.append("    captionAbove: ").append(toIndentedString(captionAbove)).append("\n");
        sb.append("    captionBelow: ").append(toIndentedString(captionBelow)).append("\n");
        sb.append("    backColor: ").append(toIndentedString(backColor)).append("\n");
        sb.append("    barColor: ").append(toIndentedString(barColor)).append("\n");
        sb.append("    borderColor: ").append(toIndentedString(borderColor)).append("\n");
        sb.append("    borderWidth: ").append(toIndentedString(borderWidth)).append("\n");
        sb.append("    borderDashStyle: ").append(toIndentedString(borderDashStyle)).append("\n");
        sb.append("    borderVisible: ").append(toIndentedString(borderVisible)).append("\n");
        sb.append("    enableChecksum: ").append(toIndentedString(enableChecksum)).append("\n");
        sb.append("    enableEscape: ").append(toIndentedString(enableEscape)).append("\n");
        sb.append("    filledBars: ").append(toIndentedString(filledBars)).append("\n");
        sb.append("    alwaysShowChecksum: ")
                .append(toIndentedString(alwaysShowChecksum))
                .append("\n");
        sb.append("    wideNarrowRatio: ").append(toIndentedString(wideNarrowRatio)).append("\n");
        sb.append("    validateText: ").append(toIndentedString(validateText)).append("\n");
        sb.append("    supplementData: ").append(toIndentedString(supplementData)).append("\n");
        sb.append("    supplementSpace: ").append(toIndentedString(supplementSpace)).append("\n");
        sb.append("    australianPost: ").append(toIndentedString(australianPost)).append("\n");
        sb.append("    aztec: ").append(toIndentedString(aztec)).append("\n");
        sb.append("    codabar: ").append(toIndentedString(codabar)).append("\n");
        sb.append("    codablock: ").append(toIndentedString(codablock)).append("\n");
        sb.append("    code16K: ").append(toIndentedString(code16K)).append("\n");
        sb.append("    coupon: ").append(toIndentedString(coupon)).append("\n");
        sb.append("    dataBar: ").append(toIndentedString(dataBar)).append("\n");
        sb.append("    dataMatrix: ").append(toIndentedString(dataMatrix)).append("\n");
        sb.append("    dotCode: ").append(toIndentedString(dotCode)).append("\n");
        sb.append("    ITF: ").append(toIndentedString(ITF)).append("\n");
        sb.append("    maxiCode: ").append(toIndentedString(maxiCode)).append("\n");
        sb.append("    pdf417: ").append(toIndentedString(pdf417)).append("\n");
        sb.append("    postal: ").append(toIndentedString(postal)).append("\n");
        sb.append("    QR: ").append(toIndentedString(QR)).append("\n");
        sb.append("    patchCode: ").append(toIndentedString(patchCode)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first
     * line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
