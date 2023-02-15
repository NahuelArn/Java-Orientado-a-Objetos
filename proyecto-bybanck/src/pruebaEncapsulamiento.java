public class pruebaEncapsulamiento {
  public static void main(String[] args) {
    cuenta cuentaPrueba = new cuenta(3);
    objetoCliente titular = new objetoCliente();
    // objetoCliente clientePrueba = new objetoCliente();
    // objetoCliente titularr = new objetoCliente();

    cuentaPrueba.setTitular(new objetoCliente());
    titular.setNombre("Pepe");
    System.out.println(titular.getNombre());
  }
}
