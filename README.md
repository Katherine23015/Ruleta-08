# Ruleta - Iteración 08
El foco principal de esta entrega es la implementación del **Principio de Inversión de Dependencias (DIP)** de SOLID y la separación de responsabilidades utilizando la arquitectura **Modelo-Vista-Controlador (MVC)**.

## Conceptos cxlaves:
- **Abstracción del Almacenamiento:** Se desacopla la persistencia de datos del núcleo del juego mediante la interfaz `IRepositorioResultados`.
- **Persistencia Múltiple:**
  - **Repositorio en Memoria:** Almacenamiento volátil utilizando colecciones en memoria RAM (`ArrayList`).
  - **Repositorio en Archivo (CSV):** Persistencia física que resguarda el historial de giros en un archivo de texto plano (`historial_ruleta.csv`) de forma transparente.
- **Inyección de Dependencias:** El componente del juego (`Ruleta`) y el componente de análisis (`Estadistica`) no conocen las implementaciones concretas, facilitando la mantenibilidad y escalabilidad del sistema.

## Estructura del Proyecto

El código fuente se encuentra organizado dentro de la carpeta `src/` bajo la siguiente arquitectura de paquetes:

```text
src/
│
├── controlador/
│   ├── Ruleta.java           # Lógica principal del juego (recibe el repositorio por constructor)
│   └── Estadistica.java      # Componente de visualización y procesamiento del historial
│
├── modelo/
│   ├── IRepositorioResultados.java  # Interfaz que define el contrato de persistencia
│   ├── RepositorioEnMemoria.java    # Implementación volátil de la interfaz
│   └── RepositorioArchivo.java      # Implementación física (Generación de archivo .csv)
│
└── Main.java                 # Punto de entrada de la aplicación (Inyector de dependencias)
