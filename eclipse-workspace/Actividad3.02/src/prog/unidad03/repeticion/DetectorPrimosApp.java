package prog.unidad03.repeticion;

import java.util.Scanner;

public class DetectorPrimosApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("DETECTOR DE NUMEROS PRIMOS");
    System.out.print("Introduce un número entero mayor que 1 para ver si es primo o no: ");
    int numeroIntroducido = Integer.parseInt(sc.nextLine());
    boolean primo = false;
    int n = 2;
    for(n = 2; n < numeroIntroducido; n++) {
      if(numeroIntroducido % n == 0) {
        primo = true;
      }else;
    }
    if(primo) {
      System.out.println("El número " + numeroIntroducido + " no es primo");
    }else {
      System.out.println("El número " + numeroIntroducido + " es primo");
    }

  }

}
