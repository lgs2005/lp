import java.util.Scanner;

public class Uni6Exe02 {
    public static void main(String[] args) {
        double[] numeros = new double[12];
        lerNumeros(numeros);
        double media = calcularMedia(numeros);
        imprimirNumerosMaioresQueMedia(numeros, media);
    }

    public static void lerNumeros(double[] numeros) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 12; i++) {
            numeros[i] = scanner.nextDouble();
        }

        scanner.close();
    }

    public static double calcularMedia(double[] numeros) {
        double total = 0;
        for (int i = 0; i < 12; i++) {
            total += numeros[i];
        }
        return total / 12;
    }

    public static void imprimirNumerosMaioresQueMedia(double[] numeros, double media) {
        System.out.println("Números maiores que a média: ");
        
        for (int i = 0; i < 12; i++) {
            if (numeros[i] > media) {
                System.out.print(numeros[i] + " ");
            }
        }
    }
}
