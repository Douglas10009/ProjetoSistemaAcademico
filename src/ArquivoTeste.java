import java.util.Scanner;

public class ArquivoTeste {


    public static void main(String[] args) {
        // Map<String, String> teste = new HashMap<String, String>();
        // for (int i = 0; i < 4; i++) {
        //     teste.put(Integer.toString(i), "i + 2");
        // }

        // teste.forEach((k, v) -> System.out.printf("\n \nkey: %s | value: %s", k, v));

        Scanner sc = new Scanner(System.in);

        System.out.println("\n------ Sistema Acadêmico SA ------");
        System.out.println("-----> Login ------");

        System.out.print("\nDigite seu número de matrícula ");
        String usuario = sc.next(); //Matricula

        System.out.print("\nDigite sua senha: ");
        String senha = sc.next(); //Cpf

        if (Estudante.ListaEstudantes.containsKey(senha)) { //Verifica o CPF no HashMap estudante
            //Verificar matricula do estudante
        
        } else if (){ //Verifica o CPF no HashMap docente
            //Verificar a matricula do docente
        } else {
            System.out.println("Login ou senha inválidos!");
        }

    }
}
