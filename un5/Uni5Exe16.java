import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a altura e o sexo (M ou F) de cada pessoa em sequência. Digite 0 como altura para terminar.");

        double mAlturaTotal = 0;
        int mConta = 0;
        double fAlturaTotal = 0;
        int fConta = 0;
        boolean fim = false;

        while (!fim) {
            double altura = scanner.nextDouble();

            if (altura == 0) {
                fim = true;
            } else {
                char sexo = scanner.next().toLowerCase().charAt(0);

                if (sexo == 'm') {
                    mAlturaTotal += altura;
                    mConta += 1;
                } else if (sexo == 'f') {
                    fAlturaTotal += altura;
                    fConta += 1;
                } else {
                    System.out.println("Sexo desconhecido.");
                }
            }
        }

        double mAlturaMedia = mAlturaTotal / mConta;
        double totalAlturaMedia = (mAlturaTotal + fAlturaTotal) / (mConta + fConta);

        DecimalFormat format = new DecimalFormat("0.00");
        System.out.println("Altura média das mulheres: " + format.format(mAlturaMedia));
        System.out.println("Altura média do grupo: " + format.format(totalAlturaMedia));

        scanner.close();
    }
}
