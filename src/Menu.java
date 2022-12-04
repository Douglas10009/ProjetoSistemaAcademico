import java.util.Scanner;

public class Menu {
	public static boolean Cadastrar() {
		boolean isRodando = true;
		// clear();

		Scanner sc = new Scanner(System.in);

		System.out.println("\n \n--------- SEJA BEM VINDE ---------");
		System.out.println("------ Sistema Acadêmico SA ------");
		System.out.println("\n1 - Cadastrar estudante");
		System.out.println("2 - Cadastrar Docente");
		System.out.println("3 - Sair");
		System.out.print("\nDigite sua escolha: ");
		String opc = sc.next();
		sc.nextLine(); // Para tirar o enter do buff

		Controle c = new Controle();
		switch (opc) {
			case "1": // Cadastrar estudante
				c.CadastrarEstudante();

				Estudante.getDados();

				System.out.println("\n \n -----> Tempo para você guardar seus dados.");
				System.out.println("");
				barraProgressoLimpo(300);
				break;

			case "2": // Cadastrar Discente
				Docente docente = new Docente();
				docente.cadastrarDocente();

				System.out.println("\n \n -----> Tempo para você guardar seus dados.");
				System.out.println("");
				barraProgressoLimpo(300);
				break;

			case "3":
				System.out.println("----> Saindo...");
				return isRodando = false;

			default:
				System.out.println("-----> Tente novamente, opção inválida..."); // AVISO
				return isRodando = false;

		}
		return isRodando = true;
	}

	public static void escolha_login_cadastro(){
		Scanner sc = new Scanner(System.in);

		System.out.println("\n------ Sistema Acadêmico SA ------");
		System.out.println("-----> O que você deseja realizar hoje?");
		System.out.println("\n1 - Cadastro");
		System.out.println("2 - Login");
		System.out.println("3 - Sair");
		System.out.print("\nDigite sua escolha: ");
		String opc = sc.next();
		sc.nextLine(); // Para tirar o enter do buff
		switch (opc) {
			case "1": 
				Menu.Cadastrar();
				break;
			case "2":
				Menu.login();
				break;
		}
	}

	public static void login(){
		Menu.UnderConstruction();
	}

	public static void UnderConstruction(){
		System.out.println(
			"""                                   



						      #&&&                     &&&
						****%%%%*****%%%*****%%%%*****%%%*****%%
						***%%%*****%%%*****%%%%*****%%%*****%%%%
						*%%%*****%%%%*****%%%*****%%%*****%%%%**
						%%*****%%%%*****%%%*****%%%%****(%%%****
						      #&&&                     &&&
						      #&&&                     &&&
						      #&&&                     &&&
						      #&&&                     &&&
						      #&&&                     &&&
						     &&&&&&                   &&&&&&

              
		""");
		System.out.println("\n-----> Ainda não há nada por aq, volte mais tarde...\n");

	}

	public static void progressPercentage(int remain, int total) {
		if (remain > total) {
			throw new IllegalArgumentException();
		}
		int maxBareSize = 10; // 10unit for 100%
		int remainProcent = ((100 * remain) / total) / maxBareSize;
		char defaultChar = '-';
		String icon = "*";
		String bare = new String(new char[maxBareSize]).replace('\0', defaultChar) + "]";
		StringBuilder bareDone = new StringBuilder();
		bareDone.append("[");
		for (int i = 0; i < remainProcent; i++) {
			bareDone.append(icon);
		}
		String bareRemain = bare.substring(remainProcent, bare.length());
		System.out.print("\r" + bareDone + bareRemain + " " + remainProcent * 10 + "%");
		if (remain == total) {
			System.out.print("\n");
		}
	}

	public static void barraProgressoLimpo(int tempo) {
		for (int i = 0; i <= tempo; i = i + 20) {
			progressPercentage(i, tempo);
			try {
				Thread.sleep(tempo);
			} catch (Exception e) {
			}
		}
	}

	public static void clear() { // Método para limpar a tela
		// Limpa a tela no windows, no linux e no MacOS
		try {
			if (System.getProperty("os.name").contains("Windows"))
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			else
				Runtime.getRuntime().exec("clear");
		} catch (Exception e) {
		}
	}

	public static void sleep(int segundos) {
		segundos *= 1000;// Transformar milisegundos em segundos
		try {
			Thread.sleep(segundos);
		} catch (Exception e) {
		}
	}

}
