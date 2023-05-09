import java.util.Scanner;

public class Uni4Exe16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Idade dos dois homens: ");
        int homemA = scanner.nextInt();
        int homemB = scanner.nextInt();

        System.out.print("Idade das duas mulheres: ");
        int mulherA = scanner.nextInt();
        int mulherB = scanner.nextInt();

        if (homemB > homemA) {
            int temp = homemA;
            homemA = homemB;
            homemB = temp;
        }

        if (mulherB > mulherA) {
            int temp = mulherA;
            mulherA = mulherB;
            mulherB = temp;
        }

        System.out.println("Soma: " + (homemA + mulherB));
        System.out.println("Produto: " + (homemB * mulherA));

        scanner.close();
    }
}
