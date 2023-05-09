import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Exe15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("R$ 0.00");

        System.out.print("Valor do salário: ");
        double salario = scanner.nextDouble();

        System.out.print("Quantidade de meses desde que foi admitido: ");
        int meses = scanner.nextInt();

        double reajuste = 0;

        if (meses <= 12) {
            reajuste = salario * 0.05;
        }
        else if (meses <= 48) {
            reajuste = salario * 0.07;
        }

        System.out.println("Reajuste: " + format.format(reajuste));

        scanner.close();
    }
}
