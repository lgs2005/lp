import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nenhumdenos = 0;
        int cpm22 = 0;
        int skank = 0;
        int jotaquest = 0;

        char sn = 's';

        while (sn == 's') {
            int codigo = scanner.nextInt();

            switch (codigo) {
                case 1:
                    nenhumdenos++;
                    break;
                case 2:
                    cpm22++;
                    break;
                case 3:
                    skank++;
                    break;
                case 4:
                    jotaquest++;
                    break;
                default:
                    System.out.println("Código inválido.");
                    break;
            }

            System.out.print("mais um voto: s (SIM) / n (NÃO)?");
            sn = scanner.next().toLowerCase().charAt(0);
        }

        double totalVotos = nenhumdenos + cpm22 + skank + jotaquest;
        DecimalFormat formatPercentual = new DecimalFormat("0.00%");

        System.out.println("Nenhum de nós: " + nenhumdenos + " votos. (" + formatPercentual.format(nenhumdenos/totalVotos) + ")");
        System.out.println("CPM22: " + cpm22 + " votos. (" + formatPercentual.format(cpm22/totalVotos) + ")");
        System.out.println("Skank: " + skank + " votos. (" + formatPercentual.format(skank/totalVotos) + ")");
        System.out.println("Jota Quest: " + jotaquest + " votos. (" + formatPercentual.format(jotaquest/totalVotos) + ")");

        String vencedor = "Nenhum de nós";
        int pontosVencedor = nenhumdenos;

        if (cpm22 > pontosVencedor) {
            vencedor = "CPM22";
            pontosVencedor = cpm22;
        }
        if (skank > pontosVencedor) {
            vencedor = "Skank";
            pontosVencedor = skank;
        }
        if (jotaquest > pontosVencedor) {
            vencedor = "Jota Quest";
            pontosVencedor = jotaquest;
        }

        System.out.println("Vencedor: " + vencedor);

        scanner.close();
    }
}
