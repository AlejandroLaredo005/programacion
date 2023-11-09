package prog.unidad03.repeticion;

import java.util.Scanner;

public class CuadriculaDiezPorDiez {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("NÚMEROS DEL 1 AL 100");
    int n = 1;
    int repetición = 1;
        for(n = 1; n <= 100; n++) {
          System.out.print(n + "  ");
          repetición++;
          if(n <= 10) {
            System.out.print(" ");
          }
          if(repetición == 11) {
            System.out.println();
            repetición = 1;
          }
        }
  }

}
