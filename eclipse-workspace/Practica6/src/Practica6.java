import java.util.Scanner;

public class Practica6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final double CONVERTIDOR= 166.386;
		System.out.print("Introduce las pesetas que quieres convertir a euros: ");
		double pesetas= Double.parseDouble(sc.nextLine());
		System.out.print(pesetas+" pesetas valen "+(pesetas/CONVERTIDOR)+" euros");
		
		
	}

}
