# Seguridad y privacidad

## Modelo de acceso
- Solo miembros del grupo pueden ver resenas del grupo.
- El moderador privado accede solo a contenido reportado.
- Los roles se gestionan por grupo y por permisos del sistema.

## Reglas de autorizacion
- Solo miembros activos pueden crear o ver resenas en un grupo.
- Solo el autor puede editar o borrar su resena.
- Un grupo desactivado no permite nuevas resenas ni invitaciones.
- El moderador privado solo accede a contenido reportado y metadatos minimos.

## Cifrado y transporte
- HTTPS obligatorio.
- Tokens firmados para sesion (JWT).

## Datos personales
- Recoger solo datos minimos necesarios.
- No compartir datos personales con terceros.

## Moderacion
- Los reportes generan un flujo de revision.
- Se registra auditoria basica de decisiones.

## Flujo de moderacion
- Reporte creado por usuario con motivo.
- Cola privada para moderador.
- Resolucion con estados: abierto, en_revision, resuelto, rechazado.
- Registro de decision con fecha y responsable.

## Cumplimiento
- Preparado para RGPD/GDPR: derecho al olvido y exportacion de datos.

## Retencion y borrado
- Retencion de logs y auditoria limitada por necesidad legal.
- Borrado de datos personales bajo solicitud del usuario.
