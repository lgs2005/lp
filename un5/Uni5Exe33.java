import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;
        int candidato4 = 0;
        int votoNulo = 0;
        int votoBranco = 0;

        boolean fim = false;
        while (!fim) {
            int codigo = -1;

            do {
                int entrada = scanner.nextInt();
                if (entrada < 0 || entrada > 6) {
                    System.out.println("Opçao incorreta.");
                } else {
                    codigo = entrada;
                }
            } while (codigo == -1);

            if (codigo == 0) {
                fim = true;
            } else {
                switch (codigo) {
                    case 1:
                        candidato1++;
                        break;
                    case 2:
                        candidato2++;
                        break;
                    case 3:
                        candidato3++;
                        break;
                    case 4:
                        candidato4++;
                        break;
                    case 5:
                        votoNulo++;
                        break;
                    case 6:
                        votoBranco++;
                        break;
                }
            }
        }
        
        System.out.println("Candidato 1: " + candidato1 + " votos.");
        System.out.println("Candidato 2: " + candidato2 + " votos.");
        System.out.println("Candidato 3: " + candidato3 + " votos.");
        System.out.println("Candidato 4: " + candidato4 + " votos.");
        System.out.println(votoBranco + " votos em branco.");
        System.out.println(votoNulo + " votos nulos.");

        double total = candidato1 + candidato2 + candidato3 + candidato4 + votoBranco + votoNulo;
        DecimalFormat formatPercentual = new DecimalFormat("0.00%");
        System.out.println(formatPercentual.format((votoBranco + votoNulo) / total) + " votos brancos e nulos.");

        scanner.close();
    }
}
