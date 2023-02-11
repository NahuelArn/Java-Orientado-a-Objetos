public class Factorial {
  public static void main(String[] args) {
    for (int i = 0; i <= 10; i++) {
      if (i == 0 || i == 1) {
        System.out.println("El factorial de " + i + " es: 1");
      } else {
        int factorial = 1;
        for (int j = 1; j <= i; j++) {
          factorial = factorial * j;
        }
        System.out.println("El factorial de " + i + " es: " + factorial);
      }
    }
  }
}



//implementacion del tutor

// class Factorial {

//   public static void main(String[] args) {
//     int factorial = 1;
//     for (int i = 1; i < 11; i++) {
//       factorial *= i;
//       System.out.println("Factorial de " + i + " = " + factorial);
//     }
//   }

// }
