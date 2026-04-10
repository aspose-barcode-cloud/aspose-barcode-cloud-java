# Java submodule workflow

Use this reference when the task edits SDK source, tests, snippets, docs, Maven metadata, or generated files inside `submodules/java`.

## Layout

- `src/main/java/com/aspose/barcode/cloud`: `ApiClient`, `Configuration`, `ApiException`, JSON helpers, auth, and HTTP plumbing.
- `src/main/java/com/aspose/barcode/cloud/api`: generated API clients such as `GenerateApi`, `RecognizeApi`, and `ScanApi`.
- `src/main/java/com/aspose/barcode/cloud/model`: request and response models plus enums.
- `src/main/java/com/aspose/barcode/cloud/requests`: wrapper classes that split required constructor arguments from optional public fields.
- `src/test/java/com/aspose/barcode/cloud/test`: integration-style tests for configuration, auth, generate, recognize, scan, and end-to-end flows.
- `src/test/java/com/aspose/barcode/cloud/api`: unit tests for request validation, path construction, and async/execute wiring.
- `src/test/java/com/aspose/barcode/cloud/examples/Example.java`: small standalone sample that generates then scans a barcode.
- `snippets`: documentation snippets executed by the snippet runner.
- `scripts`: post-processing, formatting, snippet execution, and README example insertion helpers.
- `pom.xml`: package metadata, Java version, dependencies, JaCoCo thresholds, and Maven plugins.

## Validation

On Windows, run repo scripts and Make targets through WSL.

From `submodules/java`:

- `make build`
- `make test`
- `make lint`
- `make format`
- `make fix`

`make build` does:

- `mvn compile -Dmaven.test.skip=true`
- `mvn dependency:copy-dependencies -DoutputDirectory=target/lib/`

`make test` does more than `mvn test`:

- runs `mvn test`
- copies dependencies into `target/lib/`
- runs `./scripts/run_snippets.sh`

`run_snippets.sh` creates a temporary `snippets_test` directory, links `target`, and executes every snippet through `scripts/run_snippet.sh`. Treat snippet failures as package-consumer regressions, not just sample breakage.

`make after-gen` runs `fix`, `format`, and `insert-example`. The root-level `make java` path already invokes `make after-gen` at the end of generation.

## Test configuration

- Minimal JSON shape lives in `src/test/configuration.example.json`.
- Tests load `src/test/configuration.json` first.
- If the config file is absent, `TestConfiguration.load()` falls back to `TEST_CONFIGURATION_ACCESS_TOKEN` only.
- The Java test harness does not fall back to `TEST_CONFIGURATION_CLIENT_ID` or `TEST_CONFIGURATION_CLIENT_SECRET`.
- Snippets commonly mirror the same choice: use `TEST_CONFIGURATION_ACCESS_TOKEN` when present, otherwise rely on placeholder credentials in sample code.

## Regenerated code workflow

If you change generated SDK code in this mono-repo:

1. Make the desired SDK edit in `submodules/java` so the target behavior is clear.
2. Mirror the change in the matching template under `codegen/Templates/java` when the file is generated. If the relevant template does not exist locally, copy it in from the upstream OpenAPI Generator templates first and edit the local copy.
3. Stage the Java submodule changes.
4. From the repo root, run `make java` through WSL on Windows.
5. `codegen/generate-java.bash` regenerates into `.generated/java`, splits wrapper classes into `src/main/java/com/aspose/barcode/cloud/requests`, refreshes `api`, `model`, `docs`, `pom.xml`, and `README.template`, then runs `make after-gen` in `submodules/java`.
6. Ensure `submodules/java` has no new unstaged diffs after regeneration.
7. If regeneration reintroduces old code, keep fixing the templates until generated output matches the intended SDK change.

## Useful anchors

- `pom.xml`: artifact id `com.aspose:aspose-barcode-cloud`, Java compiler level `11`, and JaCoCo coverage rules.
- `src/main/java/com/aspose/barcode/cloud/Configuration.java`: access-token versus client-id/client-secret behavior.
- `src/test/java/com/aspose/barcode/cloud/test/TestConfiguration.java`: repo auth fallback rules.
- `scripts/run_snippets.sh`: snippet execution pipeline.
- `scripts/insert-example.bash`: README generation entry point.
- `codegen/generate-java.bash`: main regen script for this submodule.
