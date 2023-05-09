import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Exe17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("R$ 0.00");

        System.out.print("Renda anual: ");
        double rendaAnual = scanner.nextDouble();

        System.out.print("Número de dependentes: ");
        int dependentes = scanner.nextInt();

        double rendaLiquida = rendaAnual * (1 - 0.02*dependentes);
        double imposto = 0;

        if (rendaLiquida >= 10_000) {
            imposto = rendaLiquida * 0.15;
        }
        else if (rendaLiquida >= 5_000) {
            imposto = rendaLiquida * 0.10;
        }
        else if (rendaLiquida >= 2_000) {
            imposto = rendaLiquida * 0.05;
        }

        System.out.println("Renda líquida: " + format.format(rendaLiquida));
        System.out.println("Imposto: " + format.format(imposto));

        scanner.close();
    }
}
