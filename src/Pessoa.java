import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Map;
import java.util.Scanner;

public class Pessoa {
    String nome = "";
    String cpf = "";

    public void cadastrarEstudante(Estudante e) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine(); // TODO Tratar exceções
        e.setNome(nome); // Pode existir nomes iguais

        while (Estudante.ListaEstudantes.get(cpf) == null) {
            System.out.print("Digite seu cpf: ");
            String cpf = sc.nextLine(); // TODO Tratar exceções

            // Verifica se o CPF já existe
            if (Estudante.ListaEstudantes.get(cpf) == null) {
                e.setCpf(cpf);
                break;
            } else {
                System.out.println("\n----> CPF já existe, tente novamente...");
            }
        }

    }

    // public boolean BuscarCPF(String CPF){
    // BufferedReader ler = new BufferedReader(new FileReader(null))
    // }

    public static void armazenarDadosEstudante() {
        // Cria a pasta e o arquivo de banco de dados, se não já estiver criado.
        File arq = Controle.VerificarPasta_Arquivo("BancoDeDados", "estudante.txt");

        try {
            PrintWriter gravar = new PrintWriter(new FileWriter(arq)); // O true, como segundo parâmetro, é para ele
                                                                       // sobreescrever
            for (Map.Entry<String, Estudante> Entry : Estudante.ListaEstudantes.entrySet()) {
                gravar.append(Entry.getKey()); // CPF
                gravar.append(";");
                gravar.append(Entry.getValue().getNome()); // Nome
                gravar.append(";");
                gravar.append(Entry.getValue().getMatricula()); // Matricula
                gravar.append(";");
                gravar.append(Integer.toString(Entry.getValue().getUltimo_contador())); // Ultimo Contador
                gravar.append(";");
                gravar.append("\n");
            }
            gravar.close();
            System.out.println("\n----> Arquivo de armazenamento de dados criado/atualizado."); // Armazenamento Dados -
                                                                                                // AVISO
        } catch (Exception e) {
            System.err.println("\n \n-----> OCORREU UM ERRO INESPERADO"); // error
            e.printStackTrace();
        }
    }

    public static void armazenarDadosDocente(Map<String, Docente> ListaDocente, String matricula) {
        // Cria a pasta e o arquivo de banco de dados, se não já estiver criado.
        File arq = Controle.VerificarPasta_Arquivo("BancoDeDados", "docente.txt");

        try {
            PrintWriter gravar = new PrintWriter(new FileWriter(arq, true)); // O true é para ele escrever ao inves de
                                                                             // sobreescrever
            for (Map.Entry<String, Docente> Entry : ListaDocente.entrySet()) {
                gravar.append(Entry.getKey()); // CPF
                gravar.append(";");
                gravar.append(Entry.getValue().getNome()); // Nome
                gravar.append(";");
                // gravar.append(Entry.getValue().getMatricula()); // Matricula //TO-DO
                gravar.append(";");
                gravar.append("\n");
            }
            gravar.close();
            System.out.println("\n----> Arquivo de armazenamento de dados criado."); // Armazenamento Dados - AVISO
        } catch (Exception e) {
            System.err.println("\n \n-----> OCORREU UM ERRO INESPERADO"); // error
            e.printStackTrace();
        }
    }

    public String gerarMatricula(String tipo) {
        // ANO + ID + CONTADOR
        // ID = Professor(20) ou Estudante(23)

        // Ano atual
        Calendar cal = Calendar.getInstance();
        int ano = cal.get(Calendar.YEAR);

        // Id da pessoa
        int id = 0;
        int contadorEstudante = 0;
        int contadorDocente = 0;

        if (tipo.equals("estudante")) {
            id = 23;
            Estudante.ultimo_contador++;
            return ano + Integer.toString(id) + Integer.toString(Estudante.ultimo_contador);

        } else if (tipo.equals("docente")) {
            id = 20;
            contadorDocente++;
            return ano + Integer.toString(id) + Integer.toString(contadorDocente);

        } else {
            return null;
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

}

// Verificar os estudantes no arquivo e colcar no HASHMAP
// Colocar o <CPF, Estudante> HashMap, para acessar os outros dados do estudante

// Instance of, Pessoa new Estudante - Obrigatório ter para funcionar o código
// abaixo
// if(x instanceof Estudante) - Verificar se o contrutor é estudante

// Criar uma classe controle com o cadastro, remover e buscar separados
// Salvar o HashMap antes de sair do programa
// HashMap estático