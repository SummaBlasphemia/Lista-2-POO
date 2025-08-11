import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        int num, centenas, dezenas, unidades;
    	Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro menor que 1000: ");
        num = sc.nextInt();

        if (num < 0 || num >= 1000) {
            System.out.println("Número inválido! Deve ser entre 0 e 999.");
            sc.close();
            return;
        }

        centenas = num / 100;
        dezenas = (num % 100) / 10;
        unidades = num % 10;

        System.out.println("Centenas: " + centenas);
        System.out.println("Dezenas: " + dezenas);
        System.out.println("Unidades: " + unidades);

        sc.close();
    }
}
