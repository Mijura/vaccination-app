FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY ./target/*.jar app.jar

ARG CONFIG_URL
ARG DISCOVERY_URL
ARG IMMUNIZATION_PORTAL_PORT

CMD java -jar /app.jar -DCONFIG_URL=${CONFIG_URL} -DDISCOVERY_URL=${DISCOVERY_URL} -DIMMUNIZATION_PORTAL_PORT=${IMMUNIZATION_PORTAL_PORT}