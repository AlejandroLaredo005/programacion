
public class Cuenta {

	public static void main(String[] args) {
		CuentaCorriente cuentaCorriente = new CuentaCorriente("11111");
		cuentaCorriente.ingresar(1000);
		System.out.println(cuentaCorriente.getSaldo());
		cuentaCorriente.retirar(1100);
		System.out.println(cuentaCorriente.getSaldo());
		cuentaCorriente.retirar(900);
		System.out.println(cuentaCorriente.getSaldo());
		cuentaCorriente.retirar(100);
		System.out.println(cuentaCorriente.getSaldo());
		cuentaCorriente.ingresar(350);
		System.out.println(cuentaCorriente.getSaldo());
		cuentaCorriente.retirar(400);
		System.out.println(cuentaCorriente.getSaldo());
	}

}
