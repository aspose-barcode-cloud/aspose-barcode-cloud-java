import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.api.GenerateApi;
import com.aspose.barcode.cloud.model.BarcodeImageFormat;
import com.aspose.barcode.cloud.model.EncodeBarcodeType;
import com.aspose.barcode.cloud.requests.GenerateMultipartRequestWrapper;

import java.io.File;

public class GenerateMultipart {
    public static void main(String[] args) {
        ApiClient client =
                new ApiClient(
                        "Client Id from https://dashboard.aspose.cloud/applications",
                        "Client Secret from https://dashboard.aspose.cloud/applications");

        GenerateApi generateApi = new GenerateApi(client);

        try {
            GenerateMultipartRequestWrapper request =
                    new GenerateMultipartRequestWrapper(EncodeBarcodeType.CODE39, "Aspose");
            request.foregroundColor = "Green";
            request.backgroundColor = "Yellow";
            request.imageFormat = BarcodeImageFormat.GIF;

            File barcodeFile = generateApi.generateMultipart(request);

            System.out.println("Barcode image saved to file " + barcodeFile.getAbsolutePath());

        } catch (Exception e) {
            System.err.println("Error");
            e.printStackTrace();
            System.exit(1);
        }
    }
}
