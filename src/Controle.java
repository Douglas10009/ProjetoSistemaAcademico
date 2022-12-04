import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Controle {
    static boolean jaRodado = false; // Verifica se o programa já foi rodado

    public void a() {
        // String matricula = Estudante.ListaEstudantes.get("111").getMatricula();
    }

    public static void lerArquivo() throws Exception { // Armazena os dados das pessoas que estão no arquivo e colocam
                                                       // no HashMap
        // Armazena os dados do estudante
        File arq = Controle.VerificarPasta_Arquivo("BancoDeDados", "estudante.txt");

        BufferedReader ler = new BufferedReader(new FileReader(arq));
        String linha = ler.readLine(); // Primeira linha a ser lida

        while (linha != null) {
            String[] valores = linha.split(";");

            Estudante estudante = new Estudante();
            estudante.setCpf(valores[0]);
            estudante.setNome(valores[1]);
            estudante.setMatricula(valores[2]);
            estudante.setUltimo_contador(Integer.parseInt(valores[3]));
            Estudante.ListaEstudantes.put(valores[0], estudante);

            linha = ler.readLine();
        }
        ler.close();

        // Armazena os dados do docente
        File arq_2 = Controle.VerificarPasta_Arquivo("BancoDeDados", "docente.txt");

        BufferedReader ler_2 = new BufferedReader(new FileReader(arq_2));
        String linha_2 = ler_2.readLine(); // Primeira linha a ser lida

        Docente docente = new Docente();
        while (linha_2 != null) {
            String[] valores = linha_2.split(";");

            docente.cpf = valores[0];
            docente.nome = valores[1];
            docente.matricula = valores[2];
            Docente.ListaDocentes.put(valores[0], docente);

            linha_2 = ler_2.readLine();
        }
        ler_2.close();

        System.out.println("\n-----> Sucesso na leitura dos dados");
    }

    public static File VerificarPasta_Arquivo(String Nome_Pasta, String Nome_Arquivo) {
        // Cria a pasta
        File pasta = new File(Nome_Pasta);
        if (!pasta.exists()) {
            pasta.mkdir();
        }

        // Cria o arquivo
        File arq = null;
        if (!new File(pasta, Nome_Arquivo).exists()) { // Se arquivo não existir, crie
            arq = new File(pasta, Nome_Arquivo);

            try {
                arq.createNewFile();
            } catch (Exception e) {
                System.out.println("\n \n ----> OCORREU UM ERRO INESPERADO"); // ERROR
                e.printStackTrace();
            }

            Controle.jaRodado = false;
        } else {
            arq = new File(pasta, Nome_Arquivo);
            Controle.jaRodado = true;
        }

        return arq;
    }

    public void CadastrarEstudante() {
        System.out.println("\n \n-----> Cadastrando estudante"); // Cadastrando Estudante - AVISO

        Estudante estudante = new Estudante();
        Pessoa pessoa = new Pessoa();

        pessoa.cadastrarEstudante(estudante); // Pega o nome e o CPF

        String matricula = estudante.gerarMatricula("estudante");
        estudante.setMatricula(matricula);

        System.out.printf("\n----> Cadastro do estudante %s, realizado com sucesso!", estudante.getNome()); // Cadastro
                                                                                                            // Estudante
                                                                                                            // Completo
                                                                                                            // - AVISO
        System.out.println("\n----> Para acessar o portal use as seguntes credenciais: "); // Credenciais Estudante- AVISO
        System.out.printf("\n - Matrícula: %s", estudante.getMatricula()); // Login Matricula Estudante - AVISO
        System.out.printf("\n - Senha: %s (Seu CPF) \n", estudante.getCpf()); // Senha CPF Estudante - AVISO
        System.out.print("\n-----> OBS: GUARDE ESSES DADOS, SÓ É POSSÍVEL O CADASTRO COM ESSAS INFORMAÇÕES"); // Alerta
                                                                                                              // - AVISO

        Estudante.ListaEstudantes.put(estudante.getCpf(), estudante); // Coloca os dados na hashmap
    }
}
