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
	sed -i -e 's_<url>https://repository.aspose.cloud/repo</url>_<url>http://repository.aspose.cloud/repo</url>_' pom.xml
	mvn deploy

.PHONY: update
update:
	mvn versions:use-latest-releases
