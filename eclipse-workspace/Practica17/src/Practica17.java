import java.util.Scanner;
public class Practica17 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Dime el presupuesto anual del hospital: ");
		double presupuesto= Double.parseDouble(sc.nextLine());
		double ginecologia = 40*presupuesto/100;
		double pediatria= 25*presupuesto/100;
		double traumatologia = 35*presupuesto/100;
		System.out.println("El presupuesto de ginecologia es de " + ginecologia + " euros");
		System.out.println("El presupuesto de pedriatria es de " + pediatria + " euros");
		System.out.println("El presupuesto de traumatologia es de " + traumatologia + " euros");

	}

}
