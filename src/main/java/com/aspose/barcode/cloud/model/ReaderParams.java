// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="ReaderParams.java">
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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Represents BarcodeReader object. */
@ApiModel(description = "Represents BarcodeReader object.")
public class ReaderParams {
    @SerializedName(value = "type")
    private DecodeBarcodeType type = null;

    @SerializedName(value = "checksumValidation")
    private ChecksumValidation checksumValidation = null;

    @SerializedName(value = "detectEncoding")
    private Boolean detectEncoding = null;

    @SerializedName(value = "preset")
    private PresetType preset = null;

    @SerializedName(value = "rectX")
    private Integer rectX = null;

    @SerializedName(value = "rectY")
    private Integer rectY = null;

    @SerializedName(value = "rectWidth")
    private Integer rectWidth = null;

    @SerializedName(value = "rectHeight")
    private Integer rectHeight = null;

    @SerializedName(value = "stripFNC")
    private Boolean stripFNC = null;

    @SerializedName(value = "timeout")
    private Integer timeout = null;

    @SerializedName(value = "medianSmoothingWindowSize")
    private Integer medianSmoothingWindowSize = null;

    @SerializedName(value = "allowMedianSmoothing")
    private Boolean allowMedianSmoothing = null;

    @SerializedName(value = "allowComplexBackground")
    private Boolean allowComplexBackground = null;

    @SerializedName(value = "allowDatamatrixIndustrialBarcodes")
    private Boolean allowDatamatrixIndustrialBarcodes = null;

    @SerializedName(value = "allowDecreasedImage")
    private Boolean allowDecreasedImage = null;

    @SerializedName(value = "allowDetectScanGap")
    private Boolean allowDetectScanGap = null;

    @SerializedName(value = "allowIncorrectBarcodes")
    private Boolean allowIncorrectBarcodes = null;

    @SerializedName(value = "allowInvertImage")
    private Boolean allowInvertImage = null;

    @SerializedName(value = "allowMicroWhiteSpotsRemoving")
    private Boolean allowMicroWhiteSpotsRemoving = null;

    @SerializedName(value = "allowOneDFastBarcodesDetector")
    private Boolean allowOneDFastBarcodesDetector = null;

    @SerializedName(value = "allowOneDWipedBarsRestoration")
    private Boolean allowOneDWipedBarsRestoration = null;

    @SerializedName(value = "allowQRMicroQrRestoration")
    private Boolean allowQRMicroQrRestoration = null;

    @SerializedName(value = "allowRegularImage")
    private Boolean allowRegularImage = null;

    @SerializedName(value = "allowSaltAndPepperFiltering")
    private Boolean allowSaltAndPepperFiltering = null;

    @SerializedName(value = "allowWhiteSpotsRemoving")
    private Boolean allowWhiteSpotsRemoving = null;

    @SerializedName(value = "regionLikelihoodThresholdPercent")
    private Double regionLikelihoodThresholdPercent = null;

    @SerializedName(value = "scanWindowSizes")
    private List<Integer> scanWindowSizes = null;

    @SerializedName(value = "similarity")
    private Double similarity = null;

    @SerializedName(value = "skipDiagonalSearch")
    private Boolean skipDiagonalSearch = null;

    @SerializedName(value = "australianPostEncodingTable")
    private CustomerInformationInterpretingType australianPostEncodingTable = null;

    public ReaderParams type(DecodeBarcodeType type) {
        this.type = type;
        return this;
    }

    /**
     * The type of barcode to read.
     *
     * @return type
     */
    @ApiModelProperty(value = "The type of barcode to read.")
    public DecodeBarcodeType getType() {
        return type;
    }

    public void setType(DecodeBarcodeType type) {
        this.type = type;
    }

    public ReaderParams checksumValidation(ChecksumValidation checksumValidation) {
        this.checksumValidation = checksumValidation;
        return this;
    }

