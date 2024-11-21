import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.api.GenerateApi;
import com.aspose.barcode.cloud.model.BarcodeImageFormat;
import com.aspose.barcode.cloud.model.EncodeBarcodeType;
import com.aspose.barcode.cloud.model.GraphicsUnit;
import com.aspose.barcode.cloud.requests.BarcodeGenerateMultipartPostRequest;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class GenerateMultipart {
    public static void main(String[] args) {
        ApiClient client =
                new ApiClient(
                        "Client Id from https://dashboard.aspose.cloud/applications",
                        "Client Secret from https://dashboard.aspose.cloud/applications");
        
        GenerateApi generateApi = new GenerateApi(client);

        try {
            BarcodeGenerateMultipartPostRequest request = 
            new BarcodeGenerateMultipartPostRequest(EncodeBarcodeType.PDF417, "Aspose.BarCode.Cloud");

        
            File barcodeImage = generateApi.barcodeGenerateMultipartPost(request);

            
            File destination = new File("pdf417.png");
            Files.move(barcodeImage.toPath(), destination.toPath(), StandardCopyOption.REPLACE_EXISTING);
 
            System.out.println("Barcode image saved to file " + destination.getAbsolutePath());

        } catch (ApiException e) {
            System.err.println("Error");
            e.printStackTrace();
        }
    }

}
