# 1. Interpreta el significado del diagrama de clases.

## a) Relación entre las clases. Significado, tipo, multiplicidad.

La relación es de tipo agregación ya que un elemento es parte de otro, pero puede ser independiente.

La multiplicidad es:  
Un curso puede tener como mínimo 1 estudiante y como máximo N.  
Un estudiante solo puede pertenecer a un único curso.

---

## b) Elementos de las clases. Tipos y propósito.

### **Curso**:
**Atributos**:  
- `String nombre` → Atributo privado de tipo String (Cadena de caracteres).  
  Corresponde al nombre del curso.  

- `String codigo` → Atributo privado de tipo String (Cadena de caracteres).  
  Corresponde al identificador del curso, su código.  

- `MutableList estudiantes` → Atributo privado de tipo MutableList (Lista Mutable).  
  Corresponde a los alumnos integrantes del curso.  

**Métodos**:  
- `+ agregarAlumno(Estudiante estudiante)` → Método que recibe un parámetro relacionado con la clase Estudiante.  
- `+ mostrarEstudiantes()` → Método que no recibe parámetros.  

### **Estudiante**:
**Atributos**:  
- `+ String nombre` → Atributo de tipo String (Cadena de caracteres).  
  Corresponde al nombre del estudiante.  

- `+ String dni` → Atributo de tipo String (Cadena de caracteres).  
  Corresponde al identificador del estudiante, su dni.  

**Métodos**:  
- `+ inscribirse(Curso curso)` → Método que recibe un parámetro relacionado con la clase Curso.  

---

## c) Significado del método agregarAlumno(). Funcionamiento.

El método `agregarAlumno()` funciona como un enlace entre los estudiantes y el curso ya que añade a una lista mutable los alumnos correspondientes a su curso.

**Ejemplo**:  
Alumnos: Marta, Manuel, Alberto.  
Al pasar estos estudiantes por el método `agregarAlumno()` meterá en una lista a los estudiantes:  

```kotlin
ListaCurso: MutableList = ("Marta", "Manuel", "Alberto")
