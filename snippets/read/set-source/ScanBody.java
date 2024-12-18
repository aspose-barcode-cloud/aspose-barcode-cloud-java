import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.api.ScanApi;
import com.aspose.barcode.cloud.model.BarcodeResponseList;
import com.aspose.barcode.cloud.model.ScanBase64Request;
import com.aspose.barcode.cloud.requests.ScanBase64RequestWrapper;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;

public class ScanBody {
    public static void main(String[] args) {
        ApiClient client =
                new ApiClient(
                        "Client Id from https://dashboard.aspose.cloud/applications",
                        "Client Secret from https://dashboard.aspose.cloud/applications");

        ScanApi scanApi = new ScanApi(client);
        Path currentRelativePath = Paths.get("");
        String currentPath = currentRelativePath.toAbsolutePath().toString();
        String testDataFolderPath = String.valueOf(Paths.get(currentPath, "test_data"));

        try {

            File file =
                    new File(String.valueOf(Paths.get(testDataFolderPath, "QR_and_Code128.png")));
            byte[] fileContent = Files.readAllBytes(file.toPath());
            String encodedFile = Base64.getEncoder().encodeToString(fileContent);

            ScanBase64Request scanBase64Request = new ScanBase64Request(encodedFile);

            ScanBase64RequestWrapper ScanRequestWrapper =
                    new ScanBase64RequestWrapper(scanBase64Request);
            BarcodeResponseList scanResponse = scanApi.scanBase64(ScanRequestWrapper);

            System.out.print("Barcode value: ");
            System.out.println(scanResponse.getBarcodes().get(0).getBarcodeValue());
        } catch (Exception e) {
            System.err.println("Error");
            e.printStackTrace();
            System.exit(1);
        }
    }
}
