public class login {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n------ Sistema Acadêmico SA ------");
        System.out.println("-----> Login ------");

        System.out.print("\nDigite seu número de matrícula ");
        String usuario = sc.next();

        System.out.print("\nDigite sua senha: ");
        String senha = sc.next();
        System.out.println(Estudante.ListaEstudantes.get(senha));

        if (Estudante.ListaEstudantes.get(senha)) {

            System.out.printf("Usuário logado com sucesso.");
        } else {
            System.out.println("Login ou senha inválidos!");
        }
    }
}