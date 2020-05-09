FROM openjdk:8-alpine

RUN apk update
RUN apk add  maven
COPY pom.xml /usr/local/calculator/pom.xml
COPY src /usr/local/calculator/src
WORKDIR /usr/local/calculator
RUN mvn package
CMD ["java","-cp","target/devops_calculator-1.0-SNAPSHOT.jar","calculator.devops_calculator.App"]
