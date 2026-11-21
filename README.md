# Estructura-de-datos
Implementaciones en Java de estructuras de datos lineales y no lineales
# Estructuras de datos en Java

Ejemplos en Java de estructuras de datos lineales y no lineales.

## Estructura del proyecto

```
src/
├── lineales/
│   ├── EjemploArray.java
│   ├── EjemploArrayList.java
│   ├── EjemploLinkedList.java
│   ├── ejemploStack.java
│   ├── EjemploQueue.java
│   └── EjemploVector.java
└── no_lineales/
    ├── EjemploGrafo.java
    ├── EjemploHashMap.java
    ├── EjemploHashSet.java
    ├── EjemploLinkedHashMap.java
    ├── EjemploLinkedHashSet.java
    └── EjemploTree.java
```

## Estructuras lineales
- **Array**: arreglo de tamaño fijo
- **ArrayList**: lista que crece dinámicamente
- **LinkedList**: lista de nodos enlazados
- **Stack**: pila (LIFO)
- **Queue**: cola (FIFO)
- **Vector**: lista dinámica sincronizada

## Estructuras no lineales
- **Grafo**: nodos conectados entre sí
- **HashMap**: pares clave-valor
- **HashSet**: conjunto sin duplicados
- **LinkedHashMap**: HashMap que conserva el orden de inserción
- **LinkedHashSet**: HashSet que conserva el orden de inserción
- **Tree**: árbol binario de búsqueda

## Cómo ejecutar
```
javac -d out src/lineales/*.java src/no_lineales/*.java
java -cp out lineales.EjemploArray
```

## Autor
Juan Pablo Montoya Gomez
Técnico profesional en Sistemas, Tecnológico de Antioquia
Medellín, Colombia
