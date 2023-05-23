package sarasa;

import java.util.*;

public class Clase10 {
    public static final List<List<Integer>> listas = new ArrayList<List<Integer>>() {
        {
            add(new LinkedList<>());
            add(new ArrayList<>());
        }
    };
    public static void main(String[] args) {
        Curso curso1 = new Curso("Historia",30);
        Curso curso2 = new Curso("Arte",10);
        Curso curso3 = new Curso("Aritmetica",20);
        Curso curso4 = new Curso("Geometria",50);
        //vector de strings
        ArrayList<Curso> cursos = new ArrayList<>();

        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);


        List<Curso> cursos2 = new ArrayList<>();
        System.out.println(cursos.stream().mapToInt(Curso::getTiempo).sum());
    }

}
