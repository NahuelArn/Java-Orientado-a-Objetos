
public class cuentaPublica {
	double saldo;
	int cuenta;
	int numero;
	Cliente titular = new Cliente();
	
	public void depositar(double monto){
		this.saldo+= monto;
	}
	
	public boolean retirar(double monto) {
		if(this.saldo >= monto) {
			this.saldo-= monto;
			return true;
		}else{ 
		return false;
		}
	}
	
	public boolean transferir(double monto, cuentaPublica cuenta) {
		if(this.saldo >= monto) {
			//this.saldo-=monto;
			//this.saldo+=monto;
			this.retirar(monto);
			cuenta.depositar(monto);
			return true;
		}else {
		return false;
	    }
	}
}
