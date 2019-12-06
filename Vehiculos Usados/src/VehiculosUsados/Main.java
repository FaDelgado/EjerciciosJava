package VehiculosUsados;

public class Main {

	public static void main(String[] args) {
		//Creamos un auto
		Autos Ford = new Autos("Ford", "Mustang", 2018, "Amarillo", 0);
		Autos Fiat = new Autos("Fiat", "Punto", 2016, "Rojo", 15000);
		Autos Renault = new Autos("Renault", "Clio", 2015, "Negro", 25000);
		
		//Creamos un cliente
		Clientes Facu = new Clientes("Facu", "Delgado", "facu@gmail.com");
		Clientes Fede = new Clientes("Fede", "Ortega", "26125112332");
		
		//Registramos una venta
		Concesionarias LaPlata = new Concesionarias("LaPlata");
		
		LaPlata.registrarVenta(Ford, Fede, 25000.00);
		LaPlata.registrarVenta(Renault, Facu, 10000.00);
				

	}

}
