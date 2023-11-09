import java.util.Scanner;
public class Actividadb {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print(" Dime la parte real del numero complejo :");
		double parteReal1 = Double.parseDouble(sc.nextLine());
		System.out.print(" Dime la parte imaginaria del numero complejo :");
		double parteImaginaria1 = Double.parseDouble(sc.nextLine());
		Complejo complejo1 = new Complejo(parteReal1, parteImaginaria1);
		System.out.print(" Dime la parte real del segundo numero complejo :");
		double parteReal2 = Double.parseDouble(sc.nextLine());
		System.out.print(" Dime la parte imaginaria del segundo numero complejo :");
		double parteImaginaria2 = Double.parseDouble(sc.nextLine());
		Complejo complejo2 = new Complejo(parteReal2, parteImaginaria2);
		double parteReal3 = 0;
		double parteImaginaria3 = 0;
		Complejo complejo3 = new Complejo(parteReal3 , parteImaginaria3);
		complejo3 = complejo1.sumar(complejo2);
		System.out.println(" La parte real del complejo en la suma es " + complejo3.getParteReal()+ " Y la parte imaginaria es " + complejo3.getParteImaginaria() + "i");
		complejo3 = complejo1.restar(complejo2);
		System.out.println(" La parte real del complejo en la resta es " + complejo3.getParteReal()+ " Y la parte imaginaria es " + complejo3.getParteImaginaria() + "i");
		complejo3 = complejo1.multiplicar(complejo2);
		System.out.println(" La parte real del complejo en la multiplicacion es " + complejo3.getParteReal()+ " Y la parte imaginaria es " + complejo3.getParteImaginaria() + "i");
		complejo3 = complejo1.dividir(complejo2);
		System.out.println(" La parte real del complejo en la division es " + complejo3.getParteReal()+ " Y la parte imaginaria es " + complejo3.getParteImaginaria() + "i");
	}

}
