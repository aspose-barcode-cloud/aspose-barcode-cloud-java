FROM maven:latest


WORKDIR /aspose-barcode-cloud-java
COPY . .

ENTRYPOINT [ "mvn", "deploy" ]
