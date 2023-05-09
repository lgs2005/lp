import java.util.Scanner;

public class Uni5Exe05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = 4;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                x *= 2;
                System.out.println(x);
            } else {
                System.out.println(x+2);
            }
        }

        scanner.close();
    }
}
