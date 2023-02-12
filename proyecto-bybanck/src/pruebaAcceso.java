import javax.net.ssl.SSLContext;

public class pruebaAcceso {
  public static void main(String[] args) {
    cuenta cuentaPrueba = new cuenta();
    cuentaPrueba.depositarPrivado(200); // Estamos accediendo a un metodo privado a eSto lo llamamos encapsulacmiento de datos
    cuentaPrueba.retirarPrivado(100); // para que no se pueda acceder a un metodo privado desde otra clase en
    System.out.println(cuentaPrueba.getObtenerSaldoPrivate());
    cuentaPrueba.setAgenciaPrivate(2);
    System.out.println(cuentaPrueba.getAgencia());
  }
}
