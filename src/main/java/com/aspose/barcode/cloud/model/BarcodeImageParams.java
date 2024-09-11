package com.aspose.barcode.cloud.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/** Barcode image optional parameters */
@ApiModel(description = "Barcode image optional parameters")
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.8.0")
public class BarcodeImageParams {
    @SerializedName(value = "imageFormat")
    private AvailableBarCodeImageFormat imageFormat;

    @SerializedName(value = "twoDDisplayText")
    private String twoDDisplayText;

    @SerializedName(value = "textLocation")
    private CodeLocation textLocation;

    @SerializedName(value = "textAlignment")
    private TextAlignment textAlignment;

    @SerializedName(value = "foregroundColor")
    private String foregroundColor;

    @SerializedName(value = "backgroundColor")
    private String backgroundColor;

    @SerializedName(value = "units")
    private AvailableGraphicsUnit units;

    @SerializedName(value = "resolution")
    private Float resolution;

    @SerializedName(value = "imageHeight")
    private Float imageHeight;

    @SerializedName(value = "imageWidth")
    private Float imageWidth;

    @SerializedName(value = "rotationAngle")
    private Integer rotationAngle;

    /**
     * Get imageFormat
     *
     * @return imageFormat
     */
    @ApiModelProperty(value = "imageFormat")
    public AvailableBarCodeImageFormat getImageFormat() {
        return imageFormat;
    }

    public void setImageFormat(AvailableBarCodeImageFormat imageFormat) {
        this.imageFormat = imageFormat;
    }

    /**
     * Text that will be displayed instead of codetext in 2D barcodes. Used for: Aztec, Pdf417,
     * DataMatrix, QR, MaxiCode, DotCode
     *
     * @return twoDDisplayText
     */
    @ApiModelProperty(value = "twoDDisplayText")
    public String getTwoDDisplayText() {
        return twoDDisplayText;
    }

    public void setTwoDDisplayText(String twoDDisplayText) {
        this.twoDDisplayText = twoDDisplayText;
    }

    /**
     * Get textLocation
     *
     * @return textLocation
     */
    @ApiModelProperty(value = "textLocation")
    public CodeLocation getTextLocation() {
        return textLocation;
    }

    public void setTextLocation(CodeLocation textLocation) {
        this.textLocation = textLocation;
    }

    /**
     * Get textAlignment
     *
     * @return textAlignment
     */
    @ApiModelProperty(value = "textAlignment")
    public TextAlignment getTextAlignment() {
        return textAlignment;
    }

    public void setTextAlignment(TextAlignment textAlignment) {
        this.textAlignment = textAlignment;
    }

    /**
     * Specify the displaying bars and content Color. Value: Color name from
     * https://reference.aspose.com/drawing/net/system.drawing/color/ or ARGB value started with #.
     * For example: Color.AliceBlue or #FF000000 Default value: Color.Black.
     *
     * @return foregroundColor
     */
    @ApiModelProperty(value = "foregroundColor")
    public String getForegroundColor() {
        return foregroundColor;
    }

    public void setForegroundColor(String foregroundColor) {
        this.foregroundColor = foregroundColor;
    }

    /**
     * Background color of the barcode image. Value: Color name from
     * https://reference.aspose.com/drawing/net/system.drawing/color/ or ARGB value started with #.
     * For example: Color.AliceBlue or #FF000000 Default value: Color.White.
     *
     * @return backgroundColor
     */
    @ApiModelProperty(value = "backgroundColor")
    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    /**
     * Get units
     *
     * @return units
     */
    @ApiModelProperty(value = "units")
    public AvailableGraphicsUnit getUnits() {
        return units;
    }

    public void setUnits(AvailableGraphicsUnit units) {
        this.units = units;
    }

    /**
     * Resolution of the BarCode image. One value for both dimensions. Default value: 96 dpi.
     *
     * @return resolution
     */
    @ApiModelProperty(value = "resolution")
    public Float getResolution() {
        return resolution;
    }

    public void setResolution(Float resolution) {
        this.resolution = resolution;
    }

    /**
     * Height of the barcode image in given units. Default units: pixel.
     *
     * @return imageHeight
     */
    @ApiModelProperty(value = "imageHeight")
    public Float getImageHeight() {
        return imageHeight;
    }

    public void setImageHeight(Float imageHeight) {
        this.imageHeight = imageHeight;
    }

    /**
     * Width of the barcode image in given units. Default units: pixel.
     *
     * @return imageWidth
     */
    @ApiModelProperty(value = "imageWidth")
    public Float getImageWidth() {
        return imageWidth;
    }

    public void setImageWidth(Float imageWidth) {
        this.imageWidth = imageWidth;
    }

    /**
     * BarCode image rotation angle, measured in degree, e.g. RotationAngle &#x3D; 0 or
     * RotationAngle &#x3D; 360 means no rotation. If RotationAngle NOT equal to 90, 180, 270 or 0,
     * it may increase the difficulty for the scanner to read the image. Default value: 0.
     *
     * @return rotationAngle
     */
    @ApiModelProperty(value = "rotationAngle")
    public Integer getRotationAngle() {
        return rotationAngle;
    }

    public void setRotationAngle(Integer rotationAngle) {
        this.rotationAngle = rotationAngle;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BarcodeImageParams barcodeImageParams = (BarcodeImageParams) o;
        return Objects.equals(this.imageFormat, barcodeImageParams.imageFormat)
                && Objects.equals(this.twoDDisplayText, barcodeImageParams.twoDDisplayText)
                && Objects.equals(this.textLocation, barcodeImageParams.textLocation)
                && Objects.equals(this.textAlignment, barcodeImageParams.textAlignment)
                && Objects.equals(this.foregroundColor, barcodeImageParams.foregroundColor)
                && Objects.equals(this.backgroundColor, barcodeImageParams.backgroundColor)
                && Objects.equals(this.units, barcodeImageParams.units)
                && Objects.equals(this.resolution, barcodeImageParams.resolution)
                && Objects.equals(this.imageHeight, barcodeImageParams.imageHeight)
                && Objects.equals(this.imageWidth, barcodeImageParams.imageWidth)
                && Objects.equals(this.rotationAngle, barcodeImageParams.rotationAngle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                imageFormat,
                twoDDisplayText,
                textLocation,
                textAlignment,
                foregroundColor,
                backgroundColor,
                units,
                resolution,
                imageHeight,
                imageWidth,
                rotationAngle);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BarcodeImageParams {\n");

        sb.append("    imageFormat: ").append(toIndentedString(imageFormat)).append("\n");
        sb.append("    twoDDisplayText: ").append(toIndentedString(twoDDisplayText)).append("\n");
        sb.append("    textLocation: ").append(toIndentedString(textLocation)).append("\n");
        sb.append("    textAlignment: ").append(toIndentedString(textAlignment)).append("\n");
        sb.append("    foregroundColor: ").append(toIndentedString(foregroundColor)).append("\n");
        sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
        sb.append("    units: ").append(toIndentedString(units)).append("\n");
        sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
        sb.append("    imageHeight: ").append(toIndentedString(imageHeight)).append("\n");
        sb.append("    imageWidth: ").append(toIndentedString(imageWidth)).append("\n");
        sb.append("    rotationAngle: ").append(toIndentedString(rotationAngle)).append("\n");
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
