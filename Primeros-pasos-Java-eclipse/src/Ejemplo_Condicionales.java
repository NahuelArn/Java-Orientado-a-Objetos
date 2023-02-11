public class Ejemplo_Condicionales {
  public static void main(String[] args) {
    System.out.println("Ejemplo de condicionales");

    int edad = 12;
    int cantPersonas = 1;
    if (edad >= 18) {
      System.out.println("es mayor de edad");
      System.out.println("Welcome");
    } else {
      if (cantPersonas >= 2) {
        System.out.println("Welcome");
      } else {
        System.out.println("es menor de edad y no esta acompanhado");
      }
    }
  }
}
