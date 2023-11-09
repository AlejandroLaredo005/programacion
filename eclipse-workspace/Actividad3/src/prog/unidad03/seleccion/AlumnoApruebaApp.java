package prog.unidad03.seleccion;

import java.util.Scanner;

public class AlumnoApruebaApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("APROBADOS Y SUSPENSOS");
    System.out.print("Introduce la clasidicación de la primera evaluación: ");
    double primeraEvaluacion = Double.parseDouble(sc.nextLine());
    System.out.print("Introduce la clasidicación de la segunda evaluación: ");
    double segundaEvaluacion = Double.parseDouble(sc.nextLine());
    System.out.print("Introduce la clasidicación de la tercera evaluación: ");
    double terceraEvaluacion = Double.parseDouble(sc.nextLine());
    double media = (primeraEvaluacion + segundaEvaluacion + terceraEvaluacion) / 3;
    if(media >=5) {
      System.out.println("El alumno ha aprobado con una media de " + media);
    }else {
      System.out.println("el alumno ha suspendido con una media de " + media);
    }

  }

}
