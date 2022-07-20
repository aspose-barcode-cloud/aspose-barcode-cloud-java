#!/bin/bash
#
# Put @SerializedName value to lower case for 'X' and 'Y'
# This issue can't be solved on swagger side
#
set -euo pipefail

find ./src -type f -iname 'RegionPoint.java' -exec sed -i -e 's_@SerializedName(value = "\(X\|Y\)"_@SerializedName(value = "\l\1"_g' '{}' \;
