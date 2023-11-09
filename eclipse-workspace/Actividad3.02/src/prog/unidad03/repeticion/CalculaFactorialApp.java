package prog.unidad03.repeticion;

import java.util.Scanner;

public class CalculaFactorialApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("CÁLCULO DE FACTORIAL");
    System.out.print("Introduce un número mayor que 0 para calcular su factorial: ");
    int numeroIntroducido = Integer.parseInt(sc.nextLine());
    int n = numeroIntroducido;
    long acumulador = n;
    for (n = numeroIntroducido; n >= 2; n-- ) {
      acumulador = (acumulador * (n - 1));
    }
    System.out.println("El factoril de " + numeroIntroducido + " vale " + acumulador);

  }

}
