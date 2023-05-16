import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.00");
        boolean fim = false;

        System.out.println("Digite o nome de cada aluno, seguido de duas notas. O programa para quando o nome for \"fim\".");

        while (!fim) {
            String nome = scanner.next();

            if (nome.equals("fim")) {
                fim = true;
            } else {
                double nota1 = scanner.nextDouble();
                double nota2 = scanner.nextDouble();
                double media = (nota1+nota2)/2.0;
                System.out.println("Média de " + nome + ": " + format.format(media));
            }
        }

        scanner.close();
    }
}
