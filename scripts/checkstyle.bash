#!/bin/bash
#
# Format java code using https://github.com/checkstyle/checkstyle/releases
#
set -euo pipefail

CHECKSTYLE_TOOL="tools/checkstyle-10.12.1-all.jar"

java -jar "${CHECKSTYLE_TOOL}" -c=checkstyle.xml src/main/java/com/aspose/barcode/cloud
