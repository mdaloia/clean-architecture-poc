# Clean Architecture - PoC



Se pueden ver algunos diagramas en [/docs](./docs)

Dudas
=====
- Cómo hace la View para obtener el HttpServletResponse para escribir el resultado: una opcion puede 
- Cómo organizar el model/entities para evitar duplicados entre casos de uso
- Inyeccion de dependencias (sin ensuciar caso de uso)

Notas
=====
- Las entities no tiene que estar atado a fwk de persistencia.
- Preferir inmutabilidad.
- Revisar nomenclatura de packages.
- Debido a la cantidad de clases involucradas creo que se hace necesario un generador de estructura.
