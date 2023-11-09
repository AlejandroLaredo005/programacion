package prog.unidad03.repeticion;

import java.util.Scanner;

public class NumerosCrecientesApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("NÚMEROS CRECIENTES");
    int numero1 = 0;
    int numero2 = 0;
    System.out.print("introduce un número entero: ");
    numero1 = Integer.parseInt(sc.nextLine());
    do {
      System.out.print("Introduce ahora un número mayor que " + numero1 + " (Introduce un número menor o igual para continuar): ");
      numero2 = Integer.parseInt(sc.nextLine());
      if(numero2 > numero1) {
        numero1 = numero2-1;
      }
    }while(numero2 > numero1);
        

  }

}
