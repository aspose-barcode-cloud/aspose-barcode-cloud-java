#!/bin/bash
set -euo pipefail

sed -n '/^```java/,/^```/ p' < README.md | sed '/^```/ d'
