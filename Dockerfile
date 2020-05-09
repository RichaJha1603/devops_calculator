
From java:8
COPY target/devops_calculator-1.0-SNAPSHOT.jar /tmp/
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "devops_calculator-1.0-SNAPSHOT.jar"]
