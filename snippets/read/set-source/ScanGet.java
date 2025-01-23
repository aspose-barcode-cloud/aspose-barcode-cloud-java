import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.api.ScanApi;
import com.aspose.barcode.cloud.model.BarcodeResponseList;
import com.aspose.barcode.cloud.requests.ScanRequestWrapper;

import java.net.URI;

public class ScanGet {
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

        ScanApi scanApi = new ScanApi(client);

        try {

            ScanRequestWrapper ScanRequestWrapper =
                    new ScanRequestWrapper(
                            new URI(
                                    "https://products.aspose.app/barcode/scan/img/how-to/scan/step2.png"));

            BarcodeResponseList scanResponse = scanApi.scan(ScanRequestWrapper);

            System.out.print("Barcode value: ");
            System.out.println(scanResponse.getBarcodes().get(0).getBarcodeValue());
        } catch (Exception e) {
            System.err.println("Error");
            e.printStackTrace();
            System.exit(1);
        }
    }
}
