package classes;

public abstract class Usuario {
	protected int codigoUsuario;
	protected String nome;
	protected String cpf;
	protected String email;
	
	public Usuario(int codigoUsuario, String nome, String cpf, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.codigoUsuario = codigoUsuario;
	}
	
	public abstract int prazoDeEntrega();
	
	public int getCodigoUsuario() {
		return codigoUsuario;
	}
	public void setCodigoUsuario(int codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
