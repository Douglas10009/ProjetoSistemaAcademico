import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Scanner;

/*
 * -- Funções da classe --
 * Classe para mostrar a parte do design e a parte mais abstrata das classes
 * 
 */

public class Pessoa {
    String nome = "";
    String cpf = "";

    public void cadastrarEstudante(Estudante e) {
        Scanner sc = new Scanner(System.in);

        System.out.print("📝	Digite seu nome: ");
        String nome = sc.nextLine(); // TODO Tratar exceções
        e.setNome(nome); // Pode existir nomes iguais

        while (Estudante.ListaEstudantes.get(cpf) == null) {
            System.out.print("📑 Digite seu cpf: ");
            String cpf = sc.nextLine(); // TODO Tratar exceções

            // Verifica se o CPF já existe
            if (Estudante.ListaEstudantes.get(cpf) == null) {
                e.setCpf(cpf);
                break;
            } else {
                System.out.println("\n---->⛔ CPF já existe, tente novamente...");
            }
        }

    }

    public void cadastrarDocente(Docente d) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine(); // TODO Tratar exceções
        d.setNome(nome); // Pode existir nomes iguais

        while (Estudante.ListaEstudantes.get(cpf) == null) {
            System.out.print("Digite seu cpf: ");
            String cpf = sc.nextLine(); // TODO Tratar exceções

            // Verifica se o CPF já existe
            if (Docente.ListaDocentes.get(cpf) == null) {
                d.setCpf(cpf);
                break;
            } else {
                System.out.println("\n----> CPF já existe, tente novamente...");
            }
        }

    }

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

    public static void armazenarDadosDocente() {
        // Cria a pasta e o arquivo de banco de dados, se não já estiver criado.
        File arq = Controle.VerificarPasta_Arquivo("BancoDeDados", "docente.txt");

        try {
            PrintWriter gravar = new PrintWriter(new FileWriter(arq, true)); // O true é para ele escrever ao inves de
                                                                             // sobreescrever
            for (Map.Entry<String, Docente> Entry : Docente.ListaDocentes.entrySet()) {
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
            System.out.println("----> Arquivo de armazenamento de dados do docente criado/atualizado."); // Armazenamento
                                                                                                         // Dados -
            // AVISO
        } catch (Exception e) {
            System.err.println("\n \n-----> OCORREU UM ERRO INESPERADO"); // error
            e.printStackTrace();
        }
    }

    public static void armazenarDadosTurma() {
        // Cria a pasta e o arquivo de banco de dados, se não já estiver criado.
        File arq = Controle.VerificarPasta_Arquivo("BancoDeDados", "turma.txt");

        try {
            PrintWriter gravar = new PrintWriter(new FileWriter(arq, true)); // O true é para ele escrever ao inves de
                                                                             // sobreescrever

            for (int i = 0; i < Turma.listaAnoTurma.size(); i++) {
                gravar.append(Turma.listaAnoTurma.get(i));
                gravar.append(";");
                gravar.append("\n");
            }

            gravar.close();
            System.out.println("----> Arquivo de armazenamento de dados da turma criado/atualizado."); // Armazenamento
                                                                                                       // Dados -
            // AVISO
        } catch (Exception e) {
            System.err.println("\n \n-----> OCORREU UM ERRO INESPERADO"); // error
            e.printStackTrace();
        }

    }

    public static void armazanarDadosDisciplina(){
        // Cria a pasta e o arquivo de banco de dados, se não já estiver criado.
        File arq = Controle.VerificarPasta_Arquivo("BancoDeDados", "disciplina.txt");

        try {
            PrintWriter gravar = new PrintWriter(new FileWriter(arq)); // O true, como segundo parâmetro, é para ele
                                                                       // sobreescrever
            for (Map.Entry<String, Disciplina> Entry : Disciplina.ListaDisciplina.entrySet()) {
                gravar.append(Entry.getKey()); // CPF
                gravar.append(";");
                gravar.append(Entry.getValue().getNomeDisciplina()); // Nome da disciplina
                gravar.append(";");
                gravar.append(Entry.getValue().getDocenteCpf()); // CPF do docente
                gravar.append(";");
                gravar.append(Entry.getValue().getTurma()); // Turma
                gravar.append(";");

                for (int i = 0; i < Disciplina.ListaDisciplina.get(Entry.getValue().getNomeDisciplina()).ListaDisciplinaDeEstudante.size(); i++) {
					gravar.append(Estudante.ListaEstudantes.get(Disciplina.ListaDisciplina.get(Entry.getValue().getNomeDisciplina()).ListaDisciplinaDeEstudante.get(i)).getNome());
                    gravar.append(",");
				}


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

// Verificar os estudantes no arquivo e colcar no HASHMAP 🆗
// Colocar o <CPF, Estudante> HashMap, para acessar os outros dados do estudante
// 🆗

// Instance of, Pessoa new Estudante - Obrigatório ter para funcionar o código
// abaixo
// if(x instanceof Estudante) - Verificar se o contrutor é estudante

// Criar uma classe controle com o cadastro, remover e buscar separados
// Salvar o HashMap antes de sair do programa 🆗
// HashMap estático 🆗