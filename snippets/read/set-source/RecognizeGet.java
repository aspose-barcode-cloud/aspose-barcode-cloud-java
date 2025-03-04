import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.api.RecognizeApi;
import com.aspose.barcode.cloud.model.BarcodeResponseList;
import com.aspose.barcode.cloud.model.DecodeBarcodeType;
import com.aspose.barcode.cloud.requests.RecognizeRequestWrapper;

import java.net.URI;

public class RecognizeGet {
    public static void main(String[] args) {
        String accessToken = System.getenv("TEST_CONFIGURATION_ACCESS_TOKEN");
        ApiClient client;

        if (accessToken != null && !accessToken.isEmpty()) {
            client = new ApiClient(accessToken);
        } else {
            client =
                    new ApiClient(
                            "Client Id from https://dashboard.aspose.cloud/applications",
                            "Client Secret from https://dashboard.aspose.cloud/applications");
        }

        RecognizeApi recognizeApi = new RecognizeApi(client);

        try {

            BarcodeResponseList response =
                    recognizeApi.recognize(
                            new RecognizeRequestWrapper(
                                    DecodeBarcodeType.QR,
                                    new URI(
                                            "https://products.aspose.app/barcode/scan/img/how-to/scan/step2.png")));

            System.out.print("Barcode value: ");
            System.out.println(response.getBarcodes().get(0).getBarcodeValue());
        } catch (Exception e) {
            System.err.println("Error");
            e.printStackTrace();
            System.exit(1);
        }
    }
}
