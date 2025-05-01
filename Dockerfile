FROM openjdk:21

# Create app directory
WORKDIR /app

# Copy Java source files
COPY src /app/src

# Compile all Java files
RUN javac src/*.java

# Run the Main class using correct classpath
CMD ["java", "-cp", "src", "Main"]

