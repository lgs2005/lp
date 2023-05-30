import java.util.Scanner;

public class Uni6Exe01 {
    public static void main(String[] args) {
        int[] numeros = new int[10];

        lerNumeros(numeros);
        escreverNumeros(numeros);
    }

    public static void lerNumeros(int[] numeros) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
        }

        scanner.close();
    }

    public static void escreverNumeros(int[] numeros) {
        for (int i = 9; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}
