import java.util.Scanner;
public class Fixacao3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
       
        System.out.printf("Matricula: ");
        int matricula = leitor.nextInt();
        
        System.out.printf("Nome: ");
        String nome = leitor.next();

        float[] notas = new float[5];
        for (int i = 0; i < 5; i ++) {
            System.out.printf("Nota %d: ", i + 1);
            float nota = leitor.nextFloat();
            notas[i] = nota;
        }

        System.out.printf("\nMatricula: %d\n", matricula);
        System.out.printf("Nome: %s\n", nome);
        for (int i = 0; i < 5; i ++) {
            System.out.printf("Nota %d: %.1f\n", i + 1, notas[i]);
           
        }
        
    }
}