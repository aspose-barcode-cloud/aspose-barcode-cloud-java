import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.api.GenerateApi;
import com.aspose.barcode.cloud.model.BarcodeImageParams;
import com.aspose.barcode.cloud.model.EncodeBarcodeType;
import com.aspose.barcode.cloud.model.EncodeData;
import com.aspose.barcode.cloud.model.EncodeDataType;
import com.aspose.barcode.cloud.model.GenerateParams;
import com.aspose.barcode.cloud.model.GraphicsUnit;
import com.aspose.barcode.cloud.requests.GenerateBodyRequestWrapper;

import java.io.File;

public class GenerateBody {
    public static void main(String[] args) {
        ApiClient client =
                new ApiClient(
                        "Client Id from https://dashboard.aspose.cloud/applications",
                        "Client Secret from https://dashboard.aspose.cloud/applications");

        GenerateApi generateApi = new GenerateApi(client);

        try {
            EncodeData encodeData = new EncodeData("Aspose.BarCode.Cloud");
            encodeData.setDataType(EncodeDataType.STRING_DATA);

            BarcodeImageParams imageParams = new BarcodeImageParams();
            imageParams.setImageHeight(2f);
            imageParams.setImageWidth(3f);
            imageParams.setResolution(96f);
            imageParams.setUnits(GraphicsUnit.INCH);

            GenerateParams generateParams =
                    new GenerateParams(EncodeBarcodeType.PDF417, encodeData);
            generateParams.setBarcodeImageParams(imageParams);

            GenerateBodyRequestWrapper request = new GenerateBodyRequestWrapper(generateParams);
            File barcodeImage = generateApi.generateBody(request);

            System.out.println("Barcode image saved to file " + barcodeImage.getAbsolutePath());

        } catch (Exception e) {
            System.err.println("Error");
            e.printStackTrace();
            System.exit(1);
        }
    }
}
