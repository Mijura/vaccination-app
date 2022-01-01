FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY ./target/*.jar app.jar

ARG CONFIG_PORT

CMD java -jar /app.jar -DPORT=${CONFIG_PORT}