    /**
     * Enable checksum validation during recognition for 1D barcodes. Default is treated as Yes for
     * symbologies which must contain checksum, as No where checksum only possible. Checksum never
     * used: Codabar Checksum is possible: Code39 Standard/Extended, Standard2of5, Interleaved2of5,
     * Matrix2of5, ItalianPost25, DeutschePostIdentcode, DeutschePostLeitcode, VIN Checksum always
     * used: Rest symbologies
     *
     * @return checksumValidation
     */
    @ApiModelProperty(
            value =
                    "Enable checksum validation during recognition for 1D barcodes. Default is"
                        + " treated as Yes for symbologies which must contain checksum, as No"
                        + " where checksum only possible. Checksum never used: Codabar Checksum is"
                        + " possible: Code39 Standard/Extended, Standard2of5, Interleaved2of5,"
                        + " Matrix2of5, ItalianPost25, DeutschePostIdentcode,"
                        + " DeutschePostLeitcode, VIN Checksum always used: Rest symbologies")
    public ChecksumValidation getChecksumValidation() {
        return checksumValidation;
    }

    public void setChecksumValidation(ChecksumValidation checksumValidation) {
        this.checksumValidation = checksumValidation;
    }

    public ReaderParams detectEncoding(Boolean detectEncoding) {
        this.detectEncoding = detectEncoding;
        return this;
    }

    /**
     * A flag which force engine to detect codetext encoding for Unicode.
     *
     * @return detectEncoding
     */
    @ApiModelProperty(value = "A flag which force engine to detect codetext encoding for Unicode.")
    public Boolean isDetectEncoding() {
        return detectEncoding;
    }

    public void setDetectEncoding(Boolean detectEncoding) {
        this.detectEncoding = detectEncoding;
    }

    public ReaderParams preset(PresetType preset) {
        this.preset = preset;
        return this;
    }

    /**
     * Preset allows to configure recognition quality and speed manually. You can quickly set up
     * Preset by embedded presets: HighPerformance, NormalQuality, HighQuality, MaxBarCodes or you
     * can manually configure separate options. Default value of Preset is NormalQuality.
     *
     * @return preset
     */
    @ApiModelProperty(
            value =
                    "Preset allows to configure recognition quality and speed manually. You can"
                        + " quickly set up Preset by embedded presets: HighPerformance,"
                        + " NormalQuality, HighQuality, MaxBarCodes or you can manually configure"
                        + " separate options. Default value of Preset is NormalQuality.")
    public PresetType getPreset() {
        return preset;
    }

    public void setPreset(PresetType preset) {
        this.preset = preset;
    }

    public ReaderParams rectX(Integer rectX) {
        this.rectX = rectX;
        return this;
    }

    /**
     * Set X for area for recognition.
     *
     * @return rectX
     */
    @ApiModelProperty(value = "Set X for area for recognition.")
    public Integer getRectX() {
        return rectX;
    }

    public void setRectX(Integer rectX) {
        this.rectX = rectX;
    }

    public ReaderParams rectY(Integer rectY) {
        this.rectY = rectY;
        return this;
    }

    /**
     * Set Y for area for recognition.
     *
     * @return rectY
     */
    @ApiModelProperty(value = "Set Y for area for recognition.")
    public Integer getRectY() {
        return rectY;
    }

    public void setRectY(Integer rectY) {
        this.rectY = rectY;
    }

    public ReaderParams rectWidth(Integer rectWidth) {
        this.rectWidth = rectWidth;
        return this;
    }

    /**
     * Set Width of area for recognition.
     *
     * @return rectWidth
     */
    @ApiModelProperty(value = "Set Width of area for recognition.")
    public Integer getRectWidth() {
        return rectWidth;
    }

    public void setRectWidth(Integer rectWidth) {
        this.rectWidth = rectWidth;
    }

    public ReaderParams rectHeight(Integer rectHeight) {
        this.rectHeight = rectHeight;
        return this;
    }

    /**
     * Set Height of area for recognition.
     *
     * @return rectHeight
     */
    @ApiModelProperty(value = "Set Height of area for recognition.")
    public Integer getRectHeight() {
        return rectHeight;
    }

    public void setRectHeight(Integer rectHeight) {
        this.rectHeight = rectHeight;
    }

    public ReaderParams stripFNC(Boolean stripFNC) {
        this.stripFNC = stripFNC;
        return this;
    }

    /**
     * Value indicating whether FNC symbol strip must be done.
     *
     * @return stripFNC
     */
    @ApiModelProperty(value = "Value indicating whether FNC symbol strip must be done.")
    public Boolean isStripFNC() {
        return stripFNC;
    }

