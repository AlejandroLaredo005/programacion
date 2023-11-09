package prog.unidad03.seleccion;

import java.util.Scanner;

public class Actividad301b {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("PROGRAMA DE CÁLCULO DE ÍNDICE DE MASA CORPORAL");
	  System.out.print("Introduce el valor para el coeficiente a: ");
	  double a = Double.parseDouble(sc.nextLine());
	  System.out.print("Introduce el valor para el coeficiente b: ");
    double b = Double.parseDouble(sc.nextLine());
    System.out.print("Introduce el valor para el coeficiente c: ");
    double c = Double.parseDouble(sc.nextLine());
    double raizCuadrada = ((b*b)-(4*a*c));
    if(raizCuadrada < 0) {
      System.out.println("La ecuación no tiene valores reales");
    }else if(raizCuadrada == 0) {
      System.out.println("El valor de x es " + (-b/(2*a)) + ". La solución es repetida");
    }else {
      raizCuadrada = Math.sqrt(raizCuadrada);
      double resultado = ((-b+raizCuadrada)/(2*a));
      System.out.println("Un valor de x es " + resultado);
      resultado = ((-b-raizCuadrada)/(2*a));
      System.out.println("Otro valor de x es " + resultado);
    }
      
      
      
    

	}

}
