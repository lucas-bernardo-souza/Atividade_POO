package classes;

public class Livro extends Item{
	private String nome;
	private String editora;
	
	public Livro(int codigoLivro, String nome, String editora, boolean estaEmprestado) {
		this.codigoItem = codigoLivro;
		this.nome = nome;
		this.editora = editora;
		this.estaEmprestado = estaEmprestado;
	}

	public int getCodigoLivro() {
		return codigoItem;
	}

	public void setCodigoLivro(int codigoLivro) {
		this.codigoItem = codigoLivro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public boolean isEstaEmprestado() {
		return estaEmprestado;
	}

	public void setEstaEmprestado(boolean estaEmprestado) {
		this.estaEmprestado = estaEmprestado;
	}
	
	
}
