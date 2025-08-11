import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        double litros, valorSemDesconto, valorDesconto, valorPagar;
        char tipo;
    	
    	Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o número de litros vendidos: ");
        litros = leitor.nextDouble();

        System.out.print("Digite o tipo de combustível (A - Álcool, G - Gasolina): ");
        tipo = leitor.next().toUpperCase().charAt(0);

        double precoLitro = 0;
        double desconto = 0;

        if (tipo == 'A') {
            precoLitro = 1.90;
            if (litros <= 20) {
                desconto = 0.03;
            } else {
                desconto = 0.05;
            }
        } else if (tipo == 'G') {
            precoLitro = 2.50;
            if (litros <= 20) {
                desconto = 0.04;
            } else {
                desconto = 0.06;
            }
        } else {
            System.out.println("Tipo de combustível inválido.");
            leitor.close();
            return;
        }

        valorSemDesconto = precoLitro * litros;
        valorDesconto = valorSemDesconto * desconto;
        valorPagar = valorSemDesconto - valorDesconto;

        System.out.printf("Preço total sem desconto: R$ %.2f%n", valorSemDesconto);
        System.out.printf("Desconto aplicado: R$ %.2f%n", valorDesconto);
        System.out.printf("Valor a pagar: R$ %.2f%n", valorPagar);

        leitor.close();
    }
}
