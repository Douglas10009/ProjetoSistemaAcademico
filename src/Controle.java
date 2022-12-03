import java.io.BufferedReader;
import java.io.FileReader;

public class Controle {
    public void a(){
        String matricula = Estudante.ListaEstudantes.get("111").matricula;
    }

    public static void lerArquivo() throws Exception{
        BufferedReader ler = new BufferedReader(new FileReader("BancoDeDados\\estudante.txt"));
        
        String linha = ler.readLine(); // Primeira linha a ser lida
        Estudante e = new Estudante();
        while (linha != null) {
            String[] valores = linha.split(";");

            e.cpf = valores[0];
            e.nome = valores[1];
            e.matricula = valores[2];

            Estudante.ListaEstudantes.put(valores[0], e);
            linha = ler.readLine();
            
        }
        

    }

    public void cadastrarEstudante() {
		System.out.println("\n \n-----> Cadastrando estudante"); // Cadastrando Estudante - AVISO
		Estudante estudante = new Estudante();

        
		Estudante.ListaEstudantes.put(estudante.getCpf(), estudante);

		System.out.printf("\n----> Cadastro do estudante %s, realizado com sucesso!", estudante.getNome()); // Cadastro
																											// Estudante
																											// Completo
																											// - AVISO
		
		String matricula = estudante.gerarMatricula("docente");
		// Pessoa.armazenarDados("estudante", Estudante.ListaEstudantes, matricula);

		System.out.println("----> Para acessar o portal use as seguntes credenciais: "); // Credenciais Estudante-
																							// AVISO
		System.out.printf("\n - Matrícula: %s", matricula); // Login Matricula Estudante - AVISO
		System.out.printf("\n - Senha: %s (Seu CPF) \n", estudante.getCpf()); // Senha CPF Estudante - AVISO
		System.out.println("\n-----> OBS: GUARDE ESSES DADOS, SÓ É POSSÍVEL O CADASTRO COM ESSAS INFORMAÇÕES"); // Alerta
																												// -
																												// AVISO
	}
}
