import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.api.GenerateApi;
import com.aspose.barcode.cloud.model.BarcodeImageFormat;
import com.aspose.barcode.cloud.model.EncodeBarcodeType;
import com.aspose.barcode.cloud.requests.GenerateRequestWrapper;

import java.io.File;

public class GenerateGet {
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

        GenerateApi generateApi = new GenerateApi(client);

        try {
            GenerateRequestWrapper request =
                    new GenerateRequestWrapper(
                            EncodeBarcodeType.QR, "https://products.aspose.cloud/barcode/family/");
            request.foregroundColor = "DarkBlue";
            request.backgroundColor = "LightGray";
            request.imageFormat = BarcodeImageFormat.PNG;

            File barcodeImage = generateApi.generate(request);

            System.out.println("Barcode image saved to file " + barcodeImage.getAbsolutePath());

        } catch (Exception e) {
            System.err.println("Error");
            e.printStackTrace();
            System.exit(1);
        }
    }
}
