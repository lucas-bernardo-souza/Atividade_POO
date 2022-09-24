package classes;

public class Professor extends Usuario {
	protected String titulacao;
	
	public Professor(int codigoUsuario, String nome, String cpf, String email, String titulacao) {
		super(codigoUsuario, nome, cpf,email);
		this.titulacao = titulacao;
	}

	@Override
	public String toString() {
		return "Professor [titulacao=" + titulacao + ", codigoUsuario=" + codigoUsuario + ", nome=" + nome + ", cpf="
				+ cpf + ", email=" + email + "]";
	}

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	
	public int prazoDeEntrega() {
		return 14;
	}
}
