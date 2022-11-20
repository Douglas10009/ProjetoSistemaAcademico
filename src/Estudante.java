import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class Estudante {

	String matricula, cpf, nome;
	int periodo;
	double boletim;
	Map<String, String> ListaEstudantes = new HashMap<String, String>(); // CPF - Chave, Nome - Valor

	public void CadastrarEstudante() {
		System.out.println("\n \n-----> Cadastrando Estudante"); // Cadastrando Estudante - AVISO
		Pessoa pessoa = new Pessoa();

		pessoa.CadastrarPessoa(); // Cadastra o estudante, como pessoa

		this.ListaEstudantes.put(pessoa.getCpf(), pessoa.getNome());

		System.out.printf("\n----> Cadastro do estudante %s, realizado com sucesso!", pessoa.getNome()); // Cadastro
																											// Estudante
																											// Completo
																											// - AVISO
		System.out.println("\n----> Para acessar o portal use as seguntes credenciais: "); // Credenciais Estudante- AVISO
		System.out.printf("\n - Matrícula: %s", pessoa.gerarMatriculaEstudante()); // Login Matricula Estudante - AVISO
		System.out.printf("\n - Senha: %s (Seu CPF) \n", pessoa.getCpf()); // Senha CPF Estudante - AVISO
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

	public void armazenarDados() {
		File pasta = new File("BancoDeDados");
		if (!pasta.exists()) {
			pasta.mkdir();
		}

		try (PrintWriter gravar = new PrintWriter(new FileWriter(new File(pasta, "Estudante.txt")))) {
			for (Map.Entry<String, String> Entry : this.ListaEstudantes.entrySet()) {
				gravar.print(Entry.getKey());
				gravar.print(";");
				gravar.print(Entry.getValue());
				gravar.print("\n");
			}
			gravar.close();
			System.out.println("\n----> Arquivo de armazenamento de dados criado."); // Armazenamento Dados - AVISO
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}