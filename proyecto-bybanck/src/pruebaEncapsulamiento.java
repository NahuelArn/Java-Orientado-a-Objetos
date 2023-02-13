import org.omg.CORBA.OBJECT_NOT_EXIST;
import org.omg.CORBA.TIMEOUT;

public class pruebaEncapsulamiento {
  public static void main(String[] args) {
    cuenta cuentaPrueba = new cuenta();
    // objetoCliente clientePrueba = new objetoCliente();
    cuentaPrueba.titular.nombre=("Carlos");
    System.out.println(cuentaPrueba.titular.nombre);
  }
}
