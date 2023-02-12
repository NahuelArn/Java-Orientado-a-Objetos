public class testReferencia2 {
  public static void main(String[] args) {
    objetoCliente diego = new objetoCliente();
    diego.nombre = "Diego";
    diego.documento = "123456789";
    diego.telefono = 123;

    cuenta cuentaDiego = new cuenta();
    cuentaDiego.agencia = 1;
    cuentaDiego.titular = diego;

    System.out.println(cuentaDiego.titular.nombre);

    System.out.println(cuentaDiego.titular);  //estamos referenciando a la misma posición de memoria, esto seria crear un registro dentro de otro registro
    System.out.println(diego);
  }
}
