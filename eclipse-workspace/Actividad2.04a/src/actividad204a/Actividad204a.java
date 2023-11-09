package actividad204a;
import es.iespablopicasso.programacion.unidad02.actividad0201.GranHermano;

public class Actividad204a {

	public static void main(String[] args) {
		GranHermano persona1= new GranHermano(23);
		GranHermano persona2= new GranHermano(17);
		GranHermano persona3= new GranHermano(58);
		System.out.println(GranHermano.getNumeroObjetosCreados());
		GranHermano persona4= new GranHermano(65);
		GranHermano persona5= new GranHermano(11);
		System.out.println(GranHermano.getNumeroObjetosCreados());
	}

}
