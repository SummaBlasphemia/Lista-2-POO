import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        int num;
    	
    	Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um n�mero inteiro: ");
        num = leitor.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " � par.");
        } else {
            System.out.println(num + " � �mpar.");
        }

        leitor.close();
    }
}
