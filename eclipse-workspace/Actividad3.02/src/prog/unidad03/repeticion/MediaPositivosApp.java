package prog.unidad03.repeticion;

import java.util.Scanner;

public class MediaPositivosApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("CÁLCULO DE LA MEDIA");
    int numeroIntroducido = 0;
    double media = 0;
    int contador = 0;
    do {
      System.out.print("Introduce un número real positivo o 0 (negativo para terminar): ");
      numeroIntroducido = Integer.parseInt(sc.nextLine());
      if(numeroIntroducido >= 0) {
        media = media + numeroIntroducido;
        contador++;
      }
    }while (numeroIntroducido >= 0);
    if(contador == 0) {
      System.out.println("La media de los " + contador + " números introducidos vale 0"); 
    }else {
    System.out.println("La media de los " + contador + " números introducidos vale " + (media / contador));
    }
  }

}
