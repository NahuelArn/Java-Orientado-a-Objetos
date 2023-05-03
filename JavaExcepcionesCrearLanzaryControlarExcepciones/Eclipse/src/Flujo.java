
public class Flujo {
	public static void main(String[] args) {
	    System.out.println("Ini do main");
	    metodo1();
	    System.out.println("Fim do main");
	  }
	  public static void metodo1(){
	    System.out.println("Ini do metodo1");
	    try {
	    	metodo2();
	    } catch(MieException me) {
	    	me.printStackTrace();
	    }
	    metodo2();
	    System.out.println("Fim do metodo1");
	  }
	  public static void metodo2(){
	    System.out.println("Ini do metodo2");
	    throw new MieException("lanzadoooo");
//	    for(int i =1; i<= 5; i++){
//	    	System.out.println(i);
//		    try { //intenta esto
//		    	if( i == 3) {
//		    		int num = 0;
//			    	int resultado = i/num;
//			    	System.out.println(resultado);
//		    	}
//		    	String test = null;
//		    	System.out.println(test.toString());
//		    }catch (ArithmeticException | NullPointerException exception) {//Atrapa el error
//		    	System.out.println("Atrapo excepcion");
//		    	System.out.println(exception.getMessage());
//		    	exception.printStackTrace();
//		    }
//	    }
//	    System.out.println("Fim do metodo2");
	  }

}
 