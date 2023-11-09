package prog.unidad03.seleccion;

import java.util.Scanner;

public class SituaciónAlumnoApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("PROMOCIONA O NO PROMOCIONA");
    System.out.print("Introduce la calificación de Matemáticas: ");
    double matematicas = Double.parseDouble(sc.nextLine());
    System.out.print("Introduce la calificación de Lengua: ");
    double lengua = Double.parseDouble(sc.nextLine());
    if((matematicas >= 5) && (lengua >= 5)) {
      System.out.println("El alumno pasa sin asignaturas pendientes");
    }else if ((matematicas < 5) && (lengua < 5)) {
      System.out.println("El alumno repite");
    }else {
      System.out.println("El alumno pasa con una pendiente");
    }
    

  }

}
