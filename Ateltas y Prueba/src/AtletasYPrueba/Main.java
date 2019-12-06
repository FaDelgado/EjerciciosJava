package AtletasYPrueba;

public class Main {

	public static void main(String[] args) {

		//Creamos los atletas
		Atleta Pedro = new Atleta("Pedro", 10, 100);
		Atleta Jose = new Atleta("Jose", 7, 80);
		
		//Creamos las 3 Pruebas
		Prueba saltar = new Prueba(8, 45);
		Prueba correr = new Prueba(5, 90);
		Prueba nadar = new Prueba(12, 150);
		Prueba caminar = new Prueba(1, 10);
		
		//Imprimimos
		saltar.puedeRealizar(Pedro);
		correr.puedeRealizar(Pedro);
		nadar.puedeRealizar(Pedro);
		caminar.puedeRealizar(Pedro);
		
		saltar.puedeRealizar(Jose);
		correr.puedeRealizar(Jose);
		nadar.puedeRealizar(Jose);
		caminar.puedeRealizar(Jose);
	}

}
