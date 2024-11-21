import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.api.GenerateApi;
import com.aspose.barcode.cloud.model.BarcodeImageFormat;
import com.aspose.barcode.cloud.model.CodeLocation;
import com.aspose.barcode.cloud.model.EncodeBarcodeType;
import com.aspose.barcode.cloud.model.GraphicsUnit;
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
                    EncodeBarcodeType.PDF417, "Aspose.BarCode.Cloud"
            );
            request.textLocation = CodeLocation.ABOVE;
            request.imageFormat = BarcodeImageFormat.SVG;
            
            File barcodeImage = generateApi.barcodeGenerateMultipartPost(request);

            System.out.println("Barcode image saved to file " + barcodeImage.getAbsolutePath());

        } catch (ApiException e) {
            System.err.println("Error");
            e.printStackTrace();
        }
    }

}
