FROM openjdk:17-jdk-slim
LABEL author="gabrieljustino"

WORKDIR /app
COPY target/veiculos-gj-eureka-server-0.0.1-SNAPSHOT.jar /app/app.jar

EXPOSE 8761

ENTRYPOINT ["java","-jar","app.jar"]
