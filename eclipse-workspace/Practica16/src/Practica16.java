import java.util.Scanner;

public class Practica16 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Dime que cantidad de dinero ha invertido la primera persona: ");
		double inversor1= Double.parseDouble(sc.nextLine());
		System.out.print("Dime que cantidad de dinero ha invertido la segunda persona: ");
		double inversor2= Double.parseDouble(sc.nextLine());
		System.out.print("Dime que cantidad de dinero ha invertido la tercera persona: ");
		double inversor3= Double.parseDouble(sc.nextLine());
		double total= inversor1 + inversor2 + inversor3;
		System.out.println("El primer inversor ha invertido " + inversor1*100/total + "%");
		System.out.println("El segundo inversor ha invertido " + inversor2*100/total + "%");
		System.out.println("El tercer inversor ha invertido " + inversor3*100/total + "%");


	}

}
