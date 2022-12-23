import java.util.ArrayList;

public class Turma {
    static ArrayList<String> listaAnoTurma = new ArrayList<String>();

    public static void CadastrarTurma(String anoTurma){
        // anoTurma = anoTurma + "° Ano";

        Turma.listaAnoTurma.add(anoTurma);

        System.out.println("-----> Turma do " + anoTurma +"° ano cadastrada");
    }

    public static void getDados(){
        for (int i = 0; i < Turma.listaAnoTurma.size(); i++) {
            System.out.println("\n" + Turma.listaAnoTurma.get(i) + "° ano");
        }
    }
}
