import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		String FemOuMasc;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a letra F ou M");
		FemOuMasc = leitor.nextLine();
		
		if(FemOuMasc.equalsIgnoreCase("F")) {
			System.out.println("F - Feminino");
		}
		else if(FemOuMasc.equalsIgnoreCase("M")) {
			System.out.println("M - Masculino");
		}
		else {
			System.out.println("Letra digitada invalida");
		}
		
		leitor.close();
	}
}
