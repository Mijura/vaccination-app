FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY ./target/*.jar app.jar

ARG CONFIG_HOST
ARG CONFIG_PORT

CMD java -jar /app.jar -DCONFIG_URI=${CONFIG_HOST}:${CONFIG_PORT}