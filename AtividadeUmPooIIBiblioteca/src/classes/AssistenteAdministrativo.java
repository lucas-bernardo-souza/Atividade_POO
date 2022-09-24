package classes;

import java.util.Date;

public class AssistenteAdministrativo extends Usuario{
	protected Date inicioContrato;
	protected Date fimContrato;
	
	public AssistenteAdministrativo(int codigoUsuario, String nome, String cpf, String email, Date inicioContrato) {
		super(codigoUsuario, nome, cpf, email);
		this.inicioContrato = inicioContrato;
	}
	
	public int prazoDeEntrega() {
		return 10;
	}
	
	public void demitirFuncionario(Date fimContrato) {
		this.fimContrato = fimContrato;
		return;
	}
}
