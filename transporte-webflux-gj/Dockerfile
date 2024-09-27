FROM openjdk:17-jdk-slim
LABEL author="gabrieljustino"

WORKDIR /app
COPY target/transporte-webflux-gj-0.0.1-SNAPSHOT.jar /app/app.jar

EXPOSE 8042

ENTRYPOINT ["java","-jar","app.jar"]
