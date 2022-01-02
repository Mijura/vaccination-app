FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY ./target/*.jar app.jar

ARG CONFIG_URL
ARG DISCOVERY_PORT

CMD java -jar /app.jar -DCONFIG_URL=${CONFIG_URL} -DDISCOVERY_PORT=${DISCOVERY_PORT}