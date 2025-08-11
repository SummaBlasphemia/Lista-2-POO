import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        int tipo;
        double quantidade, precoPorKg, total, desconto;
        char pagamento;
    	String nomeCarne;
    	
    	Scanner leitor = new Scanner(System.in);

        System.out.println("Tipos de carne dispon�veis:");
        System.out.println("1 - Fil� Duplo");
        System.out.println("2 - Alcatra");
        System.out.println("3 - Picanha");
        System.out.print("Digite o n�mero correspondente ao tipo de carne: ");
        tipo = leitor.nextInt();

        System.out.print("Digite a quantidade em Kg: ");
        quantidade = leitor.nextDouble();

        System.out.print("Pagamento com cart�o Tabajara? (s/n): ");
        pagamento = leitor.next().toLowerCase().charAt(0);

        precoPorKg = 0;
        nomeCarne = "";

        switch (tipo) {
            case 1:
                nomeCarne = "Fil� Duplo";
                precoPorKg = (quantidade <= 5) ? 4.90 : 5.80;
                break;
            case 2:
                nomeCarne = "Alcatra";
                precoPorKg = (quantidade <= 5) ? 5.90 : 6.80;
                break;
            case 3:
                nomeCarne = "Picanha";
                precoPorKg = (quantidade <= 5) ? 6.90 : 7.80;
                break;
            default:
                System.out.println("Tipo de carne inv�lido!");
                leitor.close();
                return;
        }

        total = precoPorKg * quantidade;
        desconto = 0;

        if (pagamento == 's') {
            desconto = total * 0.05;
        }

        double valorPagar = total - desconto;

        System.out.println("\n--- CUPOM FISCAL ---");
        System.out.println("Tipo de carne: " + nomeCarne);
        System.out.printf("Quantidade: %.2f Kg%n", quantidade);
        System.out.printf("Pre�o total: R$ %.2f%n", total);
        System.out.println("Tipo de pagamento: " + (pagamento == 's' ? "Cart�o Tabajara" : "Outro"));
        System.out.printf("Valor do desconto: R$ %.2f%n", desconto);
        System.out.printf("Valor a pagar: R$ %.2f%n", valorPagar);

        leitor.close();
    }
}
