package sarasa;

import java.util.ArrayList;
import java.util.Collections;

public class Clase4 {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Geometria",30);
        Curso curso2 = new Curso("Fisica",10);
        Curso curso3 = new Curso("Quimica",20);
        Curso curso4 = new Curso("Historia",50);
        //vector de strings
        ArrayList<Curso> cursos = new ArrayList<>();

        cursos.add(curso1);
        System.out.println(curso1.getNombre());
    }

}
