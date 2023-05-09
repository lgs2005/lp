import java.util.Scanner;

public class Uni4Exe25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma opção:");
        System.out.println("1 - Soma de dois números.");
        System.out.println("2 - Diferença entre dois números.");
        System.out.println("3 - Produto entre dois números.");
        System.out.println("4 - Divisão entre dois números (o denominador não pode ser zero).");
        int opcao = scanner.nextInt();

        System.out.println("Digite os dois números: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                if (b == 0) {
                    System.out.println("O denominador não pode ser zero.");
                } else {
                    System.out.println(a / b);
                }
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        scanner.close();
    }
}
