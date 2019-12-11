package DandoClases;

public class Docentes extends Empleados{
	
	private int horasCatedra;
	
	public Docentes(String nombre, String apellido, Integer dni, int horasCatedra) {
		super(nombre, apellido, dni);
		this.horasCatedra = horasCatedra;
	}
	
	
	public void darClases() {
		System.out.println("Holis, hoy vamos a ver...");
	}
	public void tomarExamen() {
		System.out.println("Preparate!!!");
	}
	
}
