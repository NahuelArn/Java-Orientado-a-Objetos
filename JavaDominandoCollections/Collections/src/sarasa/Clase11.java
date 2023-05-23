package sarasa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Clase11 {
    public static void main(String[] args) {
        String alumno1 = "Ejemplo1";
        String alumno2 = "Ejemplo2";
        String alumno3 = "Ejemplo3";
        String alumno4 = "Ejemplo4";
        String alumno5 = "Ejemplo5";
        String alumno6 = "Ejemplo6";
        Set<String> listaAlumnos = new HashSet<>();
        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);
        listaAlumnos.add(alumno6);
        for (String alumno: listaAlumnos){
            System.out.println(alumno);
        }
    }
}
