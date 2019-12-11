package AtletasYPrueba;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		//Creamos los atletas
		Atleta Pedro = new Atleta("Pedro", 15, 200);
		Atleta Jose = new Atleta("Jose", 7, 80);
		
		//Creamos las Pruebas
		Prueba saltar = new Prueba(8, 45, "Saltar");
		Prueba correr = new Prueba(5, 90, "Correr");
		Prueba nadar = new Prueba(12, 150, "Nadar");
		Prueba caminar = new Prueba(1, 10, "Caminar");
		Prueba lanzar = new Prueba(10, 120, "Lanzar");
		ArrayList pruebaBombonera = new ArrayList<>();
		pruebaBombonera.add(saltar);
		pruebaBombonera.add(correr);
		pruebaBombonera.add(nadar);
		pruebaBombonera.add(caminar);
		pruebaBombonera.add(lanzar);
		
		//Imprimimos
		/*saltar.puedeRealizar(Pedro);
		correr.puedeRealizar(Pedro);
		nadar.puedeRealizar(Pedro);
		caminar.puedeRealizar(Pedro);
		
		saltar.puedeRealizar(Jose);
		correr.puedeRealizar(Jose);
		nadar.puedeRealizar(Jose);
		caminar.puedeRealizar(Jose);*/
		
		//Creamos Estadios
		Estadios bombonera = new Estadios(50, 50, "bombonera", pruebaBombonera);
		
		//Imprimos
		bombonera.puedeCompetir(Pedro);	
		bombonera.puedeCompetir(Jose);
		
		bombonera.quienEsMejor(Pedro, Jose);
		
	}

}
