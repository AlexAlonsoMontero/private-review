# Epicas y backlog inicial

## Epica: Acceso y cuenta
- Definir flujo OAuth2 social (Google, Apple, Facebook).
- Gestion de sesiones y refresco de tokens.
- Perfil basico editable (nombre, foto).
- Preferencias de notificacion por usuario.

## Epica: Grupos y miembros
- Crear grupo con nombre y estado.
- Generar invitaciones por enlace.
- Aceptar o rechazar invitacion.
- Salir de grupo.
- Control de acceso por pertenencia.

## Epica: Lugares
- Busqueda por nombre y ubicacion.
- Filtros por sector (10 categorias).
- Ficha de lugar con informacion basica.
- Vinculo con proveedor de mapas.

## Epica: Resenas
- Crear resena con puntuacion y comentario.
- Listar resenas por grupo.
- Editar y borrar resenas propias.
- Marcar fecha de actualizacion.

## Epica: Moderacion y reportes
- Reportar resena o lugar con motivo.
- Cola de reportes para moderador privado.
- Resolucion de reportes con estado.
- Auditoria basica de decisiones.

## Epica: Notificaciones
- Notificaciones push por nueva resena.
- Ajuste de activacion y desactivacion.

## Epica: Seguridad y privacidad
- Control de acceso por grupo.
- Politica de datos agregados.
- Flujo de derecho al olvido.

## Backlog tecnico detallado

### Acceso y cuenta
- Configurar proveedores OAuth2 en backend.
- Endpoint de login social y mapeo de perfil.
- Persistencia de sesion y refresco.
- Pantalla de login en web y movil.
- Pantalla de perfil con edicion.

### Grupos y miembros
- Endpoint crear grupo.
- Endpoint listar grupos del usuario.
- Endpoint generar invitacion.
- Endpoint aceptar/rechazar invitacion.
- Endpoint salir de grupo.
- UI de grupos e invitaciones.

### Lugares
- Endpoint buscar lugares por texto y ubicacion.
- Endpoint listar sectores.
- Integracion con proveedor de mapas.
- UI de busqueda y ficha de lugar.

### Resenas
- Endpoint crear resena.
- Endpoint listar resenas por grupo.
- Endpoint editar resena propia.
- Endpoint borrar resena propia.
- UI de detalle y listado.

### Moderacion y reportes
- Endpoint reportar contenido.
- Endpoint listar reportes para moderador.
- Endpoint resolver reporte.
- UI de reporte y panel moderador.

### Notificaciones
- Endpoint guardar preferencias.
- Integracion push (FCM u OneSignal).
- Emision de notificacion por nueva resena.
- UI de ajustes de notificaciones.

### Seguridad y privacidad
- Middleware de autorizacion por grupo.
- Auditoria basica de acciones de moderacion.
- Exportacion y borrado de datos del usuario.
