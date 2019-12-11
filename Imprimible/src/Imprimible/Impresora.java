package Imprimible;

import java.util.ArrayList;

public class Impresora {

	private ArrayList<Imprimible>imprimir = new ArrayList<>();
	
	
	public void imprimirTodo() {
		for (Imprimible imprimible : imprimir) {
			imprimible.imprimir();
		}
	}
	
	public void agregarImprimible(Imprimible unImprimible) {
		imprimir.add(unImprimible);
	}
	
}
