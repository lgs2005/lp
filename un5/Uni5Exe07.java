import java.util.Scanner;

public class Uni5Exe07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números? ");
        int n = scanner.nextInt();

        if (n > 0) {
            int menor = scanner.nextInt();
            int maior = menor;

            for (int i = 1; i < n; i++) {
                int x = scanner.nextInt();
                
                if (x > maior) {
                    maior = x;
                }
                if (x < menor) {
                    menor = x;
                }
            }

            System.out.println("Menor: " + menor);
            System.out.println("Maior: " + maior);
        }

        scanner.close();
    }
}
