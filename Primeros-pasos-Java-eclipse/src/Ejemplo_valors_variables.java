public class Ejemplo_valors_variables{
  public static void main(String[] args){
    int a= 5;
    int b= 10;
    System.out.println(b);
    System.out.println(a);

    System.out.println("-------------------------");
    b= a;
    System.out.println(b);
    a= 20;
    //B???
    System.out.println(b); //JAVA NO USA PUNTEROS, TRABAJA DIRECTAMENTE CON SUS VALORES
  }
}