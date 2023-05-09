import java.util.Scanner;

public class Uni4Exe13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe as três cartas: ");
        int carta1 = scanner.nextInt();
        int carta2 = scanner.nextInt();
        int carta3 = scanner.nextInt();

        int cartasBoas = 0;

        if (carta1 >= 1 && carta1 <= 3) {
            cartasBoas += 1;
        }
        if (carta2 >= 1 && carta2 <= 3) {
            cartasBoas += 1;
        }
        if (carta3 >= 1 && carta3 <= 3) {
            cartasBoas += 1;
        }

        if (cartasBoas == 1) {
            System.out.println("TRUCO");
        }
        else if (cartasBoas == 2) {
            System.out.println("SEIS");
        }
        else if (cartasBoas == 3) {
            System.out.println("NOVE");
        }

        scanner.close();
    }
}
