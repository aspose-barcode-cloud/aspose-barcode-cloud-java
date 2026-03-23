FROM maven:3-amazoncorretto-11-debian
RUN apt-get update \
    && apt-get install -y make \
    && rm -rf /var/lib/apt/lists/*

WORKDIR /aspose-barcode-cloud-java

COPY . .

ENTRYPOINT ["mvn", "deploy", "-Dmaven.test.skip=true"]
