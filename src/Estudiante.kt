class Estudiante(val nombre: String, var dni: String) {
    fun inscribirse(curso: Curso) {
        curso.agregarAlumno(this)
    }
}