package Reloj;


public class MainReloj {

	public static void main(String[] args) {

			Reloj miReloj = new Reloj(8);
			
			//Pruebo que se agregue bien la hora
			System.out.println("Hora actual.");
			System.out.println(miReloj.getHora());
			
			//Uso la tuerca para sumar horas
			System.out.println("Girando a la derecha.");
			miReloj.girarDerecha();
			miReloj.girarDerecha();
			miReloj.girarDerecha();
			miReloj.girarDerecha();
			
			System.out.println(miReloj.getHora());
			
			//Uso la tuerca para restar horas.
			System.out.println("Girando a la izquierda.");
			miReloj.girarIzquierda();
			
			System.out.println(miReloj.getHora());
			
			
			//Creo mi alarma
			miReloj.agregarAlarma(5);
			miReloj.agregarAlarma(6);
			miReloj.agregarAlarma(10);
			miReloj.agregarAlarma(12);
			
			//Veo mis alarmas
			System.out.println("Tengo estas alarmas:"); 
			miReloj.verAlarmas();
			
			//Remover alarmas
			miReloj.removerAlaram(10);
			System.out.println("Ahora mis alarmas son:"); 
			miReloj.verAlarmas();
	}

}
