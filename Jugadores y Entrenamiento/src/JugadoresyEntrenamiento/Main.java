package JugadoresyEntrenamiento;

public class Main {

	public static void main(String[] args) {
		//Creamos un Jugador
		
		JugadorDeFutbol Messi = new JugadorDeFutbol("Messi", 100, 100, 0, 100);
		JugadorDeFutbol Suarez = new JugadorDeFutbol("Suarez", 100, 100, 0, 100);
		
		//Creo una SesionDeEntrenamiento
		SesionDeEntrenamiento miercoles = new SesionDeEntrenamiento(50);
		
		
		//Imprimo
		Messi.hacerGol();
		Messi.correr();
		
		miercoles.entrenarA(Messi);
		miercoles.entrenarA(Suarez);
		

	}

}
