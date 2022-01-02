# vaccination-app


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

## Architecture

Microservices-based system consists of the following modules:

- **client** - a frontend part of the application written in Angular. After the docker-compose finishes with running services, the client application is available on http://localhost:4200. 
- **config-service** - a module that uses Spring Cloud Config Server for running configuration server. Configurations are stored in the separate Github Repository (https://github.com/Mijura/vaccination-app-config)
- **discovery-service** - a module that uses Spring Netflix Eureka for running discovery server. Overview of registered services is available on the Eureka dashboard (http://localhost:8761) 
- **gateway-service** -  a module that uses Spring Cloud Gateway for running Spring Boot application that acts as a proxy/gateway in our architecture.
- **user-management-service** - a module that is responsible for securing the API and user management.
- **immunization-portal-service** - a core module that provides CRUD operations for immunization documents. 
- **mail-service** - a Spring Boot module that uses SendGrid for email delivery service. 
