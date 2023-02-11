public class Ejemplo_Scope {
  public static void main(String[] args) {
    System.out.println("Ejemplo de condicionales");
    // or= ||, and= &&, not= !
    int edad = 18;
    int cantPersonas = 2;
    boolean esPareja = cantPersonas > 1;
    if (edad >= 18 && esPareja) {
      System.out.println("es mayor de edad");
      System.out.println("Welcome");
    } else {
      System.out.println("es menor de edad y no esta acompanhado");
    }
  }
}

