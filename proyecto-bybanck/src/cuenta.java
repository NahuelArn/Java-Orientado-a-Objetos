//entiendad cuenta
class cuenta {
  double saldo;
  int agencia;
  int numero;
  String titulo;

  public void depositar(double valor) {
    this.saldo += valor;
    // saldo = saldo + valor;
  }

  public boolean retirar(double valor) {
    if (this.saldo >= valor) {
      this.saldo -= valor;
      System.out.println("Retiro exitoso");
      return true;
    } else {
      System.out.println("No tiene saldo suficiente");
      return false;
    }
  }

  public boolean transferir(double valor, cuenta destino) {
    if (this.saldo >= valor){
      this.saldo -= valor;
      // destino.saldo += valor;
      destino.depositar(valor);
      System.out.println("Transferencia exitosa");
      return true;
    } else {
      System.out.println("No tiene saldo suficiente");
      return false;
    }
  }
}
