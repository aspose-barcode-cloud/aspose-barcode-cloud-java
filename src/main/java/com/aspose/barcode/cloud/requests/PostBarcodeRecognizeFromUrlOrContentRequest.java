// --------------------------------------------------------------------------------------------------------------------
// <copyright company="Aspose" file="PostBarcodeRecognizeFromUrlOrContentRequest.java">
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

package com.aspose.barcode.cloud.requests;

import java.io.File;
import java.util.List;

/**
 * Recognize barcode from an url or from request body. Request body can contain raw data bytes of
 * the image with content-type \"application/octet-stream\". An image can also be passed as a form
 * field.
 */
public class PostBarcodeRecognizeFromUrlOrContentRequest {
    /** The type of barcode to read.. */
    public String type;

    /**
     * Enable checksum validation during recognition for 1D barcodes. Default is treated as Yes for
     * symbologies which must contain checksum, as No where checksum only possible. Checksum never
     * used: Codabar Checksum is possible: Code39 Standard/Extended, Standard2of5, Interleaved2of5,
     * Matrix2of5, ItalianPost25, DeutschePostIdentcode, DeutschePostLeitcode, VIN Checksum always
     * used: Rest symbologies.
     */
    public String checksumValidation;

    /** A flag which force engine to detect codetext encoding for Unicode.. */
    public Boolean detectEncoding;

    /**
     * Preset allows to configure recognition quality and speed manually. You can quickly set up
     * Preset by embedded presets: HighPerformance, NormalQuality, HighQuality, MaxBarCodes or you
     * can manually configure separate options. Default value of Preset is NormalQuality..
     */
    public String preset;

    /** Set X of top left corner of area for recognition.. */
    public Integer rectX;

    /** Set Y of top left corner of area for recognition.. */
    public Integer rectY;

    /** Set Width of area for recognition.. */
    public Integer rectWidth;

    /** Set Height of area for recognition.. */
    public Integer rectHeight;

    /** Value indicating whether FNC symbol strip must be done.. */
    public Boolean stripFNC;

    /**
     * Timeout of recognition process in milliseconds. Default value is 15_000 (15 seconds). Maximum
     * value is 60_000 (1 minute). In case of a timeout RequestTimeout (408) status will be
     * returned. Try reducing the image size to avoid timeout..
     */
    public Integer timeout;

    /**
     * Window size for median smoothing. Typical values are 3 or 4. Default value is 3.
     * AllowMedianSmoothing must be set..
     */
    public Integer medianSmoothingWindowSize;

    /**
     * Allows engine to enable median smoothing as additional scan. Mode helps to recognize noised
     * barcodes..
     */
    public Boolean allowMedianSmoothing;

    /**
     * Allows engine to recognize color barcodes on color background as additional scan. Extremely
     * slow mode..
     */
    public Boolean allowComplexBackground;

    /**
     * Allows engine for Datamatrix to recognize dashed industrial Datamatrix barcodes. Slow mode
     * which helps only for dashed barcodes which consist from spots..
     */
    public Boolean allowDatamatrixIndustrialBarcodes;

    /**
     * Allows engine to recognize decreased image as additional scan. Size for decreasing is
     * selected by internal engine algorithms. Mode helps to recognize barcodes which are noised and
     * blurred but captured with high resolution..
     */
    public Boolean allowDecreasedImage;

    /**
     * Allows engine to use gap between scans to increase recognition speed. Mode can make
     * recognition problems with low height barcodes..
     */
    public Boolean allowDetectScanGap;

    /**
     * Allows engine to recognize barcodes which has incorrect checksum or incorrect values. Mode
     * can be used to recognize damaged barcodes with incorrect text..
     */
    public Boolean allowIncorrectBarcodes;

    /**
     * Allows engine to recognize inverse color image as additional scan. Mode can be used when
     * barcode is white on black background..
     */
    public Boolean allowInvertImage;

