public class prueba_metodos {
  public static void main(String[] args){
    cuenta miCuenta = new cuenta();
    //DEPOSITAR
    // miCuenta.saldo = 900;
    miCuenta.depositar(1000);

    System.out.println(miCuenta.saldo);

    //retirar
    miCuenta.retirar(400);
    System.out.println(miCuenta.saldo);

    //transferir
    cuenta cuentaTransferir = new cuenta();
    cuentaTransferir.depositar(1100);
    cuentaTransferir.transferir(500, miCuenta); // 500 de cuentaTransferir a micuenta

    System.out.println("saldo mi cuenta: "+ miCuenta.saldo);
    System.out.println("Saldo cuenta2:  "+ cuentaTransferir.saldo);
  }
}