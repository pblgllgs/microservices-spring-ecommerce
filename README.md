# Microservices

## Environments Variables

Copy __.env.template__ and rename to __.env__ and complete fields.

```$bash
Example:

TAG=0.0.1
```

## DBs.
```$bash
postgres-order
postgres-inventory
mongo-products
```

## Microservices
```$bash
api-gateway
notification-service
discovery-client
order-service
intentory-service
product-service
```

## Run compose.

```$bash
docker compose -f docker-compose.prod.yaml up -d
```

## Crate DB  in mongo

name = product-service

## Login registry-1.docker.io for google jib
```$bash
docker login registry-1.docker.io
```

## Keycloak config

### Config

```$bash
Add realm -> "spring-boot-microservices-realm"

Clients -> Create -> Client ID -> "spring-cloud-client"
```

## Postman config

### Config

```$bash
Authorization->Type->OAuth2->Configure New Token:
-Grant Type: crendetials
-Access Token URL: http://keycloak:8080/realms/spring-boot-microservices-realm/protocol/openid-connect/token
-Client ID: spring-cloud-client
-Client Secret: CLIENT_SECRET_BY_KEYCLOK
-Scope: openid offline_access
-Client Authentication: Send as Basic Auth header
->Get New Access Token->Prosed->Use Token->Send
```