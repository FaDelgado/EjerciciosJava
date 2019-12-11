package TorreDeControl;

public class Superman implements Volable {

	private int experiencia;
	
	
		
	public Superman(int experiencia) {
		super();
		this.experiencia = experiencia;
	}



	@Override
	public void volar() {
		experiencia = experiencia + 3;
		System.out.println("Estoy volando como un campeon. Y mi experiencia ahora es de " + experiencia + ".");
	}
}
