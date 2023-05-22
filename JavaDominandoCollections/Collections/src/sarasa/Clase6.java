package sarasa;

import sarasa.model.Clase;
import sarasa.model.Curso;

import java.util.ArrayList;
import java.util.Collections;

public class Clase6 {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Java",30,new ArrayList<>());
        curso1.addClase(new Clase("ArrayList"));

        //vector de strings
        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);

        System.out.println(cursos.get(0).getClaseList());
    }
}


