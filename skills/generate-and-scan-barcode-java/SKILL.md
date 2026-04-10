---
name: generate-and-scan-barcode-java
description: "Write or update Java code that uses the Aspose.BarCode Cloud SDK (`com.aspose.barcode.cloud.*`; Maven artifact `com.aspose:aspose-barcode-cloud`) to generate, recognize, or scan barcodes through Aspose's cloud REST API. Use this skill whenever the user wants barcode work in Java, touches files under `submodules/java`, or mentions `ApiClient`, `Configuration`, `GenerateApi`, `RecognizeApi`, `ScanApi`, `GenerateParams`, `RecognizeBase64Request`, `ScanBase64Request`, or the `*RequestWrapper` classes. The Java SDK has several easy-to-miss idioms: generate methods return `File`, every API call goes through wrapper objects, GET recognize/scan methods require a public `URI`, base64 methods expect caller-encoded data, tests prefer `src/test/configuration.json` or `TEST_CONFIGURATION_ACCESS_TOKEN`, and repo scripts should run through WSL on Windows, so consult this skill instead of guessing."
---

# Generate and scan barcode in Java

The Java SDK is a thin generated client over the Aspose BarCode Cloud REST API. Most tasks boil down to choosing the right API class (`GenerateApi`, `RecognizeApi`, `ScanApi`), picking the right auth path with `ApiClient` or `Configuration`, and building the matching `*RequestWrapper`.

The Maven artifact and package names differ. Install `com.aspose:aspose-barcode-cloud`, then import classes from `com.aspose.barcode.cloud.*`.

## Quick start

Use these imports in most Java examples:

```java
import com.aspose.barcode.cloud.ApiClient;
import com.aspose.barcode.cloud.Configuration;
import com.aspose.barcode.cloud.api.GenerateApi;
import com.aspose.barcode.cloud.api.RecognizeApi;
import com.aspose.barcode.cloud.api.ScanApi;
import com.aspose.barcode.cloud.model.*;
import com.aspose.barcode.cloud.requests.*;
```

Prefer one of these setup patterns:

```java
ApiClient client = new ApiClient(clientId, clientSecret);
GenerateApi generateApi = new GenerateApi(client);
RecognizeApi recognizeApi = new RecognizeApi(client);
ScanApi scanApi = new ScanApi(client);
```

```java
Configuration config = new Configuration();
config.ClientId = clientId;
config.ClientSecret = clientSecret;
ApiClient client = config.buildApiClient();
```

```java
Configuration config = new Configuration();
config.AccessToken = accessToken;
ApiClient client = config.buildApiClient();
```

If the task is repo maintenance inside `submodules/java`, read `references/repo-workflow.md`. If the task needs a closest existing example or snippet, read `references/snippet-map.md`.

## Authentication

Use one of these two auth modes:

1. Let the SDK fetch the token for you.

```java
ApiClient client = new ApiClient(clientId, clientSecret);
```

2. Inject a pre-fetched bearer token.

```java
ApiClient client = new ApiClient(accessToken);
```

`Configuration.buildApiClient()` follows the same rule: if `Configuration.AccessToken` is non-null, it builds token mode and ignores `ClientId`/`ClientSecret`.

The README still mentions Java 8, but `submodules/java/pom.xml` currently compiles with source and target level `11`. Follow the build file, not the older README note.

The upstream README recommends one `ApiClient` instance per thread in multithreaded code. Keep that guidance when writing examples or concurrent integrations.

## Choose the right API shape

Pick the operation first:

- `GenerateApi`: create a barcode image.
- `RecognizeApi`: decode one or more expected barcode types and optionally tune recognition.
- `ScanApi`: auto-detect barcode types with the smallest API surface.

Then pick the transport variant based on what the caller has:

- Public internet URL: use `recognize(...)` or `scan(...)` with `RecognizeRequestWrapper` or `ScanRequestWrapper`.
- Local file on disk: use `recognizeMultipart(...)` or `scanMultipart(...)`.
- Raw bytes already in memory: base64-encode them yourself and use `recognizeBase64(...)` or `scanBase64(...)`.
- Simple generation with query-like parameters: use `generate(...)`.
- Structured generation payload: use `generateBody(...)` with `GenerateParams`.
- Multipart generation: use `generateMultipart(...)` only when the caller explicitly needs the multipart form variant.

