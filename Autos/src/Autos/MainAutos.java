package Autos;

public class MainAutos {

	public static void main(String[] args) {
		
		Auto Fiat = new Auto("Fiat", 100);
		Auto Ford = new Auto("Ford", 0);
		
		
		System.out.println(Fiat.getMarca() + " tiene un kilometraje de " + Fiat.getKm());
		System.out.println(Ford.getMarca() + " tiene un kilometraje de " + Ford.getKm());
		
		
		Fiat.viajar(50);
		Ford.viajar(75);
		
		
		System.out.println(Fiat.getMarca() + " recorrio " + Fiat.getKm());
		System.out.println(Ford.getMarca() + " recorrio " + Ford.getKm());
	}

}
