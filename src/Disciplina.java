import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Disciplina {
    //Nome da disciplina - Objeto Disciplina
    static Map<String, Disciplina> ListaDisciplina = new HashMap<String, Disciplina>();
    ArrayList<String> ListaDisciplinaDeEstudante = new ArrayList<String>();

    static String nomeDisciplina = "";
    String cpf_docente = "";
    static String turma = "";


    public static void CadastrarDisciplina(String nomeDisciplina , String cpf_docente, String turma, ArrayList<String> Lista_de_Estudante){
        Disciplina disciplina = new Disciplina();

        disciplina.setNomeDisciplina(nomeDisciplina);
        disciplina.setDocenteCpf(cpf_docente);
        disciplina.setTurma(turma);
        disciplina.setListaDisciplinaDeEstudante(Lista_de_Estudante);

        Disciplina.ListaDisciplina.put(nomeDisciplina, disciplina);

    }

    public void setNomeDisciplina(String nomeDisciplina){
        Disciplina.nomeDisciplina = nomeDisciplina;
    }

    public  String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setDocenteCpf(String cpf_docente){
        this.cpf_docente = cpf_docente;
    }

    public String getDocenteCpf(){
        return this.cpf_docente;
    }

    public String getDocenteNome(String cpf_Docente){
        //Posso verificar se o CPF realmente existe ou não
        return Docente.ListaDocentes.get(cpf_Docente).getNome();
       
    }

    public void setTurma(String turma){
        Disciplina.turma = turma;
    }

    public String getTurma(){
        return turma;
    }

    public  ArrayList<String> getListaDisciplinaDeEstudante() {
        return ListaDisciplinaDeEstudante;
    }

    public void setListaDisciplinaDeEstudante(ArrayList<String> listaDisciplinaDeEstudante) {
        this.ListaDisciplinaDeEstudante = listaDisciplinaDeEstudante;
    }

    
    
}
