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
            
            String matricula_estudante = Estudante.ListaEstudantes.get(senha).getMatricula();
           

            if ( usuario.equals(matricula_estudante)) {
                
                System.out.println("Usuário logado");
            } else {
                System.out.println("Esse usuário/n° de matricula não está cadastrado");
            }

           
        } else if (Docente.ListaDocentes.containsKey(senha)){ //Verifica o CPF no HashMap docente
            //Verificar a matricula do docente

            String matricula_docente = Docente.ListaDocentes.get(senha).getMatricula();
            
            if ( usuario.equals(matricula_docente)) {
                
                System.out.println("Usuário logado");
            }else{
                    System.out.println("Esse usuário/n° de matricula não está cadastrado");
                }
                
        } else {
            System.out.println("senha inválida!");
        }
    }
    }
}
