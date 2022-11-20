import java.util.Scanner;

// O aluno se inscreve na instituicao, dando o nome e CPF, e recebe o matricula e senha
//Modelo de aviso: "-----> ..."

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Antes de mostrar a tela de BemVInde, tem que verificar se o programa já foi rodado antes (/Banco de dados)
		Menu.BemVinde();

		

		sc.close();

	}

}
