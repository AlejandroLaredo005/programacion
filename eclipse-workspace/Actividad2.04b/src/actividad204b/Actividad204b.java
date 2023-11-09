package actividad204b;
import java.util.Scanner;
import paquete1.Fraccion;

public class Actividad204b {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Dime el numerador del primer número: ");
		int numerador = Integer.parseInt(sc.nextLine());
		System.out.print("Dime el denominador del primer número: ");
		int denominador = Integer.parseInt(sc.nextLine());
		Fraccion numero1 = new Fraccion(numerador,denominador);
		System.out.print("Dime el numerador del segundo número: ");
		numerador = Integer.parseInt(sc.nextLine());
		System.out.print("Dime el denominador del segundo número: ");
		denominador = Integer.parseInt(sc.nextLine());
		Fraccion numero2 = new Fraccion(numerador,denominador);
		Fraccion suma = numero1.suma(numero2);
		System.out.println("La suma de las dos fracciones es de " + suma.getNumerador() + "/" + suma.getDenominador());
		Fraccion resta = numero1.resta(numero2);
		System.out.println("La resta de las dos fracciones es de " + resta.getNumerador() + "/" + resta.getDenominador());
		Fraccion producto = numero1.producto(numero2);
		System.out.println("El producto de las dos fracciones es de " + producto.getNumerador() + "/" + producto.getDenominador());
		Fraccion division = numero1.division(numero2);
		System.out.println("El producto de las dos fracciones es de " + division.getNumerador() + "/" + division.getDenominador());
		numerador = suma.getNumerador();
		denominador = suma.getDenominador();
		paquete2.Fraccion simplificacionsuma = new paquete2.Fraccion(numerador,denominador).simplifica();
		System.out.println("La simplificación de la suma es " + simplificacionsuma.getNum());
		numerador = resta.getNumerador();
		denominador = resta.getDenominador();
		paquete2.Fraccion simplificacionresta = new paquete2.Fraccion(numerador,denominador).simplifica();
		System.out.println("La simplificación de la resta es " + simplificacionresta.getNum());
		numerador = producto.getNumerador();
		denominador = producto.getDenominador();
		paquete2.Fraccion simplificacionproducto = new paquete2.Fraccion(numerador,denominador).simplifica();
		System.out.println("La simplificación del producto es " + simplificacionproducto.getNum());
		numerador = division.getNumerador();
		denominador = division.getDenominador();
		paquete2.Fraccion simplificaciondivision = new paquete2.Fraccion(numerador,denominador).simplifica();
		System.out.println("La simplificación de la division es " + simplificaciondivision.getNum());
		
	}

}
