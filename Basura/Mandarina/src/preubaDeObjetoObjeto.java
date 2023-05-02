
public class preubaDeObjetoObjeto {
	public static void main(String[] args) {
		
		
//		Cliente miCuentaDatos =  new Cliente(); 
//		miCuentaDatos.nombre = "Nahuel";
//		miCuentaDatos.documento = "45402943";
//		miCuentaDatos.telefono = "2213186181";
//		
//		//Se van a quedar enlazadas a esta direccion
//		cuentaPublica miCuenta = new cuentaPublica(); 
//		miCuenta.titular = miCuentaDatos; 
//		miCuenta.numero = 32679;
//		
//		System.out.println(miCuenta.titular);
//		System.out.println(miCuentaDatos);
		cuentaPublica miCuenta = new cuentaPublica();
		miCuenta.titular.documento = "3331";
		System.out.println(miCuenta.titular.documento);
	}
}
