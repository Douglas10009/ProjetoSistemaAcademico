import java.io.IOException;

// O aluno se inscreve na instituicao, dando o nome e CPF, e recebe o matricula e senha
//Modelo de aviso: "-----> ..."

public class Principal {
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	public static final String ANSI_BOLD = "\u001B[1m";
	public static final String ANSI_ITALIC = "\u001B[3m";

	public static void main(String[] args) {
		//Antes de mostrar a tela de BemVInde, tem que verificar se o programa já foi rodado antes (/Banco de dados)
		while (true) {
			Menu.Cadastrar();
			
		}

		// Só pra eu me organizar --
		// Menu.login();
		// Menu.telaPrincipal();
	}
	
	public static void clear() { // Método para limpar a tela
		// Limpa a tela no windows, no linux e no MacOS
		try {
			if (System.getProperty("os.name").contains("Windows"))
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			else
				Runtime.getRuntime().exec("clear");
		} catch (Exception e) {}
	}

	public static void sleep(int segundos) {
		segundos *= 1000;// Transformar milisegundos em segundos
		try {
			Thread.sleep(segundos);
		} catch (Exception e) {}
	}
}
