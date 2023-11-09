import java.util.Scanner;

public class Practica11 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Introduce las horas trabajadas semanalmente para hallar el salario semanal: ");
		int horas= Integer.parseInt(sc.nextLine());
		System.out.print(" El salario semanal es de "+(horas*12)+" euros");

	}

}
