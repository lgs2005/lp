import java.util.Scanner;

public class Uni4Exe22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Qual foi sua escolha? ");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Bacharel em Ciência da Computação");
                break;
            case 2:
                System.out.println("Licenciado em Computação");
                break;
            case 3:
                System.out.println("Bacharel em Sistemas de Informação");
                break;
        }

        scanner.close();
    }
}
