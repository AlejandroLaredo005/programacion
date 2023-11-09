import java.util.Scanner;

public class Practica5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Introduce 2 numeros enteros y hallare la suma, diferencia, producto, division y modulo: ");
		int numero1= Integer.parseInt(sc.nextLine());
		int numero2= Integer.parseInt(sc.nextLine());
		System.out.println("La suma de "+numero1+ " y "+numero2+ " es: "+(numero1+numero2));
		System.out.println("La diferencia de "+numero1+ " y "+numero2+ " es: "+Math.abs(numero1-numero2));
		System.out.println("El producto de "+numero1+ " y "+numero2+ " es: "+(numero1*numero2));
		System.out.println("La division de "+numero1+ " y "+numero2+ " es: "+(numero1/numero2));
		System.out.println("El modulo de "+numero1+ " y "+numero2+ " es: "+(numero1%numero2));
		
	}

}
