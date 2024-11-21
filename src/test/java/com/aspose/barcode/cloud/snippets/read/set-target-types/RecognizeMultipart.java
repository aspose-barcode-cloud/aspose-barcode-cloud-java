
import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.api.RecognizeApi;
import com.aspose.barcode.cloud.model.BarcodeResponseList;
import com.aspose.barcode.cloud.model.DecodeBarcodeType;
import com.aspose.barcode.cloud.requests.BarcodeRecognizeMultipartPostRequest;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;


public class RecognizeMultipart {
    public static void main(String[] args) {
        ApiClient client =
                new ApiClient(
                        "Client Id from https://dashboard.aspose.cloud/applications",
                        "Client Secret from https://dashboard.aspose.cloud/applications");

        RecognizeApi recognizeApi = new RecognizeApi(client);
        Path currentRelativePath = Paths.get("");
        String currentPath = currentRelativePath.toAbsolutePath().toString();
        String testDataFolderPath = String.valueOf(Paths.get(currentPath, "test_data"));

        try {

        File file = new File(String.valueOf(Paths.get(testDataFolderPath, "pdf417.png")));

        BarcodeRecognizeMultipartPostRequest request =
                new BarcodeRecognizeMultipartPostRequest(
                        DecodeBarcodeType.PDF417, file);

        BarcodeResponseList response = recognizeApi.barcodeRecognizeMultipartPost(request);

            System.out.print("Barcode on image:");
            System.out.println(response.getBarcodes().get(0).getBarcodeValue());
        } catch (Exception e) {
            System.err.println("Error");
            e.printStackTrace();
        }
    }
}
