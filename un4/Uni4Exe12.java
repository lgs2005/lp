import java.util.Scanner;

public class Uni4Exe12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Primeiro lado: ");        
        double a = scanner.nextDouble();

        System.out.print("Segundo lado: ");        
        double b = scanner.nextDouble();

        System.out.print("Terceiro lado: ");        
        double c = scanner.nextDouble();

        if (a >= (b + c) || b >= (a + c) || c >= (a + b)) {
            System.out.println("Não formam um triângulo");
        }
        else if (a == b && b == c) {
            System.out.println("Triângulo Equilátero");
        }
        else if (a == b || a == c || b == c) {
            System.out.println("Triângulo Isósceles");
        }
        else {
            System.out.println("Triângulo Escaleno");
        }

        scanner.close();
    }
}
