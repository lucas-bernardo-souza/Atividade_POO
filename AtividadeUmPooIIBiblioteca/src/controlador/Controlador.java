package controlador;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import classes.Aluno;
import classes.AssistenteAdministrativo;
import classes.Biblioteca;
import classes.Emprestimo;
import classes.Livro;
import classes.Notebook;
import classes.Professor;
import classes.Usuario;

public class Controlador {
	private Biblioteca biblioteca;
	private Emprestimo emprestimo;
	private Livro livro;
	private Notebook notebook;
	private Professor professor;
	private Aluno aluno;
	private AssistenteAdministrativo adm;
	private Usuario user;
	private int ultimoCodEmprestimo;
	private int ultimoCodUsuario;
	private int codigoItem;
	
	public Controlador() {
		ultimoCodEmprestimo = 0;
		ultimoCodUsuario = 0;
		codigoItem = 0;
	}
	
	public void inicializaBiblioteca(String nome) {
		biblioteca = new Biblioteca(nome);
		return;
	}
	
	public void cadastrarProfessor(String nome, String cpf, String email, String titulacao) {
		professor = new Professor(ultimoCodUsuario, nome, cpf, email, titulacao);
		ultimoCodUsuario++;
		biblioteca.adicionarProfessor(professor);
		return;
	}
	
	public void cadastrarAluno(String nome, String cpf, String email, String curso, int ano) {
		aluno = new Aluno(ultimoCodUsuario, nome, cpf, email, curso, ano);
		ultimoCodUsuario++;
		biblioteca.adicionarAluno(aluno);
		return;
	}
	
	public void cadastrarAssistenteAdministrativo(String nome, String cpf, String email) {
		Date inicioContrato = new Date();
		adm = new AssistenteAdministrativo(ultimoCodUsuario, nome, cpf, email, inicioContrato);
		biblioteca.adicionarAssistenteAdm(adm);
		return;
	}
	/*
	public void demitirAdm(Date fimContrato, int codigoUser) {
		user = biblioteca.buscaUsuario(codigoUser);
		user.demitirFuncionario(fimContrato);
		
	}
	*/
	public void cadastrarLivro(String nome, String editora) {
		livro = new Livro(codigoItem, nome, editora, false);
		codigoItem++;
		biblioteca.cadastrarLivro(livro);
		return;
	}
	
	public void cadastrarNotebook(String modelo, String marca, String processador) {
		notebook = new Notebook(codigoItem, false, modelo, marca, processador);
		codigoItem++;
		biblioteca.cadastrarNotebook(notebook);
		return;
	}
	
	public Usuario buscaUsario(int codigo) {
		return biblioteca.buscaUsuario(codigo);
	}
	
	public void novoEmprestimo(int codigoUsuario) {
		user = biblioteca.buscaUsuario(codigoUsuario);
		GregorianCalendar dataHoje = new GregorianCalendar();
		GregorianCalendar dataEntrega = new GregorianCalendar();
		int prazo = user.prazoDeEntrega();
		dataEntrega.add(Calendar.DAY_OF_MONTH, prazo);
		emprestimo = new Emprestimo(ultimoCodEmprestimo, codigoUsuario, dataHoje, dataEntrega);
		ultimoCodEmprestimo++;
		biblioteca.cadastrarEmprestimo(emprestimo);
	}
	
	public void cadastrarItemAoUltimoEmprestimo(int codigoItem) {
		emprestimo.addItemNoEmprestimo(codigoItem);
		return;
	}
	
	public void cadastrarItemEmprestimo(int codigoItem, int codigoEmprestimo) {
		emprestimo = biblioteca.buscaEmprestimo(codigoEmprestimo);
		emprestimo.addItemNoEmprestimo(codigoItem);
		return;
	}
	
	public ArrayList<Emprestimo> getEmprestimos(){
		return biblioteca.getEmprestimos();
	}
	
	public ArrayList<Emprestimo> buscaEmprestimos(int codigoUsuario){
		return biblioteca.buscaEmprestimos(codigoUsuario);
	}
	
	public Livro buscaLivro(int cod) {
		return biblioteca.buscaLivro(cod);
	}
	
	public Notebook buscaNotebook(int cod) {
		return biblioteca.buscarNotebook(cod);
	}
}
