import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        double media, soma;
        
    	Scanner leitor = new Scanner(System.in);

        soma = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.print("Digite a nota " + i + ": ");
            soma += leitor.nextDouble();
        }

        media = soma / 3.0;

        if (media == 10) {
            System.out.printf("Aprovado com Distinção. Média: %.2f%n", media);
        } else if (media >= 7) {
            System.out.printf("Aprovado. Média: %.2f%n", media);
        } else {
            System.out.printf("Reprovado. Média: %.2f%n", media);
        }

        leitor.close();
    }
}
