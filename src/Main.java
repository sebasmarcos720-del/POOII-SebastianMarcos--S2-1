import java.util.ArrayList;
import java.util.List;

public class Main{

    public static void main(String[] args){


    System.out.println("Actividad - Alumno y cursos");

    List<Curso> cursos = new ArrayList<>();

    Alumno alumno = new Alumno (
            "A001",
            "Sebas",
            cursos
    );

    System.out.println("\n Datos del alumno");
    System.out.println("Codigo: " + alumno.getCodigoAlumno());
    System.out.println("Nombre: " + alumno.getNombre());

    System.out.println("\n Cursos Matriculados:");

    alumno.mostrarCursos();

    Docente docente = new Docente(
            "12345678",
            "Juan",
            "Perez",
            "Programacion",
            "Ingenieria de Sistemas"
    );

    System.out.println("\n calificando Cursos:");

    for (Curso curso : alumno.getListaCursos()){
        docente.calificarCurso(curso);
        System.out.println(curso.mostrar());
    }
}
}