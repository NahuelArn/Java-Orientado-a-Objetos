public class TipoVariable {
  // Tipos de variables: byte, short, int, long, float, double, char, boolean
  // bastante parecido a pascal en lo tipado de variables
  public static void main(String[] args) {
    System.out.println("prueba 1");
    int edad = 30;
    System.out.println(edad);
    System.out.println("mi edad es: " + edad);
    int edad2;
    edad2 = 40;
    System.out.println(edad2);

    //--------------------------------------------------------------------------------
    double dolarBlue = 380.5;
    double dolarOficial = 200.0;
    System.out.println("dolar blue: " + (dolarOficial-dolarBlue));
    double division = dolarBlue/dolarOficial;
    System.out.println("division: " + division);
    //--------------------------------------------------------------------------------
    // forzar a enteror un double
    double variableDouble = 3.1416;
    int variableInteger = (int) variableDouble; //cast
    System.out.println("variable forzada a entero de: "+variableDouble+" a "+variableInteger);
  }
}
           