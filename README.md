# Private Review Backend

Backend Spring Boot para una app de resenas privadas por grupos, con arquitectura hexagonal, seguridad por defecto y moderacion privada.

## Arquitectura
- Hexagonal (Ports & Adapters)
- Dominio aislado de infraestructura
- Casos de uso como servicios de aplicacion

## Stack
- Java + Spring Boot
- JDBC (PostgreSQL/MySQL por definir)
- OAuth2 (Google, Apple, Facebook)
- Docker
- GitHub Actions

## Documentacion
Los documentos base del proyecto estan en `docs/`.

## Inicio rapido
Requisitos:
- Java 17+
- Docker (opcional para DB local)

Pasos:
1. Configura variables de entorno desde `.env.example` cuando exista.
2. Ejecuta la app con `./mvnw spring-boot:run`.

## Notas
Este repo contiene solo el backend. El frontend vive en un repo separado.
