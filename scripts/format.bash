#!/bin/bash
#
# Format java code using https://github.com/google/google-java-format/releases
#
set -euo pipefail

find ./src -iname "*.java" -print0 | xargs -0 java -jar tools/google-java-format-1.7-all-deps.jar --aosp --replace
# Repeat for consistent formatting
find ./src -iname "*.java" -print0 | xargs -0 java -jar tools/google-java-format-1.7-all-deps.jar --aosp --replace
