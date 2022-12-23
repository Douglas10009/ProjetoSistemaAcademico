import java.util.HashMap;
import java.util.Map;

public class Docente extends Pessoa {

	private String matricula, cpf, nome;
	String tipo = "docente";
	static int ultimo_contador = 0;

	static Map<String, Docente> ListaDocentes = new HashMap<String, Docente>();

	

	public static void getDados() {
		int contador = 1;
		for (Map.Entry<String, Docente> Entry : Docente.ListaDocentes.entrySet()) {
			System.out.println("\n \nDocente n° " + contador);
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

	public int getUltimo_contador() {
		return ultimo_contador;
	}

	public void setUltimo_contador(int contador) {
		Docente.ultimo_contador = contador;
	}

}
