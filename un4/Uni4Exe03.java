import java.util.Scanner;

public class Uni4Exe03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Primeiro número: ");
        int a = scanner.nextInt();

        System.out.print("Segundo número: ");
        int b = scanner.nextInt();

        int maior;

        if (a > b) {
            maior = a;
        }
        else {
            maior = b;
        }

        System.out.println("O maior valor é: " + maior);

        scanner.close();
    }
}
