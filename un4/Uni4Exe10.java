import java.util.Scanner;

public class Uni4Exe10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Idade de Marquinhos: ");
        int marquinhos = scanner.nextInt();

        System.out.print("Idade de Zezinho: ");
        int zezinho = scanner.nextInt();

        System.out.print("Idade de Luluzinha: ");
        int luluzinha = scanner.nextInt();

        String cacula = "Marquinhos";
        int idadeCacula = marquinhos;

        if (zezinho < idadeCacula) {
            idadeCacula = zezinho;
            cacula = "Zezinho";
        }

        if (luluzinha < idadeCacula) {
            idadeCacula = luluzinha;
            cacula = "Luluzinha";
        }

        System.out.println("Caçula: " + cacula);

        scanner.close();
    }
}
