public class Ejemplo_Condicionales2 {
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




// CON OR

// public class Ejemplo_Condicionales2 {
//   public static void main(String[] args) {
//     System.out.println("Ejemplo de condicionales");
//     // or= ||, and= &&, not= !
//     int edad = 12;
//     int cantPersonas = 1;
//     if (edad >= 18 || cantPersonas >= 2) {
//       System.out.println("es mayor de edad");
//       System.out.println("Welcome");
//     } else {
//       System.out.println("es menor de edad y no esta acompanhado");
//     }
//   }
// }
