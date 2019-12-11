package Imprimible;

public class Main {

	public static void main(String[] args) {
		Contrato contrato = new Contrato();
		Fotos foto = new Fotos();
		Documentos documento = new Documentos();
		
		
		Impresora impresora = new Impresora();
		
		impresora.agregarImprimible(documento);
		impresora.agregarImprimible(foto);
		impresora.agregarImprimible(contrato);
		impresora.agregarImprimible(documento);
		impresora.agregarImprimible(foto);
		impresora.agregarImprimible(contrato);
		
		impresora.imprimirTodo();

	}

}
