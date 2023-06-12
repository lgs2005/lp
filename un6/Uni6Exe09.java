import java.util.Scanner;

public class Uni6Exe09 {
    public static void main(String[] args) {
        int[][] dados = lerDados();

        int notaTotal = 0;
        int contaTotal = 0;

        int notaHomens = 0;
        int contaHomens = 0;

        int notaMulherMaisJovem = 0;
        int idadeMulherMaisJovem = -1;

        for (int i = 0; i < 30; i++) {
            int sexo = dados[i][0];
            int nota = dados[i][1];
            int idade = dados[i][2];

            contaTotal++;
            notaTotal += nota;

            if (sexo == 1) {
                if (idade < idadeMulherMaisJovem || idadeMulherMaisJovem < 0) {
                    idadeMulherMaisJovem = idade;
                    notaMulherMaisJovem = nota;
                }
            } else {
                contaHomens++;
                notaHomens += nota;
            }
        }

        double mediaTotal = ((double)notaTotal)/contaTotal;
        double mediaHomens = ((double)notaHomens)/contaHomens;
        
        int mulheresAcimaDe50ComNotaAcimaDaMedia = 0;

        for (int i = 0; i < 30; i++) {
            int sexo = dados[i][0];
            int nota = dados[i][1];
            int idade = dados[i][2];

            if (sexo == 1 && idade > 50 && nota > mediaTotal) {
                mulheresAcimaDe50ComNotaAcimaDaMedia++;
            }
        }

        System.out.println("Média recebida pelo cinema: " + mediaTotal);
        System.out.println("Média atribuída pelos homens: " + mediaHomens);
        System.out.println("Nota atribuída pela mulher mais jovem: " + notaMulherMaisJovem + " (" + idadeMulherMaisJovem + " anos)");
        System.out.println("Mulheres com mais de 50 anos que deram nota superior a média: " + mulheresAcimaDe50ComNotaAcimaDaMedia);
    }

    public static int[][] lerDados() {
        Scanner scanner = new Scanner(System.in);
        int[][] dados = new int[30][3];

        for (int i = 0; i < 30; i++) {
            System.out.println("----------------------------------------------------------");
            System.out.print("Sexo (1=feminino 2=masculino): ");
            dados[i][0] = scanner.nextInt();
            System.out.print("Nota (zero até dez, valor inteiro): ");
            dados[i][1] = scanner.nextInt();
            System.out.print("Idade: ");
            dados[i][2] = scanner.nextInt();
        }

        scanner.close();
        return dados;
    }
}
