package prog.unidad03.seleccion;

import java.util.Scanner;

public class Actividad301e {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("PROGRAMA CALCULADOR DE SALARIOS");
    System.out.print("Introduce las horas trabajadas esta semana: ");
    int horasTrabajadas = Integer.parseInt(sc.nextLine());
    int horasExtra = horasTrabajadas - 40;
    if(horasTrabajadas > 40) {
      System.out.print("El resultado por trabajar 40 horas semanales y " + horasExtra + " horas extra es de ");
      horasTrabajadas = (horasTrabajadas - horasExtra) * 16;
      horasExtra = horasExtra * 20;
      horasTrabajadas = horasTrabajadas + horasExtra;
      System.out.println(horasTrabajadas);
    }else {
      System.out.print("El resultado por trabajar " + horasTrabajadas + " horas semanales es de ");
      horasTrabajadas = horasTrabajadas * 16;
      System.out.println(horasTrabajadas);
    }
  }

}
