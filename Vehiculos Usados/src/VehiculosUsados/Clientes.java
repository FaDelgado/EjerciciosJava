package VehiculosUsados;

public class Clientes {

	public String nombre;
	public String apellido;
	public String datosDeContacto;
	
	//Constructor
	public Clientes(String nombre, String apellido, String datosDeContacto) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.datosDeContacto = datosDeContacto;
	}
	
	
	
	
	
	
	
	//Setters and Getters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDatosDeContacto() {
		return datosDeContacto;
	}
	public void setDatosDeContacto(String datosDeContacto) {
		this.datosDeContacto = datosDeContacto;
	}
	
	
}
