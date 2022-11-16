import java.util.Scanner;

// O aluno se inscreve na instituicao, dando o nome e CPF, e recebe o matricula e senha

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Separar isso aqui na classe menu, método: "BemVinde"
		System.out.println("--------- SEJA BEM VINDE ---------");
		System.out.println("--- Sistema Acadêmico SA ---");
		System.out.println("1 - Cadastrar estudante");
		System.out.println("2 - Cadastrar Doscente");
		System.out.print("Digite sua escolha: ");
		int opc = sc.nextInt();

		switch (opc) {
			case 1: // Cadastrar estudante
				Estudante Estudante = new Estudante();

				System.out.print("\nDigite seu nome: ");
				sc.next();
				String nome = sc.nextLine();

				System.out.print("Digite seu cpf: ");
				String cpf = sc.nextLine();

				// Cadastrar estudante que retorna a matrícula
				if (Estudante.CadastrarEstudante(nome, cpf)) { //Verificar se estudante está cadastrado
					String matricula = Estudante.gerarMatricula();
					System.out.println("\nSua matrícula: " + matricula);
				}
				 
				break;

			default:
				break;
		}
		// Até aqui

		sc.close();

	}

}
