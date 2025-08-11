import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        double preco;
        int codigo;
    	
    	Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o pre�o de custo do produto: R$ ");
        preco = leitor.nextDouble();

        System.out.print("Digite o c�digo de origem do produto: ");
        codigo = leitor.nextInt();

        String procedencia;

        switch (codigo) {
            case 1:
                procedencia = "Sul";
                break;
            case 2:
                procedencia = "Norte";
                break;
            case 3:
                procedencia = "Leste";
                break;
            case 4:
                procedencia = "Oeste";
                break;
            case 5:
            case 6:
                procedencia = "Nordeste";
                break;
            case 7:
            case 8:
                procedencia = "Centro-Oeste";
                break;
            default:
                procedencia = "Importado";
        }

        System.out.printf("Pre�o: R$ %.2f%n", preco);
        System.out.println("Proced�ncia: " + procedencia);
        
        leitor.close();
    }
}
