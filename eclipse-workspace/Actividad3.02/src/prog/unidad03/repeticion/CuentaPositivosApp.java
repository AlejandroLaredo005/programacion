package prog.unidad03.repeticion;

import java.util.Scanner;

public class CuentaPositivosApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("CONTADOR DE POSITIVOS");
    int numeroIntroducido = 0;
    int contadorPositivos = 0;
    do {
      System.out.print("Introduce un número positivo o 0 (negativo para terminar): ");
      numeroIntroducido = Integer.parseInt(sc.nextLine());
      if (numeroIntroducido >= 0) {
        contadorPositivos++;
      }
    }while (numeroIntroducido >= 0);
    System.out.println("Has introducido " + contadorPositivos + " números positivos");

  }

}
