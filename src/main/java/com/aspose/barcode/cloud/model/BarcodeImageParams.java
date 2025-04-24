package com.aspose.barcode.cloud.model;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/** Barcode image optional parameters */
@ApiModel(description = "Barcode image optional parameters")
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.8.0")
public class BarcodeImageParams {
    @SerializedName(value = "imageFormat")
    private BarcodeImageFormat imageFormat;

    @SerializedName(value = "textLocation")
    private CodeLocation textLocation;

    @SerializedName(value = "foregroundColor")
    private String foregroundColor = "Black";

    @SerializedName(value = "backgroundColor")
    private String backgroundColor = "White";

    @SerializedName(value = "units")
    private GraphicsUnit units;

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
    public BarcodeImageFormat getImageFormat() {
        return imageFormat;
    }

    public void setImageFormat(BarcodeImageFormat imageFormat) {
        this.imageFormat = imageFormat;
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
     * Specify the displaying bars and content Color. Value: Color name from
     * https://reference.aspose.com/drawing/net/system.drawing/color/ or ARGB value started with #.
     * For example: AliceBlue or #FF000000 Default value: Black.
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
     * For example: AliceBlue or #FF000000 Default value: White.
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
    public GraphicsUnit getUnits() {
        return units;
    }

    public void setUnits(GraphicsUnit units) {
        this.units = units;
    }

    /**
     * Resolution of the BarCode image. One value for both dimensions. Default value: 96 dpi.
     * Decimal separator is dot. minimum: 1 maximum: 100000
     *
     * @return resolution
     */
    @ApiModelProperty(example = "96", value = "resolution")
    public Float getResolution() {
        return resolution;
    }

    public void setResolution(Float resolution) {
        this.resolution = resolution;
    }

    /**
     * Height of the barcode image in given units. Default units: pixel. Decimal separator is dot.
     *
     * @return imageHeight
     */
    @ApiModelProperty(example = "200", value = "imageHeight")
    public Float getImageHeight() {
        return imageHeight;
    }

    public void setImageHeight(Float imageHeight) {
        this.imageHeight = imageHeight;
    }

    /**
     * Width of the barcode image in given units. Default units: pixel. Decimal separator is dot.
     *
     * @return imageWidth
     */
    @ApiModelProperty(example = "200", value = "imageWidth")
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
                && Objects.equals(this.textLocation, barcodeImageParams.textLocation)
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
                textLocation,
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
        sb.append("    textLocation: ").append(toIndentedString(textLocation)).append("\n");
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
