import java.util.Scanner;

public class Practica10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Introduce el valor de la base imponible: ");
		double base= Double.parseDouble(sc.nextLine());
		System.out.print("Introduce el valor del IVA para aplicarselo: ");
		double iva= Double.parseDouble(sc.nextLine());
		System.out.print("El valor de la base imponible con el IVA es de "+(base+(iva/100*base)));

	}

}
