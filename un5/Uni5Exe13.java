import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.00 KM/L");

        System.out.print("Número de reabastecimentos: ");
        int numReabastecimentos = scanner.nextInt();

        double kmTotal = 0;
        double ltTotal = 0;
        double ltUltimaParada = 0;

        for (int i = 1; i <= numReabastecimentos; i++) {
            System.out.println("Parada " + i);

            System.out.print("Valor do odômetro (KM): ");
            double kmParada = scanner.nextDouble();

            if (ltUltimaParada > 0) {
                double kmlParada = kmParada / ltUltimaParada;
                System.out.println("KM/Litro desde o último reabastecimento: " + format.format(kmlParada));
                kmTotal += kmParada;
            }

            System.out.print("Total reabastecido (L): ");
            double ltParada = scanner.nextDouble();

            ltUltimaParada = ltParada;
            ltTotal += ltParada;
        }

        ltTotal -= ltUltimaParada;
        double kmlTotal = kmTotal / ltTotal;
        System.out.println("KM/Litro durante toda a viagem: " + format.format(kmlTotal));

        scanner.close();
    }
}
