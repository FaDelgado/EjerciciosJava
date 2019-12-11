package VehiculosUsados;

public class Concesionarias {
	
	public String concesionaria;
	

	public Concesionarias(String concesionaria) {
		super();
		this.concesionaria = concesionaria;
	}

	
	
	//Metodo registrarVenta()
	public void registrarVenta(Autos auto, Clientes cliente, double monto) {
		Ventas vendido = new Ventas(auto, cliente, monto);
		System.out.println("El auto vendido es: " + auto.getMarca() + " " + auto.getModelo() + ". Compra realizado por: " + cliente.getApellido() + ". Precio final de: " + monto);		
		
	}
	
	
	
	
	
	
	
	
	public String getConcesionaria() {
		return concesionaria;
	}

	public void setConcesionaria(String concesionaria) {
		this.concesionaria = concesionaria;
	}
	
	
}
