import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Estudante extends Pessoa{

	private String matricula, cpf, nome;	
	String tipo = "estudante";
	static Map<String, Estudante> ListaEstudantes = new HashMap<String, Estudante>(); // CPF - Chave, Estudante - Para acessar os outros dados


	public static void getDados() { //LEMVBRAR DE TIRAR O STATIC
		int contador = 1;
		for (Map.Entry<String, Estudante> Entry : Estudante.ListaEstudantes.entrySet()) {
			System.out.println("\n \nEstudante n° " + contador);
			System.out.printf("\nCPF: %s", Entry.getKey());
			System.out.printf("\nNome: %s", Entry.getValue().nome);
			System.out.printf("\nMatricula: %s", Entry.getValue().matricula);
			contador++;
		}
		// ListaEstudantes.forEach((k, v) -> System.out.printf("\n \nkey: %s | value:
		// %s", k, v)); //Método 2 de mostrar dados
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}