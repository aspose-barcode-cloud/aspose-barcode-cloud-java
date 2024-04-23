package com.aspose.barcode.cloud.model;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/** Codabar parameters. */
@ApiModel(description = "Codabar parameters.")
public class CodabarParams {
    @SerializedName(value = "checksumMode")
    private CodabarChecksumMode checksumMode = null;

    @SerializedName(value = "startSymbol")
    private CodabarSymbol startSymbol = null;

    @SerializedName(value = "stopSymbol")
    private CodabarSymbol stopSymbol = null;

    /**
     * Checksum algorithm for Codabar barcodes. Default value: CodabarChecksumMode.Mod16. To enable
     * checksum calculation set value EnableChecksum.Yes to property EnableChecksum.
     *
     * @return checksumMode
     */
    @ApiModelProperty(value = "ChecksumMode")
    public CodabarChecksumMode getChecksumMode() {
        return checksumMode;
    }

    public void setChecksumMode(CodabarChecksumMode checksumMode) {
        this.checksumMode = checksumMode;
    }

    /**
     * Start symbol (character) of Codabar symbology. Default value: CodabarSymbol.A
     *
     * @return startSymbol
     */
    @ApiModelProperty(value = "StartSymbol")
    public CodabarSymbol getStartSymbol() {
        return startSymbol;
    }

    public void setStartSymbol(CodabarSymbol startSymbol) {
        this.startSymbol = startSymbol;
    }

    /**
     * Stop symbol (character) of Codabar symbology. Default value: CodabarSymbol.A
     *
     * @return stopSymbol
     */
    @ApiModelProperty(value = "StopSymbol")
    public CodabarSymbol getStopSymbol() {
        return stopSymbol;
    }

    public void setStopSymbol(CodabarSymbol stopSymbol) {
        this.stopSymbol = stopSymbol;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CodabarParams codabarParams = (CodabarParams) o;
        return Objects.equals(this.checksumMode, codabarParams.checksumMode)
                && Objects.equals(this.startSymbol, codabarParams.startSymbol)
                && Objects.equals(this.stopSymbol, codabarParams.stopSymbol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(checksumMode, startSymbol, stopSymbol);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodabarParams {\n");

        sb.append("    checksumMode: ").append(toIndentedString(checksumMode)).append("\n");
        sb.append("    startSymbol: ").append(toIndentedString(startSymbol)).append("\n");
        sb.append("    stopSymbol: ").append(toIndentedString(stopSymbol)).append("\n");
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
