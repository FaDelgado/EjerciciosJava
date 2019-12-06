package VehiculosUsados;

public class Concesionarias {
	
	public String concesionaria;
	Ventas venta;
	Autos auto;
	Clientes cliente;
	Double monto;

	public Concesionarias(String concesionaria) {
		super();
		this.concesionaria = concesionaria;
	}

	
	
	//Metodo registrarVenta()
	public void registrarVenta(Autos auto, Clientes cliente, double monto) {
		venta.setAutoVendido(auto);
		venta.setCliente(cliente);
		venta.setMontoDeLaVenta(monto);
	}
	
	
	
	
	
	
	
	
	public String getConcesionaria() {
		return concesionaria;
	}

	public void setConcesionaria(String concesionaria) {
		this.concesionaria = concesionaria;
	}
	
	
}
