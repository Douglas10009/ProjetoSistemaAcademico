import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	public static boolean isAcabado = true;

	public static void Cadastrar() {
		// clear(); //Adicionar quando terminar o debug

		Scanner sc = new Scanner(System.in);

		System.out.println("\n \n        👋 SEJA BEM VINDE 👋");
		System.out.println(" ");
		System.out.println("      SISTEMA ACADÊMICO RESEBA ");
		System.out.println("\n1 - ✏️  Cadastrar estudante");
		System.out.println("2 - 🖊️  Cadastrar docente");
		System.out.println("3 - Login");
		System.out.println("4 - Sair");
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
				Menu.Login();
				break;

			case "4":
				System.out.println("----> Saindo...");
				isAcabado = false;
				break;

			default:
				System.out.println("-----> Tente novamente, opção inválida..."); // AVISO

		}
	}

	public static void escolha_login_cadastro() {
		Scanner sc = new Scanner(System.in);

		System.out.println("\n \n        👋 SEJA BEM VINDE 👋");
		System.out.println(" ");
		System.out.println("      𝓢𝓲𝓼𝓽𝓮𝓶𝓪 𝓐𝓬𝓪𝓭𝓮𝓶𝓲𝓬𝓸 RECEBA ");
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
			case "3":
				Menu.isAcabado = false;
				break;

		}
	}

	public static void Login() {
		Scanner sc = new Scanner(System.in);

		System.out.println("\n------ Sistema Acadêmico SA ------");
		System.out.println("-----> Login \n");

		System.out.print("Digite seu número de matrícula: ");
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
				// Colocando na classe EstadoAtual, que vai definir qual o usuário atual, até
				// que ele saia

				// Redireciona para a tela do estudante
				// Menu.TelaEstudante();

			} else {
				System.out.println("Esse usuário/n° de matricula não está cadastrado");
			}

		} else if (Docente.ListaDocentes.containsKey(senha)) { // Verifica o CPF no HashMap docente
			// Verificar a matricula do docente
			String matricula_docente = Docente.ListaDocentes.get(senha).getMatricula();

			if (usuario.equals(matricula_docente)) {
				System.out.println("-----> Olá " + Docente.ListaDocentes.get(senha).getNome() + "! Usuário logado");

				// Como é que eu vou salvar esse login no sistema????
				EstadoAtual.setNome(Docente.ListaDocentes.get(senha).getNome());
				EstadoAtual.setDocente(Docente.ListaDocentes.get(senha));
				// Colocando na classe EstadoAtual, que vai definir qual o usuário atual, até
				// que ele saia

				// Redireciona para a tela do docente
				Menu.TelaDocente();

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
		System.out.println("1 - Controlar disciplina");
		System.out.println("2 - Controlar turma");
		System.out.println("3 - Editar informações pessoais");
		System.out.println("4 - Sair ");
		System.out.print("-----> Digite a sua escolha: ");

		int escolha = sc.nextInt(); // TODO Tratar excessões

		switch (escolha) {
			case 1:
				System.out.println("\n------ Sistema Acadêmico SA ------");
				System.out.println("-----> Menu do Docente ------");
				System.out.println("-----> Controlar disciplina");

				System.out.println("\n-----> O que você deseja fazer agora? ");
				System.out.println("1 - Cadastrar disciplina");
				System.out.println("2 - Editar disciplina");
				System.out.println("3 - Excluir disciplina");
				System.out.println("4 - Sair");
				System.out.print("-----> Digite sua escolha: ");
				int opcaoDisciplina = sc.nextInt();

				switch (opcaoDisciplina) {
					case 1:
						System.out.println("\n------ Sistema Acadêmico SA ------");
						System.out.println("-----> Menu do Docente ------");
						System.out.println("-----> Cadastrar Disciplina");

						boolean isCerto = true; // Variavel para definir se vai continuar o código ou retonar
						while (isCerto) {
							System.out.print("\nDigite o nome da disciplina: ");
							String nomeDisciplina = sc.next();

							System.out.println(nomeDisciplina + ", É o nome da diciplina, certo?");

							System.out.print("Insira sua resposta: (y/n)");
							String resposta = sc.next();

							if (resposta.equals("y") || resposta.equals("s") || resposta.contains("s")) {
								System.out.println("\n----->   Tá ok então, vamos seguir... \n");
								isCerto = false;
							}
						}

						String professorDisciplina = EstadoAtual.getNome(); // Define o professor atual com professor da
																			// disciplina

						// System.out.println("-----> A qual turma essa disciplina pertençe? "); // Vai
						// ser o professor que criar
						// Turma.getDados();

						// CONTINUAR

						// Controle.CadastrarDisciplina();

						break;
					case 2:
						// Editar disciplina
						Menu.UnderConstruction();
						break;

					case 3:
						// Excluir disciplina
						Menu.UnderConstruction();
						break;

					case 4:
						System.out.println("\n-----> Saindo....");
						break;

					default:
						System.out.println("-----> Opção Inválida....");
						break;
				}

			case 2:
				System.out.println("\n------ Sistema Acadêmico SA ------");
				System.out.println("-----> Menu do Docente ------");
				System.out.println("-----> Controlar turma");

				System.out.println("\n-----> O que você deseja fazer agora? ");
				System.out.println("1 - Cadastrar turma");
				System.out.println("2 - Editar turma");
				System.out.println("3 - Excluir turma");
				System.out.println("4 - Sair");
				System.out.print("-----> Digite sua escolha: ");

				int opcaoDisc = sc.nextInt();

				switch (opcaoDisc) {
					case 1: // Cadastrar turma
						System.out.println("\n------ Sistema Acadêmico SA ------");
						System.out.println("-----> Menu do Docente ------");
						System.out.println("-----> Cadastrar turma");

						System.out.print("\nDigite o ano da turma: (Somente números) ");
						String anoTurma = sc.next();

						// TO DO Verificar se já existe turma desse ano
						boolean sair = false;
						for (int i = 0; i < Turma.listaAnoTurma.size(); i++) {
							if (Turma.listaAnoTurma.get(i).equals(anoTurma)) {
								System.out.println("-----> Essa turma já existe, tente novamente...");
								sair = true;
								break;

							}
						}

						if (sair) {
							break;
						}

						Turma.CadastrarTurma(anoTurma);

						// Menu.UnderConstruction();
						break;
					case 2:
						// Editar turma
						Menu.UnderConstruction();
						break;
					case 3:
						// Excluir turma
						Menu.UnderConstruction();
						break;

					case 4:
						System.out.println("\n-----> Saindo....");
						break;

					default:
						System.out.println("-----> Opção Inválida....");
						break;
				}

			case 3:
				// Editar informações pessoais docente
				Menu.UnderConstruction();
				break;
			case 4:
				System.out.println("\n-----> Saindo....");
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
