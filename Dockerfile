# Use OpenJDK image
FROM openjdk:17-alpine

# Set working directory
WORKDIR /app

# Copy your jar file into the image (replace app.jar with your actual jar name)
COPY target/app.jar app.jar

# Expose the port your app runs on (change if needed)
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]
