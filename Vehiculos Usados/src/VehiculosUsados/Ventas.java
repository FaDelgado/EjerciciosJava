package VehiculosUsados;

public class Ventas {

	public Double montoDeLaVenta;
	Autos AutoVendido;
	Clientes Cliente;
	
	//Constructor
	public Ventas(Double montoDeLaVenta, Autos autoVendido, Clientes cliente) {
		super();
		this.montoDeLaVenta = montoDeLaVenta;
		AutoVendido = autoVendido;
		Cliente = cliente;
	}
	
	
	
	
	
	
	//Setters and Getters
	public Double getMontoDeLaVenta() {
		return montoDeLaVenta;
	}
	public void setMontoDeLaVenta(Double montoDeLaVenta) {
		this.montoDeLaVenta = montoDeLaVenta;
	}
	public Autos getAutoVendido() {
		return AutoVendido;
	}
	public void setAutoVendido(Autos autoVendido) {
		AutoVendido = autoVendido;
	}
	public Clientes getCliente() {
		return Cliente;
	}
	public void setCliente(Clientes cliente) {
		Cliente = cliente;
	}
	
	
}
