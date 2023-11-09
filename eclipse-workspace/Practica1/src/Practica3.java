import java.util.Scanner;

public class Practica3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final double IVA=1.21;
		System.out.print("Introduce el valor de la base imponible: ");
		Double base= Double.parseDouble(sc.nextLine());
		System.out.print(" El valor de la base con el IVA es de "+(base*IVA));
	

	}

}
