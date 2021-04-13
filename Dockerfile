FROM openjdk:15-alpine AS build
COPY src home/viktorsidiak/IdeaProjects/Customer/src
COPY pom.xml home/viktorsidiak/IdeaProjects/IntecaProject/Customer

FROM openjdk:15-alpine
COPY target/Customer-0.0.1-SNAPSHOT.jar Customer-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "Customer-0.0.1-SNAPSHOT.jar"]