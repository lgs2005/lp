import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número do canal (4, 5, 9, 12) e quantas pessoas estão assistindo em cada casa. Digite canal 0 para terminar.");

        int audienciaCanal4 = 0;
        int audienciaCanal5 = 0;
        int audienciaCanal9 = 0;
        int audienciaCanal12 = 0;
        boolean fim = false;

        while (!fim) {
            int canal = scanner.nextInt();

            if (canal == 0) {
                fim = true;
            } else {
                int audiencia = scanner.nextInt();

                if (canal == 4) {
                    audienciaCanal4 += audiencia;
                } else if (canal == 5) {
                    audienciaCanal5 += audiencia;
                } else if (canal == 9) {
                    audienciaCanal9 += audiencia;
                } else if (canal == 12) {
                    audienciaCanal12 += audiencia;
                } else {
                    System.out.println("Canal desconhecido.");
                }
            }
        }

        double totalAudiencia = audienciaCanal4+audienciaCanal5+audienciaCanal9+audienciaCanal12;
        double percentualCanal4 = audienciaCanal4/totalAudiencia;
        double percentualCanal5 = audienciaCanal5/totalAudiencia;
        double percentualCanal9 = audienciaCanal9/totalAudiencia;
        double percentualCanal12 = audienciaCanal12/totalAudiencia;

        DecimalFormat format = new DecimalFormat("0.00%");

        System.out.println("=== Percentual de audiência ===");
        System.out.println("Canal 4: " + format.format(percentualCanal4));
        System.out.println("Canal 5: " + format.format(percentualCanal5));
        System.out.println("Canal 9: " + format.format(percentualCanal9));
        System.out.println("Canal 12: " + format.format(percentualCanal12));

        scanner.close();
    }
}
