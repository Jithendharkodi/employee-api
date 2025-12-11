# Step 1: Use a Java runtime as base image
FROM eclipse-temurin:17-jdk-alpine

# Step 2: Set working directory inside container
WORKDIR /app

# Step 3: Copy the built jar file into the container
COPY target/employee-api-1.0.0.jar employee-api.jar

# Step 4: Expose the port your app runs on
EXPOSE 8080

# Step 5: Command to run the Spring Boot app
ENTRYPOINT ["java","-jar","employee-api.jar"]
