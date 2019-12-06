package Tripode;

public class Main {

	public static void main(String[] args) {
		//Creamos el tripode
		Tripode tripode = new Tripode(true, 1, 10, 1);
		
		//Imprimimos
		tripode.definirAltura(10);
		System.out.println(tripode.plegar());
		System.out.println(tripode.desplegar());
		
		tripode.usar();
		tripode.listoParaUsar();
		
		tripode.guardar();
		tripode.listoParaGuardar();

	}

}
