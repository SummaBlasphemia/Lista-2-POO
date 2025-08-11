import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        int respostasSim;
    	
    	Scanner leitor = new Scanner(System.in);

        String[] perguntas = {
            "Telefonou para a vítima? (s/n)",
            "Esteve no local do crime? (s/n)",
            "Mora perto da vítima? (s/n)",
            "Devia para a vítima? (s/n)",
            "Já trabalhou com a vítima? (s/n)"
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
            System.out.println("Classificação: Suspeita");
        } else if (respostasSim == 3 || respostasSim == 4) {
            System.out.println("Classificação: Cúmplice");
        } else if (respostasSim == 5) {
            System.out.println("Classificação: Assassino");
        } else {
            System.out.println("Classificação: Inocente");
        }

        leitor.close();
    }
}
