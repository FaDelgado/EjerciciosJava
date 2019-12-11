package EstacionesYAutos;

public class MainEstacionesYAutos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Estaciones ypf = new Estaciones("YPF", 5000, 40, 10000);
		Estaciones shell = new Estaciones("SHELL", 3500, 25, 5000);

		Autos ford = new Autos("FORD", "Champagne", 50, 2500);
		Autos ferrari = new Autos("FERRARI", "Roja", 15, 8500);
		
		
		ypf.servirCombustible(ford, 100);
		shell.servirCombustible(ferrari, 50);
		
		
	}

}
