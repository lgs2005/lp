import java.util.Scanner;

public class Uni4Exe24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite os três valores: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (b < a) {
            int temp = a;
            a = b;
            b = temp;
        }

        if (c < a) {
            int temp = a;
            a = c;
            c = temp;
        }

        if (c < b) {
            int temp = c;
            c = b;
            b = temp;
        }

        System.out.println("se opção = 1, escreva os 3 valores em ordem crescente");
        System.out.println("se opção = 2, escreva os 3 valores em ordem decrescente");
        System.out.println("se opção = 3, escreva os 3 valores de forma que o maior valor fique no meio");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println(a + ", " + b + ", " + c);
                break;
            case 2:
                System.out.println(c + ", " + b + ", " + a);
                break;
            case 3:
                System.out.println(b + ", " + c + ", " + a);
                break;
            default:
                System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}
