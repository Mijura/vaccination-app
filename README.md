# vaccination-app


## Prerequests

Install Maven, Docker, and docker-compose

## RUN
1. Generate jar files 

Position terminal in the folder vaccination-services (parent module of java services) and execute command:

```bash
mvn clean package
```

2. Create external Docker network

Since we need a same network between two docker-compose files, we should create shared network for containers:

```bash
docker network create portal_net
```

3. Run ELK Stack for collecting, storing and displaying logs

Position terminal to the root folder (vaccination-app folder). Run the following command: 

```bash
docker-compose -f docker-compose-elk.yml up --build
```

Logs will be stored in Elasticsearch and they are visible on the Kibana dashboard (http://localhost:5601). The first time accessing to Kibana dashboard it will require creating the index pattern (*-service)

![image](https://user-images.githubusercontent.com/17992401/147994297-8276cf23-8ed5-4fe3-b45c-5ee87e82f9b9.png)

4. Run main docker-compose

Position terminal to the root folder (vaccination-app folder). Run the following command: 

```bash
docker-compose up --build
```

## Architecture

Microservices-based system consists of the following modules:

- **client** - a frontend part of the application written in Angular. After the docker-compose finishes with running services, the client application is available on http://localhost:4200. 
- **config-service** - a module that uses Spring Cloud Config Server for running configuration server. Configurations are stored in the separate Github Repository (https://github.com/Mijura/vaccination-app-config)
- **discovery-service** - a module that uses Spring Netflix Eureka for running discovery server. Overview of registered services is available on the Eureka dashboard (http://localhost:8761) ![image](https://user-images.githubusercontent.com/17992401/147994485-c88f2428-0234-4c6b-b8c7-cae026cd5307.png)

- **gateway-service** -  a module that uses Spring Cloud Gateway for running Spring Boot application that acts as a proxy/gateway in our architecture. URL http://localhost:8060/swagger-ui.html contains Swagger documentation for all inner services. ![image](https://user-images.githubusercontent.com/17992401/147994581-eb038146-e2d3-45da-a447-d79eb6b0be1c.png)

- **user-management-service** - a module that is responsible for securing the API and user management.
- **immunization-portal-service** - a core module that provides CRUD operations for immunization documents. 
- **mail-service** - a Spring Boot module that uses SendGrid for email delivery service. 
