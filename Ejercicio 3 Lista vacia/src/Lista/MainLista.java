package Lista;

import java.util.ArrayList;

public class MainLista {

	public static void main(String[] args) {

			ArrayList<Integer>miLista = new ArrayList<>();
			
			miLista.add(1);
			miLista.add(2);
			miLista.add(3);
			miLista.add(4);
			miLista.add(5);
			
		
			ListaVacia listaFinal = new ListaVacia(miLista);
			
			listaFinal.imprimirLista();
	}

}
