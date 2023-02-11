public class crearCuenta {
  public static void main(String[] args) {
    cuenta primeraCuenta = new cuenta();
    primeraCuenta.agencia = 123;

    System.out.println(primeraCuenta.agencia);
    //----------------------------------------------
    cuenta segundaCuenta = new cuenta();
    segundaCuenta.saldo = 1000;

    System.out.println(segundaCuenta.saldo);

    System.out.println(primeraCuenta); // Estamos referenciando a diferenctes direcciones por el new
    System.out.println(segundaCuenta);

    if (primeraCuenta == segundaCuenta) {
      System.out.println("Son la misma cuenta");
    } else {
      System.out.println("Son cuentas diferentes");
    }
  }
}
