import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de inscrição e altura de cada atleta. Digite inscrição 0 para terminar.");

        int numMenor = 0;
        double alturaMenor = 0;
        int numMaior = 0;
        double alturaMaior = 0;
        int contaAtletas = 0;
        double alturaTotal = 0;
        boolean fim = false;

        while (!fim) {
            int numAtleta = scanner.nextInt();

            if (numAtleta == 0) {
                fim = true;
            } else {
                double alturaAtleta = scanner.nextDouble();

                if (alturaAtleta < alturaMenor || alturaMenor == 0) {
                    numMenor = numAtleta;
                    alturaMenor = alturaAtleta;
                }

                if (alturaAtleta > alturaMaior || alturaMaior == 0) {
                    numMaior = numAtleta;
                    alturaMaior = alturaAtleta;
                }

                contaAtletas += 1;
                alturaTotal += alturaAtleta;
            }
        }

        DecimalFormat format = new DecimalFormat("0.00");

        System.out.println("Menor atleta: " + numMenor + " Altura: " + format.format(alturaMenor));
        System.out.println("Maior atleta: " + numMaior + " Altura: " + format.format(alturaMaior));
        System.out.println("Média altura: " + format.format(alturaTotal / contaAtletas));

        scanner.close();
    }
}
