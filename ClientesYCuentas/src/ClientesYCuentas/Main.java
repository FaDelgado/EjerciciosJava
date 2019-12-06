package ClientesYCuentas;

public class Main {

	public static void main(String[] args) {
		// Creo un cliente
		Cliente Facu = new Cliente("Facu", "Delgado");
		Cliente Juan = new Cliente("Juan", "Perez");
		
		
		
		//Creo una cuenta
		Cuenta uno = new Cuenta(1, 500.00, Facu);
		Cuenta dos = new Cuenta(2, 150.0, Juan);
	
		//Imprimo
		uno.depositar(65.5);
		uno.extraccion(25.25);
		
		dos.depositar(1500.00);
		dos.extraccion(50.0);
	
	
	}
	
}
