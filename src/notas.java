import java.util.Scanner;
public class notas {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Digite as notas do alunos");
        Double nota01 = sc.nextDouble();
        Double nota02 = sc.nextDouble();
        Double nota03= sc.nextDouble();

       double media = (nota01 + nota02 + nota03);
        
       if(media < 6){
        System.out.println("Reprovado");
       } if (media >= 6) {
        System.out.println("Aprovado");
       } else {
        System.out.println("Recuperação");
       }
        
    }

    }



