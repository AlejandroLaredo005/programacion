package prog.unidad03.repeticion;

import java.util.Scanner;

public class FactoresPrimosApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("CALCULO DE FACTORES PRIMOS");
    System.out.print("introduce un número entero mayor que 1 para descomponerlo en factores primos: ");
    int numeroIntroducido = Integer.parseInt(sc.nextLine());
    int n = 2;
    int i = 2;
    boolean primo = false;
    for(n = 2; n <= numeroIntroducido; n++) {
      primo = false;
      if(numeroIntroducido % n == 0) {
        for(i = 2; i < n; i++) {
          if(n % i == 0) {
            primo = false;
            i = n;
          }else {
            primo = true;
          }
        }
        if(n == 2) {
          System.out.println("2 es un factor primo");
        }
        if(primo) {
          System.out.println(n + " es un factor primo");
        }
      }
    }

  }

}
