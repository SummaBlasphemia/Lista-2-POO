import java.util.Scanner;

public class Exercicio18 {
	public static void main(String[] args) {
		int[] lados = new int[3];
		Scanner leitor = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Escreva um numero para o lado do triangulo: ");
			lados[i] = leitor.nextInt();
		}
		
		if (lados[0] == lados[1] && lados[0] == lados[2]) {
			System.out.println("Triangulo Equilatero");
		}
		else if(lados[0] == lados[1] || lados[0] == lados[2] || lados[1] == lados[2]) {
			System.out.println("Triangulo Isoceles");
		}
		else if(lados[0] != lados[1] && lados[0] != lados[2] && lados[1] != lados[2]) {
			System.out.println("Triangulo Escaleno");
		}
		
		leitor.close();
	}
}
