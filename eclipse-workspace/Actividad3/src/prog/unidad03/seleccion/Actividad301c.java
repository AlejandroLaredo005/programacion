package prog.unidad03.seleccion;

import java.util.Scanner;

public class Actividad301c {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("PROGRAMA CALCULADORA BÁSICA");
    System.out.print("Introduce la operación a realizar (S para suma, R para resta, P para producto y D para división: ");
    char operador = sc.nextLine().charAt(0);
    System.out.print("Introduce el primer operando: ");
    double numero1 = Double.parseDouble(sc.nextLine());
    System.out.print("Introduce el segundo operando: ");
    double numero2 = Double.parseDouble(sc.nextLine());
    switch(operador) {
      case 'S':
        System.out.print("El resultado de sumar " + numero1 + " y " + numero2 + " vale ");
        numero1 = numero1 + numero2;
        System.out.println(numero1);
        break;
      case 'R':
        System.out.print("El resultado de restar " + numero1 + " y " + numero2 + " vale ");
        numero1 = numero1 - numero2;
        System.out.println(numero1);
        break;
      case 'P':
        System.out.print("El resultado de multiplicar " + numero1 + " y " + numero2 + " vale ");
        numero1 = numero1 * numero2;
        System.out.println(numero1);
        break;
      case 'D':
        System.out.print("El resultado de dividir " + numero1 + " y " + numero2 + " vale ");
        numero1 = numero1 / numero2;
        System.out.println(numero1);
        break;
      default:
        System.out.println("Error. No has introducido ninguna letra indicada");
    }
       

  }

}
