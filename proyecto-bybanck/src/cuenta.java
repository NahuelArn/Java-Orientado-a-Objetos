//entiendad cuenta
class cuenta {
  double saldo;
  private double saldoPrivado;
  int agencia;
  private int agenciaPrivate;
  int numero;
  // private double numeroPrivate;
  private objetoCliente titular;

  private static int total = 0;
  /*
   * public cuenta (){
   * }
   */

  public cuenta(int agenciaPrivate) {
    if (agenciaPrivate <= 0) {
      System.out.println("No se puede crear una cuenta con un valor negativo");
      this.agenciaPrivate = 1;
    } else {
      this.agenciaPrivate = agenciaPrivate;
    }
    total++;
    System.out.println("se van creando: " + total + " cuentas");
    System.out.println("Se creo una cuenta, me permite manipular el objeto desde su nacimiento");
  }

  // ------------------------------------------------

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
  public void setTitular(objetoCliente titular) {
    this.titular = titular;
  }

  public objetoCliente getTitular() {
    return titular;
  }

  public double getObtenerSaldoPrivate() {
    return this.saldoPrivado;
  }

  public void setAgenciaPrivate(int agenciaPrivate) {
    if (agenciaPrivate > 0) {
      this.agenciaPrivate = agenciaPrivate;
    }
    System.out.println("No se puede asignar un valor negativo");
  }

  public int getAgenciaPrivate() {
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
