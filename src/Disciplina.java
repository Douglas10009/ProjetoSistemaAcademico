import java.util.HashMap;
import java.util.Map;

public class Disciplina {
    //Nome da disciplina - CPF docente
    static Map<String, String> ListaDisciplinaDocente = new HashMap<String, String>();
    static Map<String, String> ListaDisciplinaTurma = new HashMap<String, String>();

    public static void CadastrarDisciplina(String nomeDisciplina , String cpf_Doscente){
        //Associar a disciplina a um docente
        Disciplina.ListaDisciplinaDocente.put(nomeDisciplina, cpf_Doscente);

        //Como associar isso a uma turma?
    }
}
