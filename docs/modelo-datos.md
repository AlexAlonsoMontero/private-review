# Modelo de datos (borrador)

## Entidades principales

- Usuario
  - id, nombre, email, foto, estado, fechaAlta, fechaBaja
- Grupo
  - id, nombre, creadorId, activo, fechaCreacion
- MiembroGrupo
  - id, grupoId, usuarioId, rol, estado, fechaAlta
- Lugar
  - id, nombre, categoria, ubicacion, proveedor, externoId
- Resena
  - id, grupoId, usuarioId, lugarId, puntuacion, comentario, fechaCreacion, fechaActualizacion
- Reporte
  - id, tipo, referenciaId, motivo, estado, creadoPor, fechaCreacion, resueltoPor, fechaResolucion
- PreferenciasNotificacion
  - id, usuarioId, notificacionesResenasActivas

## Relaciones clave
- Un usuario puede crear varios grupos.
- Un grupo tiene varios miembros.
- Una resena pertenece a un grupo y a un lugar.
- Los reportes pueden apuntar a resenas o lugares.

## Invariantes
- Solo miembros pueden ver resenas del grupo.
- Una resena solo existe dentro de un grupo.
- Un grupo puede desactivarse, bloqueando nuevas resenas.
- Solo el autor puede editar o borrar su resena.
- El moderador privado solo accede a contenido reportado.

## Indices sugeridos
- Resena: grupoId, lugarId, fechaCreacion
- MiembroGrupo: grupoId, usuarioId
- Reporte: estado, fechaCreacion

## Privacidad
- La visibilidad esta limitada por pertenencia al grupo.
- El moderador privado solo accede a contenido reportado.
