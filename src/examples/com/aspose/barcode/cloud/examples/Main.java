package com.aspose.barcode.cloud.examples;

import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.api.BarcodeApi;
import com.aspose.barcode.cloud.model.BarcodeResponseList;
import com.aspose.barcode.cloud.model.DecodeBarcodeType;
import com.aspose.barcode.cloud.model.EncodeBarcodeType;
import com.aspose.barcode.cloud.model.PresetType;

import java.io.File;

public class Main {

    public static void main(String[] args) throws ApiException {
        ApiClient client =
        client.setReadTimeout(5 * 60 * 1000);

        BarcodeApi api = new BarcodeApi(client);

        File generated =
                api.getBarcodeGenerate(
                        EncodeBarcodeType.QR.getValue(),
                        "Example",
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null);

        BarcodeResponseList recognized =
                api.postBarcodeRecognizeFromUrlOrContent(
                        DecodeBarcodeType.QR.getValue(),
                        null,
                        false,
                        PresetType.HIGHPERFORMANCE.getValue(),
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        generated);

        System.out.println(recognized.getBarcodes().get(0).getType());
        System.out.println(recognized.getBarcodes().get(0).getBarcodeValue());
    }
}
