import java.util.Scanner;

public class Uni5Exe31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int f = 1;

        while (n > 1) {
            // Encontra o próximo primo começando em f
            boolean primo = false;
            while (f > 0 && !primo) {
                f++;
                primo = true;
                for (int d = 2; d > 0 && d < f && primo; d++) {
                    if (f % d == 0) {
                        primo = false;
                    }
                }
            }
            
            while (n % f == 0) {
                System.out.println(n + "\t|\t" + f);
                n = n/f;
            }
        }

        System.out.println("1");

        scanner.close();
    }
}
