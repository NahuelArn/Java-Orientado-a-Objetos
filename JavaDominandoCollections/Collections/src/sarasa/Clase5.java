package sarasa;

import java.util.ArrayList;

import java.util.Collections;

public class Clase5 {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Ruby",30);
        Curso curso2 = new Curso("JavaScript",10);
        Curso curso3 = new Curso("Php",20);
        Curso curso4 = new Curso("Java",50);
        //vector de strings
        ArrayList<Curso> cursos = new ArrayList<>();

        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);
        /*
        for (int i = 0; i < cursos.size(); i++) {
            System.out.println(cursos.get(i).getNombre());
        }
        System.out.println(curso1.getNombre());*/
        System.out.println(cursos);

        Collections.sort(cursos); //Ordena por nombre

        System.out.println(cursos);
    }
}
