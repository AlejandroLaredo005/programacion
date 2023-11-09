package prog.unidad01.actividad206.ParalelogramosApp;

import java.util.Random;
import java.util.Scanner;
import es.iespablopicasso.programacion.bloque02.figuras.Paralelogramo;

public class ParalelogramosApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("EXAMEN DE ALEJANDRO. PROPIEDADES DE LOS PARALELOGRAMOS");
    System.out.print("Introduzca la longitud de los lados horizontales: ");
    double ladoHorizontal = Double.parseDouble(sc.nextLine());
    System.out.print("introduzca el límite mínimo de los posibles valores de la longitud del lado vertical: ");
    double limiteMinimo = Double.parseDouble(sc.nextLine());
    System.out.print("introduzca el límite máximo de los posibles valores de la longitud del lado vertical: ");
    double limiteMaximo = Double.parseDouble(sc.nextLine());
    System.out.print("La longitud del lado vertical obtenida al azar es de:  ");
   // Random.doubles(limiteMinimo , limiteMaximo); 
    double ladoVertical = 5;
    System.out.println(ladoVertical);
    Paralelogramo paralelogramo = new Paralelogramo(ladoHorizontal, ladoVertical);
    String areaPerimetro = paralelogramo.getAreaPerimetro();
    String area = areaPerimetro.substring(0,4);
    String perimetro = areaPerimetro.substring(5,areaPerimetro.length());
    System.out.println("El area del palalelogramo vale " + area + " y el perímetro vale " + perimetro);
    System.out.print("Introduzca el factor real positivo por el que quiere ampliar (mayor que 1) o reducir(menor que 1) el paralelogramo: ");
    double escala = Double.parseDouble(sc.nextLine());
    paralelogramo.escala(escala);
    System.out.println("La suma del área y del perímetro es de ");
    area = areaPerimetro.substring(0,4);
    perimetro = areaPerimetro.substring(5,areaPerimetro.length());
    System.out.println("Después del escalado, el área del paralelogramo vale ahora " + area + " y el perímetro vale ahora " + perimetro);
    System.out.println("La suma del área y del perímetro es de ");
  }

}
