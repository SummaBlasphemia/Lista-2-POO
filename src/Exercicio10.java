import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
    	int n1,n2,n3;
    	
    	Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro n�mero: ");
        n1 = leitor.nextInt();

        System.out.print("Digite o segundo n�mero: ");
        n2 = leitor.nextInt();

        System.out.print("Digite o terceiro n�mero: ");
        n3 = leitor.nextInt();

        int maior = n1;
        int menor = n1;

        // Verifica o maior
        if (n2 > maior) {
            maior = n2;
        }
        if (n3 > maior) {
            maior = n3;
        }

        // Verifica o menor
        if (n2 < menor) {
            menor = n2;
        }
        if (n3 < menor) {
            menor = n3;
        }

        System.out.println("Maior n�mero: " + maior);
        System.out.println("Menor n�mero: " + menor);
        
        leitor.close();
    }
}
