FROM eclipse-temurin:latest
WORKDIR /app
COPY target/trabalho-0.0.1-SNAPSHOT.jar trabalho.jar
EXPOSE 8080
CMD ["java", "-jar", "trabalho.jar"]