    public void setStripFNC(Boolean stripFNC) {
        this.stripFNC = stripFNC;
    }

    public ReaderParams timeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * Timeout of recognition process.
     *
     * @return timeout
     */
    @ApiModelProperty(value = "Timeout of recognition process.")
    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public ReaderParams medianSmoothingWindowSize(Integer medianSmoothingWindowSize) {
        this.medianSmoothingWindowSize = medianSmoothingWindowSize;
        return this;
    }

    /**
     * Window size for median smoothing. Typical values are 3 or 4. Default value is 3.
     * AllowMedianSmoothing must be set.
     *
     * @return medianSmoothingWindowSize
     */
    @ApiModelProperty(
            value =
                    "Window size for median smoothing. Typical values are 3 or 4. Default value is"
                        + " 3. AllowMedianSmoothing must be set.")
    public Integer getMedianSmoothingWindowSize() {
        return medianSmoothingWindowSize;
    }

    public void setMedianSmoothingWindowSize(Integer medianSmoothingWindowSize) {
        this.medianSmoothingWindowSize = medianSmoothingWindowSize;
    }

    public ReaderParams allowMedianSmoothing(Boolean allowMedianSmoothing) {
        this.allowMedianSmoothing = allowMedianSmoothing;
        return this;
    }

    /**
     * Allows engine to enable median smoothing as additional scan. Mode helps to recognize noised
     * barcodes.
     *
     * @return allowMedianSmoothing
     */
    @ApiModelProperty(
            value =
                    "Allows engine to enable median smoothing as additional scan. Mode helps to"
                        + " recognize noised barcodes.")
    public Boolean isAllowMedianSmoothing() {
        return allowMedianSmoothing;
    }

    public void setAllowMedianSmoothing(Boolean allowMedianSmoothing) {
        this.allowMedianSmoothing = allowMedianSmoothing;
    }

    public ReaderParams allowComplexBackground(Boolean allowComplexBackground) {
        this.allowComplexBackground = allowComplexBackground;
        return this;
    }

    /**
     * Allows engine to recognize color barcodes on color background as additional scan. Extremely
     * slow mode.
     *
     * @return allowComplexBackground
     */
    @ApiModelProperty(
            value =
                    "Allows engine to recognize color barcodes on color background as additional"
                        + " scan. Extremely slow mode.")
    public Boolean isAllowComplexBackground() {
        return allowComplexBackground;
    }

    public void setAllowComplexBackground(Boolean allowComplexBackground) {
        this.allowComplexBackground = allowComplexBackground;
    }

    public ReaderParams allowDatamatrixIndustrialBarcodes(
            Boolean allowDatamatrixIndustrialBarcodes) {
        this.allowDatamatrixIndustrialBarcodes = allowDatamatrixIndustrialBarcodes;
        return this;
    }

    /**
     * Allows engine for Datamatrix to recognize dashed industrial Datamatrix barcodes. Slow mode
     * which helps only for dashed barcodes which consist from spots.
     *
     * @return allowDatamatrixIndustrialBarcodes
     */
    @ApiModelProperty(
            value =
                    "Allows engine for Datamatrix to recognize dashed industrial Datamatrix"
                        + " barcodes. Slow mode which helps only for dashed barcodes which consist"
                        + " from spots.")
    public Boolean isAllowDatamatrixIndustrialBarcodes() {
        return allowDatamatrixIndustrialBarcodes;
    }

    public void setAllowDatamatrixIndustrialBarcodes(Boolean allowDatamatrixIndustrialBarcodes) {
        this.allowDatamatrixIndustrialBarcodes = allowDatamatrixIndustrialBarcodes;
    }

    public ReaderParams allowDecreasedImage(Boolean allowDecreasedImage) {
        this.allowDecreasedImage = allowDecreasedImage;
        return this;
    }

    /**
     * Allows engine to recognize decreased image as additional scan. Size for decreasing is
     * selected by internal engine algorithms. Mode helps to recognize barcodes which are noised and
     * blurred but captured with high resolution.
     *
     * @return allowDecreasedImage
     */
    @ApiModelProperty(
            value =
                    "Allows engine to recognize decreased image as additional scan. Size for"
                        + " decreasing is selected by internal engine algorithms. Mode helps to"
                        + " recognize barcodes which are noised and blurred but captured with high"
                        + " resolution.")
    public Boolean isAllowDecreasedImage() {
        return allowDecreasedImage;
    }

