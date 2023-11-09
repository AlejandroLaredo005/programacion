package prog.unidad03.seleccion;

import java.util.Scanner;

public class CalculaImporteApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("DESCUENTOS AL COMPRAR");
    System.out.print("Introduce el importe de la compra en euros: ");
    double compra = Double.parseDouble(sc.nextLine());
    if (compra > 100) {
      System.out.print("Como la compra es superior a 100, la compra tiene un descuento del 20% de descuento. El importe a pagar es de ");
      compra = (compra - ((compra * 20) / 100));
      System.out.println(compra);
    }else {
      System.out.println("No se aplica ningún descuento ya que la compra no supera los 100 euros. Por lo tanto la compra es de " + compra);
    }
  }

}
