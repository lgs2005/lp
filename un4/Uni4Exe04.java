import java.util.Scanner;

public class Uni4Exe04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numero = scanner.nextDouble();

        if (numero % 1 > 0) {
            System.out.println("Tem casas decimais.");
        }
        else {
            System.out.println("Não tem casas decimais.");
        }

        scanner.close();
    }
}
