SRC=./src

.PHONY: all
all: format test

.PHONY: fix
fix:
	find $(SRC) -type f -iname 'RegionPoint.java' -exec sed -i -e 's_@SerializedName(value = "\(X\|Y\)"_@SerializedName(value = "\l\1"_g' '{}' \;

.PHONY: format
format: fix
	find ./src -iname "*.java" | xargs java -jar tools/google-java-format-1.8-all-deps.jar --aosp --replace
# Repeat for consistent formatting
	find ./src -iname "*.java" | xargs java -jar tools/google-java-format-1.8-all-deps.jar --aosp --replace

.PHONY: format_tests
format_tests:
	find $(SRC)/test -iname "*.java" | xargs java -jar tools/google-java-format-1.8-all-deps.jar --aosp --replace

.PHONY: test
test:
	mvn -B package --file pom.xml

.PHONY: run
run:
	mvn clean compile exec:java -Dexec.mainClass="com.aspose.barcode.cloud.examples.Main"
