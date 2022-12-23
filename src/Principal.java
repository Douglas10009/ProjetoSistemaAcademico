
// O aluno se inscreve na instituicao, dando o nome e CPF, e recebe o matricula 
//Modelo de aviso: "-----> ..."

public class Principal {
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	public static final String ANSI_BOLD = "\u001B[1m";
	public static final String ANSI_ITALIC = "\u001B[3m";

	public static void main(String[] args) throws Exception {
		// Antes de mostrar a tela de BemVInde, tem que verificar se o programa já foi
		// rodado antes (/Banco de dados)

		Controle.lerArquivo(); // Lê os arquivos e coloca no HashMap

		// Verifica se é a primeira vez que o programape executado
		if (Controle.jaRodado) {
			Menu.escolha_login_cadastro();

			// Menu.TelaDocente(); //DEGUB
			Menu.Login(); //DEGUB

		} else {
			while (Menu.isAcabado) {
				Menu.Cadastrar();
			}
		}

		System.out.println(EstadoAtual.getNome());

		Pessoa.armazenarDadosEstudante(); // Escreve os dados no arquivo do estudante
		Pessoa.armazenarDadosDocente(); // Escreve os dados no arquivo do docente

		// Só pra eu me organizar --
		// Menu.login();
		// Menu.telaPrincipal();
		// Depois adicionar mais cositas
	}
}
