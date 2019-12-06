package Tripode;

public class Tripode {
	
	public Boolean plegado;
	public Integer alturaMinima;
	public Integer alturaMaxima;
	public Integer alturaActual;
	
	//Costructor
	public Tripode(Boolean plegado, Integer alturaMinima, Integer alturaMaxima, Integer alturaActual) {
		super();
		this.plegado = plegado;
		this.alturaMinima = alturaMinima;
		this.alturaMaxima = alturaMaxima;
		this.alturaActual = alturaActual;
	}
	
	//Metodo definirAltura
	public Integer definirAltura(int nuevaAltura) {
		if(nuevaAltura <= alturaMaxima) {
		alturaActual = nuevaAltura;
		}else {
			System.out.println("La nuevaAltura " + nuevaAltura + " no puede ser mas grande que la altura maxima.");
		}
		return alturaActual;				 
	}
	
	//Metodo plegar
	public Boolean plegar() {
		if(alturaActual > alturaMinima && alturaActual <= alturaMaxima) {
			return true;
		}
		return false;
	}
	
	//Metodo desplegar
	public Boolean desplegar() {
		if(alturaActual >= alturaMinima && alturaActual < alturaMaxima) {
			return true;
		}
		return false;
	}
	
	//Metodo guardar
	public void guardar() {
		alturaActual = alturaMinima;
		plegado = true;
	}
	
	//Metodo listoParaGuardar?
	public Boolean listoParaGuardar(){
		if(plegado && alturaActual == alturaMinima) {
			System.out.println("Si, esta listo para guardar.");
			return true;
		}
		return false;
	}
	
	//Metodo usar
	public void usar() {
		alturaActual = alturaMaxima/2;
		plegado = false;
	}
	
	//Metodo listoParaUsar
	public Boolean listoParaUsar() {
		if(!plegado && alturaActual >= alturaMaxima/2) {
			System.out.println("Esta listo para usar.");
			return true;
		}
		return false;
	}
	
	
	//Getters and Setters
	public Boolean getPlegado() {
		return plegado;
	}
	public void setPlegado(Boolean plegado) {
		this.plegado = plegado;
	}
	public Integer getAlturaMinima() {
		return alturaMinima;
	}
	public void setAlturaMinima(Integer alturaMinima) {
		this.alturaMinima = alturaMinima;
	}
	public Integer getAlturaMaxima() {
		return alturaMaxima;
	}
	public void setAlturaMaxima(Integer alturaMaxima) {
		this.alturaMaxima = alturaMaxima;
	}
	public Integer getAlturaActual() {
		return alturaActual;
	}
	public void setAlturaActual(Integer alturaActual) {
		this.alturaActual = alturaActual;
	}
	
	

}
