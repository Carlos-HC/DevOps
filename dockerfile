FROM openjdk:17-jdk-alpine
MAINTAINER baeldung.com
COPY /home/svcgithub/actions-runner/_work/DevOps/DevOps/build/libs/DevOops-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]