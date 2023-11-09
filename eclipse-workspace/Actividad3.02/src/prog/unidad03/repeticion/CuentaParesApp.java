package prog.unidad03.repeticion;

import java.util.Scanner;

public class CuentaParesApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("CUENTA PARES");
    System.out.print("¿Cuántos números pares deseas introducir?: ");
    int repeticiones = Integer.parseInt(sc.nextLine());
    int n = 1;
    int numeroIntroducido = 1;
    for(n = 1; n <= repeticiones; n++) {
      while(numeroIntroducido % 2 != 0) {
        System.out.print("Introduce un número: ");
        numeroIntroducido = Integer.parseInt(sc.nextLine());
      }
      if(n == repeticiones) {
        System.out.println("Ya has introducido " + repeticiones + " numeros pares");
      }else {
      System.out.println("Te quedan " + (repeticiones - n) + " números pares por introducir");
      }
      numeroIntroducido = 1;
    }

  }

}
