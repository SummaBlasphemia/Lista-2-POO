import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
        double morangoKg, macaKg, precoMorango, precoMaca, totalMorango, totalMaca, totalCompra, pesoTotal;
    	
    	Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a quantidade de morangos (Kg): ");
         morangoKg = leitor.nextDouble();

        System.out.print("Digite a quantidade de maçãs (Kg): ");
         macaKg = leitor.nextDouble();

         precoMorango = (morangoKg <= 5) ? 2.50 : 2.20;
         precoMaca = (macaKg <= 5) ? 1.80 : 1.50;

         totalMorango = precoMorango * morangoKg;
         totalMaca = precoMaca * macaKg;

         totalCompra = totalMorango + totalMaca;
         pesoTotal = morangoKg + macaKg;

        // Verifica desconto extra
        if (pesoTotal > 8 || totalCompra > 25) {
            totalCompra = totalCompra * 0.9; // desconto 10%
        }

        System.out.printf("Total a pagar: R$ %.2f%n", totalCompra);

        leitor.close();
    }
}
