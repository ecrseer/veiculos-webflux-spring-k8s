FROM openjdk:17-jdk-slim
LABEL author="gabrieljustino"

WORKDIR /app
COPY target/veiculos-k8s-gj-spring-0.0.1-SNAPSHOT.jar /app/app.jar

EXPOSE 8042

ENTRYPOINT ["java","-jar","app.jar"]
