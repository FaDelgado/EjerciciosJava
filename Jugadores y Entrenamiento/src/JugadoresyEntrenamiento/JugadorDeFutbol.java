package JugadoresyEntrenamiento;

public class JugadorDeFutbol {
	public String Nombre;
	public Integer Energia;
	public Integer Felicidad;
	public Integer Goles;
	public Integer Experiencia;
	
	//Constructor
	public JugadorDeFutbol(String nombre, Integer energia, Integer felicidad, Integer goles, Integer experiencia) {
		super();
		Nombre = nombre;
		Energia = energia;
		Felicidad = felicidad;
		Goles = goles;
		Experiencia = experiencia;
	}
	
	//Metodo hacerGol
	public void hacerGol() {
		Energia = Energia -5;
		Felicidad = Felicidad + 10;
		Goles = Goles + 1;
		System.out.println("GOOOL!");
	}
	//Metodo correr
	public void correr() {
		Energia = Energia - 10;
		System.out.println("No me dan mas las piernas");
	}
	
	
	
	//Setters and Getters
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public Integer getEnergia() {
		return Energia;
	}
	public void setEnergia(Integer energia) {
		Energia = energia;
	}
	public Integer getFelicidad() {
		return Felicidad;
	}
	public void setFelicidad(Integer felicidad) {
		Felicidad = felicidad;
	}
	public Integer getGoles() {
		return Goles;
	}
	public void setGoles(Integer goles) {
		Goles = goles;
	}
	public Integer getExperiencia() {
		return Experiencia;
	}
	public void setExperiencia(Integer experiencia) {
		Experiencia = experiencia;
	}
	
	
}
