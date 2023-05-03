public class testReferencia3 {
  // Estructura correcta
  // en este caso el objeto. contenido se inicializa en su propia clase
  // cada vez que se cree un objeto de tipo cuenta, se va crear un objeto de tipo
  // objetoCliente
  public static void main(String[] args) { // Abreviatura main y TAB
    cuenta cuentaDiego = new cuenta(4);
    objetoCliente cliente = new objetoCliente();
    cuentaDiego.setTitular(cliente);
    System.out.println(cuentaDiego.getTitular());
    System.out.println(cuentaDiego);
    cliente.setNombre("Diego");
    System.out.println(cliente.getNombre());
  }
}
