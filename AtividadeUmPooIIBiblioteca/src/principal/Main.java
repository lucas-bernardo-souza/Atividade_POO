package principal;

import java.util.ArrayList;

import classes.Emprestimo;
import classes.Livro;
import classes.Notebook;
import controlador.Controlador;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controlador ctrl = new Controlador();
		ctrl.inicializaBiblioteca("Biblioteca UNESP");
		
		// Cadastro de professores
		ctrl.cadastrarProfessor("João", "111.111.111-11", "joao.silva@unesp.br", "Mestre");
		ctrl.cadastrarProfessor("Maria", "111.111.111-11", "maria.aparecida@unesp.br", "Doutora");
		ctrl.cadastrarProfessor("Aparecido", "111.111.111-11", "aparecido.santana@unesp.br", "Phd");
		ctrl.cadastrarProfessor("José", "111.111.111-11", "jose.goncalves@unesp.br", "Mestre");
		ctrl.cadastrarProfessor("Guilherme", "111.111.111-11", "guilherme.ribeiro@unesp.br", "Doutor");
		
		ctrl.cadastrarAluno("Júlio", "222.222.222-22", "julio.souza@unesp.br", "Ciência da Computação", 2);
		ctrl.cadastrarAluno("Jair", "222.222.222-22", "jair.souza@unesp.br", "Química", 3);
		ctrl.cadastrarAluno("Fernando", "222.222.222-22", "fernando.melo@unesp.br", "Ciência da Computação", 1);
		ctrl.cadastrarAluno("Bruna", "222.222.222-22", "bruna.silva@unesp.br", "Pedagogia", 4);
		ctrl.cadastrarAluno("Camila", "222.222.222-22", "camila.ramiro@unesp.br", "Arquitetura", 3);
		ctrl.cadastrarAluno("Gustavo", "222.222.222-22", "gustavo.lima@unesp.br","Pedagogia", 1);
		ctrl.cadastrarAluno("Luis", "222.222.222-22", "luis.albertoni@unesp.br", "Ciência da Computação", 2);
		ctrl.cadastrarAluno("Felipe", "222.222.222-22", "felipe.bernardes@unesp.br", "Ciência da Computação", 4);
		ctrl.cadastrarAluno("Paulo", "222.222.222-22", "paulo.aparecido@unesp.br", "Ciência da Computação", 2);
		ctrl.cadastrarAluno("Arthur", "222.222.222-22", "arthur.ayala@unesp.br", "Fisioterapia", 1);
		
		ctrl.cadastrarAssistenteAdministrativo("Carolina", "333.333.333-33", "carolina.carrara@unesp.br");
		ctrl.cadastrarAssistenteAdministrativo("Cintia", "333.333.333-33", "cintia.caetano@unesp.br");
		ctrl.cadastrarAssistenteAdministrativo("Camila", "333.333.333-33", "camila.santos@unesp.br");
		ctrl.cadastrarAssistenteAdministrativo("Fernando", "333.333.333-33", "fernando.silva@unesp.br");
		
		ctrl.cadastrarLivro("Romeu e Julieta", "Edit");
		ctrl.cadastrarLivro("JavaScript", "Edit");
		ctrl.cadastrarLivro("Manual de SQL", "Edit");
		ctrl.cadastrarLivro("Anatomia", "Edit");
		
		
		for(int i = 0; i<10; i++) {
			ctrl.cadastrarNotebook("Inspiron 15", "Dell", "Intel Core i7-10000U");
		}
		
		ctrl.novoEmprestimo(0); // passo o código do usuário
		ctrl.cadastrarItemAoUltimoEmprestimo(1);
		ctrl.cadastrarItemAoUltimoEmprestimo(2);
		ctrl.cadastrarItemAoUltimoEmprestimo(4);
		ctrl.cadastrarItemAoUltimoEmprestimo(5);
		ctrl.cadastrarItemAoUltimoEmprestimo(7);
		
		// Exibindo os empréstimos do usuário de código 0
		System.out.println("Exibindo empréstimo do usuário zero!");
		ArrayList<Emprestimo> emprestimos = new ArrayList<Emprestimo>();
		emprestimos = ctrl.buscaEmprestimos(0); // emprestimo do usuario 0
		if(emprestimos.isEmpty()) {
			System.out.println("Este usuário não fez empréstimos");
		}
		else {
			for(int i = 0; i< emprestimos.size(); i++) {
				System.out.println("Código do emprestimo: " + emprestimos.get(i).getCodigoEmprestimo());
			}
			System.out.println();
		}
		
		// Exibindo todos os livros emprestados
		System.out.println("Exibindo todos os livros emprestados");
		emprestimos = new ArrayList<Emprestimo>();
		emprestimos = ctrl.getEmprestimos();
		Livro livro;
		ArrayList<Integer> codigosItens = new ArrayList<Integer>();
		if(emprestimos.isEmpty()) {
			System.out.println("Não há nenhum item emprestado");
		}
		else {
			for(int i = 0; i < emprestimos.size();i++) {
				codigosItens = emprestimos.get(i).getItensDoEmprestimo();
				System.out.println("Código do emprestimo: "+ emprestimos.get(i).getCodigoEmprestimo());
				int cod = emprestimos.get(i).getCodigoUsuario();
				System.out.println("Nome do usuário: "+ ctrl.buscaUsario(cod).getNome());
				for(int j = 0; j < codigosItens.size(); j++) {
					livro = ctrl.buscaLivro(codigosItens.get(j));
					if(livro == null) {
						continue;
					}
					System.out.println("Nome do livro: "+ livro.getNome());
					System.out.println("Codigo do livro: "+ livro.getCodigoLivro());
					System.out.println("Editora: "+ livro.getEditora());
				}
			}
		}
		
		// Exibindo todos os notebooks emprestados
		System.out.println("Exibindo todos os notebooks emprestados");
		emprestimos = new ArrayList<Emprestimo>();
		emprestimos = ctrl.getEmprestimos();
		Notebook notebook;
		codigosItens = new ArrayList<Integer>();
		if(emprestimos.isEmpty()) {
			System.out.println("Não há nenhum item emprestado");
		}
		else {
			for(int i = 0; i < emprestimos.size();i++) {
				codigosItens = emprestimos.get(i).getItensDoEmprestimo();
				System.out.println("Notebooks do emprestimo: "+ emprestimos.get(i).getCodigoEmprestimo());
				int cod = emprestimos.get(i).getCodigoUsuario();
				System.out.println("Nome do usuário: "+ ctrl.buscaUsario(cod).getNome());
				for(int j = 0; j < codigosItens.size(); j++) {
					notebook = ctrl.buscaNotebook(codigosItens.get(j));
					if(notebook == null) {
						continue;
					}
					System.out.println("Modelo: "+ notebook.getModelo());
					System.out.println("Codigo do notebook: " + notebook.getCodigo());
					System.out.println("Marca: "+ notebook.getMarca());
				}
			}
		}
	}

}
