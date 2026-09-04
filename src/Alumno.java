import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

public class Alumno extends Persona {

    String codigoAlumno;
    List<Curso> listaCursos;

    public Alumno(String codigo, String nombre, List<Curso> listaCursos){

        super("", nombre, "");

        this.codigoAlumno = codigo;
        this.listaCursos = listaCursos;

        this.leeCursosAlumno("cursosAlumnos.txt");
    }

    public void leeCursosAlumno(String archivo){

        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));

            String linea;

            while ((linea = br.readLine()) !=null){

                Curso curso = new Curso(linea);

                listaCursos.add(curso);
            }
            br.close();

        } catch (Exception e){
            System.out.println("error al  leer el archivo");
        }
    }

    public String getCodigoAlumno() {
        return codigoAlumno;
    }

    public List<Curso> getListaCursos() {
        return listaCursos;
    }

    public void mostrarCursos(){
        for (Curso curso : listaCursos){

            System.out.println(curso.mostrar());
        }
    }

}
