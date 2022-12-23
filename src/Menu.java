import java.util.Scanner;

public class Menu {
	public static boolean isAcabado = false;

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

				Estudante.getDados(); // DEBUG

				System.out.println("\n \n -----> 🕛 Tempo para você guardar seus dados.");
				System.out.println("");
				barraProgressoLimpo(300);
				break;

			case "2": // Cadastrar Docente
				c.CadastrarDocente();

				Docente.getDados(); // DEBUG

				System.out.println("\n \n -----> Tempo para você guardar seus dados.");
				System.out.println("");
				barraProgressoLimpo(300);
				break;

			case "3":
				System.out.println("----> 🏃  Saindo...");
				isAcabado = true;
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
		System.out.println("\n1 - ✏️  Cadastrar");
		System.out.println("2 - 🖊️  Login");
		System.out.println("3 - 💬  Sair");
		System.out.print("\n📝  Digite sua escolha: ");
		String opc = sc.next();
		sc.nextLine(); // Para tirar o enter do buff

		switch (opc) {
			case "1":
				Menu.Cadastrar();
				break;
			case "2":
				Menu.Login();
				break;
		}
	}

	public static void Login() {
		Scanner sc = new Scanner(System.in);

		System.out.println("\n------ Sistema Acadêmico SA ------");
		System.out.println("-----> Login ");

		System.out.print("\nDigite seu número de matrícula: ");
		String usuario = sc.next(); // Matricula
		System.out.print("Digite sua senha: ");
		String senha = sc.next(); // Cpf

		System.out.println("\n");

		if (Estudante.ListaEstudantes.containsKey(senha)) { // Verifica o CPF no HashMap estudante
			// Verificar matricula do estudante
			String matricula_estudante = Estudante.ListaEstudantes.get(senha).getMatricula();

			if (usuario.equals(matricula_estudante)) {
				System.out.println("Olá " + Estudante.ListaEstudantes.get(senha).getNome() + "! Usuário logado");

				// Como é que eu vou salvar esse login no sistema????
				EstadoAtual.setNome(Estudante.ListaEstudantes.get(senha).getNome());
				EstadoAtual.setEstudante(Estudante.ListaEstudantes.get(senha));
				// Colocando na classe EstadoAtual, que vai definir qual o usuário atual, até que ele saia

			} else {
				System.out.println("Esse usuário/n° de matricula não está cadastrado");
			}

		} else if (Docente.ListaDocentes.containsKey(senha)) { // Verifica o CPF no HashMap docente
			// Verificar a matricula do docente
			String matricula_docente = Docente.ListaDocentes.get(senha).getMatricula();

			if (usuario.equals(matricula_docente)) {
				System.out.println("Olá " + Docente.ListaDocentes.get(senha).getNome() + "! Usuário logado");

				// Como é que eu vou salvar esse login no sistema????
				
				EstadoAtual.setNome(Docente.ListaDocentes.get(senha).getNome());
				EstadoAtual.setDocente(Docente.ListaDocentes.get(senha));
				// Colocando na classe EstadoAtual, que vai definir qual o usuário atual, até
				// que ele saia

			} else {
				System.out.println("Esse usuário/n° de matricula não está cadastrado");
			}

		} else {
			System.out.println("Senha inválida!");
		}

	}

	public static void TelaDocente() {
		Scanner sc = new Scanner(System.in);

		System.out.println("\n------ Sistema Acadêmico SA ------");
		System.out.println("-----> Menu do Docente ------");

		System.out.println("\n-----> O que você deseja fazer agora? ");
		System.out.println("1 - Cadastrar disciplina");
		System.out.println("2 - ....");
		System.out.print("-----> Digite a sua escolha: ");

		int escolha = sc.nextInt(); // TODO Tratar excessões
		switch (escolha) {
			case 1:
				System.out.println("\n------ Sistema Acadêmico SA ------");
				System.out.println("-----> Menu do Docente ------");
				System.out.println("-----> Cadastrar Disciplina");

				boolean isCerto = true; // Variavel para definir se vai continuar o código ou retonar
				while (isCerto) {
					System.out.println("\nDigite o nome da disciplina: ");
					String nomeDisciplina = sc.next();

					System.out.println(nomeDisciplina + ", É o nome da diciplina, certo?");
					System.out.println("Insira sua resposta: (y/n)");
					String resposta = sc.next();

					if (resposta.equals("y") || resposta.equals("s") || resposta.contains("s")) {
						System.out.println("Tá ok então, vamos seguir... \n");
						isCerto = false;
					}
				}

				System.out.println("\nQual o nome do professor?");

				// Controle.CadastrarDisciplina();
				break;

			default:
				break;
		}
	}

	public static void UnderConstruction() {
		System.out.println("""
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
				     &&&&&&                   &&&&&&""");
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
