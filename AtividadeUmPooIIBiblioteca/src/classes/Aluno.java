package classes;

public class Aluno extends Usuario {
	protected String curso;
	protected int ano;
	
	public Aluno(int codigoUsuario, String nome, String cpf, String email, String curso, int ano) {
		super(codigoUsuario, nome, cpf, email);
		this.curso = curso;
		this.ano = ano;
	}

	@Override
	public String toString() {
		return "Aluno [curso=" + curso + ", ano=" + ano + ", codigoUsuario=" + codigoUsuario + ", nome=" + nome
				+ ", cpf=" + cpf + ", email=" + email + "]";
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public int prazoDeEntrega() {
		return 7;
	}
}
