package TorreDeControl;

public class Avion implements Volable {
	
	private double horasDeVuelo;
	
	
	
	public Avion(double horasDeVuelo) {
		super();
		this.horasDeVuelo = horasDeVuelo;
	}



	@Override
	public void volar() {
		horasDeVuelo = horasDeVuelo + 13;
		System.out.println("Estoy volando como un Avion. Y ahora acumule " + horasDeVuelo + " horas de vuelo." );
	}
}
