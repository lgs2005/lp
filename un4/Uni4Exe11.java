import java.util.Scanner;

public class Uni4Exe11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Idade irmão 1: ");        
        int a = scanner.nextInt();

        System.out.print("Idade irmão 2: ");        
        int b = scanner.nextInt();

        System.out.print("Idade irmão 3: ");        
        int c = scanner.nextInt();

        if (a == b && b == c) {
            System.out.println("TRIGÊMEOS");
        }
        else if (a == b || a == c || b == c) {
            System.out.println("GÊMEOS");
        }
        else {
            System.out.println("APENAS IRMÃOS");
        }

        scanner.close();
    }
}
