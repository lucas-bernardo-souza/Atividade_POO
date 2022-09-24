package classes;

public class Notebook extends Item{
	protected String modelo;
	protected String marca;
	protected String processador;
	
	public Notebook(int codigoItem, boolean estaEmprestado, String modelo, String marca, String processador) {
		this.codigoItem = codigoItem;
		this.estaEmprestado = estaEmprestado;
		this.modelo = modelo;
		this.marca = marca;
		this.processador = processador;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getProcessador() {
		return processador;
	}

	public void setProcessador(String processador) {
		this.processador = processador;
	}
	
	public int getCodigo() {
		return codigoItem;
	}
}
