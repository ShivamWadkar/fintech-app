# strat with a base image containing Java runtime
FROM openjdk:17-jdk-slim

MAINTAINER shivamwadkar

# take jar from target and copy same to generate docker image
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

# execute the application
ENTRYPOINT ["java", "-jar", "accounts-0.0.1-SNAPSHOT.jar"]
