package prog.unidad03.seleccion;
import java.util.Scanner;

public class Actividad301 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce tu peso (en kg) : ");
		double peso= Double.parseDouble(sc.nextLine());
		String mensaje;
		System.out.print("Introduce la altura : ");
		double altura = Double.parseDouble(sc.nextLine());
		double IMC = peso / (altura*altura);
		System.out.print("Su IMC es de " + IMC + (", con un diagnóstico de "));
		if (IMC < 16) {
			mensaje = "Ingreso en el hospital por infrapeso";
			System.out.println(mensaje);
		}else if ((IMC >= 16)&& (IMC < 17)) {
			mensaje = "infrapeso";
			System.out.println(mensaje);
		}else if ((IMC >= 17)&& (IMC < 18)) {
			mensaje = "bajo peso";
			System.out.println(mensaje);
		}else if ((IMC >= 18)&& (IMC < 25)) {
			mensaje = "Peso normal (saludable)";
			System.out.println(mensaje);
		}else if ((IMC >= 25)&& (IMC < 30)) {
			mensaje = "Sobrepeso (obesidad de grado 1)";
			System.out.println(mensaje);
		}else if ((IMC >= 30)&& (IMC < 35)) {
			mensaje = "Sobrepseo cronico (obesidad de grado 2)";
			System.out.println(mensaje);
		}else if ((IMC >= 35)&& (IMC < 40)) {
			mensaje = "Obesidad premórbida (obesidad de grado 3)";
			System.out.println(mensaje);
		}else if (IMC >= 40) {
			mensaje = "Obesidad mórbida (obesidad de grado 4)";
			System.out.println(mensaje);
		}

	}

}
