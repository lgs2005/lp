import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Exe21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.00");

        System.out.print("Massa (kg): ");
        double massa = scanner.nextDouble();

        System.out.print("Altura (m): ");
        double altura = scanner.nextDouble();

        double imc = massa / (altura*altura);
        String classificacao;

        if (imc >= 40) {
            classificacao = "Obesidade Grau III (mórbida)";
        } else if (imc >= 35) {
            classificacao = "Obesidade Grau II (severa)";
        } else if (imc >= 30) {
            classificacao = "Obesidade Grau I";
        } else if (imc >= 25) {
            classificacao = "Sobrepeso";
        } else if (imc >= 18.5) {
            classificacao = "Saudável";
        } else {
            classificacao = "Magreza";
        }

        System.out.println("IMC: " + format.format(imc));
        System.out.println("Classificação: " + classificacao);

        scanner.close();
    }
}
