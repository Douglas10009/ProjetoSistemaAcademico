import java.util.Scanner;

// O aluno se inscreve na instituicao, dando o nome e CPF, e recebe o matricula e senha
//Modelo de aviso: "-----> ..."

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Separar isso aqui na classe menu, método: "BemVinde"
		System.out.println("--------- SEJA BEM VINDE ---------");
		System.out.println("--- Sistema Acadêmico SA ---");
		System.out.println("\n1 - Cadastrar estudante");
		System.out.println("2 - Cadastrar Doscente");
		System.out.print("\nDigite sua escolha: ");
		int opc = sc.nextInt();
		sc.nextLine();

		switch (opc) {
			case 1: // Cadastrar estudante
				Estudante estudante = new Estudante();
				estudante.CadastrarEstudante();
				estudante.armazenarDados(); //Por que eu não posso colocar isso na classe estudantee?? (O tamanho da ListaEstudante fica 0)
				break;

			default:
				break;
		}
		// Até aqui

		sc.close();

	}

}
