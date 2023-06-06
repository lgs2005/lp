import java.util.Scanner;

public class Uni6Exe07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tamanho do vetor: (máximo 20)");
        int tamanho = scanner.nextInt();

        while (tamanho <= 0 || tamanho > 20) {
            System.out.println("Valor inválido.");
            tamanho = scanner.nextInt();
        }

        int[] vetor = lerVetor(scanner, tamanho);

        System.out.print("Vetor origem: ");
        apresentarVetor(vetor);

        ordenarVetor(vetor);

        System.out.print("Vetor ordenado: ");
        apresentarVetor(vetor);

        scanner.close();
    }

    public static int[] lerVetor(Scanner scanner, int tamanho) {
        int[] vetor = new int[tamanho];
        int proximoValor = 0;

        while (proximoValor < tamanho) {
            System.out.print("Novo valor: ");
            int v = scanner.nextInt();

            boolean aceito = true;
            for (int v2 : vetor) {
                if (v == v2) {
                    aceito = false;
                    break;
                }
            }

            if (aceito) {
                vetor[proximoValor] = v;
                proximoValor++;
                System.out.println("Valor adicionado.");
            } else {
                System.out.println("Este valor já faz parte do vetor.");
            }
        }

        return vetor;
    }

    public static void ordenarVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length - i - 1; j++) {
                if (vetor[j] > vetor[j+1]) {
                    int x = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = x;
                }
            }
        }
    }

    public static void apresentarVetor(int[] vetor) {
        for (int v : vetor) {
            System.out.print("[" + v + "]");
        }
        System.out.println("");
    }
}
