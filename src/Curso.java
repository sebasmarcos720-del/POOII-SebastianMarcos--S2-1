public class Curso {

    String nombreCurso;
    int nota;

    public Curso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
        this.nota = 0;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public int getNota() {
        return nota;

    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String mostrar () {
        return "Curso: " + nombreCurso + " - Nota: " + nota;
    }
 }

