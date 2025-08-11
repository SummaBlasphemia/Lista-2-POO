import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        int tipo;
        double quantidade, precoPorKg, total, desconto;
        char pagamento;
    	String nomeCarne;
    	
    	Scanner leitor = new Scanner(System.in);

        System.out.println("Tipos de carne disponíveis:");
        System.out.println("1 - Filé Duplo");
        System.out.println("2 - Alcatra");
        System.out.println("3 - Picanha");
        System.out.print("Digite o número correspondente ao tipo de carne: ");
        tipo = leitor.nextInt();

        System.out.print("Digite a quantidade em Kg: ");
        quantidade = leitor.nextDouble();

        System.out.print("Pagamento com cartão Tabajara? (s/n): ");
        pagamento = leitor.next().toLowerCase().charAt(0);

        precoPorKg = 0;
        nomeCarne = "";

        switch (tipo) {
            case 1:
                nomeCarne = "Filé Duplo";
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
                System.out.println("Tipo de carne inválido!");
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
        System.out.printf("Preço total: R$ %.2f%n", total);
        System.out.println("Tipo de pagamento: " + (pagamento == 's' ? "Cartão Tabajara" : "Outro"));
        System.out.printf("Valor do desconto: R$ %.2f%n", desconto);
        System.out.printf("Valor a pagar: R$ %.2f%n", valorPagar);

        leitor.close();
    }
}
