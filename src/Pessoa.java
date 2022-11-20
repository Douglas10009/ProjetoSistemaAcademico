import java.util.Calendar;
import java.util.Scanner;

public class Pessoa {
    String nome = "";
    String cpf = ""; 
    
    public  void CadastrarPessoa(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine(); // TODO Tratar exceções
        this.nome = nome;
        //pessoa.setNome(nome);

        System.out.print("Digite seu cpf: ");
        String cpf = sc.nextLine(); // TODO Tratar exceções
        this.cpf = cpf;
        // pessoa.setCpf(cpf);
        
        sc.close();
    }

    
    
    int contador = 0000;
    public String gerarMatriculaEstudante(){
        //ANO + ID + CONTADOR
        // ID = Professor(20) ou Estudante(23)
        
        //Ano atual
        Calendar cal = Calendar.getInstance();
        int ano = cal.get(Calendar.YEAR);
        
        //Id do estudante
        int id = 23;
        
        //Adicionar mais um no contador
        contador ++;
        
        return ano + Integer.toString(id) + Integer.toString(contador);
    }
    
    public  void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    public  void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCpf() {
        return cpf;
    }

}
