import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.api.GenerateApi;
import com.aspose.barcode.cloud.model.EncodeBarcodeType;
import com.aspose.barcode.cloud.model.EncodeDataType;
import com.aspose.barcode.cloud.requests.GenerateMultipartRequestWrapper;

import java.io.File;

public class GenerateMultipart {
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

            GenerateMultipartRequestWrapper formRequest =
                    new GenerateMultipartRequestWrapper(
                            EncodeBarcodeType.CODE128, "4173706F73652E426172436F64652E436C6F7564");
            formRequest.dataType = EncodeDataType.HEX_BYTES;

            File barcodeImage = generateApi.generateMultipart(formRequest);

            System.out.println("Barcode image saved to file " + barcodeImage.getAbsolutePath());

        } catch (Exception e) {
            System.err.println("Error");
            e.printStackTrace();
            System.exit(1);
        }
    }
}