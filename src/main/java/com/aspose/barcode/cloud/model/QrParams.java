package com.aspose.barcode.cloud.model;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/** QR parameters. */
@ApiModel(description = "QR parameters.")
public class QrParams {
    @SerializedName(value = "aspectRatio")
    private Double aspectRatio = null;

    @SerializedName(value = "textEncoding")
    private String textEncoding = null;

    @SerializedName(value = "encodeType")
    private QREncodeType encodeType = null;

    @SerializedName(value = "ecIEncoding")
    private ECIEncodings ecIEncoding = null;

    @SerializedName(value = "encodeMode")
    private QREncodeMode encodeMode = null;

    @SerializedName(value = "errorLevel")
    private QRErrorLevel errorLevel = null;

    @SerializedName(value = "version")
    private QRVersion version = null;

    @SerializedName(value = "structuredAppend")
    private StructuredAppend structuredAppend = null;

    /**
     * Height/Width ratio of 2D BarCode module.
     *
     * @return aspectRatio
     */
    @ApiModelProperty(value = "AspectRatio")
    public Double getAspectRatio() {
        return aspectRatio;
    }

    public void setAspectRatio(Double aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    /**
     * DEPRECATED: This property is obsolete and will be removed in future releases. Unicode symbols
     * detection and encoding will be processed in Auto mode with Extended Channel Interpretation
     * charset designator. Using of own encodings requires manual CodeText encoding into byte[]
     * array. Sets the encoding of codetext.
     *
     * @return textEncoding
     */
    @Deprecated()
    @ApiModelProperty(value = "TextEncoding")
    public String getTextEncoding() {
        return textEncoding;
    }

    public void setTextEncoding(String textEncoding) {
        this.textEncoding = textEncoding;
    }

    /**
     * QR / MicroQR selector mode. Select ForceQR for standard QR symbols, Auto for MicroQR.
     *
     * @return encodeType
     */
    @ApiModelProperty(value = "EncodeType")
    public QREncodeType getEncodeType() {
        return encodeType;
    }

    public void setEncodeType(QREncodeType encodeType) {
        this.encodeType = encodeType;
    }

    /**
     * Extended Channel Interpretation Identifiers. It is used to tell the barcode reader details
     * about the used references for encoding the data in the symbol. Current implementation
     * consists all well known charset encodings.
     *
     * @return ecIEncoding
     */
    @ApiModelProperty(value = "EcIEncoding")
    public ECIEncodings getEcIEncoding() {
        return ecIEncoding;
    }

    public void setEcIEncoding(ECIEncodings ecIEncoding) {
        this.ecIEncoding = ecIEncoding;
    }

    /**
     * QR symbology type of BarCode&#39;s encoding mode. Default value: QREncodeMode.Auto.
     *
     * @return encodeMode
     */
    @ApiModelProperty(value = "EncodeMode")
    public QREncodeMode getEncodeMode() {
        return encodeMode;
    }

    public void setEncodeMode(QREncodeMode encodeMode) {
        this.encodeMode = encodeMode;
    }

    /**
     * Level of Reed-Solomon error correction for QR barcode. From low to high: LevelL, LevelM,
     * LevelQ, LevelH. see QRErrorLevel.
     *
     * @return errorLevel
     */
    @ApiModelProperty(value = "ErrorLevel")
    public QRErrorLevel getErrorLevel() {
        return errorLevel;
    }

    public void setErrorLevel(QRErrorLevel errorLevel) {
        this.errorLevel = errorLevel;
    }

    /**
     * Version of QR Code. From Version1 to Version40 for QR code and from M1 to M4 for MicroQr.
     * Default value is QRVersion.Auto.
     *
     * @return version
     */
    @ApiModelProperty(value = "Version")
    public QRVersion getVersion() {
        return version;
    }

    public void setVersion(QRVersion version) {
        this.version = version;
    }

    /**
     * QR structured append parameters.
     *
     * @return structuredAppend
     */
    @ApiModelProperty(value = "StructuredAppend")
    public StructuredAppend getStructuredAppend() {
        return structuredAppend;
    }

    public void setStructuredAppend(StructuredAppend structuredAppend) {
        this.structuredAppend = structuredAppend;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QrParams qrParams = (QrParams) o;
        return Objects.equals(this.aspectRatio, qrParams.aspectRatio)
                && Objects.equals(this.textEncoding, qrParams.textEncoding)
                && Objects.equals(this.encodeType, qrParams.encodeType)
                && Objects.equals(this.ecIEncoding, qrParams.ecIEncoding)
                && Objects.equals(this.encodeMode, qrParams.encodeMode)
                && Objects.equals(this.errorLevel, qrParams.errorLevel)
                && Objects.equals(this.version, qrParams.version)
                && Objects.equals(this.structuredAppend, qrParams.structuredAppend);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                aspectRatio,
                textEncoding,
                encodeType,
                ecIEncoding,
                encodeMode,
                errorLevel,
                version,
                structuredAppend);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QrParams {\n");

        sb.append("    aspectRatio: ").append(toIndentedString(aspectRatio)).append("\n");
        sb.append("    textEncoding: ").append(toIndentedString(textEncoding)).append("\n");
        sb.append("    encodeType: ").append(toIndentedString(encodeType)).append("\n");
        sb.append("    ecIEncoding: ").append(toIndentedString(ecIEncoding)).append("\n");
        sb.append("    encodeMode: ").append(toIndentedString(encodeMode)).append("\n");
        sb.append("    errorLevel: ").append(toIndentedString(errorLevel)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    structuredAppend: ").append(toIndentedString(structuredAppend)).append("\n");
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
