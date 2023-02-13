public class testReferencia3 {
  //Estructura correcta
  //en este caso el objeto. contenido se inicializa en su propia clase
  //cada vez que se cree un objeto de tipo cuenta, se va crear un objeto de tipo objetoCliente
  public static void main(String[] args) { // Abreviatura main y TAB
    cuenta cuentaDiego = new cuenta();
    // objetoCliente cliente = new objetoCliente();
    // cuentaDiego.titular = cliente;
    // cuentaDiego.titular = new objetoCliente();

    cuentaDiego.titular.nombre = "Diego";
    System.out.println(cuentaDiego.titular.nombre); // Abreviatura sout y tab
    System.out.println(cuentaDiego.titular);
    System.out.println(cuentaDiego);
  }
}
