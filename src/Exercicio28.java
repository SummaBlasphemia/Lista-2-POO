import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        double num1, num2, resultado;
        boolean valido;
    	
    	Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        num1 = leitor.nextDouble();

        System.out.print("Digite o segundo número: ");
        num2 = leitor.nextDouble();

        System.out.println("Qual operação deseja realizar?");
        System.out.println("1 - Soma (+)");
        System.out.println("2 - Subtração (-)");
        System.out.println("3 - Multiplicação (*)");
        System.out.println("4 - Divisão (/)");
        int opcao = leitor.nextInt();

        resultado = 0;
        valido = true;

        switch (opcao) {
            case 1: resultado = num1 + num2; break;
            case 2: resultado = num1 - num2; break;
            case 3: resultado = num1 * num2; break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Divisão por zero não é permitida.");
                    valido = false;
                }
                break;
            default:
                System.out.println("Opção inválida.");
                valido = false;
        }

        if (valido) {
            System.out.printf("Resultado: %.2f%n", resultado);

            if (resultado == Math.floor(resultado)) {
                if (((int)resultado) % 2 == 0) {
                    System.out.println("O resultado é par.");
                } else {
                    System.out.println("O resultado é ímpar.");
                }
            } else {
                System.out.println("O resultado não é inteiro, logo não é par nem ímpar.");
            }

            if (resultado > 0) {
                System.out.println("O resultado é positivo.");
            } else if (resultado < 0) {
                System.out.println("O resultado é negativo.");
            } else {
                System.out.println("O resultado é zero.");
            }

            if (resultado == Math.floor(resultado)) {
                System.out.println("O resultado é um número inteiro.");
            } else {
                System.out.println("O resultado é um número decimal.");
            }
        }

        leitor.close();
    }
}
