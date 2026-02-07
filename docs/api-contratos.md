# Contratos de API (borrador)

## Convenciones
- Respuestas de error: { code, message, details? }
- Campos requeridos: marcados como obligatorios en Request.
- Paginacion: usar limit y cursor cuando aplique.

## Autenticacion

### POST /auth/social
- Descripcion: iniciar sesion con proveedor social.
- Request:
  - provider: google | apple | facebook (obligatorio)
  - token: string (obligatorio)
- Response:
  - accessToken
  - refreshToken
  - user
 - Errores:
  - 400 invalid_provider
  - 401 invalid_token

## Grupos

### POST /groups
- Descripcion: crear grupo.
- Request:
  - name (obligatorio, 3-60 chars)
- Response:
  - group
 - Errores:
  - 400 validation_error

### GET /groups
- Descripcion: listar grupos del usuario.
- Response:
  - groups[]

### POST /groups/{groupId}/invites
- Descripcion: generar invitacion.
- Response:
  - inviteLink
 - Errores:
  - 403 not_group_member
  - 409 group_inactive

### POST /groups/{groupId}/invites/accept
- Descripcion: aceptar invitacion.
- Response:
  - membership
 - Errores:
  - 404 invite_not_found
  - 409 invite_already_used

### POST /groups/{groupId}/leave
- Descripcion: salir del grupo.
- Response:
  - status
 - Errores:
  - 404 membership_not_found

## Lugares

### GET /places/search
- Descripcion: buscar lugares.
- Query:
  - q (opcional)
  - lat, lng (opcional, ambos requeridos si se usa ubicacion)
  - sector (opcional, 10 categorias)
  - limit (opcional, max 50)
- Response:
  - places[]

### GET /places/{placeId}
- Descripcion: ver ficha del lugar.
- Response:
  - place

## Resenas

### POST /groups/{groupId}/reviews
- Descripcion: crear resena.
- Request:
  - placeId (obligatorio)
  - rating (obligatorio, 1-5)
  - comment (obligatorio, 10-1000 chars)
- Response:
  - review
 - Errores:
  - 403 not_group_member
  - 409 group_inactive

### GET /groups/{groupId}/reviews
- Descripcion: listar resenas del grupo.
- Response:
  - reviews[]
 - Errores:
  - 403 not_group_member

### PUT /reviews/{reviewId}
- Descripcion: editar resena propia.
- Request:
  - rating (opcional, 1-5)
  - comment (opcional, 10-1000 chars)
- Response:
  - review
 - Errores:
  - 403 not_review_owner
  - 404 review_not_found

### DELETE /reviews/{reviewId}
- Descripcion: borrar resena propia.
- Response:
  - status
 - Errores:
  - 403 not_review_owner
  - 404 review_not_found

## Moderacion

### POST /reports
- Descripcion: reportar resena o lugar.
- Request:
  - type: review | place (obligatorio)
  - referenceId (obligatorio)
  - reason (obligatorio, 5-300 chars)
- Response:
  - report
 - Errores:
  - 400 validation_error
  - 404 reference_not_found

### GET /moderation/reports
- Descripcion: listar reportes para moderador.
- Response:
  - reports[]
 - Errores:
  - 403 forbidden

### POST /moderation/reports/{reportId}/resolve
- Descripcion: resolver reporte.
- Request:
  - status (obligatorio: abierto | en_revision | resuelto | rechazado)
- Response:
  - report
 - Errores:
  - 403 forbidden
  - 404 report_not_found

## Notificaciones

### GET /users/me/notification-preferences
- Descripcion: obtener preferencias.
- Response:
  - preferences

### PUT /users/me/notification-preferences
- Descripcion: actualizar preferencias.
- Request:
  - reviewNotificationsEnabled (obligatorio, boolean)
- Response:
  - preferences

## Perfil

### GET /users/me
- Descripcion: obtener perfil.
- Response:
  - user

### PUT /users/me
- Descripcion: editar perfil.
- Request:
  - name (opcional, 2-60 chars)
  - photoUrl (opcional, URL valida)
- Response:
  - user
 - Errores:
  - 400 validation_error
