package prog.unidad03.excepciones;

import java.util.Scanner;

public class MayorMenorMediaExcepcionesApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("MAYOR, MENOR Y MEDIA ( A PRUEBA DE USUARIOS MALICIOSOS");
    boolean condicion = true;
    int repeticiones = 0;
    double numeroIntroducido = 0;
    double mayor = numeroIntroducido;
    double menor = numeroIntroducido;
    double media = numeroIntroducido;
    do {
    try {
     System.out.print("¿Cuántos números deseas introducir? ");
     repeticiones = Integer.parseInt(sc.nextLine());
    condicion = false;
    }catch(java.lang.NumberFormatException e) {
      System.out.println("El valor introducido no es un número correcto. Intentalo de nuevo");
      condicion = true;
    }
    }while(condicion);
    do {
    try {
    System.out.print("Introduce el número 1: ");
    numeroIntroducido = Double.parseDouble(sc.nextLine());
    mayor = numeroIntroducido;
    menor = numeroIntroducido;
    media = numeroIntroducido;
    condicion = false;
    }catch(java.lang.NumberFormatException e) {
      System.out.println("El valor introducido no es un número correcto. Intentalo de nuevo");
      condicion = true;
    }
    }while(condicion);
    int n = 2;
    do {
    for(n = n; n <= repeticiones; n++) {
      try {
      System.out.print("Introduce el número " + n + ": ");
      numeroIntroducido = Double.parseDouble(sc.nextLine());
      condicion = false;
      media = media + numeroIntroducido;
      }catch(java.lang.NumberFormatException e) {
        System.out.println("El valor introducido no es un número correcto. Intentalo de nuevo");
        condicion = true;
        n--;
        
      }
      if(mayor < numeroIntroducido) {
        mayor = numeroIntroducido;
      }
      if(menor > numeroIntroducido) {
        menor = numeroIntroducido;
      }
    }
    }while(condicion);
    System.out.println("El mayor de los números es " + mayor);
    System.out.println("El menor de los números es " + menor);
    System.out.println("La media de todos los números vale " + (media / repeticiones));
  }
}
