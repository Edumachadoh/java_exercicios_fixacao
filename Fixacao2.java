import java.util.Scanner;
public class Fixacao2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String[] nome = new String[5];
        float[] nota1 = new float[5];
        float[] nota2 = new float[5];
        int[] matricula = new int[5];
        String[] status = new String[5];
        float[] notaFinal = new float[5];


        for (int i = 0; i < 5; i ++) {
            System.out.println("Nome: ");
             nome[i] = leitor.next();

            System.out.println("Nota 1: ");
            nota1[i] = leitor.nextFloat();
        
            System.out.println("Nota 2: ");
            nota2[i] = leitor.nextFloat();
        
            System.out.println("Matricula: ");
            matricula[i] = leitor.nextInt();
        

            notaFinal[i] = (nota1[i] + nota2[i]) / 2;
        
       
            if (notaFinal[i] >= 6) {
                status[i] = "Aprovado";
            
         } else if (notaFinal[i] < 6) {
                status[i] = "Reprovado";
            
            }
        }   
        System.out.printf("\n-----------------------\n");
        for (int o = 0; o < 5; o ++) {
        System.out.printf("\nAluno %d\n", o);
         System.out.printf("Nome: %s\n", nome[o]);
         System.out.printf("Matricula: %d\n", matricula[o]);
         if (status[o] == "Aprovado") {
            System.out.printf("Aprovado: ( x ) Sim ( ) Não", notaFinal[o]);
         } else if (status[o] == "Reprovado") {
            System.out.printf("Aprovado: (  ) Sim ( x ) Não", notaFinal[o]);
         }
        }
    }
}