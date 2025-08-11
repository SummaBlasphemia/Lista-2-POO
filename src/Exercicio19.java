import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        double a, b, c, delta, raiz, raiz1, raiz2;
    	
    	Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        a = leitor.nextDouble();

        // Verifica se é equação do segundo grau
        if (a == 0) {
            System.out.println("O valor de A não pode ser zero. Não é uma equação do segundo grau.");
            leitor.close();
            return;
        }

        System.out.print("Digite o valor de B: ");
        b = leitor.nextDouble();

        System.out.print("Digite o valor de C: ");
        c = leitor.nextDouble();

        delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println("A equação não possui raízes reais.");
        } else if (delta == 0) {
            raiz = -b / (2 * a);
            System.out.printf("A equação possui uma raiz real: %.2f%n", raiz);
        } else {
            raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("A equação possui duas raízes reais: %.2f e %.2f%n", raiz1, raiz2);
        }

        leitor.close();
    }
}
