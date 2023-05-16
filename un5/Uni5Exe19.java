import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat formatoReais = new DecimalFormat("R$ 0.00");
        System.out.println("Digite o valor de cada compra. Digite valor 0 para terminar.");

        double totalRecebido = 0;
        boolean fim = false;

        while (!fim) {
            double valorCompra = scanner.nextDouble();

            if (valorCompra == 0) {
                fim = true;
            } else {
                double valorAPagar;
                if (valorCompra > 500) {
                    valorAPagar = valorCompra * (1 - 0.20);
                } else {
                    valorAPagar = valorCompra * (1 - 0.15);
                }

                totalRecebido += valorAPagar;
                System.out.println("Valor a pagar: " + formatoReais.format(valorAPagar));
            }
        }


        System.out.println("Valor total recebido hoje: " + formatoReais.format(totalRecebido));
        scanner.close();
    }
}
