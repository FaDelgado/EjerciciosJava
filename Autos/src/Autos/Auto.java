package Autos;

public class Auto {
	private String marca;
	private double km;
	
	
	
	
	public Auto(String marca, double km) {
		super();
		this.marca = marca;
		this.km = km;
	}




	public void viajar(double kmRecorrido) {
		km = km + kmRecorrido;
		
	}




	public String getMarca() {
		return marca;
	}




	public void setMarca(String marca) {
		this.marca = marca;
	}




	public double getKm() {
		return km;
	}




	public void setKm(double km) {
		this.km = km;
	}
	
	
	
	
}
