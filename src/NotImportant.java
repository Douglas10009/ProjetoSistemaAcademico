
public class NotImportant {
    public static void main(String[] args) {
        System.out.println("😳");
        // System.out.println("Imprime o quadrado de todos os elementos da lista!");
        // List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        // list.forEach(n -> System.out.println(n * n));

        String a = "a";
        String b = "b";
        String c = "c";

        String alpha = a + b + c;
        System.out.println(alpha);
    }
    
    public static void barraProgresso(int tempo) { //Fazer uma barra de progresso animada (\-/-)
        String anim = "|/-\\";
        for (int x = 0; x < 100; x++) {
            String data = "\r" + anim.charAt(x % anim.length()) + " " + x;

            try {
                System.out.write(data.getBytes());
                Thread.sleep(tempo);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        
        public static void login() {

        Scanner sc = new Scanner(System.in);

		System.out.println("\n------ Sistema Acadêmico SA ------");
		System.out.println("-----> Login ------");

		System.out.print("\nDigite seu número de matrícula ");
		String usuario = sc.next();

		System.out.print("\nDigite sua senha: ");
		String senha = sc.next();

		if(Estudante.ListaEstudantes.get("111").getcpf();== null){
            
            System.out.printf("Usuário logado com sucesso.");
        }else{
            System.out.println("Login ou senha inválidos!");
        }
		}


    }
}
