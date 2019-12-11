package TorreDeControl;

public class Main {

	public static void main(String[] args) {

		Pato pato = new Pato(100);
		Avion avion = new Avion(0);
		Superman superman = new Superman(0);
		
		TorreDeControl torre = new TorreDeControl();
		
		torre.agregarVolador(avion);
		torre.agregarVolador(superman);
		torre.agregarVolador(pato);
		
		torre.vuelenTodos();
		

	}

}
