package JugadoresyEntrenamiento;

public class SesionDeEntrenamiento {
	
	public Integer ExperienciaEntrenamiento;
	
		
	public SesionDeEntrenamiento(Integer experienciaEntrenamiento) {
		super();
		ExperienciaEntrenamiento = experienciaEntrenamiento;
	}





	//Metodo entrarA
	public void entrenarA(JugadorDeFutbol jugadorDeFutbol) {
		System.out.println(jugadorDeFutbol.Nombre + " Tu experiencia antes de entrenar es de: " + jugadorDeFutbol.getExperiencia());
		jugadorDeFutbol.correr();
		jugadorDeFutbol.hacerGol();
		jugadorDeFutbol.correr();
		jugadorDeFutbol.setExperiencia(jugadorDeFutbol.getExperiencia() + ExperienciaEntrenamiento);
		System.out.println(jugadorDeFutbol.getNombre() + " Tu experiencia luego de entrenar es de: " + jugadorDeFutbol.getExperiencia());
	}
	
	
	
	
	
	//Getter and Setter

	public Integer getExperienciaEntrenamiento() {
		return ExperienciaEntrenamiento;
	}

	public void setExperienciaEntrenamiento(Integer experienciaEntrenamiento) {
		ExperienciaEntrenamiento = experienciaEntrenamiento;
	}
	
	
	
	
	

}
