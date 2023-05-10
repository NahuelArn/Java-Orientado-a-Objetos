package sarasa;

import java.util.ArrayList;

public class Clase2 {
    public static void main(String[] args) {
        String variable1 = "Ejemplo1";
        String variable2 = "Ejemplo2";
        String variable3 = "Ejemplo3";
        String variable4 = "Ejemplo4";
        //vector de strings
        ArrayList<String> lista = new ArrayList<>();
        //asi se carga 1 a uno en un vector
        lista.add(variable1);
        lista.add(variable2);
        lista.add(variable3);
        lista.add(variable4);
        lista.add(variable4);
        System.out.println(lista);
        //se elimina un elemento del vector, comienza en 0 el vector
        lista.remove(0);
        System.out.println(lista);
        //se cambia el valor contenido del vector
        lista.set(3,"cambio la pos 3, el array comienza en 0");
        System.out.println(lista);
        //Para conocer mi lenght, llamando al metodo size
        System.out.println(lista.size());

        //Tradional
//        for (int i = 0; i < lista.size(); i++){
//            System.out.println(lista.get(i));
//            System.out.println("entro aca"+ i);
//        }
        //for tipo for each
//        forma antigua de imprimir una coleccion
//        for (String clase: lista){
//            System.out.println(clase);
//        }
        //recurso de lambidas
        System.out.println("Estoy aca");
        lista.forEach(clase -> {
            System.out.println(clase);
        });
    }

}
