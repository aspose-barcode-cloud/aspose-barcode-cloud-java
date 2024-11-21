import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.api.GenerateApi;
import com.aspose.barcode.cloud.model.BarcodeImageFormat;
import com.aspose.barcode.cloud.model.EncodeBarcodeType;
import com.aspose.barcode.cloud.requests.BarcodeGenerateBarcodeTypeGetRequest;


import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class GenerateGet {
    public static void main(String[] args) {
        ApiClient client =
                new ApiClient(
                        "Client Id from https://dashboard.aspose.cloud/applications",
                        "Client Secret from https://dashboard.aspose.cloud/applications");
        

        GenerateApi generateApi = new GenerateApi(client);

        try {
            BarcodeGenerateBarcodeTypeGetRequest request = 
                        new BarcodeGenerateBarcodeTypeGetRequest(EncodeBarcodeType.CODE128, "Aspose.BarCode.Cloud");

            request.imageFormat = BarcodeImageFormat.PNG;
        
            File barcodeImage = generateApi.barcodeGenerateBarcodeTypeGet(request);

            File destination = new File("barcode.png");
            Files.move(barcodeImage.toPath(), destination.toPath(), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Barcode image saved to file " + destination.getAbsolutePath());

        } catch (ApiException e) {
            System.err.println("Error");
            e.printStackTrace();
        }
    }

}
