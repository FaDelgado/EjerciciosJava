package DandoClases;

public class Administrativos extends Empleados{
	
	public Administrativos(String nombre, String apellido, Integer dni) {
		super(nombre, apellido, dni);
		// TODO Auto-generated constructor stub
	}

	public void administrar() {
		System.out.println("Estoy ocupado... haciendo... cosas...");
	}
	
	public void reportes() {
		System.out.println("Para maniana te los tengo.");
	}
	

}
