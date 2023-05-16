import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.00Kg");

        System.out.print("Digite a massa do material: ");
        double massaInicial = scanner.nextDouble();
        
        double massa = massaInicial;
        int segundosTotal = 0;

        while (massa >= 0.5) {
            massa /= 2.0;
            segundosTotal += 50;
        }

        System.out.println("Massa inicial: " + format.format(massaInicial));
        System.out.println("Massa final: " + format.format(massa));
        System.err.println("Tempo: " + segundosTotal + " segundos.");
        
        scanner.close();
    }
}
