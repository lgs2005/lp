import java.util.Scanner;

public class Uni6Exe06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        System.out.println("Vetor: ");
        double[] vetor = lerVetor(scanner, tamanho);

        System.out.print("Valor para encontrar: ");
        double valor = scanner.nextDouble();

        if (encontrarValor(vetor, valor)) {
            System.out.println("Este valor está no vetor.");
        } else {
            System.out.println("Este valor não está no vetor.");
        }

        scanner.close();
    }

    public static double[] lerVetor(Scanner scanner, int tamanho) {
        double[] vetor = new double[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = scanner.nextDouble();
        }

        return vetor;
    }

    public static boolean encontrarValor(double[] vetor, double valor) {
        for (double v : vetor) {
            if (v == valor) {
                return true;
            }
        }

        return false;
    }
}