Key method names:

- `generate`
- `generateBody`
- `generateMultipart`
- `recognize`
- `recognizeBase64`
- `recognizeMultipart`
- `scan`
- `scanBase64`
- `scanMultipart`

## Non-obvious SDK rules

1. `generate`, `generateBody`, and `generateMultipart` return `java.io.File`, not bytes or an input stream. Move or copy the returned file if you need a stable destination.
2. Every public operation takes a `*RequestWrapper`. Required arguments go into the wrapper constructor; optional parameters are set on public fields or nested models after construction.
3. `RecognizeRequestWrapper` and `ScanRequestWrapper` take a public `URI`. Do not pass local filesystem paths there; use multipart or base64 for local files.
4. `RecognizeBase64Request` and `ScanBase64Request` expect an already-encoded base64 string. The SDK does not call `Base64.getEncoder().encodeToString(...)` for you.
5. `RecognizeBase64Request` takes `List<DecodeBarcodeType>`, but `RecognizeRequestWrapper` and `RecognizeMultipartRequestWrapper` take a single `DecodeBarcodeType`.
6. `ScanApi` never takes barcode types. Use it when the caller wants auto-detection.
7. `BarcodeResponseList` may contain multiple barcodes. Iterate `response.getBarcodes()` instead of assuming a single result.
8. API failures throw `ApiException`. Turn on logging with `client.setDebugging(true)` when request or response details would help.
9. Repo tests first load `src/test/configuration.json`; if that file is absent, `TestConfiguration` only falls back to `TEST_CONFIGURATION_ACCESS_TOKEN`. Client-id and client-secret environment variables are not part of the Java test harness fallback.

## Common patterns

Generate and save a QR code:

```java
ApiClient client = new ApiClient(clientId, clientSecret);
GenerateApi api = new GenerateApi(client);

GenerateRequestWrapper request = new GenerateRequestWrapper(EncodeBarcodeType.QR, "hello from Java");
request.imageFormat = BarcodeImageFormat.PNG;
request.textLocation = CodeLocation.NONE;

File generated = api.generate(request);
Files.move(generated.toPath(), Paths.get("qr.png"), StandardCopyOption.REPLACE_EXISTING);
```

Recognize specific barcode types from bytes already in memory:

```java
byte[] bytes = Files.readAllBytes(Paths.get("many-types.png"));
String fileBase64 = Base64.getEncoder().encodeToString(bytes);

RecognizeBase64Request body =
        new RecognizeBase64Request(Arrays.asList(DecodeBarcodeType.QR, DecodeBarcodeType.CODE128), fileBase64);
BarcodeResponseList result =
        new RecognizeApi(client).recognizeBase64(new RecognizeBase64RequestWrapper(body));
```

Auto-scan a local file without specifying the barcode type:

```java
File image = Paths.get("unknown.png").toFile();
BarcodeResponseList result =
        new ScanApi(client).scanMultipart(new ScanMultipartRequestWrapper(image));
```

## Working in this repo

Read `references/repo-workflow.md` when the task changes SDK source, tests, snippets, Maven metadata, README examples, or generated code in `submodules/java`.

Read `references/snippet-map.md` when the task needs the closest existing pattern for generate, recognize, scan, auth, or repo-test scenarios.

## Final checklist

1. Use the correct artifact and package pair: Maven `com.aspose:aspose-barcode-cloud`, imports under `com.aspose.barcode.cloud.*`.
2. Choose `ApiClient(clientId, clientSecret)`, `ApiClient(accessToken)`, or `Configuration.buildApiClient()` deliberately.
3. Pick GET only for public `URI`s, multipart for local files, and base64 for in-memory bytes.
4. Build the right `*RequestWrapper` and set optional public fields after construction.
5. Base64-encode request bodies yourself before calling `recognizeBase64` or `scanBase64`.
6. Handle returned `File` objects from generate calls and multiple entries in `response.getBarcodes()`.
7. When changing the repo, validate with the submodule workflow in `references/repo-workflow.md`.
