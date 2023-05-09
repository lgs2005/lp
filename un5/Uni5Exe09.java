import java.util.Scanner;

public class Uni5Exe09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos alunos? ");
        int n = scanner.nextInt();

        if (n > 0) {
            String nomes18 = "";
            int qtdeAcimaDe20 = 0;

            for (int i = 1; i <= n; i++) {
                System.out.print("Aluno " + i + ", nome e idade: ");
                String nome = scanner.next();
                int idade = scanner.nextInt();

                if (idade == 18) {
                    if (nomes18.isEmpty()) {
                        nomes18 += nome;
                    } else {
                        nomes18 += ", " + nome;
                    }
                }
                if (idade > 20) {
                    qtdeAcimaDe20 += 1;
                }
            }

            System.out.println("Alunos com 18 anos: " + nomes18);
            System.out.println("Quantidade de alunos acima de 20 anos: " + qtdeAcimaDe20);
        }

        scanner.close();
    }
}
