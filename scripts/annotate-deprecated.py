from __future__ import division, print_function

import argparse
import re

JAVADOC_START_RE = re.compile(r"^\s*/\*\*$")
COMMENT_RE = re.compile(r"^\s*\*")
DEPRECATED_RE = re.compile(r"^\s*\*\s+DEPRECATED:\s*(?P<message>.+)$")


def main(input_file):
    filename = input_file.name
    content = [line.rstrip() for line in input_file.readlines()]
    input_file.close()

    with open(filename, "wt") as result:
        javadoc_started = False
        obsolete_message = None

        for line in content:
            deprecated_match = DEPRECATED_RE.match(line)
            if javadoc_started and deprecated_match:
                # deprecation message found
                obsolete_message = "@Deprecated()"

            if javadoc_started and not COMMENT_RE.match(line):
                # comment section ended
                javadoc_started = False
                if obsolete_message:
                    if not line.lstrip().startswith("@Deprecated"):
                        result.write(obsolete_message + "\n")
                    obsolete_message = None

                    result.write(line + "\n")
                    continue

            if JAVADOC_START_RE.match(line):
                # comment section started
                javadoc_started = True

            result.write(line + "\n")


def parse_args():
    parser = argparse.ArgumentParser()
    parser.add_argument("input_file", type=argparse.FileType("rt"))
    args = parser.parse_args()
    return vars(args)


if __name__ == "__main__":
    main(**parse_args())