    public void setAllowDecreasedImage(Boolean allowDecreasedImage) {
        this.allowDecreasedImage = allowDecreasedImage;
    }

    public ReaderParams allowDetectScanGap(Boolean allowDetectScanGap) {
        this.allowDetectScanGap = allowDetectScanGap;
        return this;
    }

    /**
     * Allows engine to use gap between scans to increase recognition speed. Mode can make
     * recognition problems with low height barcodes.
     *
     * @return allowDetectScanGap
     */
    @ApiModelProperty(
            value =
                    "Allows engine to use gap between scans to increase recognition speed. Mode"
                        + " can make recognition problems with low height barcodes.")
    public Boolean isAllowDetectScanGap() {
        return allowDetectScanGap;
    }

    public void setAllowDetectScanGap(Boolean allowDetectScanGap) {
        this.allowDetectScanGap = allowDetectScanGap;
    }

    public ReaderParams allowIncorrectBarcodes(Boolean allowIncorrectBarcodes) {
        this.allowIncorrectBarcodes = allowIncorrectBarcodes;
        return this;
    }

    /**
     * Allows engine to recognize barcodes which has incorrect checksum or incorrect values. Mode
     * can be used to recognize damaged barcodes with incorrect text.
     *
     * @return allowIncorrectBarcodes
     */
    @ApiModelProperty(
            value =
                    "Allows engine to recognize barcodes which has incorrect checksum or incorrect"
                        + " values. Mode can be used to recognize damaged barcodes with incorrect"
                        + " text.")
    public Boolean isAllowIncorrectBarcodes() {
        return allowIncorrectBarcodes;
    }

    public void setAllowIncorrectBarcodes(Boolean allowIncorrectBarcodes) {
        this.allowIncorrectBarcodes = allowIncorrectBarcodes;
    }

    public ReaderParams allowInvertImage(Boolean allowInvertImage) {
        this.allowInvertImage = allowInvertImage;
        return this;
    }

    /**
     * Allows engine to recognize inverse color image as additional scan. Mode can be used when
     * barcode is white on black background.
     *
     * @return allowInvertImage
     */
    @ApiModelProperty(
            value =
                    "Allows engine to recognize inverse color image as additional scan. Mode can"
                        + " be used when barcode is white on black background.")
    public Boolean isAllowInvertImage() {
        return allowInvertImage;
    }

    public void setAllowInvertImage(Boolean allowInvertImage) {
        this.allowInvertImage = allowInvertImage;
    }

    public ReaderParams allowMicroWhiteSpotsRemoving(Boolean allowMicroWhiteSpotsRemoving) {
        this.allowMicroWhiteSpotsRemoving = allowMicroWhiteSpotsRemoving;
        return this;
    }

    /**
     * Allows engine for Postal barcodes to recognize slightly noised images. Mode helps to
     * recognize slightly damaged Postal barcodes.
     *
     * @return allowMicroWhiteSpotsRemoving
     */
    @ApiModelProperty(
            value =
                    "Allows engine for Postal barcodes to recognize slightly noised images. Mode"
                        + " helps to recognize slightly damaged Postal barcodes.")
    public Boolean isAllowMicroWhiteSpotsRemoving() {
        return allowMicroWhiteSpotsRemoving;
    }

    public void setAllowMicroWhiteSpotsRemoving(Boolean allowMicroWhiteSpotsRemoving) {
        this.allowMicroWhiteSpotsRemoving = allowMicroWhiteSpotsRemoving;
    }

    public ReaderParams allowOneDFastBarcodesDetector(Boolean allowOneDFastBarcodesDetector) {
        this.allowOneDFastBarcodesDetector = allowOneDFastBarcodesDetector;
        return this;
    }

    /**
     * Allows engine for 1D barcodes to quickly recognize high quality barcodes which fill almost
     * whole image. Mode helps to quickly recognize generated barcodes from Internet.
     *
     * @return allowOneDFastBarcodesDetector
     */
    @ApiModelProperty(
            value =
                    "Allows engine for 1D barcodes to quickly recognize high quality barcodes"
                        + " which fill almost whole image. Mode helps to quickly recognize"
                        + " generated barcodes from Internet.")
    public Boolean isAllowOneDFastBarcodesDetector() {
        return allowOneDFastBarcodesDetector;
    }

