import java.util.Scanner;

public class Uni4Exe26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma opção: ");
        System.out.println("T. calcular a área de um triângulo de base b e altura h");
        System.out.println("Q. calcular a área de um quadrado de lado l");
        System.out.println("R. calcular a área de um retângulo de base b e altura h");
        System.out.println("C. calcular a área de um círculo de raio r");
        
        char opcao = scanner.next().toUpperCase().charAt(0);

        switch (opcao) {
            case 'T':
                System.out.print("Digite a base e a altura do triângulo: ");
                double base = scanner.nextDouble();
                double altura = scanner.nextDouble();
                System.out.println("Àrea: " + ((base*altura)/2));
                break;
            case 'Q':
                System.out.print("Digite o lado: ");
                double lado = scanner.nextDouble();
                System.out.println("Àrea: " + (lado*lado));
                break;
            case 'R':    
                System.out.print("Digite a base e a altura do retângulo: ");
                double baseret = scanner.nextDouble();
                double alturaret = scanner.nextDouble();
                System.out.println("Àrea: " + (baseret*alturaret));
                break;
            case 'C':
                System.out.print("Digite o raio: ");
                double raio = scanner.nextDouble();
                System.out.println("Área: " + (raio*raio*Math.PI));
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        scanner.close();
    }
}
