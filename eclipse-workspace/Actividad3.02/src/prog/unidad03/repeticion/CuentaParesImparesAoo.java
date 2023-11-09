package prog.unidad03.repeticion;

import java.util.Scanner;

public class CuentaParesImparesAoo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("CUENTA PARES O IMPARES");
    System.out.print("¿cuántos números deseas introducir?: ");
    int repeticiones = Integer.parseInt(sc.nextLine());
    int n = 1;
    int pares = 0;
    int impares = 0;
    for(n = 1; n <= repeticiones; n++) {
      System.out.print("Introduce el número " + n + ": ");
      int numeroIntroducido = Integer.parseInt(sc.nextLine());
      if(numeroIntroducido % 2 == 0) {
        System.out.println("El número " + numeroIntroducido + " es par");
        pares++;
      }else {
        System.out.println("El número " + numeroIntroducido + " es impar");
        impares++;
      }
    }
    System.out.println("Se han introducido " + pares + " números pares y " + impares + " números impares");

  }

}
