package AtletasYPrueba;

public class Prueba {

	public Integer dificultadRequerida;
	public Integer energiaRequerida;
	public String nombrePrueba;
	
	//Constructor
	public Prueba(Integer dificultadRequerida, Integer energiaRequerida, String nombrePrueba) {
		super();
		this.dificultadRequerida = dificultadRequerida;
		this.energiaRequerida = energiaRequerida;
	}
	
	//Metodo puedeRealizar
	public Boolean puedeRealizar(Atleta atleta) {
		if(atleta.nivel >= dificultadRequerida && atleta.energia > energiaRequerida ) {
		System.out.println(atleta.getNombre() + " Puede realizar la Prueba.");
			return true;
		}
		System.out.println(atleta.getNombre() + " No puede realizar la Prueba.");
			return false;
	}
	
	//Getters and Setters
	public Integer getDificultadRequerida() {
		return dificultadRequerida;
	}
	public void setDificultadRequerida(Integer dificultadRequerida) {
		this.dificultadRequerida = dificultadRequerida;
	}
	public Integer getEnergiaRequerida() {
		return energiaRequerida;
	}
	public void setEnergiaRequerida(Integer energiaRequerida) {
		this.energiaRequerida = energiaRequerida;
	}
	public String getNombrePrueba() {
		return nombrePrueba;
	}
	public void setNombrePrueba() {
		this.nombrePrueba = nombrePrueba;
	}
}
