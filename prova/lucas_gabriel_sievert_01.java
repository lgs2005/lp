import java.util.Scanner;

public class lucas_gabriel_sievert_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = scanner.next();

        if (nome.isEmpty()) {
            System.out.println("Dados inválidos");
        } else {
            int anoNascimento = scanner.nextInt();

            if (anoNascimento < 1900) {
                System.out.println("Dados inválidos");
            } else {
                int idade = 2023 - anoNascimento;
                System.out.println("Nome: " + nome + " Idade: " + idade);
            }
        }

        scanner.close();
    }
}