import java.util.Scanner;

// O aluno se inscreve na instituicao, dando o nome e CPF, e recebe o matricula e senha

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Menu principal 
			// CADASTRAR - Estudante(Nome, CPF) /Professor (Nome, CPF, Disciplina)
			// LOGIN - Estudante/Professor
		
			//-- Depois do login/cadastro

			// Como Estudante:
				// Editar Informacoes (Nome)
				// Escolher Disciplina
					// Ver Boletim
		
			// Como doscente:
				// Editar informacoes pessoais (Nome)
				// Editar informacoes de disciplinas (Nome das disciplinas, Escolher disciplinas para lecionar, Colocar notas dos estudantes)
				
		
		
		
		// 1- CRUD - Estudante, Professor, Disciplina, Turma, Semestre/Periodo
			// Estudante - Nome, Matricula, CPF, isPassado, Boletim[HashMap]
			// Professor - Nome, CPF, disciplina
			// Disciplina - Nome da disciplinas, Professor   
			// Turma - Ano, Codigo
		// 2- Codigo unico para as turmas
		// 3- Disciplina tem que ter 1 professor e Estudantes
		// 4- Registrar notas finais
		System.out.println("--------- SEJA BEM VINDE ---------");
		System.out.println("--- Sistema Acadêmico SA ---");
		System.out.println("1 - Cadastrar estudante");
		System.out.println("2 - Cadastrar Doscente");
		System.out.print("Digite sua escolha: ");
		int opc = sc.nextInt();
		
		switch (opc) {
		case 1:
			//Estudante Estudante = new Estudante();
			System.out.print("Digite seu nome: ");
			
			break;

		default:
			break;
		}
		
		
		sc.close();

	}

}
