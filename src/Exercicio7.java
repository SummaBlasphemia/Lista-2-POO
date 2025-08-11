import java.util.Scanner;
import java.util.Arrays;

public class Exercicio7 {
	public static void main(String[] args) {
		int[] numeros = new int[3];
		
		Scanner leitor = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			 System.out.print("Digite o " + (i + 1) + "º número: ");
	            numeros[i] = leitor.nextInt();
		}
		
		//Encontrei essa biblioteca java enqnt procurava por uma forma mais eficiente de se fazer essa organização de arrays
		
		Arrays.sort(numeros); // Ordena em ordem crescente
        System.out.println("Ordem decrescente: " + numeros[2] + " " + numeros[1] + " " + numeros[0]);
	
        leitor.close();
	}
}
