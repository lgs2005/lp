import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Exe18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("R$ 0.00");

        System.out.print("Dia do vencimento: ");
        int vencimento = scanner.nextInt();
        System.out.print("Dia do pagamento: ");
        int pagamento = scanner.nextInt();
        System.out.print("Valor da prestação: ");
        double prestacao = scanner.nextDouble();

        double valor = prestacao;
        
        if (pagamento < vencimento) {
            valor = valor * 0.9;
            System.out.println("O seu pagamento está em dia!");
        } else {
            int diasPassados = pagamento - vencimento;

            if (diasPassados <= 5) {
                System.out.println("Você perdeu seu desconto.");
            } else {
                valor = valor * (1 + 0.02 * diasPassados);
                System.out.println("Atraso maior que cinco dias. Você receberá uma multa.");
            }
        }

        System.out.println("Valor a pagar: " + format.format(valor));

        scanner.close();
    }
}
