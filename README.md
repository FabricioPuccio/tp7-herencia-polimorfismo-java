# 🎯 TP7 - Herencia y Polimorfismo en Java

## 📚 Descripción
Trabajo Práctico N°7 de la materia Programación II - Tecnicatura en Programación a Distancia  
**Tema:** Implementación de Herencia, Polimorfismo y Abstracción en Java

## 🏗️ Estructura del Proyecto
tp7-herencia-polimorfismo/

├── src/main/java/

│ ├── katas/

│ │ ├── vehiculos/ # Kata 1: Vehículos y herencia básica

│ │ ├── figuras/ # Kata 2: Figuras geométricas abstractas

│ │ ├── empleados/ # Kata 3: Sistema de nóminas polimórfico

│ │ └── animales/ # Kata 4: Comportamiento animal sobrescrito

│ └── Main.java # Clase principal con demostraciones

├── documentacion/ # Recursos para informe PDF

└── README.md

## 🎯 Katas Implementadas

### Kata 1: Vehículos y Herencia Básica
- Clase base: `Vehiculo` con atributos marca, modelo
- Subclase: `Auto` con atributo adicional cantidadPuertas
- Conceptos: `extends`, `super()`, `@Override`, upcasting

### Kata 2: Figuras Geométricas Abstractas
- Clase abstracta: `Figura` con método `calcularArea()`
- Subclases: `Circulo`, `Rectangulo` con implementaciones específicas
- Conceptos: Clases abstractas, métodos abstractos, polimorfismo

### Kata 3: Empleados y Polimorfismo
- Clase abstracta: `Empleado` con método `calcularSueldo()`
- Subclases: `EmpleadoPlanta`, `EmpleadoTemporal`
- Conceptos: Polimorfismo con List, `instanceof`, downcasting seguro

### Kata 4: Animales y Comportamiento Sobrescrito
- Clase base: `Animal` con métodos `hacerSonido()`, `describirAnimal()`
- Subclases: `Perro`, `Gato`, `Vaca` con sobrescritura completa
- Conceptos: Polimorfismo puro, ligadura dinámica

## 🛠️ Tecnologías Utilizadas
- **Lenguaje:** Java
- **IDE:** IntelliJ IDEA
- **Control de Versiones:** Git
- **Repositorio:** GitHub
- **Diagramas:** diagrams.net

## 📊 Conceptos Demostrados
- ✅ Herencia simple con `extends`
- ✅ Polimorfismo y sobrescritura con `@Override`
- ✅ Clases y métodos abstractos
- ✅ Modificadores de acceso (`public`, `protected`, `private`)
- ✅ Upcasting y downcasting seguro
- ✅ Uso de `instanceof` para verificación de tipos
- ✅ Collections Framework con `List<E>`
- ✅ Principio de sustitución de Liskov

## 👨‍💻 Autor
Fabricio Puccio - Estudiante de Tecnicatura en Programación a Distancia

## 📄 Documentación
### El informe académico completo en formato PDF incluye:

- Introducción teórica de cada concepto
- Diagramas UML de todas las jerarquías
- Código fuente comentado
- Análisis de ejecución y resultados
- Conclusiones de aprendizaje

## 🚀 Ejecución
Compilar y ejecutar la clase `Main.java` para ver todas las demostraciones:

```bash
javac Main.java
java Main