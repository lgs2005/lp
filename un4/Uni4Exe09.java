import java.util.Scanner;

public class Uni4Exe09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Primeiro valor: ");
        int a = scanner.nextInt();

        System.out.print("Segundo valor: ");
        int b = scanner.nextInt();

        if (a % b == 0) {
            System.out.println(a + " é múltiplo de " + b);
        }
        else if (b % a == 0) {
            System.out.println(b + " é múltiplo de " + a);
        }
        else {
            System.err.println("Não são múltiplos.");
        }

        scanner.close();
    }
}
