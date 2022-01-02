# vaccination-app

## Services

###### client
###### config-service
###### discovery-service
###### gateway-service
###### user-management-service

## Prerequests

Install Maven, Docker, and docker-compose

## RUN
1. Generate jar files 

```bash
mvn clean package
```

2. Run docker-compose

```bash
docker-compose up --build
```

After the docker-compose finishes with running services, the client application is available on http://localhost:4200. Overview of backend services is available on the Eureka dashboard (http://localhost:8761)
