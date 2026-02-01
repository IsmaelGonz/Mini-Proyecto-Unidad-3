# Mini Proyecto Unidad 3 – Problema de las 9 Reinas

## Asignatura
Estructura de Datos  
Carrera de Computación – FEIRNNR

## Unidad
Unidad 3

---

## Autores
- **Mateo Fabián Silva Aguilar**
- **Ariel Ismael González Astudillo**

---

## Objetivo
Aplicar la técnica de búsqueda en profundidad con retroceso (backtracking) para resolver el problema clásico de las 9 reinas, fortaleciendo el razonamiento algorítmico y la validación de restricciones.

---

## Descripción del problema
El problema de las 9 reinas consiste en colocar nueve reinas en un tablero de ajedrez de 9×9 de manera que ninguna de ellas se ataque entre sí.  
Esto implica que no pueden compartir la misma fila, columna ni diagonales.

Dado que el número de configuraciones posibles es muy elevado, una solución por fuerza bruta resulta ineficiente. Por esta razón, se emplea el algoritmo de **backtracking**, el cual permite descartar configuraciones inválidas de forma temprana.

---

## Enfoque del algoritmo
El algoritmo utiliza **búsqueda en profundidad con retroceso**, avanzando fila por fila:

- Cada fila contiene exactamente una reina.
- En cada fila se prueban todas las columnas posibles.
- Antes de colocar una reina se validan las restricciones:
    - No compartir columna con otra reina.
    - No compartir diagonales.
- Si no es posible continuar, el algoritmo retrocede y prueba una nueva alternativa.

El proceso se detiene al encontrar la primera solución válida.

---

## Métricas del algoritmo
Durante la ejecución se registran las siguientes métricas:

- **Intentos realizados**: cantidad de veces que el algoritmo intenta colocar una reina en una posición.
- **Retrocesos realizados**: número de veces que el algoritmo deshace una decisión al no poder continuar.

Estas métricas permiten analizar el comportamiento y la eficiencia del algoritmo de backtracking.

---

## Requisitos de ejecución
- Java JDK (OpenJDK)
- IntelliJ IDEA Community
- Sistema operativo Windows, Linux o macOS

---

## Ejecución
1. Abrir el proyecto en IntelliJ IDEA.
2. Ejecutar la clase `Main`.
3. Observar la solución generada y las métricas mostradas en consola.

---

## Estructura del proyecto
```
src
├── app
│ └── Main.java
└── model
├── Tablero.java
└── SolverReinas.java
```

- **Main**: gestiona la ejecución del programa.
- **Tablero**: representa el estado del tablero y valida las restricciones.
- **SolverReinas**: implementa el algoritmo de backtracking.

---

## Conclusiones
El algoritmo de backtracking permite resolver el problema de las 9 reinas de forma eficiente, evitando explorar configuraciones inválidas.  
La validación temprana de restricciones reduce significativamente el espacio de búsqueda.  
Además, la organización del código en clases mejora la claridad, mantenibilidad y comprensión del proyecto.

---

## Bibliografía
- Cormen, T. H., et al. *Introduction to Algorithms*. MIT Press, 2022.
- Weiss, M. A. *Data Structures and Algorithm Analysis in Java*. Pearson, 2021.
- Knuth, D. E. *The Art of Computer Programming*. Addison-Wesley, 2019.
