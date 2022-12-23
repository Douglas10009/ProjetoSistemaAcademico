import java.util.HashMap;
import java.util.Map;

public class Disciplina {
    //Nome da disciplina - Objeto Disciplina
    static Map<String, Disciplina> ListaDisciplinaDocente = new HashMap<String, Disciplina>();

    static String nomeDisciplina = "";
    String cpf_docente = "";
    String turma = "";


    public static void CadastrarDisciplina(String nomeDisciplina , String cpf_docente, String turma){
        Disciplina disciplina = new Disciplina();

        disciplina.setNomeDisciplina(nomeDisciplina);
        disciplina.setDocenteCpf(cpf_docente);
        disciplina.setTurma(turma);

        Disciplina.ListaDisciplinaDocente.put(nomeDisciplina, disciplina);

    }

    public void setNomeDisciplina(String nomeDisciplina){
        Disciplina.nomeDisciplina = nomeDisciplina;
    }

    public static String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setDocenteCpf(String cpf_docente){
        this.cpf_docente = cpf_docente;
    }

    public String getDocenteNome(){
        //Pegar o CPF do docente
        //Veirificar se existe
        //Pesquisar o CPF do docente no ListaDocente
        //Retornar o nome do docente
    }

    public void setTurma(String turma){
        this.turma = turma;
    }
    
}
