package prog.unidad03.seleccion;

import java.util.Scanner;

public class Actividad301f {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("¿PAR O IMPAR?");
    System.out.print("Introduce un número entero: ");
    int numero = Integer.parseInt(sc.nextLine());
    if(numero % 2 ==0) {
      System.out.println("El numero " + numero + " es par");
    }else {
      System.out.println("El numero " + numero + " es impar");
    }

  }

}
