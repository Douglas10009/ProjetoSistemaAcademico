import java.util.Scanner;

public class Menu {
	public static void Cadastrar() {
		//clear();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--------- SEJA BEM VINDE ---------");
		System.out.println("------ Sistema Acadêmico RESEBA ------");
		System.out.println("\n1 - Cadastrar Estudante");
		System.out.println("2 - Cadastrar Docente");
		System.out.print("\nDigite sua escolha: ");
		int opc = sc.nextInt();
		sc.nextLine();

		switch (opc) {
			case 1: // Cadastrar estudante
				Estudante estudante = new Estudante();
				estudante.cadastrarEstudante();

				System.out.println("\n \n -----> Tempo para você guardar seus dados.");
				barraProgressoLimpo(300);
				break;
			case 2: // Cadastrar Discente
				Docente docente = new Docente();
				docente.cadastrarDocente();

				System.out.println("\n \n -----> Tempo para você guardar seus dados.");
				barraProgressoLimpo(300);
				break;
			default:
				System.out.println("-----> Tente novamente, opção inválida..."); // AVISO
				break;

		}

		sc.close();
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

	public static void barraProgressoLimpo (int tempo){
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
