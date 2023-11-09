package prog.unidad03.repeticion;

import java.util.Scanner;

public class TablasMultiplicarApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("TABLAS DE MULTIPLICAR");
    int i = 1;
    int n = 1;
    for(i = 1; i <= 10; i++) {
      System.out.println("Tabla del " + i);
      System.out.println("---------");
      for(n = 1; n <= 10; n++) {
        System.out.println(i + " X " + n + " = " + i * n);
      }
    }

  }

}
