import java.util.Scanner;

public class Practica13 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		final int CONVERTIDOR= 1024;
		System.out.print("Introduce la cantidad de MB que quieras y te dire cuantos KB serian: ");
		int mb= Integer.parseInt(sc.nextLine());
		System.out.print(mb + "MB equivalen a " + (mb * CONVERTIDOR) + "KB");

	}

}
