package prog.unidad03.seleccion;

import java.util.Scanner;

public class Actividad301d {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("PROGRAMA CLASIFICADOR DE TRIÁNGULOS");
    System.out.print("Introduce la longitud del primer lado: ");
    double longitud1 = Double.parseDouble(sc.nextLine());
    System.out.print("Introduce la longitud del segundo lado: ");
    double longitud2 = Double.parseDouble(sc.nextLine());
    System.out.print("Introduce la longitud del tercer lado: ");
    double longitud3 = Double.parseDouble(sc.nextLine());
    if((longitud1 == longitud2) && (longitud1 == longitud3) && (longitud2 == longitud3)) {
      System.out.println("El triángulo es equilátero");
    }else if ((longitud1 != longitud2) && (longitud1 != longitud3) && (longitud2 != longitud3)) {
      System.out.println("El triangulo es escaleno");
    }else {
      System.out.println("El triángulo es isósceles");
    }

  }

}
