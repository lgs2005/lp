import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Exe01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("R$ 0.00");

        System.out.print("Entre com as horas trabalhadas no mês: ");
        double horas = scanner.nextDouble();

        System.out.print("Entre com o valor pago por hora: ");
        double valorPorHora = scanner.nextDouble();

        double salario = horas * valorPorHora;
        
        if (horas > 160) {
            salario += (horas - 160) * (valorPorHora/2);
        }

        System.out.println("O salário total é: " + format.format(salario));
        scanner.close();
    }
}
