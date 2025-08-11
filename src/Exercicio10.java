import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
    	int n1,n2,n3;
    	
    	Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        n1 = leitor.nextInt();

        System.out.print("Digite o segundo número: ");
        n2 = leitor.nextInt();

        System.out.print("Digite o terceiro número: ");
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

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        
        leitor.close();
    }
}
