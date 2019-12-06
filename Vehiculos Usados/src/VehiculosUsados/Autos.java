package VehiculosUsados;

public class Autos {

	public String marca;
	public String modelo;
	public Integer anioDeFabricacion;
	public String color;
	public Integer kilometraje;
	
	//Constructor
	public Autos(String marca, String modelo, Integer anioDeFabricacion, String color, Integer kilometraje) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anioDeFabricacion = anioDeFabricacion;
		this.color = color;
		this.kilometraje = kilometraje;
	}
	
	
	
	
	
	//Setters and Getters
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getAnioDeFabricacion() {
		return anioDeFabricacion;
	}

	public void setAnioDeFabricacion(Integer anioDeFabricacion) {
		this.anioDeFabricacion = anioDeFabricacion;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(Integer kilometraje) {
		this.kilometraje = kilometraje;
	}
	
	
}
