# Base Alpine Linux based image with OpenJDK JRE only
FROM maven:3.6.3-jdk-8
WORKDIR /auto
COPY pom.xml .

RUN mvn clean package
COPY src src
ENTRYPOINT ["mvn", "test"]
