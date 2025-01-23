import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.api.RecognizeApi;
import com.aspose.barcode.cloud.model.BarcodeResponseList;
import com.aspose.barcode.cloud.model.DecodeBarcodeType;
import com.aspose.barcode.cloud.model.RecognitionImageKind;
import com.aspose.barcode.cloud.requests.RecognizeRequestWrapper;

import java.net.URI;

public class RecognizeGet {
    public static void main(String[] args) {
        String accessToken = System.getenv("TEST_CONFIGURATION_ACCESS_TOKEN");
        ApiClient client;

        if (accessToken != null && !accessToken.isEmpty()) {
            client = new Configuration(accessToken);
        } else {
            client =
                    new Configuration(
                            "Client Id from https://dashboard.aspose.cloud/applications",
                            "Client Secret from https://dashboard.aspose.cloud/applications");
        }

        RecognizeApi recognizeApi = new RecognizeApi(client);

        try {

            RecognizeRequestWrapper request =
                    new RecognizeRequestWrapper(
                            DecodeBarcodeType.MOST_COMMONLY_USED,
                            new URI(
                                    "https://products.aspose.app/barcode/scan/img/how-to/scan/step2.png"));

            request.recognitionImageKind = RecognitionImageKind.PHOTO;

            BarcodeResponseList response = recognizeApi.recognize(request);

            System.out.print("Barcode value: ");
            System.out.println(response.getBarcodes().get(0).getBarcodeValue());
        } catch (Exception e) {
            System.err.println("Error");
            e.printStackTrace();
            System.exit(1);
        }
    }
}
