import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        double num1, num2, resultado;
        boolean valido;
    	
    	Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro n�mero: ");
        num1 = leitor.nextDouble();

        System.out.print("Digite o segundo n�mero: ");
        num2 = leitor.nextDouble();

        System.out.println("Qual opera��o deseja realizar?");
        System.out.println("1 - Soma (+)");
        System.out.println("2 - Subtra��o (-)");
        System.out.println("3 - Multiplica��o (*)");
        System.out.println("4 - Divis�o (/)");
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
                    System.out.println("Divis�o por zero n�o � permitida.");
                    valido = false;
                }
                break;
            default:
                System.out.println("Op��o inv�lida.");
                valido = false;
        }

        if (valido) {
            System.out.printf("Resultado: %.2f%n", resultado);

            if (resultado == Math.floor(resultado)) {
                if (((int)resultado) % 2 == 0) {
                    System.out.println("O resultado � par.");
                } else {
                    System.out.println("O resultado � �mpar.");
                }
            } else {
                System.out.println("O resultado n�o � inteiro, logo n�o � par nem �mpar.");
            }

            if (resultado > 0) {
                System.out.println("O resultado � positivo.");
            } else if (resultado < 0) {
                System.out.println("O resultado � negativo.");
            } else {
                System.out.println("O resultado � zero.");
            }

            if (resultado == Math.floor(resultado)) {
                System.out.println("O resultado � um n�mero inteiro.");
            } else {
                System.out.println("O resultado � um n�mero decimal.");
            }
        }

        leitor.close();
    }
}
