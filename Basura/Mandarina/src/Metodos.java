
public class Metodos {
	public static void main(String[] args) {
		cuentaPublica PrimeraCuenta = new cuentaPublica();
		//no retorna
		PrimeraCuenta.depositar(20);
		System.out.println(PrimeraCuenta.saldo);
		//si retorna
		
		if(PrimeraCuenta.retirar(10)) {
			System.out.println("Se retiro exitosamente");
		}
		System.out.println(PrimeraCuenta.saldo);
		
		//transferir
		cuentaPublica SegundaCuenta = new cuentaPublica();
		SegundaCuenta.depositar(200);
		
		if(SegundaCuenta.transferir(199, PrimeraCuenta)) {
			System.out.println("Se transfirio exitosamente");
		}
		System.out.println(SegundaCuenta.saldo);
	}
}
