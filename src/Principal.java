
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
		// Antes de mostrar a tela de BemVInde, tem que verificar se o programa já foi
		// rodado antes (/Banco de dados)
		while (true) {
			Menu.Cadastrar();

		}

		// Só pra eu me organizar --
		// Menu.login();
		// Menu.telaPrincipal();
	}
}
