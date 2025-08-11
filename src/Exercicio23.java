import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        int soma;
    	double media;
    	Scanner leitor = new Scanner(System.in);

        soma = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.print("Digite a idade do aluno " + i + ": ");
            soma += leitor.nextInt();
        }

        media = soma / 3.0;

        if (media < 25) {
            System.out.println("Turma Jovem");
        } else if (media <= 40) {
            System.out.println("Turma Adulta");
        } else {
            System.out.println("Turma Idosa");
        }

        leitor.close();
    }
}
