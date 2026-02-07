# Arquitectura

## Estilo
Arquitectura hexagonal (Ports & Adapters). El dominio no depende de infraestructura. Las dependencias apuntan hacia adentro.

## Modulos de dominio
- Identidad y acceso
- Grupos y miembros
- Lugares
- Resenas
- Reportes y moderacion
- Notificaciones

## Casos de uso principales
- Crear grupo, invitar y gestionar miembros.
- Buscar lugares y filtrar por sector.
- Publicar, editar y borrar resenas.
- Reportar contenido y resolver reportes.
- Gestionar preferencias de notificaciones.

## Capas

### Dominio
- Entidades y reglas de negocio.
- Casos de uso (aplicacion) definidos como servicios.

### Puertos
- Puertos de entrada: interfaces para casos de uso.
- Puertos de salida: repositorios, mensajeria, notificaciones, mapas, autenticacion externa.

### Adaptadores
- Web/API: controladores REST.
- Persistencia: repositorios JDBC.
- Integraciones: login social, mapas, notificaciones push.

## Puertos de salida (detalle)
- UsuarioRepository
- GrupoRepository
- MiembroGrupoRepository
- LugarRepository
- ResenaRepository
- ReporteRepository
- PreferenciasNotificacionRepository
- MapaProviderPort
- NotificacionPushPort
- AuthSocialPort

## Adaptadores sugeridos
- REST Controllers (Spring MVC)
- JDBC Repositories
- Integracion OAuth2 (Google, Apple, Facebook)
- Proveedor de mapas (OpenStreetMap o similar)
- Proveedor de notificaciones (FCM u OneSignal)

## Reglas de dependencia
- Dominio no importa infraestructura.
- Adaptadores dependen de puertos.
- Casos de uso dependen de puertos de salida.

## Seguridad
- HTTPS obligatorio en todos los endpoints.
- Cifrado en transito y proteccion de datos sensibles.

## Observabilidad
- Logging con Spring Boot.
- Metricas basicas para uso y errores.
