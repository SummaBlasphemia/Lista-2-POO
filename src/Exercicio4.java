import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		int ano;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um ano, ele deve ter obrigatoriamente 4 digitos: ");
		ano = leitor.nextInt();
		
		if (ano >= 1000 && ano <= 9999) {
			if (ano % 4 == 0) {
				System.out.println("Ano bissexto");
		}
			
		else {
			System.out.println("Ano não é bissexto");
		} 
	}
		else {
			System.out.println("Ano não tem 4 digitos");
		}
		
		leitor.close();
}
}
