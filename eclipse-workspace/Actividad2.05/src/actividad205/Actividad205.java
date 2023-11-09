package actividad205;
import java.util.Scanner;

public class Actividad205 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escriba una cadena de texto: ");
		String cadena1 = sc.nextLine();
		System.out.print("Escriba otra cadena de texto: ");
		String cadena2 = sc.nextLine();
		String cadena3 = cadena1+cadena2;
		System.out.println("La longitud de las dos cadenas es de " + cadena3.length());
		System.out.println("¿Las cadenas están vacías? " + cadena3.isEmpty());
		System.out.println("¿Las cadenas sólo tienen caracteres blancos? " + cadena3.isBlank());
		System.out.println("La concatenación de ambas cadenas es " + cadena3);
		System.out.println("¿Son ambas cadenas iguales teniendo en cuenta mayusculas y minusculas? " + cadena1.equals(cadena2));
		System.out.println("¿Son ambas cadenas iguales sin tener en cuenta mayusculas y minusculas? " + cadena1.equalsIgnoreCase(cadena2));
		System.out.println("¿Qué valor dan las cadenas al compararse alfabeticamente sin importar mayusculas y minusculas? " + cadena1.compareToIgnoreCase(cadena2));
		System.out.println("¿Qué valor dan las cadenas al compararse alfabeticamente teniendo en cuenta mayusculas y minusculas? " + cadena1.compareTo(cadena2));
		System.out.println("¿La primera cadena contiene a la segunda? " + cadena1.contains(cadena2));
		System.out.println("¿La primera cadena comienza por la segunda? " + cadena1.startsWith(cadena2));
		System.out.println("¿La primera cadena termina por la segunda? " + cadena1.endsWith(cadena2));
		System.out.println("El primer caracter de la primera cadena es " + cadena1.charAt(0) + " y el ultimo es " + cadena1.charAt(cadena1.length()-1));
		System.out.println("La primera cadena sin el primer caracter es " + cadena1.substring(1));
		System.out.println("La primera cadena en minusculas es " + cadena1.toLowerCase());
		System.out.println("La primera cadena en mayusculas es " + cadena1.toUpperCase());
		

	}

}
