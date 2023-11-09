package prog.unidad03.seleccion;

import java.util.Scanner;

public class NombreMesesApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("NOMBRE DE MES");
    System.out.print("Introduce un número del 1 al 12 y te diré qué mes ocupa esa posición: ");
    int numeroMes = Integer.parseInt(sc.nextLine());
    switch(numeroMes) {
    case 1:
      System.out.println("El mes con posición 1 tiene el nombre Enero");
      break;
    case 2:
      System.out.println("El mes con posición 2 tiene el nombre Febrero");
      break;
    case 3:
      System.out.println("El mes con posición 3 tiene el nombre Marzo");
      break;
    case 4:
      System.out.println("El mes con posición 4 tiene el nombre Abril");
      break;
    case 5:
      System.out.println("El mes con posición 5 tiene el nombre Mayo");
      break;
    case 6:
      System.out.println("El mes con posición 6 tiene el nombre Junio");
      break;
    case 7:
      System.out.println("El mes con posición 7 tiene el nombre Julio");
      break;
    case 8:
      System.out.println("El mes con posición 8 tiene el nombre Agosto");
      break;
    case 9:
      System.out.println("El mes con posición 9 tiene el nombre Septiembre");
      break;
    case 10:
      System.out.println("El mes con posición 10 tiene el nombre Octubre");
      break;
    case 11:
      System.out.println("El mes con posición 11 tiene el nombre Noviembre");
      break;
    case 12:
      System.out.println("El mes con posición 12 tiene el nombre Diciembre");
      break;
    default:
      System.out.println("No has introducido ningún número recogido en los meses");
    }
  }

}
