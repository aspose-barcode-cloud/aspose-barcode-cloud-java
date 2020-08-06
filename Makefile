SRC=./src

.PHONY: all
all: format build test

.PHONY: fix
fix:
	find $(SRC) -type f -iname 'RegionPoint.java' -exec sed -i -e 's_@SerializedName(value = "\(X\|Y\)"_@SerializedName(value = "\l\1"_g' '{}' \;

.PHONY: format
format: fix
	find $(SRC) -iname "*.java" -exec java -jar tools/google-java-format-1.8-all-deps.jar --aosp --replace {} \;

.PHONY: format_tests
format_tests:
	find $(SRC)/test -iname "*.java" -exec java -jar tools/google-java-format-1.8-all-deps.jar --aosp --replace {} \;

.PHONY: build
build:
	mvn compile

.PHONY: test
test:
	mvn test
