FROM openjdk:17-jdk-slim
VOLUME /temp
EXPOSE 8080
ARG JAR FILE=target/user-registration-service.jar
ADD ${JAR_FILE} userregistrations.jar
ENTRYPOINT [ "java","-jar","/userregistration.jar" ]