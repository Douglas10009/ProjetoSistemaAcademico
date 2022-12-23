import java.util.Scanner;
public class notas {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        String nome[] = new String[2];
        float nota[] = new float[3];
        float soma = 0;
        float media;
        
        for(int  i = 0; i< nome.length; i++) {
            System.out.println("Nome " + (i + 1));
            nome[i] = sc.nextLine();
            
        for(int  i1 = 0; i < nota.length; i++) {
        System.out.println("Nota" + (i + 1));
        nota[i] = Float.parseFloat(sc.nextLine());
        
        soma = soma + nota[i];
        
        }
        
        }
        media = soma;
        for(int i = 0; i < nota.length ; i++) {
            System.out.println(nome[i] + " ficou com média " + media);
           
            if(media < 7){
                System.out.println("Reprovado");
               } if (media >= 7) {
                System.out.println("Aprovado");
               } else if(media == 6) {
                System.out.println("Recuperação");
               }
               
        }

    
    }


}

 

