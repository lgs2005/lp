import java.util.Scanner;

public class Uni6Exe04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vetor 1: ");
        int[] valores1 = lerValores(scanner);
        System.out.println("Vetor 2: ");
        int[] valores2 = lerValores(scanner);

        int[] valoresSoma = somarValores(valores1, valores2);

        System.out.println("Resultado: ");
        apresentarValores(valoresSoma);
    }

    public static int[] lerValores(Scanner scanner) {
        // criar dois scanners da erro
        // Scanner scanner = new Scanner(System.in);
        int[] valores = new int[10];

        for (int i = 0; i < 10; i++) {
            valores[i] = scanner.nextInt();
        }

        // scanner.close();

        return valores;
    }

    public static int[] somarValores(int[] valores1, int[] valores2) {
        int[] valoresSoma = new int[10];

        for (int i = 0; i < 10; i++) {
            valoresSoma[i] = valores1[i] + valores2[i];
        }

        return valoresSoma;
    }

    public static void apresentarValores(int[] valores) {
        for (int i = 0; i < 10; i++) {
            System.out.print(valores[i] + " ");
        }
    }
}
