package prog.unidad03.repeticion;

import java.util.Scanner;

public class SumaParesIntervaloApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("SUMA DE UN INTERVALO");
    int comienzoIntervalo = 0;
    int finIntervalo = 0;
    do {
      System.out.print("Introduce el número de comienzo del intervalo: ");
      comienzoIntervalo = Integer.parseInt(sc.nextLine());
      System.out.print("Introduce el número de fin del intervalo: ");
      finIntervalo = Integer.parseInt(sc.nextLine());
      if(comienzoIntervalo > finIntervalo) {
        System.out.println("Error. El número de inicio debe ser menor o igual al del final. Inténtelo de nuevo");
      }
    }while (comienzoIntervalo > finIntervalo);
    int suma = 0;
    int n = 0;
    for ( n = comienzoIntervalo; n <= finIntervalo; n++) {
      if (n % 2 == 0) {
        suma = suma + n;
      }
    }
    System.out.println("La suma de los números pares desde el " + comienzoIntervalo + " hasta " + finIntervalo + " vale " + suma);
   


  }

}
