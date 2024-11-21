import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.api.GenerateApi;
import com.aspose.barcode.cloud.model.BarcodeImageFormat;
import com.aspose.barcode.cloud.model.BarcodeImageParams;
import com.aspose.barcode.cloud.model.EncodeBarcodeType;
import com.aspose.barcode.cloud.model.EncodeData;
import com.aspose.barcode.cloud.model.EncodeDataType;
import com.aspose.barcode.cloud.model.GenerateParams;
import com.aspose.barcode.cloud.requests.BarcodeGenerateBodyPostRequest;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class GenerateBody {
    public static void main(String[] args) {
        ApiClient client =
                new ApiClient(
                        "Client Id from https://dashboard.aspose.cloud/applications",
                        "Client Secret from https://dashboard.aspose.cloud/applications");
        

        GenerateApi generateApi = new GenerateApi(client);

        try {
            EncodeData encodeData = new EncodeData("Aspose.BarCode.Cloud");
            BarcodeImageParams imageParams = new BarcodeImageParams();
            imageParams.setImageFormat(BarcodeImageFormat.JPEG);
            
            GenerateParams generateParams = new GenerateParams(EncodeBarcodeType.QR, encodeData);
            generateParams.setBarcodeImageParams(imageParams);
            
            BarcodeGenerateBodyPostRequest request = new BarcodeGenerateBodyPostRequest(generateParams);
            
            File barcodeImage = generateApi.barcodeGenerateBodyPost(request);

            File destination = new File("qrcode.jpg");
            Files.move(barcodeImage.toPath(), destination.toPath(), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Barcode image saved to file " + destination.getAbsolutePath());

        } catch (Exception e) {
            System.err.println("Error");
            e.printStackTrace();
        }
    }

}
