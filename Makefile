SRC=./src

.PHONY: all
all: format build test lint

.PHONY: fix
fix:
	./scripts/fix-region-point.bash
	./scripts/annotate-deprecated.bash

.PHONY: format
format:
	./scripts/format.bash

.PHONY: lint
lint:
	./scripts/checkstyle.bash

.PHONY: build
build:
	mvn compile -Dmaven.test.skip=true

.PHONY: test
test:
	mvn test

.PHONY: display-updates
display-updates:
	mvn versions:display-plugin-updates versions:display-dependency-updates

.PHONY: update
update:
	mvn versions:update-properties

.PHONY: insert-example
insert-example:
	./scripts/insert-example.bash

.PHONY: after-gen
after-gen: fix format insert-example