    public void setAllowOneDFastBarcodesDetector(Boolean allowOneDFastBarcodesDetector) {
        this.allowOneDFastBarcodesDetector = allowOneDFastBarcodesDetector;
    }

    public ReaderParams allowOneDWipedBarsRestoration(Boolean allowOneDWipedBarsRestoration) {
        this.allowOneDWipedBarsRestoration = allowOneDWipedBarsRestoration;
        return this;
    }

    /**
     * Allows engine for 1D barcodes to recognize barcodes with single wiped/glued bars in pattern.
     *
     * @return allowOneDWipedBarsRestoration
     */
    @ApiModelProperty(
            value =
                    "Allows engine for 1D barcodes to recognize barcodes with single wiped/glued"
                        + " bars in pattern.")
    public Boolean isAllowOneDWipedBarsRestoration() {
        return allowOneDWipedBarsRestoration;
    }

    public void setAllowOneDWipedBarsRestoration(Boolean allowOneDWipedBarsRestoration) {
        this.allowOneDWipedBarsRestoration = allowOneDWipedBarsRestoration;
    }

    public ReaderParams allowQRMicroQrRestoration(Boolean allowQRMicroQrRestoration) {
        this.allowQRMicroQrRestoration = allowQRMicroQrRestoration;
        return this;
    }

    /**
     * Allows engine for QR/MicroQR to recognize damaged MicroQR barcodes.
     *
     * @return allowQRMicroQrRestoration
     */
    @ApiModelProperty(value = "Allows engine for QR/MicroQR to recognize damaged MicroQR barcodes.")
    public Boolean isAllowQRMicroQrRestoration() {
        return allowQRMicroQrRestoration;
    }

    public void setAllowQRMicroQrRestoration(Boolean allowQRMicroQrRestoration) {
        this.allowQRMicroQrRestoration = allowQRMicroQrRestoration;
    }

    public ReaderParams allowRegularImage(Boolean allowRegularImage) {
        this.allowRegularImage = allowRegularImage;
        return this;
    }

    /**
     * Allows engine to recognize regular image without any restorations as main scan. Mode to
     * recognize image as is.
     *
     * @return allowRegularImage
     */
    @ApiModelProperty(
            value =
                    "Allows engine to recognize regular image without any restorations as main"
                        + " scan. Mode to recognize image as is.")
    public Boolean isAllowRegularImage() {
        return allowRegularImage;
    }

    public void setAllowRegularImage(Boolean allowRegularImage) {
        this.allowRegularImage = allowRegularImage;
    }

    public ReaderParams allowSaltAndPepperFiltering(Boolean allowSaltAndPepperFiltering) {
        this.allowSaltAndPepperFiltering = allowSaltAndPepperFiltering;
        return this;
    }

    /**
     * Allows engine to recognize barcodes with salt and pepper noise type. Mode can remove small
     * noise with white and black dots.
     *
     * @return allowSaltAndPepperFiltering
     */
    @ApiModelProperty(
            value =
                    "Allows engine to recognize barcodes with salt and pepper noise type. Mode can"
                        + " remove small noise with white and black dots.")
    public Boolean isAllowSaltAndPepperFiltering() {
        return allowSaltAndPepperFiltering;
    }

    public void setAllowSaltAndPepperFiltering(Boolean allowSaltAndPepperFiltering) {
        this.allowSaltAndPepperFiltering = allowSaltAndPepperFiltering;
    }

    public ReaderParams allowWhiteSpotsRemoving(Boolean allowWhiteSpotsRemoving) {
        this.allowWhiteSpotsRemoving = allowWhiteSpotsRemoving;
        return this;
    }

    /**
     * Allows engine to recognize image without small white spots as additional scan. Mode helps to
     * recognize noised image as well as median smoothing filtering.
     *
     * @return allowWhiteSpotsRemoving
     */
    @ApiModelProperty(
            value =
                    "Allows engine to recognize image without small white spots as additional"
                        + " scan. Mode helps to recognize noised image as well as median smoothing"
                        + " filtering.")
    public Boolean isAllowWhiteSpotsRemoving() {
        return allowWhiteSpotsRemoving;
    }

