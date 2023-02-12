//entiendad cuenta
class cuenta {
  double saldo;
  private double saldoPrivado;
  int agencia;
  private int agenciaPrivate;
  int numero;
  private double numeroPrivate;
  objetoCliente titular = new objetoCliente();

  public double getObtenerSaldoPublic() {
    return this.saldo;
  }

  // publico DEPOSITAR
  public void depositar(double valor) {
    this.saldo += valor;
    // saldo = saldo + valor;
  }

  // publico RETIRAR
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

  // publico TRANSFERIR
  public boolean transferir(double valor, cuenta destino) {
    if (this.saldo >= valor) {
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

  // ------------------------------------------------
  // PRIVADO

  public double getObtenerSaldoPrivate() {
    return this.saldoPrivado;
  }

  public void setAgenciaPrivate(int agenciaPrivate) {
    if (agenciaPrivate > 0) {
      this.agenciaPrivate = agenciaPrivate;
    }
  }

  public int getAgencia() {
    return agenciaPrivate;
  }

  // depositar
  public void depositarPrivado(double valor) {
    this.saldoPrivado += valor;
    // saldo = saldo + valor;
  }

  // retirar
  public boolean retirarPrivado(double valor) {
    if (this.saldoPrivado >= valor) {
      this.saldoPrivado -= valor;
      System.out.println("Retiro exitoso");
      return true;
    } else {
      System.out.println("No tiene saldo suficiente");
      return false;
    }
  }

  // private TRANSFERIR
  public boolean transferirPrivado(double valor, cuenta destino) {
    if (this.saldoPrivado >= valor) {
      this.saldoPrivado -= valor;
      // destino.saldoPrivado += valor;
      destino.depositar(valor);
      System.out.println("Transferencia exitosa");
      return true;
    } else {
      System.out.println("No tiene saldo suficiente");
      return false;
    }
  }
}
