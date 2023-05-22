import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat formatReais = new DecimalFormat("R$ 0.00");

        char simnao = '1';
        while (simnao == '1') {
            System.out.print("Dia: ");
            int dia = scanner.nextInt();

            if (dia < 1 || dia > 30) {
                System.out.println("Dia inválido");
            } else {
                System.out.print("Total de peças (Manhã): ");
                int totalManha = scanner.nextInt();
                System.out.print("Total de peças (Tarde): ");
                int totalTarde = scanner.nextInt();

                double valor;
                if (dia <= 15) {
                    int total = totalManha + totalTarde;
                    if (totalManha >= 30 && totalTarde >= 30 && total > 100) {
                        valor = 0.80 * total;
                    } else {
                        valor = 0.50 * total;
                    }
                } else {
                    valor = 0.40*totalManha + 0.30*totalTarde;
                }

                System.out.println(formatReais.format(valor) + " (valor recebido)");
            }

            System.out.print("Novo funcionário (1.sim 2.não)?");
            simnao = scanner.next().toLowerCase().charAt(0);
        }

        scanner.close();
    }
}
