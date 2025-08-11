import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        double nota1,nota2,nota3, media;
        
    	Scanner leitor = new Scanner(System.in);
 
        System.out.print("Digite a primeira nota: ");
        nota1 = leitor.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = leitor.nextDouble();

        media = (nota1 + nota2) / 2;

        System.out.printf("Média: %.2f%n", media);

        if (media >= 0 && media <= 3) {
            System.out.println("Reprovado");
        }
        else if (media > 3 && media < 7) {
            System.out.println("Em Exame");
        } 
        else if (media >= 7 && media <= 10) {
            System.out.println("Aprovado");
        }
        else {
            System.out.println("Notas inválidas!");
        }
        
        leitor.close();
    }
}
