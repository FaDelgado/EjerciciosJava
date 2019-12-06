package AtletasYPrueba;

public class Atleta {

	public String nombre;
	public Integer nivel;
	public Integer energia;
	
	//Constructor
	public Atleta(String nombre, Integer nivel, Integer energia) {
		super();
		this.nombre = nombre;
		this.nivel = nivel;
		this.energia = energia;
	}
	
	
	
	//Getters and Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getNivel() {
		return nivel;
	}
	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}
	public Integer getEnergia() {
		return energia;
	}
	public void setEnergia(Integer energia) {
		this.energia = energia;
	}
	
	
	
}
