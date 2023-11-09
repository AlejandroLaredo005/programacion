import java.util.Scanner;

public class Practica12 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		final double PI= 3.14159;
		System.out.println("Dime el radio y la altura de un cono para hallar el volumen ");
		System.out.print("Radio: ");
		double radio= Double.parseDouble(sc.nextLine());
		radio=radio*radio;
		System.out.print("Altura: ");
		double altura= Double.parseDouble(sc.nextLine());
		double volumen= (PI*radio*altura*0.333333);
		System.out.print("El volumen del cono es de "+volumen);

	}

}
