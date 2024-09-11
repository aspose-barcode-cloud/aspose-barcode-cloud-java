import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.api.ScanApi;
import com.aspose.barcode.cloud.model.BarcodeResponseList;
import com.aspose.barcode.cloud.requests.ScanMultipartRequestWrapper;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ScanMultipart {
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

            ScanMultipartRequestWrapper ScanRequestWrapper = new ScanMultipartRequestWrapper(file);

            BarcodeResponseList scanResponse = scanApi.scanMultipart(ScanRequestWrapper);

            System.out.print("Barcode value: ");
            System.out.println(scanResponse.getBarcodes().get(0).getBarcodeValue());
        } catch (Exception e) {
            System.err.println("Error");
            e.printStackTrace();
            System.exit(1);
        }
    }
}
