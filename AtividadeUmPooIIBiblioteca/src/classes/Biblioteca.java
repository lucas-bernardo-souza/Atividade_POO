package classes;

import java.util.ArrayList;

public class Biblioteca {
	private String nome;
	private ArrayList<Emprestimo> emprestimos;
	//private ArrayList<Item> itens;
	private ArrayList<Notebook> notebooks;
	private ArrayList<Livro> livros;
	private ArrayList<Usuario> usuarios;
	
	public Biblioteca(String nome) {
		this.nome = nome;
		emprestimos = new ArrayList<Emprestimo>();
		livros = new ArrayList<Livro>();
		notebooks = new ArrayList<Notebook>();
		usuarios = new ArrayList<Usuario>();
	}
	
	public void cadastrarLivro(Livro livro) {
		livros.add(livro);
		return;
	}
	
	public void cadastrarNotebook(Notebook notebook) {
		notebooks.add(notebook);
		return;
	}
	
	public void adicionarAluno(Aluno aluno) {
		usuarios.add(aluno);
		return;
	}
	
	public void adicionarProfessor(Professor professor) {
		usuarios.add(professor);
		return;
	}
	
	public void adicionarAssistenteAdm(AssistenteAdministrativo adm) {
		usuarios.add(adm);
		return;
	}
	/*
	public void adicionarUsuario(Usuario user) {
		usuarios.add(user);
		return;
	}
	*/
	public void cadastrarEmprestimo(Emprestimo emprestimo) {
		emprestimos.add(emprestimo);
		return;
	}
	
	public void imprimirTodosEmprestimos() {
		Emprestimo emprestimo;
		for(int i = 0; i < emprestimos.size(); i++) {
			emprestimo = emprestimos.get(i);
			emprestimo.toString();
			System.out.println(); //Pular linha
		}
	}
	
	public Usuario buscaUsuario(int codigo) {
		for(int i = 0; i < usuarios.size(); i++) {
			if(usuarios.get(i).codigoUsuario == codigo) {
				return usuarios.get(i);
			}
		}
		return null;
	}
	
	public Emprestimo buscaEmprestimo(int codigo) {
		for(int i = 0; i < emprestimos.size(); i++) {
			if(emprestimos.get(i).getCodigoEmprestimo() == codigo) {
				return emprestimos.get(i);
			}
		}
		return null;
	}
	
	public Livro buscaLivro(int cod) {
		for(int i = 0; i < livros.size(); i++) {
			if(livros.get(i).codigoItem == cod) {
				return livros.get(i);
			}
		}
		return null;
	}
	
	public Notebook buscarNotebook(int cod) {
		for(int i = 0; i < notebooks.size(); i++) {
			if(notebooks.get(i).codigoItem == cod) {
				return notebooks.get(i);
			}
		}
		return null;
	}
	
	public String getNome() {
		return nome;
	}

	public ArrayList<Emprestimo> getEmprestimos() {
		return emprestimos;
	}

	public ArrayList<Livro> getLivros() {
		return livros;
	}
	
	public ArrayList<Notebook> getNotebooks() {
		return notebooks;
	}

	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}
	
	public ArrayList<Emprestimo> buscaEmprestimos(int codigoUsuario){
		ArrayList<Emprestimo> aux = new ArrayList<Emprestimo>();
		for(int i = 0; i < emprestimos.size(); i++) {
			if(emprestimos.get(i).getCodigoUsuario() == codigoUsuario) {
				aux.add(emprestimos.get(i));
			}
		}
		return aux;
	}
	
}
