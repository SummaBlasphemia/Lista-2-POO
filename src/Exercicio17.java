import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        double nota1,nota2, media;
    	
    	Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        nota1 = leitor.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = leitor.nextDouble();

        media = (nota1 + nota2) / 2;

        char conceito;

        if (media >= 9.0 && media <= 10.0) {
            conceito = 'A';
        } 
        else if (media >= 7.5 && media < 9.0) {
            conceito = 'B';
        }
        else if (media >= 6.0 && media < 7.5) {
            conceito = 'C';
        }
        else if (media >= 4.0 && media < 6.0) {
            conceito = 'D';
        } 
        else if (media >= 0 && media < 4.0) {
            conceito = 'E';
        } 
        else {
            System.out.println("Notas inválidas!");
            return;
        }

        System.out.printf("Média: %.2f%n", media);
        System.out.println("Conceito: " + conceito);
        
        leitor.close();
    }
}
