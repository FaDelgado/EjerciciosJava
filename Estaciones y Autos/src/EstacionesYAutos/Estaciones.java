package EstacionesYAutos;

public class Estaciones {
	
		private String nombre;
		private int combustible;
		private int precioCombustible;
		private int caja;
		Autos auto;
		public Estaciones(String nombre, int combustible, int precioCombustible, int caja) {
			super();
			this.nombre = nombre;
			this.combustible = combustible;
			this.precioCombustible = precioCombustible;
			this.caja = caja;
		}

		public void servirCombustible(Autos auto, int cantCombustible) {
			int tanqueNuevo = cantCombustible + auto.getTanque(); 
			auto.setTanque(tanqueNuevo);
			int aPagar = cantCombustible*precioCombustible;
			auto.setPlata(auto.getPlata() - aPagar);
			
			System.out.println(auto.getMarca() + " compro $" + aPagar + " de combustible.");
			System.out.println("El tanque ahora tiene " + tanqueNuevo + " litros de combustible.");
			
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getCombustible() {
			return combustible;
		}

		public void setCombustible(int combustible) {
			this.combustible = combustible;
		}

		public int getPrecioCombustible() {
			return precioCombustible;
		}

		public void setPrecioCombustible(int precioCombustible) {
			this.precioCombustible = precioCombustible;
		}

		public int getCaja() {
			return caja;
		}

		public void setCaja(int caja) {
			this.caja = caja;
		}
		
		
		
}
