package prog.unidad03.excepciones;

import java.util.Scanner;

public class NumeroSeguroCansino {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("INTRODUCCIÓN DE NÚMERO SEGURA CANSINO");
    boolean condicion = true;
    do {
    try {
      System.out.print("Introduce un número entero: ");
      int numeroEntero = Integer.parseInt(sc.nextLine());
      condicion = false;
    }catch(java.lang.NumberFormatException e) {
      System.out.println("No has introducido un número entero");
      condicion = true;
    }
    }while(condicion);
  }

}
