package prog.unidad03.repeticion;

import java.util.Scanner;

public class PositivoNegativoApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("NÚMEROS POSITIVOS Y NEGATIVOS");
    int numeroIntroducido = 0;
    do {
      System.out.print("Introduce un número entero (0 para terminar): ");
      numeroIntroducido = Integer.parseInt(sc.nextLine());
      if(numeroIntroducido > 0) {
        System.out.println("El número " + numeroIntroducido + " es positivo");
      }else if (numeroIntroducido < 0){
        System.out.println("El número " + numeroIntroducido + " es negativo");
      }
    }while(numeroIntroducido != 0);

  }

}
