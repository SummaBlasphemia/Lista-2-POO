import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
    	double altura, peso;
    	char sexo;
    	
    	Scanner leitor = new Scanner(System.in);

        System.out.print("Digite sua altura (em metros): ");
        altura = leitor.nextDouble();

        System.out.print("Digite seu peso (em kg): ");
        peso = leitor.nextDouble();

        System.out.print("Digite seu sexo (M para masculino / F para feminino): ");
        sexo = leitor.next().toUpperCase().charAt(0);

        double pesoIdeal;

        if (sexo == 'M') {
            pesoIdeal = (72.7 * altura) - 58;
        } else if (sexo == 'F') {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            System.out.println("Sexo inv�lido! Use M ou F.");
            return;
        }

        System.out.println("\n=== RESULTADO ===");
        System.out.printf("Altura: %.2f m%n", altura);
        System.out.printf("Peso: %.2f kg%n", peso);
        System.out.println("Sexo: " + (sexo == 'M' ? "Masculino" : "Feminino"));
        System.out.printf("Peso Ideal: %.2f kg%n", pesoIdeal);

        if (peso > pesoIdeal) {
            System.out.println("Voc� est� acima do peso ideal.");
        } else if (peso < pesoIdeal) {
            System.out.println("Voc� est� abaixo do peso ideal.");
        } else {
            System.out.println("Voc� est� no peso ideal!");
        }
        
        leitor.close();
    }
}
