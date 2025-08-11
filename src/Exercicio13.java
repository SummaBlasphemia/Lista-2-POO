import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
    	double valorHora, horasTrabalhadas, valorIR, valorINSS, valorFGTS, totalDescontos, salarioLiquido;
    	
    	Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor da sua hora: R$ ");
        valorHora = leitor.nextDouble();

        System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
        horasTrabalhadas = leitor.nextDouble();

        double salarioBruto = valorHora * horasTrabalhadas;

        double percentualIR;
        if (salarioBruto <= 900) {
            percentualIR = 0;
        } else if (salarioBruto <= 1500) {
            percentualIR = 5;
        } else if (salarioBruto <= 2500) {
            percentualIR = 10;
        } else {
            percentualIR = 20;
        }

        valorIR = salarioBruto * (percentualIR / 100);
        valorINSS = salarioBruto * 0.10;
        valorFGTS = salarioBruto * 0.11;

        totalDescontos = valorIR + valorINSS;
        salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("\n=== FOLHA DE PAGAMENTO ===");
        System.out.printf("Salário Bruto: (%.2f * %.0f) : R$ %.2f%n", valorHora, horasTrabalhadas, salarioBruto);
        System.out.printf("(-) IR (%.0f%%) : R$ %.2f%n", percentualIR, valorIR);
        System.out.printf("(-) INSS (10%%) : R$ %.2f%n", valorINSS);
        System.out.printf("FGTS (11%%) : R$ %.2f%n", valorFGTS);
        System.out.printf("Total de descontos : R$ %.2f%n", totalDescontos);
        System.out.printf("Salário Líquido : R$ %.2f%n", salarioLiquido);
    }
}
