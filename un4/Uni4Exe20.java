import java.util.Scanner;

public class Uni4Exe20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("notaProva1: ");
        double notaProva1 = scanner.nextDouble();
        System.out.print("notaProva2: ");
        double notaProva2 = scanner.nextDouble();
        System.out.print("notaProva3: ");
        double notaProva3 = scanner.nextDouble();
        System.out.print("notaExercicios: ");
        double notaExercicios = scanner.nextDouble();

        double media = (notaProva1 + notaProva2*2 + notaProva3*3 + notaExercicios) / 7;
        char conceito = 'E';
        boolean aprovado = false;

        if (media >= 9) {
            conceito = 'A';
            aprovado = true;
        }
        else if (media >= 7.5) {
            conceito = 'B';
            aprovado = true;
        }
        else if (media >= 6) {
            conceito = 'C';
            aprovado = true;
        }
        else if (media > 4) {
            conceito = 'D';
        }

        System.out.println("Conceito: " + conceito);
        
        if (aprovado) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado.");
        }

        scanner.close();
    }
}
