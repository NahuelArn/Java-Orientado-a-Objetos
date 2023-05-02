public class Ejemplo_ciclos2 {
  public static void main(String[] args) {
    int sumaTotal, i; // igual q pascal puedo declarar varias variables en una linea y despues tengo
                      // que inicializarlas
    sumaTotal = 0;
    for (i = 0; i <= 10; i++) {
      sumaTotal = sumaTotal + i;

    }
    System.out.println("La suma total es: " + sumaTotal);
  }
}
