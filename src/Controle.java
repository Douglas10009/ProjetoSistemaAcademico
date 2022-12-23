import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Calendar;

public class Controle {
    static boolean jaRodado = false; // Verifica se o programa já foi rodado

    public void a() {
        // String matricula = Estudante.ListaEstudantes.get("111").getMatricula(); //Exemplo de pegar dados no array list
    }


    //Armazena os dados das pessoas que estão no arquivo e colocam no HashMap
    public static void lerArquivo() throws Exception {

        // Armazena os dados do estudante no HashMap
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

        // Armazena os dados do docente no HashMap
        File arq_2 = Controle.VerificarPasta_Arquivo("BancoDeDados", "docente.txt");
        BufferedReader ler_2 = new BufferedReader(new FileReader(arq_2));
        String linha_2 = ler_2.readLine(); // Primeira linha a ser lida

        while (linha_2 != null) {
            String[] valores = linha_2.split(";");

            Docente docente = new Docente();
            docente.setCpf(valores[0]);
            docente.setNome(valores[1]);
            docente.setMatricula(valores[2]);
            docente.setUltimo_contador(Integer.parseInt(valores[3]));
            Docente.ListaDocentes.put(valores[0], docente);

            linha_2 = ler_2.readLine();
        }
        ler_2.close();


        //Armazena os dados da turma no ArrayList
        File arq_3 = Controle.VerificarPasta_Arquivo("BancoDeDados", "docente.txt");
        BufferedReader ler_3 = new BufferedReader(new FileReader(arq_3));
        String linha_3 = ler_3.readLine(); // Primeira linha a ser lida

        while (linha_3 != null) {
            String[] valores = linha_3.split(";");





            

            // TO DO VÊ ISSO AK







            linha_3 = ler_3.readLine();
        }
        ler_3.close();

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

        String matricula = Controle.gerarMatricula("estudante");
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

    public void CadastrarDocente() {
        System.out.println("\n \n-----> Cadastrando docente"); // Cadastrando docente - AVISO

        Docente docente = new Docente();
        Pessoa pessoa = new Pessoa();

        pessoa.cadastrarDocente(docente); // Pega o nome e o CPF

        String matricula = Controle.gerarMatricula("docente");
        docente.setMatricula(matricula);

        System.out.printf("\n----> Cadastro do docente %s, realizado com sucesso!", docente.getNome()); // Cadastro
                                                                                                            // Docente
                                                                                                            // Completo
                                                                                                            // - AVISO
        System.out.println("\n----> Para acessar o portal use as seguntes credenciais: "); // Credenciais Docente- AVISO
        System.out.printf("\n - Matrícula: %s", docente.getMatricula()); // Login Matricula Docente - AVISO
        System.out.printf("\n - Senha: %s (Seu CPF) \n", docente.getCpf()); // Senha CPF Docente - AVISO
        System.out.print("\n-----> OBS: GUARDE ESSES DADOS, SÓ É POSSÍVEL O CADASTRO COM ESSAS INFORMAÇÕES"); // Alerta
                                                                                                              // - AVISO

        Docente.ListaDocentes.put(docente.getCpf(), docente); // Coloca os dados na hashmap
    }

    public static String gerarMatricula(String tipo) {
        // ANO + ID + CONTADOR
        // ID = Professor(20) ou Estudante(23)

        // Ano atual
        Calendar cal = Calendar.getInstance();
        int ano = cal.get(Calendar.YEAR);

        // Id da pessoa
        int id = 0;

        //Verificar tipo
        if (tipo.equals("estudante")) {
            id = 23;
            Estudante.ultimo_contador++;
            return ano + Integer.toString(id) + Integer.toString(Estudante.ultimo_contador);

        } else if (tipo.equals("docente")) {
            id = 20;
            Docente.ultimo_contador++;
            return ano + Integer.toString(id) + Integer.toString(Docente.ultimo_contador);

        } else {
            return null;
        }
    }

    public static void CadastrarDisciplina(){
        
    }
}


// public void cadastrarDocente() {
//     System.out.println("\n \n-----> Cadastrando docente");
//     Pessoa pessoa = new Pessoa();

//     pessoa.cadastrarEstudante();// Cadastra o docente como pessoa

//     Docente.ListaDocentes.put(pessoa.getCpf(), pessoa.getNome());

//     System.out.printf("\n----> Cadastro do docente %s, realizado com sucesso!", pessoa.getNome()); // Cadastro
//                                                                                                     // Estudante
//                                                                                                     // Completo
//                                                                                                     // - AVISO

//     String matricula = pessoa.gerarMatricula("docente");
//     Pessoa.armazenarDados("docente", ListaDocentes, matricula);

//     System.out.println("----> Para acessar o portal use as seguntes credenciais: "); // Credenciais Estudante-
//                                                                                         // AVISO
//     System.out.printf("\n - Matrícula: %s", matricula); // Login Matricula Estudante - AVISO
//     System.out.printf("\n - Senha: %s (Seu CPF) \n", pessoa.getCpf()); // Senha CPF Estudante - AVISO
//     System.out.println("\n-----> OBS: GUARDE ESSES DADOS, SÓ É POSSÍVEL O CADASTRO COM ESSAS INFORMAÇÕES"); // Alerta
//                                                                                                             // -
//                                                                                                             // AVISO
// }