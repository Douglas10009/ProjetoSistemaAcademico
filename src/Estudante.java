import java.util.HashMap;
import java.util.Map;

public class Estudante {

	String matricula, cpf, nome;
	int periodo;
	double boletim;
	Map<String, String> ListaEstudantes = new HashMap<String, String>(); // CPF - Chave, Nome - Valor

	public void cadastrarEstudante() {
		System.out.println("\n \n-----> Cadastrando Estudante"); // Cadastrando Estudante - AVISO
		Pessoa pessoa = new Pessoa();

		pessoa.cadastrarPessoa(); // Cadastra o estudante, como pessoa

		this.ListaEstudantes.put(pessoa.getCpf(), pessoa.getNome());

		System.out.printf("\n----> Cadastro do estudante %s, realizado com sucesso!", pessoa.getNome()); // Cadastro
																											// Estudante
																											// Completo
																											// - AVISO
		Pessoa.armazenarDados("estudante", ListaEstudantes);

		System.out.println("----> Para acessar o portal use as seguntes credenciais: "); // Credenciais Estudante-
																							// AVISO
		System.out.printf("\n - Matrícula: %s", pessoa.gerarMatriculaEstudante()); // Login Matricula Estudante - AVISO
		System.out.printf("\n - Senha: %s (Seu CPF) \n", pessoa.getCpf()); // Senha CPF Estudante - AVISO
		System.out.println("\n-----> OBS: GUARDE ESSES DADOS, SÓ É POSSÍVEL O CADASTRO COM ESSAS INFORMAÇÕES"); // Alerta
																												// -
																												// AVISO
	}

	public void getDados() {
		int contador = 0;
		for (Map.Entry<String, String> Entry : this.ListaEstudantes.entrySet()) {
			System.out.println("Estudante n° " + contador);
			System.out.printf("\nNome: %s", Entry.getValue());
			System.out.printf("\nCPF: %s", Entry.getKey());
			contador++;
		}
		// ListaEstudantes.forEach((k, v) -> System.out.printf("\n \nkey: %s | value:
		// %s", k, v)); //Método 2 de mostrar dados
	}

}