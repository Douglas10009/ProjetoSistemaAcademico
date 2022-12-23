import java.util.ArrayList;
import java.util.HashMap;

public class Turma {
    static ArrayList<String> listaAnoTurma = new ArrayList<String>();

    public static void CadastrarTurma(String anoTurma){
        // anoTurma = anoTurma + "° Ano";

        Turma.listaAnoTurma.add(anoTurma);

        System.out.println("-----> Turma do " + anoTurma +"° ano cadastrada");
    }
}
