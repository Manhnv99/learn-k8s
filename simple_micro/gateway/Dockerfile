# Stage 1: Build Stage
FROM maven:3.9.4-eclipse-temurin-17 as builder

WORKDIR /app

# Copy Maven's dependency descriptor files
COPY pom.xml ./
COPY src ./src

# Install dependencies and build the application
RUN mvn clean package -DskipTests

# Stage 2: Runtime Stage
FROM eclipse-temurin:17

WORKDIR /app

# Copy the JAR file from the build stage
COPY --from=builder /app/target/*.jar /app/app.jar

# Command to run the Spring Boot application
CMD ["java", "-jar", "app.jar"]