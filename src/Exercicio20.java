import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        int ano;
        boolean bissexto;
    	Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        ano = leitor.nextInt();

        bissexto = false;

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            bissexto = true;
        }

        if (bissexto) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }

        leitor.close();
    }
}
