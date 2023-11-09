package prog.unidad03.repeticion;

import java.util.Scanner;

public class MayorMenorMediaApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("MAYOR, MENOR Y MEDIA");
    System.out.print("¿Cuántos números deseas introducir? ");
    int repeticiones = Integer.parseInt(sc.nextLine());
    System.out.print("Introduce el número 1: ");
    double numeroIntroducido = Double.parseDouble(sc.nextLine());
    double mayor = numeroIntroducido;
    double menor = numeroIntroducido;
    double media = numeroIntroducido;
    int n = 2;
    for(n = 2; n <= repeticiones; n++) {
      System.out.print("Introduce el número " + n + ": ");
      numeroIntroducido = Double.parseDouble(sc.nextLine());
      media = media + numeroIntroducido;
      if(mayor < numeroIntroducido) {
        mayor = numeroIntroducido;
      }
      if(menor > numeroIntroducido) {
        menor = numeroIntroducido;
      }
    }
    System.out.println("El mayor de los números es " + mayor);
    System.out.println("El menor de los números es " + menor);
    System.out.println("La media de todos los números vale " + (media / repeticiones));
  }

}
