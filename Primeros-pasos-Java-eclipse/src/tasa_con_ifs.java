public class tasa_con_ifs {
  public static void main(String[] args) {
    double salario = 3300.0;
    // ifs aqui
    if (salario >= 1900.0 && salario <= 2800.0) {
      System.out.println("Tasa del 7,5%: " + "usted puede deducir 142, le quedaria: " +(salario - 142));
    } else if (salario >= 2800.01 && salario <= 3751.0) {
      System.out.println("Tasa del 15%: " + "usted puede deducir 350, le quedaria: " + (salario - 350));
    } else if (salario >= 3751.01 && salario <= 4664.0) {
      System.out.println("Tasa del 22,5%: " + "usted puede deducir 636, le quedaria: " + (salario - 636));
    }

  }
}

// if (salario >= 2800.01 && salario <= 3751.0){
// System.out.println("Tasa del 15%: " + (salario-350));
// }
// if (salario >= 3751.01 && salario <= 4664.0){
// System.out.println("Tasa del 22,5%: " + (salario-636));
// }