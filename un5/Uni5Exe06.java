import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.00");

        System.out.print("Digite as 20 alturas: ");

        double soma = 0;
        for (int i = 0; i < 20; i++) {
            soma += scanner.nextDouble();
        }

        System.out.println("Média: " + format.format(soma / 20));
        scanner.close();
    }
}
