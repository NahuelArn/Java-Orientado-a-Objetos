public class Ejemplo_ciclos {
  public static void main(String[] args) {
    int i = 0;
    System.out.println("Ciclo con un while");
    while (i <= 10) {
      System.out.println("i vale: " + i);
      i++;
      // i+=2;
    }
    System.out.println("Ciclo con un for");
    for (i = 0; i <= 10; i = i + 1) {
      System.out.println("i vale: " + i);
    }
  }
}
