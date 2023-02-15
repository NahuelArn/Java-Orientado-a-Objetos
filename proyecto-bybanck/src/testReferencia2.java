public class testReferencia2 {
  public static void main(String[] args) {
    objetoCliente diego = new objetoCliente();
    diego.setNombre("Diego");
    // diego.nombre = "Diego";
    diego.setDocumento("123456789");
    // diego.documento = "123456789";
    diego.setTelefono(123);
    // diego.telefono = 123;

    cuenta cuentaDiego = new cuenta(2);
    cuentaDiego.agencia = 1;
    cuentaDiego.setTitular(diego);
    // cuentaDiego.titular = diego;

    System.out.println(diego.getNombre());

    System.out.println(cuentaDiego.getTitular());  //estamos referenciando a la misma posición de memoria, esto seria crear un registro dentro de otro registro
    System.out.println(diego);
  }
}
