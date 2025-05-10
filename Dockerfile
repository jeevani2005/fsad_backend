FROM eclipse-temurin:21-jdk

# Set working directory
WORKDIR /app

# Copy everything to container
COPY . .

# Build the project
RUN ./mvnw clean package -DskipTests

# Run the JAR file
CMD ["java", "-jar", "target/JobPortalS21-0.0.1-SNAPSHOT.jar"]
