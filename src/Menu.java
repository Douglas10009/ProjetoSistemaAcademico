import java.util.Scanner;

public class Menu {
	public static void Cadastrar() {
		// clear(); //Adicionar quando terminar o debug

		Scanner sc = new Scanner(System.in);

		System.out.println("\n \n        👋 SEJA BEM VINDE 👋");
		System.out.println(" ");
		System.out.println("      𝓢𝓲𝓼𝓽𝓮𝓶𝓪 𝓐𝓬𝓪𝓭𝓮𝓶𝓲𝓬𝓸 𝓡𝓮𝓼𝓮𝓫𝓪 ");
		System.out.println("\n1 - ✏️  Cadastrar estudante");
		System.out.println("2 - 🖊️  Cadastrar docente");
		System.out.println("3 - 💬  Sair");
		System.out.print("\n📝  Digite sua escolha: ");
		String opc = sc.next();
		sc.nextLine(); // Para tirar o enter do buff

		Controle c = new Controle();
		switch (opc) {
			case "1": // Cadastrar estudante
				c.CadastrarEstudante();

				Estudante.getDados(); //DEBUG

				System.out.println("\n \n -----> 🕛 Tempo para você guardar seus dados.");
				System.out.println("");
				barraProgressoLimpo(300);
				break;

			case "2": // Cadastrar Docente
				c.CadastrarDocente();

				Docente.getDados(); //DEBUG

				System.out.println("\n \n -----> Tempo para você guardar seus dados.");
				System.out.println("");
				barraProgressoLimpo(300);
				break;

			case "3":
				System.out.println("----> 🏃  Saindo...");
				break;

			default:
				System.out.println("-----> ❌ Tente novamente, opção inválida..."); // AVISO

		}
	}

	public static void escolha_login_cadastro() {
		Scanner sc = new Scanner(System.in);

		System.out.println("\n \n        👋 SEJA BEM VINDE 👋");
		System.out.println(" ");
		System.out.println("      𝓢𝓲𝓼𝓽𝓮𝓶𝓪 𝓐𝓬𝓪𝓭𝓮𝓶𝓲𝓬𝓸 𝓡𝓮𝓼𝓮𝓫𝓪 ");
		System.out.println("\n1 - ✏️  Cadastrar estudante");
		System.out.println("2 - 🖊️  Cadastrar docente");
		System.out.println("3 - 💬  Sair");
		System.out.print("\n📝  Digite sua escolha: ");
		String opc = sc.next();
		sc.nextLine(); // Para tirar o enter do buff
		switch (opc) {
			case "1":
				for (int i = 0; i < 4; i++) {
					Menu.Cadastrar();
				}
				break;
			case "2":
				Menu.login();
				break;
		}
	}

	public static void login() {

		System.out.println("\n------ Sistema Acadêmico SA ------");
		System.out.println("-----> Login ------");

		System.out.print("\nDigite seu número de matrícula ");
		String usuario = sc.next();

		System.out.print("\nDigite sua senha: ");
		String senha = sc.next();
	}

	public static void UnderConstruction() {
		System.out.println(
				);
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
