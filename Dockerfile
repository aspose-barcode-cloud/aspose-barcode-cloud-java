FROM maven:latest
RUN apt-get update \
    && apt-get install -y make \
    && rm -rf /var/lib/apt/lists/*

WORKDIR /aspose-barcode-cloud-java
COPY . .

ENTRYPOINT ["make", "publish-docker"]
