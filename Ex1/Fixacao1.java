import java.util.Scanner;
public class Fixacao1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = leitor.nextLine();

        System.out.println("Nota 1: ");
        float nota1 = leitor.nextFloat();
        
        System.out.println("Nota 2: ");
        float nota2 = leitor.nextFloat();
        
        System.out.println("Matricula: ");
        int matricula = leitor.nextInt();

        

        float notaFinal = (nota1 + nota2) / 2;

        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Nota final: %.1f\n", notaFinal);
        System.out.printf("Matricula: %d\n", matricula);
        
        String aprovado = new String();
        if (notaFinal >= 6) {
            aprovado = "Aprovado";
            System.out.printf("Aprovado: ( x ) Sim ( ) Não");
        } else if (notaFinal < 6) {
            aprovado = "Reprovado";
            System.out.printf("Aprovado: (  ) Sim ( x ) Não");
        }
        
    }
}
