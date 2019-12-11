package AtletasYPrueba;

import java.util.List;

public class Estadios extends Prueba {
	
	private String nombreEstadio;
	private List <Prueba> prueba;
	
	public Estadios(Integer dificultadRequerida, Integer energiaRequerida, String nombreEstadio, List<Prueba> prueba) {
		super(dificultadRequerida, energiaRequerida, nombreEstadio);
		this.nombreEstadio = nombreEstadio;
		this.prueba = prueba;
	}
	
	public void puedeCompetir(Atleta atleta) {
		
		for (int i = 0; i < prueba.size(); i++) {
			
			if(prueba.get(i).puedeRealizar(atleta)) {

				System.out.println(atleta.getNombre() + " Puede competir en este Estadio.");
				
			}else {
				System.out.println(atleta.getNombre() + " No cumple con los requisitos para " + prueba.get(i).getNombrePrueba() + " en este Estadio.");
			}
		}
	
	}
	
	
	public void quienEsMejor(Atleta atleta1, Atleta atleta2) {
		if(atleta1.getNivel() > atleta2.getNivel()) {
			System.out.println(atleta1.getNombre() + " realizo la prueba mejor que " + atleta2.getNombre());
		}else {
		System.out.println(atleta2.getNombre() + " realizo la prueba mejor que " + atleta1.getNombre());
		}
	}
}


/* Filtro por Pruebas del Estadio. Si puede realizar todas o no.
for (int i = 0; i < prueba.size(); i++) {
			
			if(!prueba.get(i).puedeRealizar(atleta)) {

				System.out.println(atleta.getNombre() + " No cumple con los requisitos para competir en este Estadio.");
				
			}
			 if(i + 1 == prueba.size()) {
					
					System.out.println(atleta.getNombre() + " Puede competir en este Estadio.");
				}
				
		}
*/