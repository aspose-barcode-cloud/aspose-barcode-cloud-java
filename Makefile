SRC=./src

.PHONY: all
all: format test

.PHONY: fix
fix:
	./scripts/fix-region-point.bash

.PHONY: format
format: fix
	./scripts/format.bash

.PHONY: format_tests
format_tests:
	find $(SRC)/test -iname "*.java" | xargs java -jar tools/google-java-format-1.9-all-deps.jar --aosp --replace

.PHONY: test
test:
	mvn test

.PHONY: publish-docker
publish-docker:
	mvn deploy

.PHONY: update
update:
	mvn versions:use-latest-releases
