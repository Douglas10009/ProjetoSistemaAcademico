import java.util.HashMap;
import java.util.Map;

public class Estudante {
	String matricula, cpf, nome;
	int periodo;
	double boletim;

	public Boolean CadastrarEstudante(String nome, String cpf){
		Map<String, String> ListaEstudantes = new HashMap<String, String>(); //CPF - Chave, Nome - Valor
		ListaEstudantes.put(cpf, nome);
		
		return true; //Retorna true se tudo deu certo
	}

	public  String gerarMatricula(){
		String matricula = "MATRICULA_TESTE"; //Código da matricula
		return matricula;
	}

}