FROM maven:3-eclipse-temurin-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17-jdk-slim
COPY target/flipkart-0.0.1-SNAPSHOT.jar flipkart.jar
EXPOSE 8088
ENTRYPOINT ["java","-jar","flipkart.jar"]