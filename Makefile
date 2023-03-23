SRC=./src

.PHONY: all
all: format test

.PHONY: fix
fix:
	./scripts/fix-region-point.bash

.PHONY: format
format:
	./scripts/format.bash

.PHONY: test
test:
	mvn test

.PHONY: publish-docker
publish-docker:
	mvn deploy

.PHONY: update
update:
	mvn versions:use-latest-releases

.PHONY: after-gen
after-gen: fix format
