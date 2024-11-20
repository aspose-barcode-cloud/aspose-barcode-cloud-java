
import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.api.ScanApi;
import com.aspose.barcode.cloud.model.BarcodeResponseList;
import com.aspose.barcode.cloud.requests.BarcodeScanGetRequest;

import java.net.URI;

public class ScanGet {
    public static void main(String[] args) {
        ApiClient client =
                new ApiClient(
                        "Client Id from https://dashboard.aspose.cloud/applications",
                        "Client Secret from https://dashboard.aspose.cloud/applications");

        ScanApi scanApi = new ScanApi(client);

        try {

            BarcodeScanGetRequest scanRequest =
            new BarcodeScanGetRequest(
                    new URI(
                            "https://products.aspose.app/barcode/scan/img/how-to/scan/step2.png"));

    BarcodeResponseList scanResponse = scanApi.barcodeScanGet(scanRequest);

            System.out.print("Barcode on image:");
            System.out.println(scanResponse.getBarcodes().get(0).getBarcodeValue());
        } catch (Exception e) {
            System.err.println("Error");
            e.printStackTrace();
        }
    }
}
