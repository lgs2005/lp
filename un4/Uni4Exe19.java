import java.util.Scanner;

public class Uni4Exe19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("x = ");
        double x = scanner.nextDouble();
        System.out.print("y = ");
        double y = scanner.nextDouble();

        // faltou os eixos???
        // não constam no enunciado.

        if (x == 0 && y == 0) {
            System.out.println("Quandrante 0");
        }
        else if (x > 0 && y > 0) {
            System.out.println("Quadrante 1");
        }
        else if (x > 0 && y < 0) {
            System.out.println("Quandrante 2");
        }
        else if (x < 0 && y < 0) {
            System.out.println("Quadrante 3");
        }
        else if (x < 0 && y > 0) {
            System.out.println("Quadrante 4");
        }

        scanner.close();
    }
}
