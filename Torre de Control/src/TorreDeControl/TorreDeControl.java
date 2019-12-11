package TorreDeControl;

import java.util.ArrayList;

public class TorreDeControl {
	
		private ArrayList<Volable>volables = new ArrayList<>();
		
		
		public void vuelenTodos() {
			for (Volable volable : volables) {
				volable.volar();
			}
		}
		
		public void agregarVolador(Volable volador) {
			volables.add(volador);
		}
}
