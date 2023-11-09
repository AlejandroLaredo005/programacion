import java.util.Scanner;

public class Practica8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime la base de un cuadrado y su altura para hallar el area ");
		System.out.print("Base: ");
		double base= Double.parseDouble(sc.nextLine());
		System.out.print("Altura: ");
		double altura= Double.parseDouble(sc.nextLine());
		System.out.print("El area del cuadrado es "+(base*altura)+" unidades cuadradas");
	}

}
