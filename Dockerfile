FROM maven:3.8
RUN apt-get update \
    && apt-get install -y make \
    && rm -rf /var/lib/apt/lists/*

WORKDIR /aspose-barcode-cloud-java

# Resolve some dependencies
# Due to https://issues.apache.org/jira/browse/MDEP-82
# MVN can't resolve ALL dependencies before build
COPY ./pom.xml .
RUN mvn -Dmaven.repo.local=./.cache dependency:go-offline -B

# Build the package
COPY . .
RUN mvn -Dmaven.repo.local=./.cache clean install -Dmaven.test.skip=true

# Publish package
ENTRYPOINT ["mvn", "deploy"]
