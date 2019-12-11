package DandoClases;

public class MainDandoClases {

	public static void main(String[] args) {
		
			Empleados alguien = new Empleados("alguien", "alguien", 22222222);

			Docentes delgado = new Docentes("Facu", "Delgado", 123456789, 50);
			Administrativos perez = new Administrativos("Jorgue", "Perez", 78945613);
			
			delgado.darPresente();
			perez.darPresente();
			
			delgado.tomarExamen();
			delgado.darClases();
			perez.administrar();
			perez.reportes();
			
			
					
	}

}
