package prog.unidad03.excepciones;

import java.util.Scanner;

public class NumeroSeguroApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("INTRODUCCIÓN DE NÚMERO SEGURA");
    System.out.print("Introduce un número entero: ");
    try {
      int numeroEntero = Integer.parseInt(sc.nextLine());
    }catch(java.lang.NumberFormatException e) {
      System.out.println("No has introducido un número entero");
    }
    
    
  }

}
