public class CrearCuenta {
	public static void main(String[] args) {
		cuentaPublica primeraCuenta = new cuentaPublica();
		primeraCuenta.saldo = 1000;

		System.out.println(primeraCuenta.saldo);
		
		cuentaPublica segundaCuenta = new cuentaPublica();
		segundaCuenta.saldo = 500;
		System.out.println(segundaCuenta.saldo);
	}
}
