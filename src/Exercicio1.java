import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		int num1, num2;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro: ");
		num1 = leitor.nextInt();
		
		System.out.println("Digite mais um numero inteiro: ");
		num2 = leitor.nextInt();
		
		if(num1 > num2) {
			System.out.println("O maior numero é " + num1);
		}
		
		else if (num1 == num2) {
			System.out.println("Ambos os numeros são iguais.");
		}
		
		else {
			System.out.println("O maior numero é " + num2);
		}
		
		leitor.close();
	}
}
