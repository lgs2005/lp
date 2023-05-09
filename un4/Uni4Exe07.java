import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Exe07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("R$ 0.00");

        System.out.print("Peso da carta (gramas): ");
        double peso = scanner.nextDouble();

        double valor = 0.45;

        if (peso > 50) {
            valor += ((peso-50)/20) * 0.45;
        }

        System.out.println("Custo do selo: " + format.format(valor));

        scanner.close();
    }
}
