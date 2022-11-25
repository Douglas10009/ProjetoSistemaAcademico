import java.util.Scanner;

public class Menu {
	public static void Cadastrar() {
		Scanner sc = new Scanner(System.in);

		System.out.println("--------- SEJA BEM VINDE ---------");
		System.out.println("--- Sistema Acadêmico SA ---");
		System.out.println("\n1 - Cadastrar estudante");
		System.out.println("2 - Cadastrar Docente");
		System.out.print("\nDigite sua escolha: ");
		int opc = sc.nextInt();
		sc.nextLine();

		switch (opc) {
			case 1: // Cadastrar estudante
				Estudante estudante = new Estudante();
				estudante.cadastrarEstudante();
				break;
			case 2: // Cadastrar Discente
			    Docente docente = new Docente();
				docente.cadastrarDocente();
				break;
			default:
				System.out.println("-----> Tente novamente, opção inválida..."); // AVISO
				break;

		}
		sc.close();
	}

}
