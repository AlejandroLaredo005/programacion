import java.util.Scanner;

public class Practica15 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		final double COMISION= 0.10;
		System.out.print("Dime el sueldo base que cobras: ");
		double sueldoBase= Double.parseDouble(sc.nextLine());
		System.out.print("Dime el precio de la primera venta: ");
		double venta1= Double.parseDouble(sc.nextLine());
		System.out.print("Dime el precio de la segunda venta: ");
		double venta2= Double.parseDouble(sc.nextLine());
		System.out.print("Dime el precio de la tercera venta: ");
		double venta3= Double.parseDouble(sc.nextLine());
		double sueldoFinal= sueldoBase +((venta1*COMISION)+(venta2*COMISION)+(venta3*COMISION));
		System.out.print("El sueldo final es de " + sueldoFinal + " euros");
	}

}
