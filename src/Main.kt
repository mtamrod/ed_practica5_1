fun main() {
    val estudiante1 = Estudiante("Mario", "01234567A")
    val estudiante2 = Estudiante("Julia", "76543210B")
    val curso1 = Curso("Programación", "01010101Z")

    estudiante1.inscribirse(curso1)
    estudiante2.inscribirse(curso1)

    curso1.mostrarEstudiantes()
}