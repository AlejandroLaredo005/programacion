import java.util.Scanner;
public class Actividadclases {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Persona persona1 = new Persona();
		persona1.edad = 25;
		persona1.peso = 75.4;
		persona1.numeroHijos = 0;
		Persona persona2 = new Persona();
		persona2.edad = 65;
		persona2.peso = 65;
		persona2.numeroHijos = 3;
		System.out.println(persona1.edad);
		System.out.println(persona1.peso);
		System.out.println(persona1.numeroHijos);
		System.out.println(persona2.edad);
		System.out.println(persona2.peso);
		System.out.println(persona2.numeroHijos);
		boolean igual = persona1 == persona2;
		System.out.println(igual);
		Persona persona3 = new Persona();
		persona3.edad = 33;
		persona3.peso = 80.43;
		persona3.numeroHijos = 1;
		Persona persona4 = new Persona();
		persona4 = persona3;
		persona4.peso = 79.65;
		System.out.println(persona3.edad);
		System.out.println(persona3.peso);
		System.out.println(persona3.numeroHijos);
		System.out.println(persona4.edad);
		System.out.println(persona4.peso);
		System.out.println(persona4.numeroHijos);
		System.out.println("Esto ocurre ya que al igualar las variables, los atributos tambien se igualan aunque varien");
		boolean igual2 = persona3 == persona4;
		System.out.println( igual2);
		// En el ejercicio 5 en la primera sale 25, en la segunda sale 40 y en la tercera no sale nada porque al ponerle null no referencia a ningun objeto
		int edad = Integer.parseInt(sc.nextLine());
		double peso= Double.parseDouble(sc.nextLine());
		int hijos = Integer.parseInt(sc.nextLine());
		Persona persona5 = new Persona();
		persona5.edad = edad;
		persona5.peso = peso;
		persona5.numeroHijos = hijos;
		System.out.println(persona5.edad);
		System.out.println(persona5.peso);
		System.out.println(persona5.numeroHijos);
	}

}
