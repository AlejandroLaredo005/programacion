package prog.unidad03.repeticion;

import java.util.Scanner;

public class TablaMultiplicarSimpleApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("TABLA DE MULTIPLICAR");
    System.out.print("¿De qué numero entero quieres saber su table de multiplicar?: ");
    int numeroIntroducido = Integer.parseInt(sc.nextLine());
    System.out.println("Tabla del " + numeroIntroducido);
    int numeroTabla = 1;
    for (numeroTabla = 1; numeroTabla <= 10; numeroTabla++) {
      System.out.println(numeroIntroducido + " X " + numeroTabla + " = " + (numeroIntroducido * numeroTabla));
    }

  }

}
