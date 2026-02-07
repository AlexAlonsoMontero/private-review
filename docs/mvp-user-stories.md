# Historias de usuario del MVP

## Acceso y cuenta

- Como usuario, quiero registrarme e iniciar sesion con Google, Apple o Facebook para acceder rapidamente a la app.
  - Criterios de aceptacion:
    - Se puede iniciar sesion con al menos un proveedor social.
    - Se solicita consentimiento para datos basicos de perfil.
    - La sesion persiste entre aperturas.
  - Flujo basico:
    - Abrir app, seleccionar proveedor, completar permiso, entrar a la app.

## Grupos

- Como usuario, quiero crear un grupo privado para compartir resenas con mi circulo cercano.
  - Criterios de aceptacion:
    - El grupo tiene nombre y creador.
    - El creador puede activar o desactivar el grupo.
  - Flujo basico:
    - Crear grupo, confirmar nombre, aparecer en lista de grupos.

- Como usuario, quiero invitar a personas a mi grupo para compartir resenas.
  - Criterios de aceptacion:
    - Se genera invitacion por enlace o sistema de compartir.
    - La invitacion puede ser aceptada o rechazada.
  - Flujo basico:
    - Seleccionar grupo, invitar, enviar enlace, destinatario acepta.

- Como usuario, quiero aceptar una invitacion a un grupo para ver sus resenas.
  - Criterios de aceptacion:
    - La aceptacion agrega al usuario como miembro.
    - Solo miembros pueden ver contenido del grupo.
  - Flujo basico:
    - Abrir enlace, confirmar, entrar al grupo.

- Como usuario, quiero salir de un grupo para dejar de ver sus resenas.
  - Criterios de aceptacion:
    - Al salir, dejo de ver el contenido del grupo.
    - No puedo volver sin nueva invitacion.
  - Flujo basico:
    - Entrar a ajustes del grupo, salir, confirmar.

## Lugares

- Como usuario, quiero buscar lugares para crear o consultar resenas.
  - Criterios de aceptacion:
    - Se puede buscar por nombre y ubicacion.
    - Se puede filtrar por sector (restaurantes, cafeterias, bares, supermercados, tiendas, salud, belleza, servicios, ocio, otros).
    - Se listan lugares con informacion basica.
  - Flujo basico:
    - Buscar, filtrar por sector, abrir ficha del lugar.

## Resenas

- Como usuario, quiero publicar una resena en mi grupo para compartir mi experiencia.
  - Criterios de aceptacion:
    - La resena incluye puntuacion, comentario y lugar.
    - La resena queda visible solo para miembros del grupo.
  - Flujo basico:
    - Seleccionar grupo, elegir lugar, escribir resena, publicar.

- Como usuario, quiero editar o borrar mis resenas para corregirlas o eliminarlas.
  - Criterios de aceptacion:
    - Solo el autor puede editar o borrar su resena.
    - La edicion actualiza el contenido y fecha de ultima modificacion.
  - Flujo basico:
    - Abrir resena propia, editar o borrar, confirmar.

- Como usuario, quiero ver las resenas de mi grupo para decidir mejor.
  - Criterios de aceptacion:
    - Solo se muestran resenas del grupo actual.
    - Se muestra autor, fecha y puntuacion.
  - Flujo basico:
    - Entrar al grupo, ver lista, abrir detalle de resena.

## Moderacion y reportes

- Como usuario, quiero reportar una resena o lugar para que se revise.
  - Criterios de aceptacion:
    - Se puede reportar con un motivo.
    - El contenido reportado queda marcado para revision.
  - Flujo basico:
    - Abrir resena o lugar, reportar, elegir motivo.

- Como moderador privado, quiero revisar contenido reportado para tomar una decision.
  - Criterios de aceptacion:
    - Solo veo contenido reportado.
    - Puedo resolver el reporte con un estado.
  - Flujo basico:
    - Abrir cola de reportes, revisar, resolver.

## Notificaciones

- Como usuario, quiero recibir notificaciones cuando alguien publique en mi grupo.
  - Criterios de aceptacion:
    - Se recibe notificacion push cuando hay nueva resena.
    - Se puede activar o desactivar desde ajustes.
  - Flujo basico:
    - Ajustes, activar o desactivar, guardar.

## Ajustes basicos

- Como usuario, quiero editar mi perfil para gestionar mi identidad en la app.
  - Criterios de aceptacion:
    - Puedo cambiar nombre y foto.
    - Los cambios se reflejan en futuras resenas.
  - Flujo basico:
    - Abrir perfil, editar, guardar.
