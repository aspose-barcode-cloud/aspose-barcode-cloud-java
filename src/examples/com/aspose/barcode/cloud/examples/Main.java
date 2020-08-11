package com.aspose.barcode.cloud.examples;

import com.aspose.barcode.cloud.ApiException;
import com.aspose.barcode.cloud.api.BarcodeApi;
import com.aspose.barcode.cloud.model.BarcodeResponseList;
import com.aspose.barcode.cloud.model.DecodeBarcodeType;
import com.aspose.barcode.cloud.model.EncodeBarcodeType;
import com.aspose.barcode.cloud.model.PresetType;

import java.io.File;

public class Main {

    public static void main(String[] args) throws ApiException {
        BarcodeApi api = new BarcodeApi();
        api.getApiClient()
                .setAccessToken(
                        "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYmYiOjE1OTcxMjgzMDUsImV4cCI6MTU5NzIxNDcwNSwiaXNzIjoiaHR0cHM6Ly9hcGkuYXNwb3NlLmNsb3VkIiwiYXVkIjpbImh0dHBzOi8vYXBpLmFzcG9zZS5jbG91ZC9yZXNvdXJjZXMiLCJhcGkucGxhdGZvcm0iLCJhcGkucHJvZHVjdHMiLCJhcGkuc3RvcmFnZSJdLCJjbGllbnRfaWQiOiI3NjU4MTMwMC1hZDNlLTRhNGMtYWU3MS1lMDI4ZjYwMjcwOTIiLCJjbGllbnRfZGVmYXVsdF9zdG9yYWdlIjoiQjJEMzUzREYtNDAyMS00N0QzLTkyQjItMjQ0NzYyMzlDRTc3IiwiY2xpZW50X2lkU3J2SWQiOiI4MTQwNDEiLCJzY29wZSI6WyJhcGkucGxhdGZvcm0iLCJhcGkucHJvZHVjdHMiLCJhcGkuc3RvcmFnZSJdfQ.lRNljaTHpxqrvLvFrGs1lMvzAZ8Tn--XwAuCVtElIFY-VRr9F1wpvx7SbTxFL_ePZVd6f_Z3ULZLPlLnbLhyxDoOFxF0Aw00EDKtsaGTeBIPAJRJPrxOEspHWFbogNazk-jyiN-aDEQ2LR83IlknXXEE424XqREeHTXRCwXI7cQOIIYuvZEevUIW0J8MXmZ0TUS3TIwRGu6VdZ0v7MeE9fmYJu_SzXXnpUicNfTjJujsaabVXWaz0JUAlR9EoWVHQddz6Cf2cZ8rQ2SSMwy9-SXZ-5bf9SB-DDfr67ZA7hFTqiif6vtysgvK0PovK1R76k-g3jRtnZb2A0zko5UxNw");

        File generated =
                api.getBarcodeGenerate(
                        EncodeBarcodeType.QR.getValue(),
                        "Example",
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null);

        BarcodeResponseList recognized =
                api.postBarcodeRecognizeFromUrlOrContent(
                        DecodeBarcodeType.QR.getValue(),
                        null,
                        false,
                        PresetType.HIGHPERFORMANCE.getValue(),
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        generated);

        System.out.println(recognized.getBarcodes().get(0).getType());
        System.out.println(recognized.getBarcodes().get(0).getBarcodeValue());
    }
}
