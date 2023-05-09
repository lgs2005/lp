import java.util.Scanner;

public class Uni5Exe08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números? ");
        int n = scanner.nextInt();

        if (n > 0) {
            int menor = 0;
            int qtdePositivos = 0;
            double somaPositivos = 0;

            for (int i = 0; i < n; i++) {
                int x = scanner.nextInt();
                if (x > 0) {
                    qtdePositivos += 1;
                    somaPositivos += x;
                }
                if (x < menor) {
                    menor = x;
                }
            }

            //System.out.println(somaPositivos);
            //System.out.println(qtdePositivos);

            System.out.println("Menor negativo: " + menor);
            System.out.println("Média positivos: " + (somaPositivos/qtdePositivos));
        }

        scanner.close();
    }
}
