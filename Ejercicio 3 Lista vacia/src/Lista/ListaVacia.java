package Lista;

import java.util.ArrayList;

public class ListaVacia {
	
	
	private ArrayList<Integer>lista;

		
	
	public ListaVacia(ArrayList<Integer> lista) {
		super();
		this.lista = lista;
	}



	public void imprimirLista() {
		for(Integer x : lista) {
			System.out.println(x);
		}
	}
}
