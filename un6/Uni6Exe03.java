import java.util.Scanner;

public class Uni6Exe03 {
    public static void main(String[] args) {
        double[] valores = new double[12];
        lerValores(valores);
        ajustarValores(valores);
        apresentarValores(valores);
    }

    public static void lerValores(double[] valores) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 12; i++) {
            valores[i] = scanner.nextDouble();
        }
        scanner.close();
    }

    public static void ajustarValores(double[] valores) {
        for (int i = 0; i < 12; i++) {
            if (i % 2 == 0) {
                valores[i] *= 1.02;
            } else {
                valores[i] *= 1.05;
            }
        }
    }

    public static void apresentarValores(double[] valores) {
        System.out.println("Valores ajustados:");
        for (int i = 0; i < 12; i++) {
            System.out.print(valores[i] + " ");
        }
    }
}
