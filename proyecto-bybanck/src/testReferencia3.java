public class testReferencia3 {
  //Estructura correcta
  public static void main(String[] args) { // Abreviatura main y TAB
    cuenta cuentaDiego = new cuenta();
    objetoCliente cliente = new objetoCliente();
    cuentaDiego.titular = cliente;

    System.out.println(cuentaDiego.titular.nombre); // Abreviatura sout y tab
  }
}
