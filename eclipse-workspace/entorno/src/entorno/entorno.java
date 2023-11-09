package entorno;
import java.util.Scanner;

public class entorno {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el valor de la temperatura: ");
		int n1=12;
		int n2=65;
		int n3=53;
		Double temperatura= Double.parseDouble(sc.nextLine());
		if (temperatura > 25) {
		    System.out.println("A la playa!!!");
		} else {
		    System.out.println("Esperando al buen tiempo...");
		}
		

	}

}
