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