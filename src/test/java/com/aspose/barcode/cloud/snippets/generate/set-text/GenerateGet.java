import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.api.GenerateApi;
import com.aspose.barcode.cloud.model.EncodeBarcodeType;
import com.aspose.barcode.cloud.model.EncodeDataType;
import com.aspose.barcode.cloud.requests.BarcodeGenerateBarcodeTypeGetRequest;

import java.io.File;

public class GenerateGet {
    public static void main(String[] args) {
        ApiClient client =
                new ApiClient(
                        "Client Id from https://dashboard.aspose.cloud/applications",
                        "Client Secret from https://dashboard.aspose.cloud/applications");

        GenerateApi generateApi = new GenerateApi(client);

        try {
            BarcodeGenerateBarcodeTypeGetRequest getRequest =
                    new BarcodeGenerateBarcodeTypeGetRequest(
                            EncodeBarcodeType.QR, "Aspose.BarCode.Cloud");

            getRequest.dataType = EncodeDataType.STRING_DATA;

            File barcodeImage = generateApi.barcodeGenerateBarcodeTypeGet(getRequest);

            System.out.println("Barcode image saved to file " + barcodeImage.getAbsolutePath());

        } catch (Exception e) {
            System.err.println("Error");
            e.printStackTrace();
            System.exit(1);
        }
    }
}
