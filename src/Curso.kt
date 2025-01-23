class Curso(private val nombre: String, private val codigo: String) {
    private val estudiantes: MutableList<Estudiante> = mutableListOf()

    fun agregarAlumno(estudiante: Estudiante): Boolean {
        return estudiantes.add(estudiante)
    }

    fun mostrarEstudiantes() {
        println("Estudiantes de $nombre ($codigo)")
        estudiantes.forEach { println("- ${it.nombre} (DNI: ${it.dni})") }
    }
}