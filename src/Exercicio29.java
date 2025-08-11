import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        int respostasSim;
    	
    	Scanner leitor = new Scanner(System.in);

        String[] perguntas = {
            "Telefonou para a v�tima? (s/n)",
            "Esteve no local do crime? (s/n)",
            "Mora perto da v�tima? (s/n)",
            "Devia para a v�tima? (s/n)",
            "J� trabalhou com a v�tima? (s/n)"
        };

        respostasSim = 0;

        for (String pergunta : perguntas) {
            System.out.print(pergunta + " ");
            String resposta = leitor.nextLine().trim().toLowerCase();
            if (resposta.equals("s") || resposta.equals("sim")) {
                respostasSim++;
            }
        }

        if (respostasSim == 2) {
            System.out.println("Classifica��o: Suspeita");
        } else if (respostasSim == 3 || respostasSim == 4) {
            System.out.println("Classifica��o: C�mplice");
        } else if (respostasSim == 5) {
            System.out.println("Classifica��o: Assassino");
        } else {
            System.out.println("Classifica��o: Inocente");
        }

        leitor.close();
    }
}
