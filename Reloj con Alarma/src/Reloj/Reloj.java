package Reloj;

import java.util.ArrayList;

public class Reloj {
	
	private int hora;
	private ArrayList<Integer>alarmas;

	public Reloj(int hora) {
		super();
		this.hora = hora;
		alarmas = new ArrayList<>();
	}

	//Tuerca q suma y reta la hora
	
	public void girarDerecha() {
		hora = hora + 1; 
	}
	public void girarIzquierda() {
		hora = hora - 1;
	}
	
	public void agregarAlarma(Integer alarma) {
		
		alarmas.add(alarma);
	}
	public void removerAlaram(Integer alarma) {
		alarmas.remove(alarma);
	}
	
	
	public void verAlarmas() {
		for (Integer x : alarmas) {
			System.out.println(x);
		}
	}
	
	
	
	
	
	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}
	
	
	
	

}
