import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.api.GenerateApi;
import com.aspose.barcode.cloud.model.BarcodeImageFormat;
import com.aspose.barcode.cloud.model.BarcodeImageParams;
import com.aspose.barcode.cloud.model.EncodeBarcodeType;
import com.aspose.barcode.cloud.model.EncodeData;
import com.aspose.barcode.cloud.model.GenerateParams;
import com.aspose.barcode.cloud.requests.GenerateBodyRequestWrapper;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
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

            GenerateBodyRequestWrapper request = new GenerateBodyRequestWrapper(generateParams);

            File barcodeImage = generateApi.generateBody(request);

            File destination = Paths.get("test_data", "QR.jpg").toFile();
            Files.move(
                    barcodeImage.toPath(),
                    destination.toPath(),
                    StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Barcode image saved to file " + destination.getAbsolutePath());

        } catch (Exception e) {
            System.err.println("Error");
            e.printStackTrace();
            System.exit(1);
        }
    }
}
