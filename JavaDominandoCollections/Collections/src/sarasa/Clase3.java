package sarasa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Clase3 {
    public static void main(String[] args) {
        String Curso1 = "Gemetria";
        String Curso2 = "Fisica";
        String Curso3 = "Quimica";
        String Curso4 = "Historia";
        //vector de strings
        ArrayList<String> cursos = new ArrayList<>();
        //asi se carga 1 a uno en un vector
        cursos.add(Curso1);
        cursos.add(Curso2);
        cursos.add(Curso3);
        cursos.add(Curso4);
        cursos.add(Curso4);
        System.out.println(cursos);
        //IMPORTANTE sort ordena la lista sobre la misma, no genera otra
        //ordena la lista, con la libreria importada de Collections, por orden alfabetico de manera ascendente
        Collections.sort(cursos);
        //otra variante de lo mismo
        //cursos.sort(Comparator.naturalOrder());
        System.out.println(cursos);
        //ordeno de manera descendete
        Collections.sort(cursos,Collections.reverseOrder());
        System.out.println(cursos);
        //otra forma
        /*List<String> sarasa = cursos.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sarasa);*/
    }

}
