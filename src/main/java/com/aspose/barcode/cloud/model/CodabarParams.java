// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="CodabarParams.java">
//   Copyright (c) 2022 Aspose.BarCode for Cloud
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
    @ApiModelProperty(
            value =
                    "Checksum algorithm for Codabar barcodes. Default value:"
                            + " CodabarChecksumMode.Mod16. To enable checksum calculation set value"
                            + " EnableChecksum.Yes to property EnableChecksum.")
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
    @ApiModelProperty(
            value = "Start symbol (character) of Codabar symbology. Default value: CodabarSymbol.A")
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
    @ApiModelProperty(
            value = "Stop symbol (character) of Codabar symbology. Default value: CodabarSymbol.A")
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
