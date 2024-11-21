import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.api.GenerateApi;
import com.aspose.barcode.cloud.model.EncodeBarcodeType;
import com.aspose.barcode.cloud.model.EncodeDataType;
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

            BarcodeGenerateMultipartPostRequest formRequest = 
            new BarcodeGenerateMultipartPostRequest(EncodeBarcodeType.CODE128, "4173706F73652E426172436F64652E436C6F7564");
            formRequest.dataType = EncodeDataType.HEX_BYTES;

            File barcodeImage = generateApi.barcodeGenerateMultipartPost(formRequest);

            System.out.println("Barcode image saved to file " + barcodeImage.getAbsolutePath());

        } catch (ApiException e) {
            System.err.println("Error");
            e.printStackTrace();
        }
    }

}
