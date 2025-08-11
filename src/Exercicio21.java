import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        int dia, mes, ano;
        boolean dataValida;
        
    	Scanner leitor = new Scanner(System.in);

        System.out.print("Digite uma data (dd/mm/aaaa): ");
        String data = leitor.nextLine();

        String[] partes = data.split("/");

        if (partes.length != 3) {
            System.out.println("Formato inválido!");
            leitor.close();
            return;
        }

        try {
            dia = Integer.parseInt(partes[0]);
            mes = Integer.parseInt(partes[1]);
            ano = Integer.parseInt(partes[2]);

            dataValida = true;


            if (ano <= 0) {
                dataValida = false;
            }


            if (mes < 1 || mes > 12) {
                dataValida = false;
            }


            int[] diasNoMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                diasNoMes[1] = 29;
            }

            if (dia < 1 || dia > diasNoMes[mes - 1]) {
                dataValida = false;
            }

            if (dataValida) {
                System.out.println("Data válida.");
            } else {
                System.out.println("Data inválida.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Formato inválido: não é um número.");
        }

        leitor.close();
    }
}
