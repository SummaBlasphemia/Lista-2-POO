import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
    	double num;
    	Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um n�mero: ");
        num = leitor.nextDouble();

        if (num == Math.floor(num)) {
            System.out.println(num + " � um n�mero inteiro.");
        } else {
            System.out.println(num + " � um n�mero decimal.");
        }

        leitor.close();
    }
}
