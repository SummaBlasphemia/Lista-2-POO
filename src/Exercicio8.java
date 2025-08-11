import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
    	double nota1, nota2, media;
    	
    	Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        nota1 = leitor.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = leitor.nextDouble();

        media = (nota1 + nota2) / 2;

        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
        
        leitor.close();
    }
}
