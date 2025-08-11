import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		String letra;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Escreva uma letra");
		letra = leitor.nextLine();
		
		if (letra.length() == 1) {
			if (letra.equalsIgnoreCase("A")|| letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I") || letra.equalsIgnoreCase("O")|| letra.equalsIgnoreCase("U")) {
			System.out.println("Vogal");
			}
			else {
				System.out.println("Caracter digitado não é uma vogal");
		}
		leitor.close();
	}
}
}
