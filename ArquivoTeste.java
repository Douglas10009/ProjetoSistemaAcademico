import java.io.File;

public class ArquivoTeste {
    public static void main(String[] args) {
        File ArquvoEstudante = new File("BancoDeDados", "estudante.txt");
        if (!ArquvoEstudante.exists()) {
            ArquvoEstudante.mkdirs();
        }
        Estudante a = Estudante.ListaEstudantes.get("hilorena");
        System.out.println(a);
    }
}
