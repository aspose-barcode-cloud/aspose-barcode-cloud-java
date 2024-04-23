package com.aspose.barcode.cloud.model;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/** PatchCode parameters. */
@ApiModel(description = "PatchCode parameters.")
public class PatchCodeParams {
    @SerializedName(value = "extraBarcodeText")
    private String extraBarcodeText = null;

    @SerializedName(value = "patchFormat")
    private PatchFormat patchFormat = null;

    /**
     * Specifies codetext for an extra QR barcode, when PatchCode is generated in page mode.
     *
     * @return extraBarcodeText
     */
    @ApiModelProperty(value = "ExtraBarcodeText")
    public String getExtraBarcodeText() {
        return extraBarcodeText;
    }

    public void setExtraBarcodeText(String extraBarcodeText) {
        this.extraBarcodeText = extraBarcodeText;
    }

    /**
     * PatchCode format. Choose PatchOnly to generate single PatchCode. Use page format to generate
     * Patch page with PatchCodes as borders. Default value: PatchFormat.PatchOnly
     *
     * @return patchFormat
     */
    @ApiModelProperty(value = "PatchFormat")
    public PatchFormat getPatchFormat() {
        return patchFormat;
    }

    public void setPatchFormat(PatchFormat patchFormat) {
        this.patchFormat = patchFormat;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PatchCodeParams patchCodeParams = (PatchCodeParams) o;
        return Objects.equals(this.extraBarcodeText, patchCodeParams.extraBarcodeText)
                && Objects.equals(this.patchFormat, patchCodeParams.patchFormat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(extraBarcodeText, patchFormat);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PatchCodeParams {\n");

        sb.append("    extraBarcodeText: ").append(toIndentedString(extraBarcodeText)).append("\n");
        sb.append("    patchFormat: ").append(toIndentedString(patchFormat)).append("\n");
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
