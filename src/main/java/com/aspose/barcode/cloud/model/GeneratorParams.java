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

    @SerializedName(value = "noWrap")
    private Boolean noWrap = null;

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

    @SerializedName(value = "barWidthReduction")
    private Double barWidthReduction = null;

    @SerializedName(value = "useAntiAlias")
    private Boolean useAntiAlias = null;

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

    @SerializedName(value = "code128")
    private Code128Params code128 = null;

    @SerializedName(value = "hanXin")
    private HanXinParams hanXin = null;

    /**
     * Type of barcode to generate.
     *
     * @return typeOfBarcode
     */
    @ApiModelProperty(required = true, value = "TypeOfBarcode")
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
    @ApiModelProperty(required = true, value = "Text")
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
    @ApiModelProperty(value = "TwoDDisplayText")
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
    @ApiModelProperty(value = "TextLocation")
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
    @ApiModelProperty(value = "TextAlignment")
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
    @ApiModelProperty(value = "TextColor")
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
    @ApiModelProperty(value = "Font")
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
    @ApiModelProperty(value = "FontSizeMode")
    public FontMode getFontSizeMode() {
        return fontSizeMode;
    }

    public void setFontSizeMode(FontMode fontSizeMode) {
        this.fontSizeMode = fontSizeMode;
    }

    /**
     * Specify word wraps (line breaks) within text. Default value: false.
     *
     * @return noWrap
     */
    @ApiModelProperty(value = "NoWrap")
    public Boolean isNoWrap() {
        return noWrap;
    }

    public void setNoWrap(Boolean noWrap) {
        this.noWrap = noWrap;
    }

    /**
     * Resolution of the BarCode image. One value for both dimensions. Default value: 96 dpi.
     *
     * @return resolution
     */
    @ApiModelProperty(value = "Resolution")
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
    @Deprecated()
    @ApiModelProperty(value = "ResolutionX")
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
    @Deprecated()
    @ApiModelProperty(value = "ResolutionY")
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
    @ApiModelProperty(value = "DimensionX")
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
    @ApiModelProperty(value = "TextSpace")
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
    @ApiModelProperty(value = "Units")
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
    @ApiModelProperty(value = "SizeMode")
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
    @ApiModelProperty(value = "BarHeight")
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
    @ApiModelProperty(value = "ImageHeight")
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
    @ApiModelProperty(value = "ImageWidth")
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
    @ApiModelProperty(value = "RotationAngle")
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
    @ApiModelProperty(value = "Padding")
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
    @ApiModelProperty(value = "CaptionAbove")
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
    @ApiModelProperty(value = "CaptionBelow")
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
    @ApiModelProperty(value = "BackColor")
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
    @ApiModelProperty(value = "BarColor")
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
    @ApiModelProperty(value = "BorderColor")
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
    @ApiModelProperty(value = "BorderWidth")
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
    @ApiModelProperty(value = "BorderDashStyle")
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
    @ApiModelProperty(value = "BorderVisible")
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
    @ApiModelProperty(value = "EnableChecksum")
    public EnableChecksum getEnableChecksum() {
        return enableChecksum;
    }

    public void setEnableChecksum(EnableChecksum enableChecksum) {
        this.enableChecksum = enableChecksum;
    }

    /**
     * Indicates whether explains the character &quot;\&quot; as an escape character in CodeText
     * property. Used for Pdf417, DataMatrix, Code128 only If the EnableEscape is true,
     * &quot;\&quot; will be explained as a special escape character. Otherwise, &quot;\&quot; acts
     * as normal characters. Aspose.BarCode supports input decimal ascii code and mnemonic for ASCII
     * control-code characters. For example, \013 and \\CR stands for CR.
     *
     * @return enableEscape
     */
    @ApiModelProperty(value = "EnableEscape")
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
    @ApiModelProperty(value = "FilledBars")
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
    @ApiModelProperty(value = "AlwaysShowChecksum")
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
    @ApiModelProperty(value = "WideNarrowRatio")
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
    @ApiModelProperty(value = "ValidateText")
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
    @ApiModelProperty(value = "SupplementData")
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
    @ApiModelProperty(value = "SupplementSpace")
    public Double getSupplementSpace() {
        return supplementSpace;
    }

    public void setSupplementSpace(Double supplementSpace) {
        this.supplementSpace = supplementSpace;
    }

    /**
     * Bars reduction value that is used to compensate ink spread while printing.
     *
     * @return barWidthReduction
     */
    @ApiModelProperty(value = "BarWidthReduction")
    public Double getBarWidthReduction() {
        return barWidthReduction;
    }

    public void setBarWidthReduction(Double barWidthReduction) {
        this.barWidthReduction = barWidthReduction;
    }

    /**
     * Indicates whether is used anti-aliasing mode to render image. Anti-aliasing mode is applied
     * to barcode and text drawing.
     *
     * @return useAntiAlias
     */
    @ApiModelProperty(value = "UseAntiAlias")
    public Boolean isUseAntiAlias() {
        return useAntiAlias;
    }

    public void setUseAntiAlias(Boolean useAntiAlias) {
        this.useAntiAlias = useAntiAlias;
    }

    /**
     * AustralianPost params.
     *
     * @return australianPost
     */
    @ApiModelProperty(value = "AustralianPost")
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
    @ApiModelProperty(value = "Aztec")
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
    @ApiModelProperty(value = "Codabar")
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
    @ApiModelProperty(value = "Codablock")
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
    @ApiModelProperty(value = "Code16K")
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
    @ApiModelProperty(value = "Coupon")
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
    @ApiModelProperty(value = "DataBar")
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
    @ApiModelProperty(value = "DataMatrix")
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
    @ApiModelProperty(value = "DotCode")
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
    @ApiModelProperty(value = "ITF")
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
    @ApiModelProperty(value = "MaxiCode")
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
    @ApiModelProperty(value = "Pdf417")
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
    @ApiModelProperty(value = "Postal")
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
    @ApiModelProperty(value = "QR")
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
    @ApiModelProperty(value = "PatchCode")
    public PatchCodeParams getPatchCode() {
        return patchCode;
    }

    public void setPatchCode(PatchCodeParams patchCode) {
        this.patchCode = patchCode;
    }

    /**
     * Code128 params.
     *
     * @return code128
     */
    @ApiModelProperty(value = "Code128")
    public Code128Params getCode128() {
        return code128;
    }

    public void setCode128(Code128Params code128) {
        this.code128 = code128;
    }

    /**
     * HanXin params.
     *
     * @return hanXin
     */
    @ApiModelProperty(value = "HanXin")
    public HanXinParams getHanXin() {
        return hanXin;
    }

    public void setHanXin(HanXinParams hanXin) {
        this.hanXin = hanXin;
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
                && Objects.equals(this.noWrap, generatorParams.noWrap)
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
                && Objects.equals(this.barWidthReduction, generatorParams.barWidthReduction)
                && Objects.equals(this.useAntiAlias, generatorParams.useAntiAlias)
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
                && Objects.equals(this.patchCode, generatorParams.patchCode)
                && Objects.equals(this.code128, generatorParams.code128)
                && Objects.equals(this.hanXin, generatorParams.hanXin);
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
                noWrap,
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
                barWidthReduction,
                useAntiAlias,
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
                patchCode,
                code128,
                hanXin);
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
        sb.append("    noWrap: ").append(toIndentedString(noWrap)).append("\n");
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
        sb.append("    barWidthReduction: ")
                .append(toIndentedString(barWidthReduction))
                .append("\n");
        sb.append("    useAntiAlias: ").append(toIndentedString(useAntiAlias)).append("\n");
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
        sb.append("    code128: ").append(toIndentedString(code128)).append("\n");
        sb.append("    hanXin: ").append(toIndentedString(hanXin)).append("\n");
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
