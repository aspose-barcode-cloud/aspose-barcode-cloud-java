#!/bin/bash

set -euo pipefail

FILE_PATH=$1;
RUN_DIR=$2
SCRIPT_DIR=$3
CONFIG_FILE_PATH=$4
echo "Run snippet file: $FILE_PATH"

python ${SCRIPT_DIR}/insert-credentials.py $FILE_PATH $CONFIG_FILE_PATH $RUN_DIR

java -cp "./$RUN_DIR/target/classes:./$RUN_DIR/target/lib/*" ./$RUN_DIR/Snippet.java || exit 1