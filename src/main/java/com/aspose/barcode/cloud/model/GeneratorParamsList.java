// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="GeneratorParamsList.java">
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

package com.aspose.barcode.cloud.model;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Represents list of barcode generators */
@ApiModel(description = "Represents list of barcode generators")
public class GeneratorParamsList {
    @SerializedName(value = "barcodeBuilders")
    private List<GeneratorParams> barcodeBuilders = null;

    @SerializedName(value = "xstep")
    private Integer xstep = null;

    @SerializedName(value = "ystep")
    private Integer ystep = null;

    /** Add GeneratorParams. */
    public void addBarcodeBuildersItem(GeneratorParams barcodeBuildersItem) {
        if (this.barcodeBuilders == null) {
            this.barcodeBuilders = new ArrayList<GeneratorParams>();
        }
        this.barcodeBuilders.add(barcodeBuildersItem);
    }

    /**
     * List of barcode generators
     *
     * @return barcodeBuilders
     */
    @ApiModelProperty(value = "BarcodeBuilders")
    public List<GeneratorParams> getBarcodeBuilders() {
        return barcodeBuilders;
    }

    public void setBarcodeBuilders(List<GeneratorParams> barcodeBuilders) {
        this.barcodeBuilders = barcodeBuilders;
    }

    /**
     * Shift step according to X axis
     *
     * @return xstep
     */
    @ApiModelProperty(required = true, value = "Xstep")
    public Integer getXstep() {
        return xstep;
    }

    public void setXstep(Integer xstep) {
        this.xstep = xstep;
    }

    /**
     * Shift step according to Y axis
     *
     * @return ystep
     */
    @ApiModelProperty(required = true, value = "Ystep")
    public Integer getYstep() {
        return ystep;
    }

    public void setYstep(Integer ystep) {
        this.ystep = ystep;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GeneratorParamsList generatorParamsList = (GeneratorParamsList) o;
        return Objects.equals(this.barcodeBuilders, generatorParamsList.barcodeBuilders)
                && Objects.equals(this.xstep, generatorParamsList.xstep)
                && Objects.equals(this.ystep, generatorParamsList.ystep);
    }

    @Override
    public int hashCode() {
        return Objects.hash(barcodeBuilders, xstep, ystep);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GeneratorParamsList {\n");

        sb.append("    barcodeBuilders: ").append(toIndentedString(barcodeBuilders)).append("\n");
        sb.append("    xstep: ").append(toIndentedString(xstep)).append("\n");
        sb.append("    ystep: ").append(toIndentedString(ystep)).append("\n");
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
