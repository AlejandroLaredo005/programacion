package prog.unidad03.seleccion;

import java.util.Scanner;

public class NumeroCifrasApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("CIFRAS DE UN NÚMERO");
    System.out.print("Introduce un número entero y te diré cuántas cifras tiene: ");
    String numero = sc.nextLine();
    System.out.println("El número " + numero + " tiene " + numero.length() + " cifras");
    
    

  }

}
