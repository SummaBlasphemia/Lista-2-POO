import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		int num;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro: ");
		num = leitor.nextInt();
		
		if(num > 0) {
			System.out.println("O numero digitado � positivo");
		}
		else if(num == 0) {
			System.out.println("O numero digitado � zero");
		}
		else {
			System.out.println("O numero digitado � negativo");
		}
		
		leitor.close();
	}
}
