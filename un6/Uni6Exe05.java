import java.util.Scanner;

public class Uni6Exe05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Participante 1");
        String[] respostas1 = responderQuestionario(scanner);

        System.out.println("Participante 2");
        String[] respostas2 = responderQuestionario(scanner);

        int afinidade = calcularAfinidade(respostas1, respostas2);

        if (afinidade >= 15) {
            System.out.println("Casem!");
        } else if (afinidade >= 10) {
            System.out.println("Vocês têm muita coisa em comum!");
        } else if (afinidade >= 5) {
            System.out.println("Talvez não dê certo  :(");
        } else if (afinidade >= 0) {
            System.out.println("Vale um encontro.");
        } else if (afinidade > -10) {
            System.out.println("Melhor não perder tempo");
        } else {
            System.out.println("Vocês se odeiam!");
        }
    }

    public static String lerResposta(Scanner scanner) {
        String resposta = scanner.next().toUpperCase();

        while (!(resposta.equals("SIM") || resposta.equals("NAO") || resposta.equals("IND"))) {
            System.out.println("Resposta inválida.");
            resposta = scanner.next().toUpperCase();
        }

        return resposta;
    }

    public static String[] responderQuestionario(Scanner scanner) {
        String[] respostas = new String[5];

        System.out.println("Responda com SIM, NAO ou IND (indiferente)");

        System.out.println("Gosta de música sertaneja?");
        respostas[0] = lerResposta(scanner);

        System.out.println("Gosta de futebol?");
        respostas[1] = lerResposta(scanner);

        System.out.println("Gosta de seriados?");
        respostas[2] = lerResposta(scanner);

        System.out.println("Gosta de redes sociais?");
        respostas[3] = lerResposta(scanner);

        System.out.println("Gosta da Oktoberfest?");
        respostas[4] = lerResposta(scanner);

        return respostas;
    }

    public static int calcularAfinidade(String[] respostas1, String[] respostas2) {
        int indice = 0;

        for (int i = 0; i < 5; i++) {
            String resp1 = respostas1[i];
            String resp2 = respostas2[i];

            if (resp1.equals(resp2)) {
                indice += 3;
            } else if (resp1.equals("IND") || resp2.equals("IND")) {
                indice += 1;
            } else if ((resp1.equals("SIM") && resp2.equals("NAO")) || (resp1.equals("NAO") && resp2.equals("SIM"))) {
                indice -= 1;
            }
        }

        return indice;
    }
}
