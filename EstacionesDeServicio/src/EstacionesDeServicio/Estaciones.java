package EstacionesDeServicio;

public class Estaciones {
	
	private double combustible;
	private double caja;
	private double combustibleVendido;
	private double dineroCompra;
	
	public Estaciones(double combustible, double caja) {
		super();
		this.combustible = combustible;
		this.caja = caja;
	}
	
	public void comprarCombustible(double combustibleVendido) {
		combustible = combustible - combustibleVendido;
		caja = caja + (combustibleVendido*45);
		System.out.println("Hemos facturado $" + caja);
		
	}
	
	
	
}
