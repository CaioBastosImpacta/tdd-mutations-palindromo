FROM openjdk:11-slim
ARG JAR_FILE=build/libs/*.jar
COPY /target/tdd-mutations*.jar app.jar
EXPOSE 5005
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]