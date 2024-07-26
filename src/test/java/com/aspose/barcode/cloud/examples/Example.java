package com.aspose.barcode.cloud.examples;

import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.api.BarcodeApi;
import com.aspose.barcode.cloud.model.BarcodeResponseList;
import com.aspose.barcode.cloud.model.DecodeBarcodeType;
import com.aspose.barcode.cloud.model.EncodeBarcodeType;
import com.aspose.barcode.cloud.requests.GetBarcodeGenerateRequest;
import com.aspose.barcode.cloud.requests.ScanBarcodeRequest;

import java.io.File;
import java.util.Collections;

public class Example {
    public static void main(String[] args) {
        ApiClient client =
                new ApiClient(
                        "Client Id from https://dashboard.aspose.cloud/applications",
                        "Client Secret from https://dashboard.aspose.cloud/applications");
        client.setReadTimeout(5 * 60 * 1000);

        BarcodeApi api = new BarcodeApi(client);

        try {
            System.out.println("Generating barcode...");
            File barcodeImage = generateBarcode(api);
            System.out.println("Barcode image saved to file " + barcodeImage.getAbsolutePath());

            System.out.println("Recognizing barcode on image...");
            BarcodeResponseList recognized = scanBarcode(api, barcodeImage);
            System.out.print("Barcode on image:");
            System.out.println(recognized.toString());
        } catch (ApiException e) {
            System.err.println("Error");
            e.printStackTrace();
        }
    }

    private static File generateBarcode(BarcodeApi api) throws ApiException {
        String type = EncodeBarcodeType.QR.toString();
        String text = "Aspose.BarCode for Cloud Sample";
        GetBarcodeGenerateRequest request = new GetBarcodeGenerateRequest(type, text);
        request.textLocation = "None";

        return api.getBarcodeGenerate(request);
    }

    private static BarcodeResponseList scanBarcode(BarcodeApi api, File barcodeImage)
            throws ApiException {
        ScanBarcodeRequest request = new ScanBarcodeRequest(barcodeImage);
        request.decodeTypes = Collections.singletonList(DecodeBarcodeType.QR);

        return api.scanBarcode(request);
    }
}