    public void setAllowWhiteSpotsRemoving(Boolean allowWhiteSpotsRemoving) {
        this.allowWhiteSpotsRemoving = allowWhiteSpotsRemoving;
    }

    public ReaderParams regionLikelihoodThresholdPercent(Double regionLikelihoodThresholdPercent) {
        this.regionLikelihoodThresholdPercent = regionLikelihoodThresholdPercent;
        return this;
    }

    /**
     * Sets threshold for detected regions that may contain barcodes. Value 0.7 means that bottom
     * 70% of possible regions are filtered out and not processed further. Region likelihood
     * threshold must be between [0.05, 0.9] Use high values for clear images with few barcodes. Use
     * low values for images with many barcodes or for noisy images. Low value may lead to a bigger
     * recognition time.
     *
     * @return regionLikelihoodThresholdPercent
     */
    @ApiModelProperty(
            value =
                    "Sets threshold for detected regions that may contain barcodes. Value 0.7"
                        + " means that bottom 70% of possible regions are filtered out and not"
                        + " processed further. Region likelihood threshold must be between [0.05,"
                        + " 0.9] Use high values for clear images with few barcodes. Use low"
                        + " values for images with many barcodes or for noisy images. Low value"
                        + " may lead to a bigger recognition time.")
    public Double getRegionLikelihoodThresholdPercent() {
        return regionLikelihoodThresholdPercent;
    }

    public void setRegionLikelihoodThresholdPercent(Double regionLikelihoodThresholdPercent) {
        this.regionLikelihoodThresholdPercent = regionLikelihoodThresholdPercent;
    }

    public ReaderParams scanWindowSizes(List<Integer> scanWindowSizes) {
        this.scanWindowSizes = scanWindowSizes;
        return this;
    }

    public ReaderParams addScanWindowSizesItem(Integer scanWindowSizesItem) {
        if (this.scanWindowSizes == null) {
            this.scanWindowSizes = new ArrayList<Integer>();
        }
        this.scanWindowSizes.add(scanWindowSizesItem);
        return this;
    }

    /**
     * Scan window sizes in pixels. Allowed sizes are 10, 15, 20, 25, 30. Scanning with small window
     * size takes more time and provides more accuracy but may fail in detecting very big barcodes.
     * Combining of several window sizes can improve detection quality.
     *
     * @return scanWindowSizes
     */
    @ApiModelProperty(
            value =
                    "Scan window sizes in pixels. Allowed sizes are 10, 15, 20, 25, 30. Scanning"
                        + " with small window size takes more time and provides more accuracy but"
                        + " may fail in detecting very big barcodes. Combining of several window"
                        + " sizes can improve detection quality.")
    public List<Integer> getScanWindowSizes() {
        return scanWindowSizes;
    }

    public void setScanWindowSizes(List<Integer> scanWindowSizes) {
        this.scanWindowSizes = scanWindowSizes;
    }

    public ReaderParams similarity(Double similarity) {
        this.similarity = similarity;
        return this;
    }

    /**
     * Similarity coefficient depends on how homogeneous barcodes are. Use high value for for clear
     * barcodes. Use low values to detect barcodes that ara partly damaged or not lighten evenly.
     * Similarity coefficient must be between [0.5, 0.9]
     *
     * @return similarity
     */
    @ApiModelProperty(
            value =
                    "Similarity coefficient depends on how homogeneous barcodes are. Use high"
                        + " value for for clear barcodes. Use low values to detect barcodes that"
                        + " ara partly damaged or not lighten evenly. Similarity coefficient must"
                        + " be between [0.5, 0.9]")
    public Double getSimilarity() {
        return similarity;
    }

    public void setSimilarity(Double similarity) {
        this.similarity = similarity;
    }

    public ReaderParams skipDiagonalSearch(Boolean skipDiagonalSearch) {
        this.skipDiagonalSearch = skipDiagonalSearch;
        return this;
    }

    /**
     * Allows detector to skip search for diagonal barcodes. Setting it to false will increase
     * detection time but allow to find diagonal barcodes that can be missed otherwise. Enabling of
     * diagonal search leads to a bigger detection time.
     *
     * @return skipDiagonalSearch
     */
    @ApiModelProperty(
            value =
                    "Allows detector to skip search for diagonal barcodes. Setting it to false"
                        + " will increase detection time but allow to find diagonal barcodes that"
                        + " can be missed otherwise. Enabling of diagonal search leads to a bigger"
                        + " detection time.")
    public Boolean isSkipDiagonalSearch() {
        return skipDiagonalSearch;
    }

