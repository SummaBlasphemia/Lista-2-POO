import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		int numero;
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Escreva um numero inteiro qualquer: ");
		numero = leitor.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("Numero digitado � par.");
			
			numero = numero + 1;
			System.out.println("Transformando ele em impar: " + numero);
		}
		
		else if (numero % 2 != 0) {
			System.out.println("Numero digitado � impar.");
			
			numero = numero + 1;
			System.out.println("Transformando ele em par: " + numero);
		}
		
		leitor.close();
	}
}
