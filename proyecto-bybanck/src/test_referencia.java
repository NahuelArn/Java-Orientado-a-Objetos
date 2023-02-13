public class test_referencia {
  public static void main(String[] args) {
    cuenta primeraCuenta = new cuenta();
    primeraCuenta.saldo = 200;

    cuenta segundaCuenta = primeraCuenta;

    segundaCuenta.saldo = 100;

    System.out.println(primeraCuenta.saldo);

    System.out.println(segundaCuenta.saldo);

    segundaCuenta.saldo += 400;
    System.out.println(primeraCuenta); // Estamos referenciando a la misma posición de memoria
    System.out.println(segundaCuenta);

    if (primeraCuenta == segundaCuenta) {
      System.out.println("Son la misma cuenta");
    } else {
      System.out.println("Son cuentas diferentes");
    }
  }
}