    public void setSkipDiagonalSearch(Boolean skipDiagonalSearch) {
        this.skipDiagonalSearch = skipDiagonalSearch;
    }

    public ReaderParams australianPostEncodingTable(
            CustomerInformationInterpretingType australianPostEncodingTable) {
        this.australianPostEncodingTable = australianPostEncodingTable;
        return this;
    }

    /**
     * Interpreting Type for the Customer Information of AustralianPost BarCode.Default is
     * CustomerInformationInterpretingType.Other.
     *
     * @return australianPostEncodingTable
     */
    @ApiModelProperty(
            value =
                    "Interpreting Type for the Customer Information of AustralianPost"
                        + " BarCode.Default is CustomerInformationInterpretingType.Other.")
    public CustomerInformationInterpretingType getAustralianPostEncodingTable() {
        return australianPostEncodingTable;
    }

    public void setAustralianPostEncodingTable(
            CustomerInformationInterpretingType australianPostEncodingTable) {
        this.australianPostEncodingTable = australianPostEncodingTable;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReaderParams readerParams = (ReaderParams) o;
        return Objects.equals(this.type, readerParams.type)
                && Objects.equals(this.checksumValidation, readerParams.checksumValidation)
                && Objects.equals(this.detectEncoding, readerParams.detectEncoding)
                && Objects.equals(this.preset, readerParams.preset)
                && Objects.equals(this.rectX, readerParams.rectX)
                && Objects.equals(this.rectY, readerParams.rectY)
                && Objects.equals(this.rectWidth, readerParams.rectWidth)
                && Objects.equals(this.rectHeight, readerParams.rectHeight)
                && Objects.equals(this.stripFNC, readerParams.stripFNC)
                && Objects.equals(this.timeout, readerParams.timeout)
                && Objects.equals(
                        this.medianSmoothingWindowSize, readerParams.medianSmoothingWindowSize)
                && Objects.equals(this.allowMedianSmoothing, readerParams.allowMedianSmoothing)
                && Objects.equals(this.allowComplexBackground, readerParams.allowComplexBackground)
                && Objects.equals(
                        this.allowDatamatrixIndustrialBarcodes,
                        readerParams.allowDatamatrixIndustrialBarcodes)
                && Objects.equals(this.allowDecreasedImage, readerParams.allowDecreasedImage)
                && Objects.equals(this.allowDetectScanGap, readerParams.allowDetectScanGap)
                && Objects.equals(this.allowIncorrectBarcodes, readerParams.allowIncorrectBarcodes)
                && Objects.equals(this.allowInvertImage, readerParams.allowInvertImage)
                && Objects.equals(
                        this.allowMicroWhiteSpotsRemoving,
                        readerParams.allowMicroWhiteSpotsRemoving)
                && Objects.equals(
                        this.allowOneDFastBarcodesDetector,
                        readerParams.allowOneDFastBarcodesDetector)
                && Objects.equals(
                        this.allowOneDWipedBarsRestoration,
                        readerParams.allowOneDWipedBarsRestoration)
                && Objects.equals(
                        this.allowQRMicroQrRestoration, readerParams.allowQRMicroQrRestoration)
                && Objects.equals(this.allowRegularImage, readerParams.allowRegularImage)
                && Objects.equals(
                        this.allowSaltAndPepperFiltering, readerParams.allowSaltAndPepperFiltering)
                && Objects.equals(
                        this.allowWhiteSpotsRemoving, readerParams.allowWhiteSpotsRemoving)
                && Objects.equals(
                        this.regionLikelihoodThresholdPercent,
                        readerParams.regionLikelihoodThresholdPercent)
                && Objects.equals(this.scanWindowSizes, readerParams.scanWindowSizes)
                && Objects.equals(this.similarity, readerParams.similarity)
                && Objects.equals(this.skipDiagonalSearch, readerParams.skipDiagonalSearch)
                && Objects.equals(
                        this.australianPostEncodingTable, readerParams.australianPostEncodingTable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                type,
                checksumValidation,
                detectEncoding,
                preset,
                rectX,
                rectY,
                rectWidth,
                rectHeight,
                stripFNC,
                timeout,
                medianSmoothingWindowSize,
                allowMedianSmoothing,
                allowComplexBackground,
                allowDatamatrixIndustrialBarcodes,
                allowDecreasedImage,
                allowDetectScanGap,
                allowIncorrectBarcodes,
                allowInvertImage,
                allowMicroWhiteSpotsRemoving,
                allowOneDFastBarcodesDetector,
                allowOneDWipedBarsRestoration,
                allowQRMicroQrRestoration,
                allowRegularImage,
                allowSaltAndPepperFiltering,
                allowWhiteSpotsRemoving,
                regionLikelihoodThresholdPercent,
                scanWindowSizes,
                similarity,
                skipDiagonalSearch,
                australianPostEncodingTable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReaderParams {\n");

        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    checksumValidation: ")
                .append(toIndentedString(checksumValidation))
                .append("\n");
        sb.append("    detectEncoding: ").append(toIndentedString(detectEncoding)).append("\n");
        sb.append("    preset: ").append(toIndentedString(preset)).append("\n");
        sb.append("    rectX: ").append(toIndentedString(rectX)).append("\n");
        sb.append("    rectY: ").append(toIndentedString(rectY)).append("\n");
        sb.append("    rectWidth: ").append(toIndentedString(rectWidth)).append("\n");
        sb.append("    rectHeight: ").append(toIndentedString(rectHeight)).append("\n");
        sb.append("    stripFNC: ").append(toIndentedString(stripFNC)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
        sb.append("    medianSmoothingWindowSize: ")
                .append(toIndentedString(medianSmoothingWindowSize))
                .append("\n");
        sb.append("    allowMedianSmoothing: ")
                .append(toIndentedString(allowMedianSmoothing))
                .append("\n");
        sb.append("    allowComplexBackground: ")
                .append(toIndentedString(allowComplexBackground))
                .append("\n");
        sb.append("    allowDatamatrixIndustrialBarcodes: ")
                .append(toIndentedString(allowDatamatrixIndustrialBarcodes))
                .append("\n");
        sb.append("    allowDecreasedImage: ")
                .append(toIndentedString(allowDecreasedImage))
                .append("\n");
        sb.append("    allowDetectScanGap: ")
                .append(toIndentedString(allowDetectScanGap))
                .append("\n");
        sb.append("    allowIncorrectBarcodes: ")
                .append(toIndentedString(allowIncorrectBarcodes))
                .append("\n");
        sb.append("    allowInvertImage: ").append(toIndentedString(allowInvertImage)).append("\n");
        sb.append("    allowMicroWhiteSpotsRemoving: ")
                .append(toIndentedString(allowMicroWhiteSpotsRemoving))
                .append("\n");
        sb.append("    allowOneDFastBarcodesDetector: ")
                .append(toIndentedString(allowOneDFastBarcodesDetector))
                .append("\n");
        sb.append("    allowOneDWipedBarsRestoration: ")
                .append(toIndentedString(allowOneDWipedBarsRestoration))
                .append("\n");
        sb.append("    allowQRMicroQrRestoration: ")
                .append(toIndentedString(allowQRMicroQrRestoration))
                .append("\n");
        sb.append("    allowRegularImage: ")
                .append(toIndentedString(allowRegularImage))
                .append("\n");
        sb.append("    allowSaltAndPepperFiltering: ")
                .append(toIndentedString(allowSaltAndPepperFiltering))
                .append("\n");
        sb.append("    allowWhiteSpotsRemoving: ")
                .append(toIndentedString(allowWhiteSpotsRemoving))
                .append("\n");
        sb.append("    regionLikelihoodThresholdPercent: ")
                .append(toIndentedString(regionLikelihoodThresholdPercent))
                .append("\n");
        sb.append("    scanWindowSizes: ").append(toIndentedString(scanWindowSizes)).append("\n");
        sb.append("    similarity: ").append(toIndentedString(similarity)).append("\n");
        sb.append("    skipDiagonalSearch: ")
                .append(toIndentedString(skipDiagonalSearch))
                .append("\n");
        sb.append("    australianPostEncodingTable: ")
                .append(toIndentedString(australianPostEncodingTable))
                .append("\n");
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