    /**
     * Allows engine for Postal barcodes to recognize slightly noised images. Mode helps to
     * recognize slightly damaged Postal barcodes..
     */
    public Boolean allowMicroWhiteSpotsRemoving;

    /**
     * Allows engine for 1D barcodes to quickly recognize high quality barcodes which fill almost
     * whole image. Mode helps to quickly recognize generated barcodes from Internet..
     */
    public Boolean allowOneDFastBarcodesDetector;

    /**
     * Allows engine for 1D barcodes to recognize barcodes with single wiped/glued bars in pattern..
     */
    public Boolean allowOneDWipedBarsRestoration;

    /** Allows engine for QR/MicroQR to recognize damaged MicroQR barcodes.. */
    public Boolean allowQRMicroQrRestoration;

    /**
     * Allows engine to recognize regular image without any restorations as main scan. Mode to
     * recognize image as is..
     */
    public Boolean allowRegularImage;

    /**
     * Allows engine to recognize barcodes with salt and pepper noise type. Mode can remove small
     * noise with white and black dots..
     */
    public Boolean allowSaltAndPepperFiltering;

    /**
     * Allows engine to recognize image without small white spots as additional scan. Mode helps to
     * recognize noised image as well as median smoothing filtering..
     */
    public Boolean allowWhiteSpotsRemoving;

    /**
     * Allows engine to recognize 1D barcodes with checksum by checking more recognition variants.
     * Default value: False..
     */
    public Boolean checkMore1DVariants;

    /**
     * Allows engine for 1D barcodes to quickly recognize middle slice of an image and return result
     * without using any time-consuming algorithms. Default value: False..
     */
    public Boolean fastScanOnly;

    /**
     * Allows engine using additional image restorations to recognize corrupted barcodes. At this
     * time, it is used only in MicroPdf417 barcode type. Default value: False..
     */
    public Boolean allowAdditionalRestorations;

    /**
     * Sets threshold for detected regions that may contain barcodes. Value 0.7 means that bottom
     * 70% of possible regions are filtered out and not processed further. Region likelihood
     * threshold must be between [0.05, 0.9] Use high values for clear images with few barcodes. Use
     * low values for images with many barcodes or for noisy images. Low value may lead to a bigger
     * recognition time..
     */
    public Double regionLikelihoodThresholdPercent;

    /**
     * Scan window sizes in pixels. Allowed sizes are 10, 15, 20, 25, 30. Scanning with small window
     * size takes more time and provides more accuracy but may fail in detecting very big barcodes.
     * Combining of several window sizes can improve detection quality..
     */
    public List<Integer> scanWindowSizes;

    /**
     * Similarity coefficient depends on how homogeneous barcodes are. Use high value for for clear
     * barcodes. Use low values to detect barcodes that ara partly damaged or not lighten evenly.
     * Similarity coefficient must be between [0.5, 0.9].
     */
    public Double similarity;

    /**
     * Allows detector to skip search for diagonal barcodes. Setting it to false will increase
     * detection time but allow to find diagonal barcodes that can be missed otherwise. Enabling of
     * diagonal search leads to a bigger detection time..
     */
    public Boolean skipDiagonalSearch;

    /**
     * Allows engine to recognize tiny barcodes on large images. Ignored if AllowIncorrectBarcodes
     * is set to True. Default value: False..
     */
    public Boolean readTinyBarcodes;

    /**
     * Interpreting Type for the Customer Information of AustralianPost BarCode.Default is
     * CustomerInformationInterpretingType.Other..
     */
    public String australianPostEncodingTable;

    /**
     * The flag which force AustraliaPost decoder to ignore last filling patterns in Customer
     * Information Field during decoding as CTable method. CTable encoding method does not have any
     * gaps in encoding table and sequence "333" of filling patterns is decoded as letter "z"..
     */
    public Boolean ignoreEndingFillingPatternsForCTable;

    /** The image file url.. */
    public String url;

    /** Image data. */
    public File image;
}
