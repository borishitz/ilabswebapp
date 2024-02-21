# Stage 1: Build the application
FROM maven:3.9.4-openjdk-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean install

# Stage 2: Run the application
FROM openjdk:17-alpine
WORKDIR /app
COPY --from=build /app/target/noah-sark-next2-0.0.1-SNAPSHOT.jar ./demo-aws.jar
EXPOSE 8080
CMD ["java", "-jar", "demo-aws.jar"]