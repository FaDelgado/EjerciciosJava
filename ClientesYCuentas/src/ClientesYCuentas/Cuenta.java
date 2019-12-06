package ClientesYCuentas;

public class Cuenta {
	public Integer numeroDeCuenta;
	public Double saldo;
	public Cliente Cliente;
	
	public Cuenta(Integer numeroDeCuenta, Double saldo, ClientesYCuentas.Cliente cliente) {
		super();
		this.numeroDeCuenta = numeroDeCuenta;
		this.saldo = saldo;
		Cliente = cliente;
		
	}
	
	//Metodo deposito
	public void depositar (Double cantidadDeDinero) {
		saldo = saldo + cantidadDeDinero;
		System.out.println("Usted deposito: " + cantidadDeDinero + " su saldo ahora es de: " + saldo);
		
	}
	
	//Metodo extraccion
	public void extraccion (double cantidadDeDinero) {
		saldo = saldo - cantidadDeDinero;
		System.out.println("Usted acaba de extraer: " + cantidadDeDinero + " su daldo ahora es de: " + saldo);
	}
	
	
	public Integer getNumeroDeCuenta() {
		return numeroDeCuenta;
	}
	public void setNumeroDeCuenta(Integer numeroDeCuenta) {
		this.numeroDeCuenta = numeroDeCuenta;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public Cliente getCliente() {
		return Cliente;
	}
	public void setCliente(Cliente cliente) {
		Cliente = cliente;
	}
	
	
}

