FROM maven:latest


WORKDIR /aspose-barcode-cloud-java
COPY . .

ENTRYPOINT ["make", "publish-docker"]
