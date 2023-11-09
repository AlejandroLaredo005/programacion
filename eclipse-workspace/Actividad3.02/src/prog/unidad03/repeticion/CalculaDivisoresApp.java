package prog.unidad03.repeticion;

import java.util.Scanner;

public class CalculaDivisoresApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("DIVISORES DE UN NÚMERO");
    System.out.print("Introduce un número entero para que calcule sus divisores: ");
    int numeroIntroducido = Integer.parseInt(sc.nextLine());
    int n = 1;
    for (n = 1; n <= numeroIntroducido; n++) {
      if(numeroIntroducido % n == 0) {
        System.out.println("Es divisible por " + n);
      }
    }
  }

}
