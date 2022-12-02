import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Estudante extends Pessoa{

	String matricula, cpf, nome;

	int periodo;
	double boletim;
	String tipo = "estudante";
	static Map<String, Estudante> ListaEstudantes = new HashMap<String, Estudante>(); // CPF - Chave, Nome - Valor

	public Estudante(){ //Colocar isso ak na classe pessoa
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine(); // TODO Tratar exceções
        this.nome = nome;
        // pessoa.setNome(nome);

        System.out.print("Digite seu cpf: ");
        String cpf = sc.nextLine(); // TODO Tratar exceções
        // pessoa.BuscarCPF(cpf);
        this.cpf = cpf;
	}

	public static void getDados() { //LEMVBRAR DE TIRAR O STATIC
		int contador = 0;
		for (Map.Entry<String, Estudante> Entry : Estudante.ListaEstudantes.entrySet()) {
			System.out.println("Estudante n° " + contador);
			System.out.printf("\nNome: %s", Entry.getValue().nome);
			// System.out.printf("\nCPF: %s", Entry.getKey());
			contador++;
		}
		// ListaEstudantes.forEach((k, v) -> System.out.printf("\n \nkey: %s | value:
		// %s", k, v)); //Método 2 de mostrar dados
	}

}