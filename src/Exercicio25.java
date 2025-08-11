import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        int restante, notas100, notas50, notas10, notas5, notas1;
    	Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor do saque (10 a 600): R$ ");
        int valor = leitor.nextInt();

        if (valor < 10 || valor > 600) {
            System.out.println("Valor inválido para saque.");
            leitor.close();
            return;
        }

        restante = valor;

        notas100 = restante / 100;
        restante %= 100;

        notas50 = restante / 50;
        restante %= 50;

        notas10 = restante / 10;
        restante %= 10;

         notas5 = restante / 5;
        restante %= 5;

        notas1 = restante;

        System.out.println("Notas fornecidas:");
        if (notas100 > 0) System.out.println(notas100 + " nota(s) de R$ 100");
        if (notas50 > 0) System.out.println(notas50 + " nota(s) de R$ 50");
        if (notas10 > 0) System.out.println(notas10 + " nota(s) de R$ 10");
        if (notas5 > 0) System.out.println(notas5 + " nota(s) de R$ 5");
        if (notas1 > 0) System.out.println(notas1 + " nota(s) de R$ 1");

        leitor.close();
    }
}
