# Use Eclipse Temurin Java 21
FROM eclipse-temurin:21-jdk

# Set working directory inside the container
WORKDIR /app

# Copy the built jar into the container
COPY build/libs/spring-batch-practice-0.0.1-SNAPSHOT.jar app.jar

# Expose port 8080 (optional)
EXPOSE 8080

# Command to run the Spring Boot app
ENTRYPOINT ["java", "-jar", "app.jar"]
