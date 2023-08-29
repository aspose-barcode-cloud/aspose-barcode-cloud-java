// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="ReaderParams.java">
//   Copyright (c) 2023 Aspose.BarCode for Cloud
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

    @SerializedName(value = "checkMore1DVariants")
    private Boolean checkMore1DVariants = null;

    @SerializedName(value = "fastScanOnly")
    private Boolean fastScanOnly = null;

    @SerializedName(value = "allowAdditionalRestorations")
    private Boolean allowAdditionalRestorations = null;

    @SerializedName(value = "regionLikelihoodThresholdPercent")
    private Double regionLikelihoodThresholdPercent = null;

    @SerializedName(value = "scanWindowSizes")
    private List<Integer> scanWindowSizes = null;

    @SerializedName(value = "similarity")
    private Double similarity = null;

    @SerializedName(value = "skipDiagonalSearch")
    private Boolean skipDiagonalSearch = null;

    @SerializedName(value = "readTinyBarcodes")
    private Boolean readTinyBarcodes = null;

    @SerializedName(value = "australianPostEncodingTable")
    private CustomerInformationInterpretingType australianPostEncodingTable = null;

    @SerializedName(value = "ignoreEndingFillingPatternsForCTable")
    private Boolean ignoreEndingFillingPatternsForCTable = null;

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
                    "Enable checksum validation during recognition for 1D barcodes. Default is treated as Yes for symbologies which must contain checksum, as No where checksum only possible. Checksum never used: Codabar Checksum is possible: Code39 Standard/Extended, Standard2of5, Interleaved2of5, Matrix2of5, ItalianPost25, DeutschePostIdentcode, DeutschePostLeitcode, VIN Checksum always used: Rest symbologies")
    public ChecksumValidation getChecksumValidation() {
        return checksumValidation;
    }

    public void setChecksumValidation(ChecksumValidation checksumValidation) {
        this.checksumValidation = checksumValidation;
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

    /**
     * Preset allows to configure recognition quality and speed manually. You can quickly set up
     * Preset by embedded presets: HighPerformance, NormalQuality, HighQuality, MaxBarCodes or you
     * can manually configure separate options. Default value of Preset is NormalQuality.
     *
     * @return preset
     */
    @ApiModelProperty(
            value =
                    "Preset allows to configure recognition quality and speed manually. You can quickly set up Preset by embedded presets: HighPerformance, NormalQuality, HighQuality, MaxBarCodes or you can manually configure separate options. Default value of Preset is NormalQuality.")
    public PresetType getPreset() {
        return preset;
    }

    public void setPreset(PresetType preset) {
        this.preset = preset;
    }

    /**
     * Set X of top left corner of area for recognition.
     *
     * @return rectX
     */
    @ApiModelProperty(value = "Set X of top left corner of area for recognition.")
    public Integer getRectX() {
        return rectX;
    }

    public void setRectX(Integer rectX) {
        this.rectX = rectX;
    }

    /**
     * Set Y of top left corner of area for recognition.
     *
     * @return rectY
     */
    @ApiModelProperty(value = "Set Y of top left corner of area for recognition.")
    public Integer getRectY() {
        return rectY;
    }

    public void setRectY(Integer rectY) {
        this.rectY = rectY;
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

    /**
     * Timeout of recognition process in milliseconds. Default value is 15_000 (15 seconds). Maximum
     * value is 60_000 (1 minute). In case of a timeout RequestTimeout (408) status will be
     * returned. Try reducing the image size to avoid timeout.
     *
     * @return timeout
     */
    @ApiModelProperty(
            value =
                    "Timeout of recognition process in milliseconds. Default value is 15_000 (15 seconds). Maximum value is 60_000 (1 minute). In case of a timeout RequestTimeout (408) status will be returned. Try reducing the image size to avoid timeout.")
    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    /**
     * Window size for median smoothing. Typical values are 3 or 4. Default value is 3.
     * AllowMedianSmoothing must be set.
     *
     * @return medianSmoothingWindowSize
     */
    @ApiModelProperty(
            value =
                    "Window size for median smoothing. Typical values are 3 or 4. Default value is 3. AllowMedianSmoothing must be set.")
    public Integer getMedianSmoothingWindowSize() {
        return medianSmoothingWindowSize;
    }

    public void setMedianSmoothingWindowSize(Integer medianSmoothingWindowSize) {
        this.medianSmoothingWindowSize = medianSmoothingWindowSize;
    }

    /**
     * Allows engine to enable median smoothing as additional scan. Mode helps to recognize noised
     * barcodes.
     *
     * @return allowMedianSmoothing
     */
    @ApiModelProperty(
            value =
                    "Allows engine to enable median smoothing as additional scan. Mode helps to recognize noised barcodes.")
    public Boolean isAllowMedianSmoothing() {
        return allowMedianSmoothing;
    }

    public void setAllowMedianSmoothing(Boolean allowMedianSmoothing) {
        this.allowMedianSmoothing = allowMedianSmoothing;
    }

    /**
     * Allows engine to recognize color barcodes on color background as additional scan. Extremely
     * slow mode.
     *
     * @return allowComplexBackground
     */
    @ApiModelProperty(
            value =
                    "Allows engine to recognize color barcodes on color background as additional scan. Extremely slow mode.")
    public Boolean isAllowComplexBackground() {
        return allowComplexBackground;
    }

    public void setAllowComplexBackground(Boolean allowComplexBackground) {
        this.allowComplexBackground = allowComplexBackground;
    }

    /**
     * Allows engine for Datamatrix to recognize dashed industrial Datamatrix barcodes. Slow mode
     * which helps only for dashed barcodes which consist from spots.
     *
     * @return allowDatamatrixIndustrialBarcodes
     */
    @ApiModelProperty(
            value =
                    "Allows engine for Datamatrix to recognize dashed industrial Datamatrix barcodes. Slow mode which helps only for dashed barcodes which consist from spots.")
    public Boolean isAllowDatamatrixIndustrialBarcodes() {
        return allowDatamatrixIndustrialBarcodes;
    }

    public void setAllowDatamatrixIndustrialBarcodes(Boolean allowDatamatrixIndustrialBarcodes) {
        this.allowDatamatrixIndustrialBarcodes = allowDatamatrixIndustrialBarcodes;
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
                    "Allows engine to recognize decreased image as additional scan. Size for decreasing is selected by internal engine algorithms. Mode helps to recognize barcodes which are noised and blurred but captured with high resolution.")
    public Boolean isAllowDecreasedImage() {
        return allowDecreasedImage;
    }

    public void setAllowDecreasedImage(Boolean allowDecreasedImage) {
        this.allowDecreasedImage = allowDecreasedImage;
    }

    /**
     * Allows engine to use gap between scans to increase recognition speed. Mode can make
     * recognition problems with low height barcodes.
     *
     * @return allowDetectScanGap
     */
    @ApiModelProperty(
            value =
                    "Allows engine to use gap between scans to increase recognition speed. Mode can make recognition problems with low height barcodes.")
    public Boolean isAllowDetectScanGap() {
        return allowDetectScanGap;
    }

    public void setAllowDetectScanGap(Boolean allowDetectScanGap) {
        this.allowDetectScanGap = allowDetectScanGap;
    }

    /**
     * Allows engine to recognize barcodes which has incorrect checksum or incorrect values. Mode
     * can be used to recognize damaged barcodes with incorrect text.
     *
     * @return allowIncorrectBarcodes
     */
    @ApiModelProperty(
            value =
                    "Allows engine to recognize barcodes which has incorrect checksum or incorrect values. Mode can be used to recognize damaged barcodes with incorrect text.")
    public Boolean isAllowIncorrectBarcodes() {
        return allowIncorrectBarcodes;
    }

    public void setAllowIncorrectBarcodes(Boolean allowIncorrectBarcodes) {
        this.allowIncorrectBarcodes = allowIncorrectBarcodes;
    }

    /**
     * Allows engine to recognize inverse color image as additional scan. Mode can be used when
     * barcode is white on black background.
     *
     * @return allowInvertImage
     */
    @ApiModelProperty(
            value =
                    "Allows engine to recognize inverse color image as additional scan. Mode can be used when barcode is white on black background.")
    public Boolean isAllowInvertImage() {
        return allowInvertImage;
    }

    public void setAllowInvertImage(Boolean allowInvertImage) {
        this.allowInvertImage = allowInvertImage;
    }

    /**
     * Allows engine for Postal barcodes to recognize slightly noised images. Mode helps to
     * recognize slightly damaged Postal barcodes.
     *
     * @return allowMicroWhiteSpotsRemoving
     */
    @ApiModelProperty(
            value =
                    "Allows engine for Postal barcodes to recognize slightly noised images. Mode helps to recognize slightly damaged Postal barcodes.")
    public Boolean isAllowMicroWhiteSpotsRemoving() {
        return allowMicroWhiteSpotsRemoving;
    }

    public void setAllowMicroWhiteSpotsRemoving(Boolean allowMicroWhiteSpotsRemoving) {
        this.allowMicroWhiteSpotsRemoving = allowMicroWhiteSpotsRemoving;
    }

    /**
     * Allows engine for 1D barcodes to quickly recognize high quality barcodes which fill almost
     * whole image. Mode helps to quickly recognize generated barcodes from Internet.
     *
     * @return allowOneDFastBarcodesDetector
     */
    @ApiModelProperty(
            value =
                    "Allows engine for 1D barcodes to quickly recognize high quality barcodes which fill almost whole image. Mode helps to quickly recognize generated barcodes from Internet.")
    public Boolean isAllowOneDFastBarcodesDetector() {
        return allowOneDFastBarcodesDetector;
    }

    public void setAllowOneDFastBarcodesDetector(Boolean allowOneDFastBarcodesDetector) {
        this.allowOneDFastBarcodesDetector = allowOneDFastBarcodesDetector;
    }

    /**
     * Allows engine for 1D barcodes to recognize barcodes with single wiped/glued bars in pattern.
     *
     * @return allowOneDWipedBarsRestoration
     */
    @ApiModelProperty(
            value =
                    "Allows engine for 1D barcodes to recognize barcodes with single wiped/glued bars in pattern.")
    public Boolean isAllowOneDWipedBarsRestoration() {
        return allowOneDWipedBarsRestoration;
    }

    public void setAllowOneDWipedBarsRestoration(Boolean allowOneDWipedBarsRestoration) {
        this.allowOneDWipedBarsRestoration = allowOneDWipedBarsRestoration;
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

    /**
     * Allows engine to recognize regular image without any restorations as main scan. Mode to
     * recognize image as is.
     *
     * @return allowRegularImage
     */
    @ApiModelProperty(
            value =
                    "Allows engine to recognize regular image without any restorations as main scan. Mode to recognize image as is.")
    public Boolean isAllowRegularImage() {
        return allowRegularImage;
    }

    public void setAllowRegularImage(Boolean allowRegularImage) {
        this.allowRegularImage = allowRegularImage;
    }

    /**
     * Allows engine to recognize barcodes with salt and pepper noise type. Mode can remove small
     * noise with white and black dots.
     *
     * @return allowSaltAndPepperFiltering
     */
    @ApiModelProperty(
            value =
                    "Allows engine to recognize barcodes with salt and pepper noise type. Mode can remove small noise with white and black dots.")
    public Boolean isAllowSaltAndPepperFiltering() {
        return allowSaltAndPepperFiltering;
    }

    public void setAllowSaltAndPepperFiltering(Boolean allowSaltAndPepperFiltering) {
        this.allowSaltAndPepperFiltering = allowSaltAndPepperFiltering;
    }

    /**
     * Allows engine to recognize image without small white spots as additional scan. Mode helps to
     * recognize noised image as well as median smoothing filtering.
     *
     * @return allowWhiteSpotsRemoving
     */
    @ApiModelProperty(
            value =
                    "Allows engine to recognize image without small white spots as additional scan. Mode helps to recognize noised image as well as median smoothing filtering.")
    public Boolean isAllowWhiteSpotsRemoving() {
        return allowWhiteSpotsRemoving;
    }

    public void setAllowWhiteSpotsRemoving(Boolean allowWhiteSpotsRemoving) {
        this.allowWhiteSpotsRemoving = allowWhiteSpotsRemoving;
    }

    /**
     * Allows engine to recognize 1D barcodes with checksum by checking more recognition variants.
     * Default value: False.
     *
     * @return checkMore1DVariants
     */
    @ApiModelProperty(
            value =
                    "Allows engine to recognize 1D barcodes with checksum by checking more recognition variants. Default value: False.")
    public Boolean isCheckMore1DVariants() {
        return checkMore1DVariants;
    }

    public void setCheckMore1DVariants(Boolean checkMore1DVariants) {
        this.checkMore1DVariants = checkMore1DVariants;
    }

    /**
     * Allows engine for 1D barcodes to quickly recognize middle slice of an image and return result
     * without using any time-consuming algorithms. Default value: False.
     *
     * @return fastScanOnly
     */
    @ApiModelProperty(
            value =
                    "Allows engine for 1D barcodes to quickly recognize middle slice of an image and return result without using any time-consuming algorithms. Default value: False.")
    public Boolean isFastScanOnly() {
        return fastScanOnly;
    }

    public void setFastScanOnly(Boolean fastScanOnly) {
        this.fastScanOnly = fastScanOnly;
    }

    /**
     * Allows engine using additional image restorations to recognize corrupted barcodes. At this
     * time, it is used only in MicroPdf417 barcode type. Default value: False.
     *
     * @return allowAdditionalRestorations
     */
    @ApiModelProperty(
            value =
                    "Allows engine using additional image restorations to recognize corrupted barcodes. At this time, it is used only in MicroPdf417 barcode type. Default value: False.")
    public Boolean isAllowAdditionalRestorations() {
        return allowAdditionalRestorations;
    }

    public void setAllowAdditionalRestorations(Boolean allowAdditionalRestorations) {
        this.allowAdditionalRestorations = allowAdditionalRestorations;
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
                    "Sets threshold for detected regions that may contain barcodes. Value 0.7 means that bottom 70% of possible regions are filtered out and not processed further. Region likelihood threshold must be between [0.05, 0.9] Use high values for clear images with few barcodes. Use low values for images with many barcodes or for noisy images. Low value may lead to a bigger recognition time.")
    public Double getRegionLikelihoodThresholdPercent() {
        return regionLikelihoodThresholdPercent;
    }

    public void setRegionLikelihoodThresholdPercent(Double regionLikelihoodThresholdPercent) {
        this.regionLikelihoodThresholdPercent = regionLikelihoodThresholdPercent;
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
                    "Scan window sizes in pixels. Allowed sizes are 10, 15, 20, 25, 30. Scanning with small window size takes more time and provides more accuracy but may fail in detecting very big barcodes. Combining of several window sizes can improve detection quality.")
    public List<Integer> getScanWindowSizes() {
        return scanWindowSizes;
    }

    public void setScanWindowSizes(List<Integer> scanWindowSizes) {
        this.scanWindowSizes = scanWindowSizes;
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
                    "Similarity coefficient depends on how homogeneous barcodes are. Use high value for for clear barcodes. Use low values to detect barcodes that ara partly damaged or not lighten evenly. Similarity coefficient must be between [0.5, 0.9]")
    public Double getSimilarity() {
        return similarity;
    }

    public void setSimilarity(Double similarity) {
        this.similarity = similarity;
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
                    "Allows detector to skip search for diagonal barcodes. Setting it to false will increase detection time but allow to find diagonal barcodes that can be missed otherwise. Enabling of diagonal search leads to a bigger detection time.")
    public Boolean isSkipDiagonalSearch() {
        return skipDiagonalSearch;
    }

    public void setSkipDiagonalSearch(Boolean skipDiagonalSearch) {
        this.skipDiagonalSearch = skipDiagonalSearch;
    }

    /**
     * Allows engine to recognize tiny barcodes on large images. Ignored if AllowIncorrectBarcodes
     * is set to True. Default value: False.
     *
     * @return readTinyBarcodes
     */
    @ApiModelProperty(
            value =
                    "Allows engine to recognize tiny barcodes on large images. Ignored if AllowIncorrectBarcodes is set to True. Default value: False.")
    public Boolean isReadTinyBarcodes() {
        return readTinyBarcodes;
    }

    public void setReadTinyBarcodes(Boolean readTinyBarcodes) {
        this.readTinyBarcodes = readTinyBarcodes;
    }

    /**
     * Interpreting Type for the Customer Information of AustralianPost BarCode.Default is
     * CustomerInformationInterpretingType.Other.
     *
     * @return australianPostEncodingTable
     */
    @ApiModelProperty(
            value =
                    "Interpreting Type for the Customer Information of AustralianPost BarCode.Default is CustomerInformationInterpretingType.Other.")
    public CustomerInformationInterpretingType getAustralianPostEncodingTable() {
        return australianPostEncodingTable;
    }

    public void setAustralianPostEncodingTable(
            CustomerInformationInterpretingType australianPostEncodingTable) {
        this.australianPostEncodingTable = australianPostEncodingTable;
    }

    /**
     * The flag which force AustraliaPost decoder to ignore last filling patterns in Customer
     * Information Field during decoding as CTable method. CTable encoding method does not have any
     * gaps in encoding table and sequence \&quot;333\&quot; of filling patterns is decoded as
     * letter \&quot;z\&quot;.
     *
     * @return ignoreEndingFillingPatternsForCTable
     */
    @ApiModelProperty(
            value =
                    "The flag which force AustraliaPost decoder to ignore last filling patterns in Customer Information Field during decoding as CTable method. CTable encoding method does not have any gaps in encoding table and sequence \"333\" of filling patterns is decoded as letter \"z\".")
    public Boolean isIgnoreEndingFillingPatternsForCTable() {
        return ignoreEndingFillingPatternsForCTable;
    }

    public void setIgnoreEndingFillingPatternsForCTable(
            Boolean ignoreEndingFillingPatternsForCTable) {
        this.ignoreEndingFillingPatternsForCTable = ignoreEndingFillingPatternsForCTable;
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
                && Objects.equals(this.checkMore1DVariants, readerParams.checkMore1DVariants)
                && Objects.equals(this.fastScanOnly, readerParams.fastScanOnly)
                && Objects.equals(
                        this.allowAdditionalRestorations, readerParams.allowAdditionalRestorations)
                && Objects.equals(
                        this.regionLikelihoodThresholdPercent,
                        readerParams.regionLikelihoodThresholdPercent)
                && Objects.equals(this.scanWindowSizes, readerParams.scanWindowSizes)
                && Objects.equals(this.similarity, readerParams.similarity)
                && Objects.equals(this.skipDiagonalSearch, readerParams.skipDiagonalSearch)
                && Objects.equals(this.readTinyBarcodes, readerParams.readTinyBarcodes)
                && Objects.equals(
                        this.australianPostEncodingTable, readerParams.australianPostEncodingTable)
                && Objects.equals(
                        this.ignoreEndingFillingPatternsForCTable,
                        readerParams.ignoreEndingFillingPatternsForCTable);
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
                checkMore1DVariants,
                fastScanOnly,
                allowAdditionalRestorations,
                regionLikelihoodThresholdPercent,
                scanWindowSizes,
                similarity,
                skipDiagonalSearch,
                readTinyBarcodes,
                australianPostEncodingTable,
                ignoreEndingFillingPatternsForCTable);
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
        sb.append("    checkMore1DVariants: ")
                .append(toIndentedString(checkMore1DVariants))
                .append("\n");
        sb.append("    fastScanOnly: ").append(toIndentedString(fastScanOnly)).append("\n");
        sb.append("    allowAdditionalRestorations: ")
                .append(toIndentedString(allowAdditionalRestorations))
                .append("\n");
        sb.append("    regionLikelihoodThresholdPercent: ")
                .append(toIndentedString(regionLikelihoodThresholdPercent))
                .append("\n");
        sb.append("    scanWindowSizes: ").append(toIndentedString(scanWindowSizes)).append("\n");
        sb.append("    similarity: ").append(toIndentedString(similarity)).append("\n");
        sb.append("    skipDiagonalSearch: ")
                .append(toIndentedString(skipDiagonalSearch))
                .append("\n");
        sb.append("    readTinyBarcodes: ").append(toIndentedString(readTinyBarcodes)).append("\n");
        sb.append("    australianPostEncodingTable: ")
                .append(toIndentedString(australianPostEncodingTable))
                .append("\n");
        sb.append("    ignoreEndingFillingPatternsForCTable: ")
                .append(toIndentedString(ignoreEndingFillingPatternsForCTable))
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
