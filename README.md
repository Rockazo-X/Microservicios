# Microservicios
Repositorio con conceptos base para creación de micro-servicios.

## Introducción
Cuando las soluciones informaticas, crecen en complejidad, tamaño, requerimientos u otro aspecto, estas terminan volviendose sistemas complejos, los cuales y segun las formas tradicionales de desarrollo se vuelven bastante dificil de mantener, de actualizar, dificultando su comprension, y en el peor de lo casos puede relentizar todo proceso asociado tanto al desarrollo como a su mantenibilidad y rendimiento. Para ello, se propone la idea de microservicios.

Los microservicios nacen de la necesidad de facilitar el desarrollo de sistemas complejos, mediante una arquitectura orientada a servicios (SOA), así, estos microservicios se encargan de modularizar una gran solución, en soluciones mas pequeñas y específicas. Lo cual trae una serie de beneficios, permitira que cada módulo interactue con una base de datos más pequeña, sin dejar de perder la transaccionabilidad entre distintas bases de datos que puedan existir. Cada microservicio, se hara cargo de un módulo en particular de un gran aplicativo, lo cual lo hara más facil a la hora de mantener, mejorar o actualizar. Si desea agregar nuevas funcionalidades a un sistema, entonces bastara con extender la funcionalidad de un microservicio ya creado para ese fin, o bien crear un nuevo microservicio, permitiendo que el sistema sea completamente escalable.

## Beneficios

Las principales caracteristicas y/o beneficios de un microservicio son:

- Realizan una tarea específica, pero la realizan perfectamente.
- Son completamente reutilizables
- Permiten que un sistema sea escalable
- Manejan y controla su propia lógica de negocio
- Controlan su propia base de datos
- Son mucho más facil de mantener
- Se pueden comunicar entre ellos
- Pueden ser llamados desde distintos lenguajes
- Los microservicios pueden desacoplarse completamente de un sistema
