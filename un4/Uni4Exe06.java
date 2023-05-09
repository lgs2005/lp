import java.util.Scanner;

public class Uni4Exe06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char c = scanner.next().toUpperCase().charAt(0);

        if (c == 'M') {
            System.out.println("Masculino");
        }
        else if (c == 'F') {
            System.out.println("Feminino");
        }
        else if (c == 'I') {
            System.out.println("Não informado");;
        }
        else {
            System.out.println("Entrada incorreta");
        }

        scanner.close();
    }
}
