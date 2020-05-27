FROM openjdk:8u252
MAINTAINER sankar
WORKDIR /opt
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]