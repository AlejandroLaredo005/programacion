import java.util.Scanner;

public class Practica14 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Introduce la nota que tuviste en el primer examen: ");
		double primerExamen= Double.parseDouble(sc.nextLine());
		System.out.print("Introduce la media que deseas: ");
		double media= Double.parseDouble(sc.nextLine());
		double segundoExamen= (media*2)-primerExamen;
		System.out.print("La nota que deber sacar en el segundo examen es de " + segundoExamen);

	}

}
