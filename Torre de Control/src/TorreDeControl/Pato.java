package TorreDeControl;

public class Pato implements Volable{
	
	private int energia;
	
	
	
	
	public Pato(int energia) {
		super();
		this.energia = energia;
	}




	@Override
	public void volar() {
		energia = energia - 5;
		System.out.println("Estoy volando como un pato. Pero mi energia ahora es de " + energia + ".");
		
	}

}
