import java.util.Scanner;

public class Uni4Exe02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com um valor inteiro maior do que 0: ");
        int valor = scanner.nextInt();

        if (valor % 2 == 0) {
            System.out.println("Número é par");
        }
        else {
            System.out.println("Número é impar");
        }

        scanner.close();
    }
}
