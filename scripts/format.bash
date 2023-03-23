#!/bin/bash
#
# Format java code using https://github.com/google/google-java-format/releases
#
set -euo pipefail

FORMAT_TOOL="tools/google-java-format-1.16.0-all-deps.jar"

find ./src -iname "*.java" -print0 | xargs -0 java -jar "${FORMAT_TOOL}" --aosp --replace --skip-reflowing-long-strings
# Repeat for consistent formatting
find ./src -iname "*.java" -print0 | xargs -0 java -jar "${FORMAT_TOOL}" --aosp --replace --skip-reflowing-long-strings
