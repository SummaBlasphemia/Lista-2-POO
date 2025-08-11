import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o turno em que você estuda (M - Matutino, V - Vespertino, N - Noturno): ");
        char turno = leitor.next().toUpperCase().charAt(0);

        if (turno == 'M') {
            System.out.println("Bom Dia!");
        } else if (turno == 'V') {
            System.out.println("Boa Tarde!");
        } else if (turno == 'N') {
            System.out.println("Boa Noite!");
        } else {
            System.out.println("Valor inválido! Use M, V ou N.");
        }
        
        leitor.close();
    }
}
