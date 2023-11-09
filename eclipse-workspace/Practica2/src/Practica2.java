import java.util.Scanner;

public class Practica2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final double CONVERTIDOR=166.386;
		System.out.print("Introduce los euros que quieres convertir a pesetas: ");
		double euros= Double.parseDouble(sc.nextLine());
		System.out.print(euros+" euros valen "+(euros*CONVERTIDOR)+" pesetas");
		
		
	}

}
