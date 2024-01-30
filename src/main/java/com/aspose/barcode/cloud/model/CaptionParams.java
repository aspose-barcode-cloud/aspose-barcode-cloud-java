// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="CaptionParams.java">
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

import java.util.Objects;

/** Caption */
@ApiModel(description = "Caption")
public class CaptionParams {
    @SerializedName(value = "text")
    private String text = null;

    @SerializedName(value = "alignment")
    private TextAlignment alignment = null;

    @SerializedName(value = "color")
    private String color = null;

    @SerializedName(value = "visible")
    private Boolean visible = null;

    @SerializedName(value = "font")
    private FontParams font = null;

    @SerializedName(value = "padding")
    private Padding padding = null;

    @SerializedName(value = "noWrap")
    private Boolean noWrap = null;

    /**
     * Caption text.
     *
     * @return text
     */
    @ApiModelProperty(value = "Text")
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    /**
     * Text alignment.
     *
     * @return alignment
     */
    @ApiModelProperty(value = "Alignment")
    public TextAlignment getAlignment() {
        return alignment;
    }

    public void setAlignment(TextAlignment alignment) {
        this.alignment = alignment;
    }

    /**
     * Text color.
     *
     * @return color
     */
    @ApiModelProperty(value = "Color")
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Is caption visible.
     *
     * @return visible
     */
    @ApiModelProperty(value = "Visible")
    public Boolean isVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    /**
     * Font.
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
     * Padding.
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CaptionParams captionParams = (CaptionParams) o;
        return Objects.equals(this.text, captionParams.text)
                && Objects.equals(this.alignment, captionParams.alignment)
                && Objects.equals(this.color, captionParams.color)
                && Objects.equals(this.visible, captionParams.visible)
                && Objects.equals(this.font, captionParams.font)
                && Objects.equals(this.padding, captionParams.padding)
                && Objects.equals(this.noWrap, captionParams.noWrap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, alignment, color, visible, font, padding, noWrap);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CaptionParams {\n");

        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    alignment: ").append(toIndentedString(alignment)).append("\n");
        sb.append("    color: ").append(toIndentedString(color)).append("\n");
        sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
        sb.append("    font: ").append(toIndentedString(font)).append("\n");
        sb.append("    padding: ").append(toIndentedString(padding)).append("\n");
        sb.append("    noWrap: ").append(toIndentedString(noWrap)).append("\n");
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
