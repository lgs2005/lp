import java.util.Scanner;

public class Uni5Exe29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor = scanner.nextInt();

        int cedulas20 = 0;
        int cedulas10 = 0;
        int cedulas5 = 0;
        int cedulas2 = 0;
        int cedulas1 = 0;

        while (valor > 0) {
            if (valor >= 20) {
                cedulas20++;
                valor -= 20;
            } else if (valor >= 10) {
                cedulas10++;
                valor -= 10;
            } else if (valor >= 5) {
                cedulas5++;
                valor -= 5;
            } else if (valor >= 2) {
                cedulas2++;
                valor -= 2;
            } else {
                cedulas1 += valor;
                valor = 0;
            }
        }

        System.out.println("Cédulas de 20: " + cedulas20);
        System.out.println("Cédulas de 10: " + cedulas10);
        System.out.println("Cédulas de 5: " + cedulas5);
        System.out.println("Cédulas de 2: " + cedulas2);
        System.out.println("Cédulas de 1: " + cedulas1);

        scanner.close();
    }
}
