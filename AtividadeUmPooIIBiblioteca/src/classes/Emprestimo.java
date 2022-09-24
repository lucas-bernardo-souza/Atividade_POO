package classes;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Emprestimo {
	private int codigoEmprestimo;
	private int codigoUsuario;
	private ArrayList<Integer> itensDoEmprestimo;
	private GregorianCalendar dataEmprestimo;
	private GregorianCalendar dataDevolucao;
	
	public Emprestimo(int codigoEmprestimo, int codigoUsuario, GregorianCalendar dataEmprestimo, GregorianCalendar dataDevolucao) {
		this.codigoEmprestimo = codigoEmprestimo;
		this.codigoUsuario = codigoUsuario;
		this.dataEmprestimo = dataEmprestimo;
		this.dataDevolucao = dataDevolucao;
		itensDoEmprestimo = new ArrayList<Integer>();
	}
	
	public void addItemNoEmprestimo(int codigoItem) {
		itensDoEmprestimo.add(codigoItem);
		return;
	}

	public int getCodigoEmprestimo() {
		return codigoEmprestimo;
	}

	public void setCodigoEmprestimo(int codigoEmprestimo) {
		this.codigoEmprestimo = codigoEmprestimo;
	}

	public int getCodigoUsuario() {
		return codigoUsuario;
	}

	public void setCodigoUsuario(int codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	public GregorianCalendar getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(GregorianCalendar dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public GregorianCalendar getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(GregorianCalendar dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public ArrayList<Integer> getItensDoEmprestimo() {
		return itensDoEmprestimo;
	}
	
}
