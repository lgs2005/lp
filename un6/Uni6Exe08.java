import java.util.Scanner;

public class Uni6Exe08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Tamanho do vetor: (máximo 20)");
        int tamanho = scanner.nextInt();

        while (tamanho <= 0 || tamanho > 20) {
            System.out.println("Valor inválido.");
            tamanho = scanner.nextInt();
        }

        System.out.println("Valores do vetor: ");
        double[] vetor = lerVetor(scanner, tamanho);

        apresentarFrequencias(vetor);
        scanner.close();
    }

    public static double[] lerVetor(Scanner scanner, int tamanho) {
        double[] vetor = new double[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = scanner.nextDouble();
        }

        return vetor;
    }

    public static void apresentarFrequencias(double[] vetor) {
        double[] pularv = new double[vetor.length];
        int pulari = 0;

        System.out.println("VALOR\t\tFREQUÊNCIA");

        for (double v : vetor) {
            boolean pular = false;
            for (double v2 : pularv) {
                if (v == v2) {
                    pular = true;
                }
            }

            if (pular) {
                continue;
            } else {
                pularv[pulari] = v;
                pulari++;

                int frequencia = 0;
                for (double v3 : vetor) {
                    if (v3 == v) {
                        frequencia++;
                    }
                }

                System.out.println(v + "\t\t"+ + frequencia);
            }
        }
    }
}
