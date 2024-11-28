import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.api.GenerateApi;
import com.aspose.barcode.cloud.model.BarcodeImageFormat;
import com.aspose.barcode.cloud.model.EncodeBarcodeType;
import com.aspose.barcode.cloud.requests.BarcodeGenerateMultipartPostRequest;

import java.io.File;

public class GenerateMultipart {
    public static void main(String[] args) {
        ApiClient client =
                new ApiClient(
                        "Client Id from https://dashboard.aspose.cloud/applications",
                        "Client Secret from https://dashboard.aspose.cloud/applications");
        
        GenerateApi generateApi = new GenerateApi(client);

        try {
            BarcodeGenerateMultipartPostRequest request = new BarcodeGenerateMultipartPostRequest(
                EncodeBarcodeType.CODE39, "Aspose");
            request.foregroundColor = "Green";
            request.backgroundColor = "Yellow";
            request.imageFormat = BarcodeImageFormat.GIF;
        
            File barcodeFile = generateApi.barcodeGenerateMultipartPost(request);

            System.out.println("Barcode image saved to file " + barcodeFile.getAbsolutePath());

        } catch (ApiException e) {
            System.err.println("Error");
            e.printStackTrace();
        }
    }

}
