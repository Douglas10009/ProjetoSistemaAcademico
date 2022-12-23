import java.util.HashMap;
import java.util.Map;

public class Disciplina {
    //CPF do Docente - Nome da disciplina
    static Map<String, String> ListaDisciplina = new HashMap<String, String>();

    public static void CadastrarDisciplina(String nomeDisciplina , String cpf_Doscente){
        //Associar a disciplina a um docente
        Disciplina.ListaDisciplina.put(cpf_Doscente , nomeDisciplina);

        //Como associar isso a uma turma?
    }
}
