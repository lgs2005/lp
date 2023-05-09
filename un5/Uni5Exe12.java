import java.util.Scanner;

public class Uni5Exe12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas linhas? ");
        int n = scanner.nextInt();

        int x = 1;
        for (int l = 1; l <= n; l++) {
            String linha = "";
            for (int i = 0; i < l; i++) {
                linha += x + " ";
                x++;
            }
            System.out.println(linha);
        }

        scanner.close();
    }
}
